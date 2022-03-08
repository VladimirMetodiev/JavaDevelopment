package mathematics.geometry;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CircleCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter a radius:");
            Circle circle = new Circle(input.nextDouble());

            System.out.println(circle.getArea());
            System.out.println(circle.getPerimeter());
            System.out.println("------------------------------");
            System.out.println(circle.area);
            System.out.println(circle.perimeter);
        }
        catch (InputMismatchException ex) {
            System.out.println("It isn't a number.");
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());;
        }

    }
}



//Tests

//Input
//10
//Output
//314.1592653589793
//62.83185307179586
//------------------------------
//The area of circle = 314,16
//The perimeter of circle = 62,83



//Input
//14.8
//Output
//688.1344548423084
//92.99114254625788
//------------------------------
//The area of circle = 688,13
//The perimeter of circle = 92,99



//Input
//one
//Output
//It isn't a number.



//Input
//-19
//Output
//It can't be negative or zero.
