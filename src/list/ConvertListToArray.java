package list;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertListToArray {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Argentina", "Chile", "Uruguay", "Paraguay", "Brazil"));
        String[] array = countries.toArray(new String[countries.size()]);
        System.out.println(Arrays.toString(array));


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5));
        Integer[] num = numbers.toArray(new Integer[numbers.size()]);
        System.out.println(Arrays.toString(num));


        ArrayList<Double> realNumbers = new ArrayList<>(Arrays.asList(6.8, 12.4, 5.4, 9.1, 7.7));
        Double[] realNumArr = new Double[realNumbers.size()];
        realNumbers.toArray(realNumArr);
        System.out.println(Arrays.toString(realNumArr));
    }
}
