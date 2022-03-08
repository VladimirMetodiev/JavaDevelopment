package oop.staff;

import java.util.Scanner;

public class ManagesEmployees {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Employee president = new Employee();
        takesTheInformation(president);

        System.out.println("Enter a name, a surname and age:");
        Employee chiefAccountant = new Employee(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()));
        System.out.println("Enter an id:");
        chiefAccountant.setId(input.nextLine());
        System.out.println("Enter a position:");
        chiefAccountant.setPosition(input.nextLine());
        System.out.println("Enter a salary:");
        chiefAccountant.setSalary(Double.parseDouble(input.nextLine()));

        System.out.println(president);
        System.out.println(chiefAccountant);
    }

    private static void takesTheInformation(Employee employee){
        System.out.println("Enter a name:");
        employee.setName(input.nextLine());
        System.out.println("Enter a surname:");
        employee.setSurname(input.nextLine());
        System.out.println("Enter age:");
        employee.setAge(Integer.parseInt(input.nextLine()));
        System.out.println("Enter an id:");
        employee.setId(input.nextLine());
        System.out.println("Enter a position:");
        employee.setPosition(input.nextLine());
        System.out.println("Enter a salary:");
        employee.setSalary(Double.parseDouble(input.nextLine()));
    }
}

//Vladimir
//Metodiev
//42
//BOSS000001
//President
//100000.0

//Anna
//Dimitrova
//28
//ACC000002
//Chief Accountant
//90000.0

//Output
//[BOSS000001][President] Vladimir Metodiev: $ 100000,00
//[ACC000002][Chief Accountant] Anna Dimitrova: $ 90000,00
