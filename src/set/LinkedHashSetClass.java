package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        // Създаване на LinkedHashSet
        LinkedHashSet<String> names = new LinkedHashSet<>();

        // Проверка дали е празно
        System.out.println("Is it empty? " + names.isEmpty());
        System.out.println("--------------------------------------------------");

        // Добавяне на елементи
        names.add("Anna");
        names.add("Victoria");
        names.add("Sarah");
        names.add("Eva");
        names.add("Irina");
        System.out.println(names);

        ArrayList<String> temporary = new ArrayList<>(Arrays.asList("Maria", "Valentina", "Nina"));
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
        System.out.println("\n--------------------------------------------------");

        // Съдържа ли ...
        System.out.println("Does it contain: " + names.contains("Vladimir"));
        System.out.println("Does it contain: " + names.contains("Anna"));
        System.out.println("--------------------------------------------------");

        // Изчистване на множеството
        names.clear();
        System.out.println(names.isEmpty());
        System.out.println("--------------------------------------------------");
    }
}
