package mathematics.stereometry.circle;

import java.util.Locale;
import java.util.Scanner;

public class StartCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter a radius:");
            Circle circle1 = new Circle(input.nextDouble());
            System.out.println(circle1);
        }
        catch (Exception ex) {
            System.out.println("It isn't a number.");
        }

        System.out.println("------------------------------");

        try {
            System.out.println("Enter a radius:");
            Circle circle2 = new Circle();
            circle2.radius = input.nextDouble();
            System.out.println(circle2);
        }
        catch (Exception ex) {
            System.out.println("It isn't a number.");
        }

        System.out.println("------------------------------");
    }
}
