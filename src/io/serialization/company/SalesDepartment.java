package io.serialization.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 1.24
 */

public class SalesDepartment {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Employee> staff;
    private static ArrayList<SalesRepresentative> salesRepresentatives;
    private static String data;

    public static void main(String[] args) {
        salesRepresentatives = new ArrayList<>();

        try(ObjectInputStream oisRep = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\sales.bin"))) {
            salesRepresentatives = (ArrayList<SalesRepresentative>) oisRep.readObject();
            checkTheRep();
        }
        catch (FileNotFoundException ex) {
            findTheRep();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        getMessage();
        String command;

        if(!salesRepresentatives.isEmpty()) {
            while (!(command = input.nextLine().toLowerCase()).equals("end")) {
                switch (command) {
                    case "sales": sales(); break;
                    case "representative": representative(); break;
                    case "all": all(); break;
                    default: System.out.println("Wrong command!"); break;
                }
                getMessage();
            }
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\io\\serialization\\company\\sales.bin", false))) {
            oos.writeObject(salesRepresentatives);
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
        System.out.println("Choose: \"sales\", \"representative\", \"all\" or \"end\":");
    }

    private static void sales() {
        try {
            boolean flag = false;
            System.out.println("Enter ID:");
            data = input.nextLine();
            for (int g = 0; g < salesRepresentatives.size(); g++) {
                if(Integer.parseInt(data) == salesRepresentatives.get(g).employee.getId()) {
                    System.out.println("Enter sales:");
                    salesRepresentatives.get(g).setSale(Double.parseDouble(input.nextLine()));
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

    private static void representative() {
        try {
            boolean flag = false;
            System.out.println("Enter ID or surname:");
            data = input.nextLine();
            if(Integer.parseInt(data) > 0) {
                for (int f = 0; f < salesRepresentatives.size(); f++) {
                    if(Integer.parseInt(data) == salesRepresentatives.get(f).employee.getId()) {
                        System.out.println(salesRepresentatives.get(f) + "\n");
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
            for (SalesRepresentative s : salesRepresentatives) {
                if(data.equals(s.employee.getSurname())) {
                    System.out.println(s);
                    flag = true;
                }
            }
            if(!flag) System.out.println("There isn't such surname." + "\n");
            else System.out.println();
        }
    }

    private static void all() {
        for (SalesRepresentative s : salesRepresentatives) {
            System.out.println(s);
        }
        System.out.println();
    }

    private static void findTheRep() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\staff.bin"))) {
            staff = (ArrayList<Employee>) ois.readObject();
            for (int a = 1; a < staff.size(); a++) {
                if(staff.get(a).getPosition().equalsIgnoreCase("Sales representative")) {
                    salesRepresentatives.add(new SalesRepresentative(staff.get(a)));
                }
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

    private static void checkTheRep() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\staff.bin"));
            ObjectInputStream oisRep = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\sales.bin"))) {
            staff = (ArrayList<Employee>) ois.readObject();
            salesRepresentatives = (ArrayList<SalesRepresentative>) oisRep.readObject();
            for (int a = 1; a < staff.size(); a++) {
                boolean flag = false;
                for(int b = 0; b < salesRepresentatives.size(); b++) {
                    if(staff.get(a).getPosition().equalsIgnoreCase("Sales representative") & checkUp(staff.get(a), salesRepresentatives.get(b))) {
                        flag = true;
                    }
                }
                if(!flag && staff.get(a).getPosition().equalsIgnoreCase("Sales representative")) {
                    salesRepresentatives.add(new SalesRepresentative(staff.get(a)));
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

    private static boolean checkUp(Employee e, SalesRepresentative s) {
        if(e.getId() == s.employee.getId() &&
                e.getName().equals(s.employee.getName()) &&
                e.getSurname().equals(s.employee.getSurname()) &&
                e.getPosition().equals(s.employee.getPosition())) {
            return true;
        }
        else {
            return false;
        }
    }
}
