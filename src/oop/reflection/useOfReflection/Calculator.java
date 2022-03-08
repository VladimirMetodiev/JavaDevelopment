package oop.reflection.useOfReflection;

import java.text.DecimalFormat;

public class Calculator {
    DecimalFormat df = new DecimalFormat("0.##");

    void sum (double x, double y) {
        System.out.printf("Sum: %s%n", df.format(x + y));
    }

    void subtraction (double x, double y) {
        System.out.printf("Subtraction: %s%n", df.format(x - y));
    }

    void multiplication (double x, double y) {
        System.out.printf("Multiplication: %s%n", df.format(x * y));
    }

    void division (double x, double y) {
        //if(y == 0) throw new IllegalArgumentException("Can not be divided by zero");
        System.out.printf("Division: %s%n", df.format(x / y));
    }
}
