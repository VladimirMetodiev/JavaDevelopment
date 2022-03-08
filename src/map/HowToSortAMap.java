package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HowToSortAMap {
    public static void main(String[] args) {
        Map<String, Integer> unSortMap = new HashMap<>();
        unSortMap.put("banana", 10);
        unSortMap.put("papaya", 6);
        unSortMap.put("grapes", 8);
        unSortMap.put("peach", 16);
        unSortMap.put("apricot", 30);
        unSortMap.put("apple", 5);
        unSortMap.put("pear", 5);
        unSortMap.put("plum", 22);
        unSortMap.put("orange", 3);
        unSortMap.put("pineapple", 1);

        // Sort by Keys

        // Сортира по ключове, banana, papaya, grapes и т.н., след което връща нов LinkedHashMap, който ни е нужен, за да запазим реда
        Map<String, Integer> fruit = unSortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        printAMap(fruit);
        System.out.println("------------------------------");

        Map<String, Integer> unSortVegetables = new HashMap<>();
        unSortVegetables.put("potato", 10);
        unSortVegetables.put("pepper", 12);
        unSortVegetables.put("tomato", 12);
        unSortVegetables.put("cabbage", 2);
        unSortVegetables.put("parsley", 1);
        unSortVegetables.put("onion", 5);
        unSortVegetables.put("garlic", 2);
        unSortVegetables.put("carrot", 9);
        unSortVegetables.put("lettuce", 3);
        unSortVegetables.put("cucumber", 6);

        // Sort by Values

        // Сортирам по стойности, след което запазвам реда с LinkedHashMap
        Map<String, Integer> vegetables = unSortVegetables.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        printAMap(vegetables);
    }

    private static void printAMap(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s = %d%n", entry.getKey(), entry.getValue());
        }
    }
}
