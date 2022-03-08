package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        // Създаване на HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Проверка дали е празен
        System.out.println("Is it empty? " + map.isEmpty());
        System.out.println("------------------------------------------------------------");


        // Добавяне на елементи
        map.put(1, "Vladimir Metodiev");
        map.put(2, "Anna Dimitrova");
        map.put(3, "Nikola Petrov");
        map.put(4, "Irina Georgieva");
        System.out.println(map);

        HashMap<Integer, String> temporary = new HashMap<>();
        temporary.put(5, "Atanas Penev");
        temporary.put(6, "Ralitza Ivanova");
        map.putAll(temporary);
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // null може да бъде използвана както като ключ, така и като стойност
        map.put(null, "Ivan Todorov");
        map.put(7, null);
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // Замяна на елементи - става като на елемента с определен ключ, зададем нова стойност
        map.put(5, "Milen Goranov");
        map.put(6, "Marina Topolova");
        System.out.println(map);
        // Ако някой от ключовете в temporary, съвпада с ключ от map, то тогава елемента от temporary с този ключ, ще замени елемента от map
        map.putAll(temporary);
        System.out.println(map);
        map.replace(7, "Marina Topolova");
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // Добавяне на елемент но само ако такъв елемент не е наличен в колекцията - метод .putIfAbsent()
        map.putIfAbsent(2, "Anna Dimitrova");
        System.out.println(map);
        map.putIfAbsent(1, "Galina Milanova");
        System.out.println(map);
        map.putIfAbsent(8, "Nina Mihailova");
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // Размер на HashMap-ът - метод .size()
        System.out.println("Size: " + map.size());
        System.out.println("------------------------------------------------------------");


        // Взимане на стойността на елемент - метод .get() и ключът на елемента
        System.out.println(map.get(1));
        System.out.println(map.get(-1));
        System.out.println("------------------------------------------------------------");


        // Премахване на елемент - метод .remove() и ключът на елемента
        map.remove(null);
        System.out.println(map);
        System.out.println("------------------------------------------------------------");


        // Проверка дали съдържа ...
        System.out.println("Does it contain the key: " + map.containsKey(1));
        System.out.println("Does it contain the value: " + map.containsValue("Ivan Ivanov"));
        System.out.println("------------------------------------------------------------");


        // Взимаме всички ключове от HashMap-ът - метод .keySet()
        System.out.println("Keys: " + map.keySet());
        System.out.println("------------------------------------------------------------");


        // Взимаме всички стойности от HashMap-ът - метод .values()
        System.out.println("Values: " + map.values());
        System.out.println("------------------------------------------------------------");


        // Взимаме всички елементи от HashMap-ът - метод .entrySet()
        System.out.println("entrySet: " + map.entrySet());
        System.out.println("------------------------------------------------------------");


        // Принтиране на елементите на HashMap-ът
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("Key[%d] => Value[%s]%n", entry.getKey(), entry.getValue());
        }
        System.out.println("------------------------------------------------------------");

        /*
         * В основата на HashMap лежи масив. Елементите на този масив са структури на LinkedList. Тези LinkedList структури
         * се запълват с елементите, които добавям в HashMap.
         *
         * Изразът: HashMap<K, V> map = new HashMap<>(); - създава масив, с размер по подразбиране 16. Този масив се нарича table.
         * Всеки негов елемент, представлява LinkedList и може да съдържа множество двойки ключ-стойност, които са добавени в HashMap-ът.
         * Когато с методът .put() добавя двойка ключ-стойност в HashMap-ът, първо се проверява дали ключът е равен на null, ако е равен се добавя
         * на позиция с индекс 0. Ако не е равен на null, се определя хеш-код за този ключ и по даден алгоритъм се определя, на коя позиция
         * в масивът да бъде поставена тази двойка ключ-стойност. По този начин тя става елемент на LinkedList-а на тази позиция.
         * - Когато продължим да добавяме елементи, възможно е да добавим двойка ключ-стойност, чиито хеш-код да се различава от хеш-кодовете
         *   на другите елементи, но да бъде разпределен на индекс в масива, на който вече има добавена двойка. Тогава се проверява дали
         *   хеш-кодовете на новият и на вече добавеният елемен са равни, ако не са, тогава новият обект се добавя в края на LinkedList-а.
         * - Когато продължим да добавяме елементи, възможно е да добавим двойка ключ-стойност, чиито хеш-код да съвпада с хеш-кода на друг
         *   вече добавен елемент, новата двойка ще бъде радпределена на същият индекс в масива където се намира двойката със съвпадащият
         *   хеш-код. След като хеш-кодовете (на ключовете) съвпадат, ключовете на тези елементи се сравняват с метода .equals(). Ако ключовете са
         *   идентични, тогава новата двойка се презаписва на мястото на старата. Ако не са идентични, тогава новата двойка се добавя
         *   в края на LinkedList-а.
         * - Когато искаме да намерим двойка ключ-стойност в HashMap-ът, с методът .get(), в скобите на който е указан ключ, първо се определя хеш-кода
         *   за този ключ, след това се определя индексът в масива, на който може да се намира елемента. След това започва проверка в
         *   LinkedList-а, който се намира на този индекс. Проверява се съвпада ли хеш-кода по указаният ключ с хеш-кода на някой от добавените
         *   елементи. Ако има съвпадение, тогава се сравняват с метода .equals(), ако отново има съвпадение, тогава сме намерили търсената двойка.
         *
         * При създавнето на HashMap мога да задам 2 параметъра, които влияят върху производителността:
         * - initial capacity - начален размер на масива (по подразбиране е 16);
         * - load factor - коефициент указващ, колко трябва да се запълни масивът, след достигането на което,
         *   размерът му трябва да се удвои. По подразбиране е 0.75F. Например: ако capacity е 16, тогава load factor = 16 * 0.75 = 12.
         *   При достигането на 12 елемента, масива ще се удвои - 32 елемента и всички елементи на HashMap-ът ще бъдат рехеширани,
         *   т.е. ще бъде определено на кой индекс от масива ще се намират.
         */

        HashMap<Integer, Double> newMap = new HashMap<>(10, 0.6F);
        newMap.put(1, 2.3);
        newMap.put(2, 3.4);
        newMap.put(3, 4.5);
        newMap.put(4, 5.6);
        newMap.put(5, 6.7);
        newMap.put(6, 7.8);
        for(Map.Entry<Integer, Double> entry : newMap.entrySet()) {
            System.out.printf("Key[%d] => Value[%s]%n", entry.getKey(), entry.getValue());
        }
        System.out.println("------------------------------------------------------------");
    }
}
