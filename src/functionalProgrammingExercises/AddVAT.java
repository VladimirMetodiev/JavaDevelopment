package functionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class AddVAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] prices = Arrays.stream(input.nextLine().split(",\\s+")).mapToDouble(Double::parseDouble).toArray();

        Consumer<double[]> withTax = (array) -> {
            System.out.println("Prices with VAT:");
            for(double element : array) {
                System.out.printf("%1$.2f%n", element * 1.2);
            }
        };

        withTax.accept(prices);
    }
}



//Condition
//Write a program that reads one line of Double prices separated by ", ". Print the prices with added VATs for all of them.
//Format them to the 2nd digit after the decimal point. The order of the prices must remain the same.



//Tests

//1.38, 2.56, 4.4
//Prices with VAT:
//1,66
//3,07
//5,28

//1, 3, 5, 7
//Prices with VAT:
//1,20
//3,60
//6,00
//8,40
