package mathematics.geometry;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class RectangleCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter the values of the two sides of the rectangle:");
            Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());

            System.out.println(rectangle.getArea());
            System.out.println(rectangle.getPerimeter());
            System.out.println("------------------------------");
            System.out.println(rectangle.area);
            System.out.println(rectangle.perimeter);
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
//30
//50
//Output
//1500.0
//160.0
//------------------------------
//The area of rectangle = 1500,00
//The perimeter of rectangle = 160,00



//Input
//4 18.3
//Output
//73.2
//44.6
//------------------------------
//The area of rectangle = 73,20
//The perimeter of rectangle = 44,60



//Input
//ten eleven
//Output
//It isn't a number.



//Input
//-10 0
//Output
//It can't be negative or zero.
