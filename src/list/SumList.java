package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SumList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        Integer sum1 = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        Integer sum2 = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
