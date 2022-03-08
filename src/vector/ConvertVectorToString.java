package vector;

import java.util.Arrays;
import java.util.Vector;

public class ConvertVectorToString {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(-2, -1, 0, 1, 2));
        Integer[] array = vector.toArray(new Integer[vector.size()]);
        System.out.println(Arrays.toString(array));

        Vector<Double> realNumbers = new Vector<>(Arrays.asList(0.1, 0.2, 0.3, 0.4, 0.5));
        Double[] realNumArr = new Double[realNumbers.size()];
        realNumbers.toArray(realNumArr);
        System.out.println(Arrays.toString(realNumArr));

        Vector<String> words = new Vector<>(Arrays.asList("cement", "wood", "stone", "concrete", "gypsum"));
        String[] vocables = new String[words.size()];
        words.toArray(vocables);
        System.out.println(Arrays.toString(vocables));
    }
}
