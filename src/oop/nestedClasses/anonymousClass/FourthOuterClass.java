package oop.nestedClasses.anonymousClass;

import java.util.Locale;
import java.util.Scanner;

public class FourthOuterClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        /* Anonymous class */
        /* Анонимният клас имплементира интерфейсът MathOperation и пренаписва неговият метод calculate */

        MathOperation sum = new MathOperation() {
            @Override
            public double calculate(double x, double y) {
                return x + y;
            }
        };

        getMessage();
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.println(sum.calculate(x, y));


        MathOperation subtraction = new MathOperation() {
            @Override
            public double calculate(double x, double y) {
                return x - y;
            }
        };

        getMessage();
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.println(subtraction.calculate(x, y));


        MathOperation multiplication = new MathOperation() {
            @Override
            public double calculate(double x, double y) {
                return x * y;
            }
        };

        getMessage();
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.println(multiplication.calculate(x, y));


        MathOperation division = new MathOperation() {
            @Override
            public double calculate(double x, double y) {
                if(y == 0) throw new IllegalArgumentException("Can not divide by zero.");
                return x / y;
            }
        };

        getMessage();
        x = input.nextDouble();
        y = input.nextDouble();
        try {
            System.out.println(division.calculate(x, y));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void getMessage() {
        System.out.println("Enter x and y:");
    }
}
