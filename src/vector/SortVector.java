package vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class SortVector {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(Arrays.asList(53, -26, 13, 48, -2, 18, 37, 92, 11, 64));

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

        Vector<Integer> anotherNumbers = new Vector<>(Arrays.asList(33, -12, 14, -50, 48, 2, 31, 29, -38, 24));
        Collections.sort(anotherNumbers, Collections.reverseOrder());
        System.out.println(anotherNumbers);
    }
}
