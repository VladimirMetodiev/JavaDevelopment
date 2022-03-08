package basicSyntaxExercises;

public class Savings {
    public static void main(String[] args) {
        double finalBalance = 100000.0;
        double currentBalance = 0.0;
        double annualPayment = 1200.0;
        int years = 0;
        double interestRate = 5.5;

        while(currentBalance < finalBalance){
            currentBalance = (currentBalance + annualPayment) * (1.0 + interestRate / 100.0);
            years++;
            System.out.printf("Year %d - your current balance will be $ %.2f%n", years, currentBalance);
        }

        System.out.printf("The amount of %.2f will be saved for %d years.", finalBalance, years);
    }
}
