package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapTwoElementsInAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 3, 4, 5, 2, 7 , 8));
        System.out.println(list);

        Collections.swap(list, 1, 5);
        System.out.println(list);
    }
}
