package mathematics.stereometry;

import java.util.Locale;
import java.util.Scanner;

public class StartCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter a radius and a height:");
            Cylinder cylinder1 = new Cylinder(input.nextDouble(), input.nextDouble());
            System.out.println(cylinder1);
        }
        catch (Exception ex) {
            System.out.println("It isn't a number.");
        }

        System.out.println("------------------------------");

        try {
            // Бележка: от обект на клас Circle мога да извикам полето radius с точкова нотация, но от обект на класът наследник Cylinder,
            // НЯМАМ ДИРЕКТЕН ДОСТЪП до полето radius, защото не съм създал setter
            // От обект на клас Cylinder, с точкова нотация, мога да достъпя полето height

            System.out.println("Enter a radius:");
            Cylinder cylinder2 = new Cylinder(input.nextDouble());
            System.out.println("Enter a height:");
            cylinder2.height = input.nextDouble();
            System.out.println(cylinder2);
        }
        catch (Exception ex) {
            System.out.println("It isn't a number.");
        }

        System.out.println("------------------------------");
    }
}
