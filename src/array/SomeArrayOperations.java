package array;

import java.util.Arrays;

public class SomeArrayOperations {
    public static void main(String[] args) {
        int[] someArray = {2, 8, 19, -4, 27, 6, -47, 14, 22, 18};

        System.out.println("Printing: " + Arrays.toString(someArray));

        int min = Arrays.stream(someArray).min().getAsInt();
        System.out.println("The smallest number: " + min);

        int max = Arrays.stream(someArray).max().getAsInt();
        System.out.println("The largest number: " + max);

        int sum = Arrays.stream(someArray).sum();
        System.out.println("Sum: " + sum);

        long count = Arrays.stream(someArray).count();
        System.out.println("Count of elements: " + count);

        System.out.print("Sorting: ");
        Arrays.stream(someArray).sorted().forEach(el -> System.out.print(el + " "));

        System.out.print("\nGetting the first 4 numbers: ");
        Arrays.stream(someArray).limit(4).forEach(el -> System.out.print(el + " "));

        System.out.print("\nGetting the last 4 numbers: ");
        Arrays.stream(someArray).skip(6).forEach(el -> System.out.print(el + " "));

        System.out.print("\nGetting a range of items from index 2 to index 7: ");
        Arrays.stream(someArray).skip(2).limit(5).forEach(el -> System.out.print(el + " "));
    }
}
