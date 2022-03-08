package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyList {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Sydney", "Melbourne", "Brisbane"));
        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);


        list2.add("Perth");
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list2);
        System.out.println(list3);


        list3.add("Adelaide");
        ArrayList<String> list4 = (ArrayList<String>)list3.clone();
        System.out.println(list4);

        list4.add("Canberra");
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        Collections.copy(list5, list4);
        System.out.println(list5);

        // За да използвам метода .copy(), масива-дестинация, трябва да има равен или по-голям брой елементи, от
        // масива-източник, защото в противен случай ще хвърли изключение java.lang.IndexOutOfBoundsException
    }
}
