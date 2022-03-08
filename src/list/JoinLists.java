package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        list1.addAll(list2);
        System.out.println(list1);

        List<Integer> list3 = list1.subList(3, 10);
        System.out.println(list3);
    }
}
