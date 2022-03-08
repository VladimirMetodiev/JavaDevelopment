package mathematics.stereometry;

import java.util.Locale;
import java.util.Scanner;

public class StartParallelepiped {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter length:");
            double length = input.nextDouble();
            System.out.println("Enter width:");
            double width = input.nextDouble();
            System.out.println("Enter height:");
            double height = input.nextDouble();

            Parallelepiped parallelepiped = new Parallelepiped(length, width, height);

            System.out.println(parallelepiped);
        }
        catch (Exception ex) {
            System.out.println("It isn't a number.");
        }
    }
}



//Tests

//6
//4
//10
//The parallelepiped area = 248,00
//The parallelepiped volume = 240,00



//15.25
//8.32
//16.16
//The parallelepiped area = 1015,54
//The parallelepiped volume = 2050,38
