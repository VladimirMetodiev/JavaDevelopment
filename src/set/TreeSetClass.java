package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        // Създаване на TreeSet
        TreeSet<String> names = new TreeSet<>();

        // Проверка дали е празно
        System.out.println("Is it empty? " + names.isEmpty());
        System.out.println("--------------------------------------------------");

        // Добавяне на елементи
        names.add("Anna");
        names.add("Nina");
        names.add("Irina");
        names.add("Eva");
        names.add("Daniela");
        System.out.println(names);

        ArrayList<String> temporary = new ArrayList<>(Arrays.asList("Maria", "Valentina", "Victoria"));
        names.addAll(temporary);
        System.out.println(names);
        System.out.println("--------------------------------------------------");

        // Премахване на елементи
        names.remove("Irina");
        System.out.println(names);
        System.out.println("--------------------------------------------------");

        // Размер на TreeSet-ът - определя се чрез методът .size()
        System.out.println("Size: " + names.size());
        System.out.println("--------------------------------------------------");

        // Принтиране
        System.out.println("FOR EACH LOOP");
        for(String element : names) System.out.print(element + " ");
        System.out.println("\n---");

        names.forEach(el -> System.out.print(el + " "));
        System.out.println("\n---");

        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n---");

        iterator = names.descendingIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n--------------------------------------------------");

        // Съдържа ли ...
        System.out.println("Does it contain: " + names.contains("Vladimir"));
        System.out.println("Does it contain: " + names.contains("Anna"));
        System.out.println("--------------------------------------------------");

        // Изчистване на множеството
        names.clear();
        System.out.println(names.isEmpty());
        System.out.println("--------------------------------------------------");



        TreeSet<Integer> hashSet1 = new TreeSet<>(Arrays.asList(11, 2, 33, 4, 55, 66));
        TreeSet<Integer> hashSet2 = new TreeSet<>(Arrays.asList(33, 44, 5, 66, 7, 888));

        // Обединяване на 2 множества
        TreeSet<Integer> union = new TreeSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);
        System.out.println("--------------------------------------------------");

        // Отделяне само на общите за 2 множества елементи
        TreeSet<Integer> intersect = new TreeSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);
        System.out.println("--------------------------------------------------");

        // Изваждане на група от елементи
        TreeSet<Integer> subtract = new TreeSet<>(union);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
        System.out.println("--------------------------------------------------");



        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(50, 32, 6, 92, 1, 84, 11, 63, 21, 31, 52, 14, 3, 19, 4, 55, 38, 2, 66, 5, 18, 49, 9, 82, 100));

        // Взимане на първият елемент с метода .first() и взимане на последният елемент с метода .last()
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println("--------------------------------------------------");

        // Взимане на всички елементи от първият до указаният елемент чрез метода .headSet()
        System.out.println(numbers.headSet(50));
        System.out.println("--------------------------------------------------");

        // Взимане на всички елементи от указаният елемент до последният елемент чрез метода .tailSet()
        System.out.println(numbers.tailSet(50));
        System.out.println("--------------------------------------------------");

        // Взимане на елементите от указаното подмножество - .subSet(from, to)
        System.out.println(numbers.subSet(11, 82));
        System.out.println(numbers.subSet(10, 70));
        System.out.println("--------------------------------------------------");

        // Взимане на най-малкият елемент от множеството, който е по-голям или равен на указаният елемент, или null, ако няма такъв елемент, чрез .ceiling()
        System.out.println(numbers.ceiling(30));
        System.out.println("--------------------------------------------------");

        // Взимане на най-големият елемент от множеството, който е по-малък или равен на указаният елемент, или null, ако няма такъв елемент, чрез .floor()
        System.out.println(numbers.floor(30));
        System.out.println("--------------------------------------------------");
    }
}
