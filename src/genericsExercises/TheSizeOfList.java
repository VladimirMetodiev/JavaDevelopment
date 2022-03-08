package genericsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheSizeOfList {
    public static void main(String args[]) {
        List<Integer> num = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));
        System.out.printf("The size of list is: %d%n", getSize(num));

        List<String> someExpressions = new ArrayList<>(Arrays.asList("get to know her", "have a lot in common", "get on well with", "enjoy her company"));
        System.out.printf("The size of list is: %d%n", getSize(someExpressions));
    }

    private static int getSize(List<?> list) {
        return list.size();
    }
}
