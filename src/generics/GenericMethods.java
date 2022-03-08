package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        Double[] realNumbers = {3.33, 11.09, 122.69, 15120.07, 228616586.57};
        String[] cities = {"Sydney", "Melbourne", "Brisbane", "Perth", "Adelaide", "Gold Coast"};

        printArray(numbers);
        printArray(realNumbers);
        printArray(cities);

        System.out.println("\nThe maximum for the array of integers: " + findMaximum(numbers));
        System.out.println("The maximum for the array of real numbers: " + findMaximum(realNumbers));
        System.out.println("The maximum for the array of strings: " + findMaximum(cities) + "\n");


        List<Integer> someList = new ArrayList<>(Arrays.asList(numbers));
        List<Double> someRealNumbers = new ArrayList<>(Arrays.asList(realNumbers));
        printElements(someList);
        printElements(someRealNumbers);
    }

    private static<T> void printArray(T[] array){
        System.out.printf("%s array: ", array.getClass().getSimpleName());
        System.out.println(Arrays.toString(array));
    }

    private static<T extends Comparable<T>> T findMaximum(T[] array){
        T max = array[0];
        for (T element : array){
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // Wildcards

    private static void printElements(List<? extends Number> list){
        for (Number element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
     * E - element
     * K - key
     * N - number
     * T - type
     * V - value
     * S, U, V etc.
     */
}
