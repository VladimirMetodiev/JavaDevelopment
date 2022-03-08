package oopExercises.bankAccounts;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageYourMoney {
    static Scanner input = new Scanner(System.in);
    static int number, years;
    static double amount, interest;

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(0, 0.0));
        String command;
        printMessage();

        while (!(command = input.nextLine().toLowerCase()).equals("end")) {
            switch (command) {
                case "create": {
                    accounts.add(new BankAccount(accounts.size(), 0.0));
                    System.out.println("Your bank account has been successfully opened.");
                    System.out.printf("Acc[%d] | balance = %.2f%n", accounts.get(accounts.size() - 1).getId(), accounts.get(accounts.size() - 1).getBalance());
                    break;
                }
                case "deposit": {
                    getInfo();
                    if(accounts.size() == 1 || number < 1 || number > accounts.size() - 1) {
                        System.out.println("There isn't such account.");
                    }
                    else {
                        try {
                            accounts.get(number).add(amount);
                        }
                        catch (RuntimeException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    break;
                }
                case "withdraw cash":
                case "pay": {
                    try {
                        getInfo();
                        if(accounts.size() == 1 || number < 1 || number > accounts.size() - 1) {
                            System.out.println("There isn't such account.");
                        }
                        else {
                            accounts.get(number).draw(amount);
                        }
                    }
                    catch (RuntimeException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case "balance": {
                    System.out.println("Enter a number of account:");
                    number = Integer.parseInt(input.nextLine());
                    if(accounts.size() == 1 || number < 1 || number > accounts.size() - 1) {
                        System.out.println("There isn't such account.");
                    }
                    else {
                        System.out.printf("Acc[%d] | balance = %.2f%n", accounts.get(number).getId(), accounts.get(number).getBalance());
                    }
                    break;
                }
                case "calculate interest": {
                    System.out.println("Enter a number of account:");
                    number = Integer.parseInt(input.nextLine());
                    if(accounts.size() == 1 || number < 1 || number > accounts.size() - 1) {
                        System.out.println("There isn't such account.");
                    }
                    else {
                        System.out.println("Enter years:");
                        years = Integer.parseInt(input.nextLine());
                        interest = BankAccount.calculateFutureValue(accounts.get(number).getBalance(), years);
                        System.out.printf("The future value for %d years at %.2f%% is %.2f%n", years, BankAccount.getInterestRate() * 100.0, interest);
                    }
                    break;
                }
                default: System.out.println("There isn't such command!"); break;
            }
            printMessage();
        }
    }

    private static void printMessage () {
        System.out.println("Choose: \"create\", \"deposit\", \"withdraw cash\", \"pay\", \"balance\", \"calculate interest\", \"end\"");
    }

    private static void getInfo () {
        System.out.println("Enter a number of account:");
        number = Integer.parseInt(input.nextLine());
        System.out.println("Enter an amount:");
        amount = Double.parseDouble(input.nextLine());
    }
}



//Test

//Input

//create

//withdraw cash
//2
//100

//pay
//1
//100

//deposit
//1
//1000

//balance
//1

//pay
//1
//600

//balance
//1

//end



//Output

//Your bank account has been successfully opened.
//Acc[1] | balance = 0,00

//There isn't such account.

//There isn't enough money in the account.

//The transaction is successful.

//Acc[1] | balance = 1000,00

//The transaction is successful.

//Acc[1] | balance = 400,00
