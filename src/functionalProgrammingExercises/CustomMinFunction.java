package functionalProgrammingExercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> getMin = (arr) -> {
            int min = arr[0];
            for (int a = 1; a < arr.length; a++) {
                if(min > arr[a]) min = arr[a];
            }
            return min;
        };

        System.out.println(getMin.apply(numbers));
    }
}



//Condition

//Write a simple program that reads a set of numbers from the console and finds the smallest of the numbers using
//a simple Function<Integer[], Integer> .



//Test

//16 28 3 17 -4 19 8 23 0 7
//-4

//6 37 -9 16 -3 27 14 -9 -2 19
//-9



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        List<Integer> num = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
//        int minimum = Collections.min(num);
//
//        System.out.println(minimum);
//    }
