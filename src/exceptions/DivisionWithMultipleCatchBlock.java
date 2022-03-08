package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithMultipleCatchBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the first numbers: ");
            a = input.nextInt();
            System.out.print("Enter the second numbers: ");
            b = input.nextInt();

            System.out.println(a + " / " + b + " = " + (a / b));
        }
        catch (ArithmeticException | InputMismatchException ex) {
            System.out.println("Error: " + ex);
            System.out.println("Description: " + ex.getMessage());
        }

    }
}
