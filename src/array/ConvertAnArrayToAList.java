package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertAnArrayToAList {
    public static void main(String[] args) {
        System.out.println("Example 1");

        String[] array = {"boxer", "rottweiler", "beagle", "dalmatian"};
        ArrayList<String> list = new ArrayList(Arrays.asList(array));
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();



        System.out.println("Example 2");

        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> integerList = new ArrayList<>(integerArray.length);

        for (int element: integerArray) {
            integerList.add(element);
        }

        integerList.forEach(e -> System.out.print(e + " "));
        System.out.println();



        System.out.println("Example 3");

        int[] intArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        List<Integer> intList = Arrays.stream(intArray)                         // IntStream
                                           .boxed()                             // Stream<Integer>
                                           .collect(Collectors.toList());
        intList.forEach(e -> System.out.print(e + " "));
        System.out.println();



        System.out.println("Example 4");

        double[] doubleArray = {3.33, 11.0889, 122.96370321, 15120.0723071169643041};

        // конвертирам масив от тип double в масив от обвиващ тип Double
        Double[] boxedArray = Arrays.stream(doubleArray).boxed().toArray(Double[]::new);

        // добавям всички елементи на масивът от тип Double в списък от тип Double
        List<Double> doubleList = new ArrayList<>();
        Collections.addAll(doubleList, boxedArray);

        doubleList.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
