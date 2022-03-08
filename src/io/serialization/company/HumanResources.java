package io.serialization.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 1.3
 */

public class HumanResources {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Employee> staff;
    private static String data;

    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\company\\staff.bin"))) {
            staff = (ArrayList<Employee>) ois.readObject();
            getStartMessage();
        }
        catch (FileNotFoundException ex) {
            staff = new ArrayList<>(Arrays.asList(new Employee(0, "", "", "")));
            getStartMessage();
        }
        catch (IOException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String command;
        getMessage();

        while (!(command = input.nextLine().toLowerCase()).equals("end")) {
            switch (command) {
                case "add": add(); break;
                case "employee": employee(); break;
                case "all": all(); break;
                default: System.out.println("Wrong command!"); break;
            }
            getMessage();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\io\\serialization\\company\\staff.bin"))) {
            oos.writeObject(staff);
            System.out.println("SAVE");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getStartMessage() {
        System.out.println("The program is running.");
    }

    private static void getMessage() {
        System.out.println("Choose: \"add\", \"employee\", \"all\" or \"end\":");
    }

    private static void add() {
        System.out.println("Enter a name:");
        String name = input.nextLine();
        System.out.println("Enter a surname:");
        String surname = input.nextLine();
        System.out.println("Enter a position:");
        String position = input.nextLine();
        staff.add(new Employee(staff.size(), name, surname, position));
        System.out.println("A new employee has been added." + "\n");
    }

    private static void employee() {
        try {
            System.out.println("Enter ID or surname:");
            data = input.nextLine();
            if(Integer.parseInt(data) > 0 && Integer.parseInt(data) < staff.size()) System.out.println(staff.get(Integer.parseInt(data)) + "\n");
            else System.out.println("There isn't such ID.");
        }
        catch (NumberFormatException ex) {
            boolean flag = false;
            for (Employee el : staff) {
                if(data.equals(el.getSurname())) {
                    System.out.println(el);
                    flag = true;
                }
            }
            if(!flag) System.out.println("There isn't such surname.");
            else System.out.println();
        }
    }

    private static void all() {
        if(staff.size() > 1) {
            for (int a = 1; a < staff.size(); a++) {
                System.out.println(staff.get(a));
            }
            System.out.println();
        }
        else {
            System.out.println("There isn't staff.");
        }
    }
}
