package mathematics.geometry;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TriangleCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter the values of the three sides of the triangle:");
            Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());

            System.out.println(triangle.getArea());
            System.out.println(triangle.getPerimeter());
            System.out.println("------------------------------");
            System.out.println(triangle.area);
            System.out.println(triangle.perimeter);
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
//4
//3
//5
//Output
//6.0
//12.0
//------------------------------
//The area of triangle = 6,00
//The perimeter of triangle = 12,00



//Input
//4 13 15
//Output
//24.0
//32.0
//------------------------------
//The area of triangle = 24,00
//The perimeter of triangle = 32,00



//Input
//5.5 6.8 11.11
//Output
//14.559102066211887
//23.41
//------------------------------
//The area of triangle = 14,56
//The perimeter of triangle = 23,41



//Input
//3
//4.1
//7.1
//Output
//These aren't sides of a triangle.



//Input
//2.5
//6.7
//15
//Output
//These aren't sides of a triangle.



//Input
//two three four
//Output
//It isn't a number.



