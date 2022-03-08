package oopExercises.bankAccounts;

public class BankAccount {
    private int id;
    private double balance;

    static double interestRate = 0.05;

    public BankAccount() {
    }

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public static double calculateFutureValue(double amount, int years) {
        for (int a = 0; a < years; a++) {
            amount += amount * interestRate;
        }
        return amount;
    }

    public void add (double value) {
        if(value < 0) {
            throw new RuntimeException("Wrong amount!");
        }
        else {
            balance += value;
            System.out.println("The transaction is successful.");
        }
    }

    public void draw (double value) {
        if(balance - value < 0) {
            throw new RuntimeException("There isn't enough money in the account.");
        }
        else {
            balance -= value;
            System.out.println("The transaction is successful.");
        }
    }
}
