package array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayVarTwo {
    public static void main(String[] args) {
        Integer[] array = {2, 4, 6, 8, 10, 12};
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }
}
