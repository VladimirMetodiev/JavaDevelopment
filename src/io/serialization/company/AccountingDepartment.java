package io.serialization.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 1.4
 */

public class AccountingDepartment {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Salary> salaries;
    private static ArrayList<Employee> staff;
    private static ArrayList<SalesRepresentative> salesRepresentatives;
    private static String data;

    public static void main(String[] args) {
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\salary.bin"))) {
            salaries = (ArrayList<Salary>) oos.readObject();
            checkUp();
        }
        catch (FileNotFoundException ex) {
            find();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String command;
        getMessage();

        while(!(command = input.nextLine().toLowerCase()).equals("end")) {
            switch (command) {
                case "set salary": setSalary(); break;
                case "employee": employee(); break;
                case "all": all(); break;
                default: System.out.println("Wrong command!"); break;
            }
            getMessage();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\io\\serialization\\company\\salary.bin"))){
            oos.writeObject(salaries);
            System.out.println("SAVE");
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void getMessage() {
        System.out.println("Choose: \"set salary\", \"employee\", \"all\" or \"end\":");
    }

    private static void checkUp() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\staff.bin"));
            ObjectInputStream oisSalary = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\salary.bin"))) {
            staff = (ArrayList<Employee>) ois.readObject();
            salaries = (ArrayList<Salary>) oisSalary.readObject();

            for (int a = 1; a < staff.size(); a++) {
                boolean flag = false;
                for(int b = 0; b < salaries.size(); b++) {
                    if(staff.get(a).getId() == salaries.get(b).getEmployee().getId() &&
                            staff.get(a).getName().equals(salaries.get(b).getEmployee().getName()) &&
                            staff.get(a).getSurname().equals(salaries.get(b).getEmployee().getSurname()) &&
                            staff.get(a).getPosition().equals(salaries.get(b).getEmployee().getPosition())) {
                        flag = true;
                    }
                }
                if(!flag) {
                    salaries.add(new Salary(staff.get(a)));
                }
            }
        }
        catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static void find() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\staff.bin"))) {
            staff = (ArrayList<Employee>) ois.readObject();
            salaries = new ArrayList<>();
            for (int i = 1; i < staff.size(); i++) {
                salaries.add(new Salary(staff.get(i)));
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("There isn't any information about the staff.");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static void setSalary() {
        try {
            boolean flag = false;
            System.out.println("Enter ID:");
            data = input.nextLine();
            for (int n = 0; n < salaries.size(); n++) {
                if(Integer.parseInt(data) == salaries.get(n).getEmployee().getId()) {
                    System.out.println("Enter sales:");
                    salaries.get(n).setSalary(Double.parseDouble(input.nextLine()));
                    if(salaries.get(n).getEmployee().getPosition().equalsIgnoreCase("Sales representative")) {
                        double sales = getSales(salaries.get(n).getEmployee().getId());
                        if(sales >= 250000) {
                            salaries.get(n).setSalary(salaries.get(n).getSalary() + 2000);
                        }
                        else if(sales >= 500000) {
                            salaries.get(n).setSalary(salaries.get(n).getSalary() + 4000);
                        }
                    }
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println("There isn't such ID.");
        }
        catch (NumberFormatException ex) {
            System.out.println("There isn't such ID.");
        }
    }

    private static double getSales(int id) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\sales.bin"))){
            salesRepresentatives = (ArrayList<SalesRepresentative>)ois.readObject();
            for(SalesRepresentative s : salesRepresentatives) {
                if(s.employee.getId() == id) return s.getSale();
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return -1;
    }

    private static void employee() {
        try {
            boolean flag = false;
            System.out.println("Enter ID or surname:");
            data = input.nextLine();
            if(Integer.parseInt(data) > 0) {
                for (int m = 0; m < salaries.size(); m++) {
                    if(Integer.parseInt(data) == salaries.get(m).getEmployee().getId()) {
                        System.out.println(salaries.get(m) + "\n");
                        flag = true;
                        break;
                    }
                }
                if(!flag) System.out.println("There isn't such ID." + "\n");
            }
            else {
                System.out.println("There isn't such ID." + "\n");
            }
        }
        catch (NumberFormatException ex) {
            boolean flag = false;
            for (Salary s : salaries) {
                if(data.equals(s.getEmployee().getSurname())) {
                    System.out.println(s);
                    flag = true;
                }
            }
            if(!flag) System.out.println("There isn't such surname." + "\n");
            else System.out.println();
        }
    }

    private static void all() {
        for (Salary s : salaries) {
            System.out.println(s);
        }
        System.out.println();
    }
}
