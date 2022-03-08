package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Sydney", "Melbourne", "Brisbane", "Perth", "Adelaide", "Gold Coast", "Wollongong", "Canberra"));

        Collections.sort(cities);
        System.out.println(cities);

        Collections.reverse(cities);
        System.out.println(cities);

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Senegal", "Guinea", "Bissau", "Liberia", "Ghana"));
        Collections.sort(countries, Collections.reverseOrder());
        System.out.println(countries);

    }
}
