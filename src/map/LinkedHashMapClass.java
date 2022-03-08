package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        // Създаване на LinkedHashMap<K, V>
        LinkedHashMap<Integer, Double> map = new LinkedHashMap<>();


        // Проверка дали е празен
        System.out.println("Is it empty? " + map.isEmpty());
        System.out.println("------------------------------------------------------------");


        // Добавяне на елементи
        map.put(15, 45.8);
        map.put(12, 53.1);
        map.put(18, 49.3);
        map.put(24, 52.8);
        System.out.println(map);

        HashMap<Integer, Double> temporary = new HashMap<>();
        temporary.put(25, 44.6);
        temporary.put(26, 47.8);
        map.putAll(temporary);
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // null може да бъде използвана както като ключ, така и като стойност
        map.put(null, 53.2);
        map.put(6, null);
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // Замяна на елементи - става като на елемента с определен ключ, задам нова стойност или чрез метода .replace()
        map.put(6, 42.6);
        map.put(18, 48.8);
        System.out.println(map);
        map.replace(26, 45.3);
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // Премахване на елемент - метод .remove() и ключът на елемента
        map.remove(null);
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // Добавяне на елемент но само ако такъв елемент не е наличен в колекцията - метод .putIfAbsent()
        map.putIfAbsent(2, 38.9);
        System.out.println(map);
        map.putIfAbsent(1, 44.8);
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // Размер на LinkedHashMap - метод .size()
        System.out.println("Size: " + map.size());
        System.out.println("------------------------------------------------------------");


        // Взимане на стойността на елемент - метод .get() и ключът на елемента
        System.out.println(map.get(15));
        System.out.println(map.get(-1));
        System.out.println("------------------------------------------------------------");


        // Проверка дали съдържа ...
        System.out.println("Does it contain the key: " + map.containsKey(1));
        System.out.println("Does it contain the value: " + map.containsValue(100.0));
        System.out.println("------------------------------------------------------------");


        // Взимаме всички ключове от LinkedHashMap-ът - метод .keySet()
        System.out.println("Keys: " + map.keySet());
        System.out.println("------------------------------------------------------------");


        // Взимаме всички стойности от LinkedHashMap-ът - метод .values()
        System.out.println("Values: " + map.values());
        System.out.println("------------------------------------------------------------");


        // Взимаме всички елементи от LinkedHashMap-ът - метод .entrySet()
        System.out.println("entrySet: " + map.entrySet());
        System.out.println("------------------------------------------------------------");


        // Принтиране на елементите на LinkedHashMap-ът
        for(Map.Entry<Integer, Double> entry : map.entrySet()) {
            System.out.printf("Key[%d] => Value[%s]%n", entry.getKey(), entry.getValue());
        }
        System.out.println("------------------------------------------------------------");


        // LinkedHashMap съхраняващ елементите по реда на тяхното добавяне
        LinkedHashMap<String, Integer> newMap = new LinkedHashMap<>(16, 0.75F, false);
        newMap.put("invent", 6);
        newMap.put("discover", 8);
        newMap.put("conquer", 7);
        newMap.put("create", 6);
        System.out.println(newMap);
        System.out.println("------------------------------------------------------------");


        // LinkedHashMap съхраняващ елементите по реда на тяхното използване
        LinkedHashMap<String, Integer> anotherMap = new LinkedHashMap<>(16, 0.75F, true);
        anotherMap.put("invent", 6);
        anotherMap.put("conquer", 7);
        anotherMap.put("create", 6);
        anotherMap.put("discover", 8);
        System.out.println(anotherMap);
        anotherMap.get("conquer");
        anotherMap.put("understand", 10);
        System.out.println(anotherMap);
        System.out.println("------------------------------------------------------------");
    }
}
