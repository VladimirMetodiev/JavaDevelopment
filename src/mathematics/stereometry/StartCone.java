package mathematics.stereometry;

import java.util.Locale;
import java.util.Scanner;

public class StartCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            System.out.println("Enter a radius and a height:");
            Cone cone = new Cone(input.nextDouble(), input.nextDouble());
            System.out.println(cone);
        }
        catch (Exception ex) {
            System.out.println("It isn't a number.");
        }
    }
}
