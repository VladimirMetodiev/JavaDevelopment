package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        BiFunction<Integer, Integer, Integer> max = (x, y) -> x >= y ? x : y;
        System.out.println(max.apply(a, b));
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        BiFunction<Integer, Integer, Integer> max = (x, y) -> {
//            return x >= y ? x : y;
//        };
//        System.out.println(max.apply(a, b));
//    }
