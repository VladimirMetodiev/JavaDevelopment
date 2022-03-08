package oopExercises.bankAccountHolders;

import oopExercises.bankAccounts.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccountHolder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name:");
        String name = input.nextLine();
        System.out.println("Enter a surname:");
        String surname = input.nextLine();
        System.out.println("Enter some age:");
        int age = Integer.parseInt(input.nextLine());

        BankAccountHolder theFirst = new BankAccountHolder(name, surname, age);

        System.out.println("Enter a number of bank account:");
        int number = Integer.parseInt(input.nextLine());
        System.out.println("Enter an amount:");
        double amount = Double.parseDouble(input.nextLine());

        theFirst.setAccount(number, amount);



        ArrayList<BankAccount> acc = new ArrayList<>();
        acc.add(new BankAccount(454562, 42500));
        acc.add(new BankAccount(454568, 15800));
        acc.add(new BankAccount(386458, 105322.42));

        System.out.println("Enter a name:");
        name = input.nextLine();
        System.out.println("Enter a surname:");
        surname = input.nextLine();
        System.out.println("Enter some age:");
        age = Integer.parseInt(input.nextLine());

        BankAccountHolder theSecond = new BankAccountHolder(name, surname, age, acc);



        System.out.printf("%s %s has $ %.2f%n", theFirst.getFirstName(), theFirst.getSurname(), theFirst.getBalance());
        System.out.printf("%s %s has $ %.2f%n", theSecond.getFirstName(), theSecond.getSurname(), theSecond.getBalance());
    }
}



//Test

//Input

//Vladimir
//Metodiev
//33
//9865737
//1000
//Anna
//Dimitrova
//31


//Output

//Vladimir Metodiev has $ 1000,00
//Anna Dimitrova has $ 163622,42
