package basicSyntaxExercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first operand:");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Enter the second operand:");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Choose: \"+\", \"-\", \"*\", \"/\"");
        char sign = input.nextLine().charAt(0);

        switch (sign) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': {
                if (b == 0) {
                    System.out.println("Can not divide by zero!");
                }
                else {
                    System.out.println(a / b);
                }
                break;
            }
            default: System.out.println("There isn't such sign."); break;
        }
    }
}
