package methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] data;

        try {
            System.out.println("Enter one or two numbers separated by a space:");
            data = Arrays.stream(input.nextLine().split("\\s+")).mapToDouble(e -> Double.parseDouble(e)).toArray();
        }
        catch (NumberFormatException ex) {
            System.out.println("Wrong entry!");
            return;
        }

        if(data.length == 1) {
            System.out.printf("Area of the circle = %.2f", calculate(data[0]));
        }
        else if(data.length == 2) {
            System.out.printf("Area of the quadrilateral = %.2f", calculate(data[0], data[1]));
        }
        else {
            System.out.println("Wrong entry!");
        }
    }

    private static double calculate(double num) {
        return Math.PI * Math.pow(num, 2);
    }

    private static double calculate(double height, double length) {
        return height * length;
    }
}
