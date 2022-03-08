package io.exercises.findOrAddAnEmployee;

import java.io.*;
import java.util.Scanner;

public class Staff {
    private String employeeDatabase;

    public Staff(String employeeDatabase) {
        this.employeeDatabase = employeeDatabase;
    }

    public void search (String surname) throws IOException {
        int symbol;
        boolean flag = false;
        String expression;

        BufferedReader reader = new BufferedReader(new FileReader(employeeDatabase));

        while((symbol = reader.read()) != -1) {
            if(symbol == '#') {
                reader.readLine();
                expression = reader.readLine();

                if(expression.equalsIgnoreCase(surname)) {
                    flag = true;
                    System.out.println("\n" + expression);

                    while (!expression.equals("")) {
                        expression = reader.readLine();
                        System.out.println(expression);
                    }
                }
            }
        }

        if(!flag) System.out.println("There isn't such person.");
        reader.close();
    }

    public void addEmployee(String surname, String name) throws IOException {
        int symbol;
        String data;
        boolean isThereSuchPerson = false;

        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(employeeDatabase));
        BufferedWriter writer = new BufferedWriter(new FileWriter(employeeDatabase, true));

        while((symbol = reader.read()) != -1) {
            if(symbol == '#') {
                reader.readLine();
                data = reader.readLine();

                if(data.equalsIgnoreCase(surname)) {
                    data = reader.readLine();
                    if(data.equalsIgnoreCase(name)) {
                        isThereSuchPerson = true;
                    }
                }

                while (!data.equals("")) {
                    data = reader.readLine();
                }
            }
        }

        reader.close();

        if(isThereSuchPerson) {
            System.out.println("There is such person.");
        }
        else {
            try {
                System.out.println("Enter age:");
                int age = Integer.parseInt(input.nextLine());
                System.out.println("Enter a position:");
                String position = input.nextLine();
                System.out.println("Enter a salary:");
                double salary = Double.parseDouble(input.nextLine());

                writer.write('#');
                writer.newLine();
                writer.write(surname);
                writer.newLine();
                writer.write(name);
                writer.newLine();
                writer.write("" + age);
                writer.newLine();
                writer.write(position);
                writer.newLine();
                writer.write("" + salary);
                writer.newLine();
                writer.newLine();
                System.out.println("You have entered a new employee.");
            }
            catch(Exception ex){
                System.out.println("You could not enter this information.");
            }
        }

        writer.close();
    }
}
