package vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class CopyVector {
    public static void main(String[] args) {
        Vector<String> source = new Vector<>(Arrays.asList("effort", "success", "victory"));
        Vector<String> destination = new Vector<>(source);
        System.out.println(destination);

        Vector<Integer> numbers = new Vector<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20));
        Vector<Integer> copy = new Vector<>(Arrays.asList(3, 6, 9, 12, 15, 18, 21, 24, 27, 30));
        // Vector-a дестинация, трябва да има равен или по-голям брой елементи, от Vector-a източник,
        // защото в противен случай ще хвърли изключение java.lang.IndexOutOfBoundsException

        Collections.copy(copy, numbers);
        System.out.println(copy);
    }
}
