package oopExercises.bankAccountHolders;

import oopExercises.bankAccounts.BankAccount;

import java.util.ArrayList;

public class BankAccountHolder {
    private String firstName;
    private String surname;
    private int age;
    private ArrayList<BankAccount> accounts;

    public BankAccountHolder(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        accounts = new ArrayList<>();
    }

    public BankAccountHolder(String firstName, String surname, int age, ArrayList<BankAccount> accounts) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.accounts = accounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setAccount (int number, double amount) {
        accounts.add(new BankAccount(number, amount));
    }

    public double getBalance () {
        double result = 0.0;
        for (int a = 0; a < accounts.size(); a++) {
            result += accounts.get(a).getBalance();
        }
        return result;
    }
}
