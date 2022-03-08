package mathematics.geometry;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SquareCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter the side of a square:");
            Square square = new Square(input.nextDouble());

            System.out.println(square.getArea());
            System.out.println(square.getPerimeter());
            System.out.println("------------------------------");
            System.out.println(square.area);
            System.out.println(square.perimeter);
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
//12.25
//Output
//150.0625
//49.0
//------------------------------
//The area of square = 150,06
//The perimeter of square = 49,00


//Input
//five
//Output
//It isn't a number.



//Input
//0
//Output
//It can't be negative or zero.

