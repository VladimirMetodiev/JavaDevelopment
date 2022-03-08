package oop.nestedClasses.localInnerClass;

import java.util.Scanner;

public class ThirdOuterClass {
    private String division = "Division result:";
    static Scanner input = new Scanner(System.in);

    public void getResult() {
        /* Local class */
        class Divide implements Mathematics {
            private double x;
            private double y;

            public double getX() {
                return x;
            }

            public void setX(double x) {
                this.x = x;
            }

            public double getY() {
                return y;
            }

            public void setY(double y) {
                this.y = y;
            }

            // Локалният клас може да имплементира интерфейси
            @Override
            public double calculate() {
                System.out.println(division); // от локалният клас, мога да се обърна към поле на външният клас
                if(y == 0) throw new IllegalArgumentException("Can not divide by zero.");
                return x / y;
            }
        }

        try {
            Divide divide = new Divide();
            System.out.println("Enter the first number:");
            divide.setX(Double.parseDouble(input.nextLine()));
            System.out.println("Enter the second number:");
            divide.setY(Double.parseDouble(input.nextLine()));
            System.out.println(divide.calculate());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
