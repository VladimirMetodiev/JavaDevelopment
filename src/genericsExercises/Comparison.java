package genericsExercises;

import java.util.Locale;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        System.out.println("Enter two integers:");
        System.out.printf("The biggest is: %d%n", getBiggest(input.nextInt(), input.nextInt()));

        System.out.println("\nEnter two real numbers:");
        System.out.printf("The biggest is: %f%n", getBiggest(input.nextDouble(), input.nextDouble()));

        System.out.println("\nEnter two characters:");
        System.out.printf("The biggest is: %c%n", getBiggest(input.next().charAt(0), input.next().charAt(0)));
    }

    private static <T extends Comparable<T>> T getBiggest(T value1, T value2) {
        return value1.compareTo(value2) > 0 ? value1 : value2;
    }
}
