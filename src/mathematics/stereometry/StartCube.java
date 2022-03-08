package mathematics.stereometry;

import java.util.Locale;
import java.util.Scanner;

public class StartCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter a side length of the cube:");
            double length = input.nextDouble();
            Cube cube = new Cube(length);
            System.out.println(cube);
        }
        catch (Exception ex) {
            System.out.println("It isn't a number.");
        }
    }
}



//5
//Surface area of the cube = 150,00
//Volume of the cube = 125,00



//9.9
//Surface area of the cube = 588,06
//Volume of the cube = 970,30
