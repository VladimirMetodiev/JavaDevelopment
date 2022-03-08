package basicSyntax;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());

        if (b == 0) {
            System.out.println("Can not divide by zero!");
            return;
        }

        if (a / b > 0) {
            System.out.println("Positive");
        }
        else if (a / b < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Neutral");
        }

    }
}
