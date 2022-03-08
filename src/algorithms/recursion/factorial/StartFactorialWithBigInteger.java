package algorithms.recursion.factorial;

import java.util.Scanner;

public class StartFactorialWithBigInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = Integer.parseInt(input.nextLine());

        FactorialWithBigInteger factorial = new FactorialWithBigInteger(number);
        System.out.println(factorial);
    }
}
