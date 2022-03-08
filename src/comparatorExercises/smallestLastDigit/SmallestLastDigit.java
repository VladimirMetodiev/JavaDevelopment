package comparatorExercises.smallestLastDigit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallestLastDigit {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(23, 2451, 19, 107, 342, 8, 1555, 3000, 16, 484));
        Collections.sort(numbers, new LastDigitComparator());
        System.out.println(numbers);
    }
}
