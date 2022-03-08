package list;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparisonOfLists {
    public static void main(String[] args) {
        ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G'));
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G'));
        ArrayList<Character> list3 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'));
        ArrayList<Character> list4 = new ArrayList<>(Arrays.asList('A', 'B', 'm', 'D', 'E', 'F', 'G'));
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(65, 66, 67, 68, 69, 70, 71));

        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));
        System.out.println(list1.equals(list4));
        System.out.println(list1.equals(list5));
    }
}
