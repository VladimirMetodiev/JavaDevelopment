package mathematics.stereometry;

import java.util.Locale;
import java.util.Scanner;

public class StartSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter a radius");
            Sphere sphere = new Sphere(input.nextDouble());
            System.out.println(sphere);
        }
        catch (Exception ex) {
            System.out.println("It isn't a number.");
        }
    }
}
