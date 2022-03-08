package mathematics.geometry;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class IsoscelesTrapezoidCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter the longer side:");
            double a = input.nextDouble();
            System.out.println("Enter the shorter side:");
            double b = input.nextDouble();
            System.out.println("Enter the leg:");
            double e = input.nextDouble();

            IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(a, b, e);

            System.out.println(isoscelesTrapezoid.getArea());
            System.out.println(isoscelesTrapezoid.getPerimeter());
            System.out.println("------------------------------");
            System.out.println(isoscelesTrapezoid.area);
            System.out.println(isoscelesTrapezoid.perimeter);
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
//8
//5.25
//6.8
//Output
//44.11940374834382
//26.85
//------------------------------
//The area of isosceles trapezoid = 44,12
//The perimeter of isosceles trapezoid = 26,85



//Input
//10
//2
//5
//Output
//18.0
//22.0
//------------------------------
//The area of isosceles trapezoid = 18,00
//The perimeter of isosceles trapezoid = 22,00



//Input
//162.8
//50.75
//81.81
//Output
//6365.505581194998
//377.17
//------------------------------
//The area of isosceles trapezoid = 6365,51
//The perimeter of isosceles trapezoid = 377,17



//Input
//Trapezoid
//Output
//It isn't a number.


//Input
//10
//3.5
//-6.2
//Output
//Any side can not be negative or zero.


