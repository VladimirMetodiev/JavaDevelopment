package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ComposingPredicates {
    public static void main(String[] args) {
        // We'd like to print only those numbers which are odd or can be divided by 5 (i.e. x % 5 == 0);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> dividedBy5 = x -> x % 5 == 0;
        Predicate<Integer> predicate = isEven.negate().or(dividedBy5);

        numbers.forEach(element -> {
            if (predicate.test(element)) System.out.print(element + " ");
        });

        System.out.println("\n--------------------------------------------------");

        // We'd like to print only those numbers which are odd and can be divided by 5;

        Predicate<Integer> newPredicate = isEven.negate().and(dividedBy5);

        numbers.forEach(element -> {
            if (newPredicate.test(element)) System.out.print(element + " ");
        });
    }
}
