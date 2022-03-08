package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinAndMax {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(29, -11, 14, -6, 13, 8, -22, 42, 15, -22, 0, 5, 21, 18));

        System.out.println("Maximum = " + Collections.max(numbers));
        System.out.println("Minimum = " + Collections.min(numbers));
    }
}
