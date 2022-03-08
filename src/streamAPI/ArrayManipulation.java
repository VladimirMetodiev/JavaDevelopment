package streamAPI;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        double[] realNumbers = {63, 243.8, 15.2, -48.9, 72, 95.1, -68.3, 19, 42.6, 87.4, -52, 10};

        long count = Arrays.stream(realNumbers).count();
        System.out.println("Count of elements: " + count);

        double minimum = Arrays.stream(realNumbers).min().getAsDouble();
        System.out.println("Minimum: " + minimum);

        double maximum = Arrays.stream(realNumbers).max().getAsDouble();
        System.out.println("Maximum: " + maximum);

        double sum = Arrays.stream(realNumbers).sum();
        System.out.println("Sum: " + sum);

        double average = Arrays.stream(realNumbers).average().getAsDouble();
        System.out.println("Average: " + average);

        int[] numbers = {155, 23, 84, 15, 96, -11, 3, 48, -22, 101};

        count = Arrays.stream(numbers).count();
        System.out.println("Count of elements: " + count);

        System.out.print("Odd numbers: ");
        Arrays.stream(numbers).filter(el -> el % 2 != 0).forEach(el -> System.out.print(el + " "));
        System.out.println();

        System.out.print("Even numbers: ");
        Arrays.stream(numbers).filter(el -> el % 2 == 0).forEach(el -> System.out.print(el + " "));
        System.out.println();
    }
}
