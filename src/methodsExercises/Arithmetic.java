package methodsExercises;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        char sign = input.nextLine().trim().charAt(0);

        switch (sign) {
            case '+': add(a, b); break;
            case '-': subtract(a, b); break;
            case '*': multiply(a, b); break;
            case '/': divide(a, b); break;
            default: System.out.println("There isn't such sign."); break;
        }
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    static void divide(int a, int b) {
        try{
            if(b == 0) throw new ArithmeticException("Can not divide by zero.");
            System.out.println(a / (double)b);
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
