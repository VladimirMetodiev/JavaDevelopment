package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeExceptions {
    public static void main(String[] args) {
        int x, y, sum = 0;

        Scanner input = new Scanner(System.in);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("Choose two indexes from 0 to " + (numbers.length - 1) + ":");
        try {
            System.out.print("Enter the first index: ");
            x = input.nextInt();

            System.out.print("Enter the second index: ");
            y = input.nextInt();

            for (int a = x; a <= y; a++) {
                sum += numbers[a];
                System.out.print(numbers[a] + " ");
            }
            System.out.println();
            System.out.println("Result: " + sum / (y - x));
        }
        catch (InputMismatchException ex1) {
            System.out.println("Description: " + ex1);
        }
        catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("\nDescription: " + ex2);
        }
        catch (ArithmeticException ex3) {
            System.out.println("Description: " + ex3);
        }
    }
}



//Tests

//Input
//Enter the first index: word
//Output
//Description: java.util.InputMismatchException

//Input
//Enter the first index: 2
//Enter the second index: 21
//Output
//2 3 4 5 6 7 8 9 10 11 12 13 14 15
//Description: java.lang.ArrayIndexOutOfBoundsException: 16

//Input
//Enter the first index: 4
//Enter the second index: 4
//Output
//4
//Description: java.lang.ArithmeticException: / by zero
