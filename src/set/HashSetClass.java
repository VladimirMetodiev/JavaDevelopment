package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {
        // Set (множество) - това е колекция, която съхранява само уникални елементи;

        // Създаване на HashSet
        HashSet<String> names = new HashSet<>();

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

        // Размер на HashSet-ът - определя се чрез метод .size()
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
        System.out.println("\n--------------------------------------------------");

        // Съдържа ли ...
        System.out.println("Does it contain: " + names.contains("Vladimir"));
        System.out.println("Does it contain: " + names.contains("Anna"));
        System.out.println("--------------------------------------------------");

        // Изчистване на множеството
        names.clear();
        System.out.println(names.isEmpty());
        System.out.println("--------------------------------------------------");



        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Обединяване на 2 множества
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);
        System.out.println("--------------------------------------------------");

        // Отделяне само на общите за 2 множества елементи
        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);
        System.out.println("--------------------------------------------------");

        // Изваждане на група от елементи
        HashSet<Integer> subtract = new HashSet<>(union);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
        System.out.println("--------------------------------------------------");
    }
}
