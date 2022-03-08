package array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {145, 19, -32, 256, -98, 0, 68, 51, -3, 72};
        Arrays.sort(numbers);

        System.out.print("Sorted Int Array: ");
        System.out.println(Arrays.toString(numbers));


        String[] names = {"Vladimir", "Alexander", "Nina", "Diana", "Konstantin", "Anna", "Daniel", "Teodora", "Stephan", "Philip"};
        Arrays.sort(names);

        System.out.print("Sorted String Array: ");
        System.out.println(Arrays.toString(names));
    }
}
