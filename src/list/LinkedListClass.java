package list;

import java.util.*;

public class LinkedListClass {
    public static void main(String[] args) {

        // Създаване на списък
        LinkedList<String> theFirstList = new LinkedList<>();
        LinkedList<Integer> theSecondList = new LinkedList<>();

        System.out.println("Example: Initialization");

        // Инициализиране на списък
        LinkedList<Double> theThirdList = new LinkedList<>(Arrays.asList(1.2, 2.3, 3.4, 4.5, 5.6));
        System.out.println(theThirdList.toString());

        System.out.println("\nExample: method .add(), .addFirst(), .offerFirst(), .addLast() and .offerLast()");

        // Добавяне на елемент
        theFirstList.add("Melbourne");
        theFirstList.add("Brisbane");
        theFirstList.add("New York");
        theFirstList.addFirst("Sydney");            // Добавя елемент в началото на списъка
        theFirstList.offerFirst("Washington");       // Добавя елемент в началото на списъка
        theFirstList.addLast("Philadelphia");       // Добавя елемент в края на списъка
        theFirstList.offerLast("Boston");           // Добавя елемент в края на списъка
        System.out.println(theFirstList);

        System.out.println("\nExample: method .remove(), .removeFirst(), .pollFirst(), .removeLast(), and .pollLast()");

        // Премахване на елемент
        theFirstList.remove(4);
        theFirstList.remove("Philadelphia");
        theFirstList.removeFirst();                 // Премахва елемент от началото на списъка
        theFirstList.removeLast();                  // Премахва елемент от края на списъка
        System.out.println(theFirstList);

        System.out.println("\nExample: method .set()");

        // Замяна (поставяне) на елемент
        theFirstList.add("Perth");
        theFirstList.add("Adelaide");
        theFirstList.add("Norfolk");
        theFirstList.add("Canberra");
        theFirstList.set(5, "Gold Coast");
        theFirstList.add(6, "Wollongong"); // добавяне на елемент
        System.out.println(theFirstList);

        System.out.println("\nExample: method .size()");

        // Размер на списъка
        System.out.println(theFirstList.size());

        System.out.println("\nExample: method .isEmpty()");

        // Проверка дали списъкът е празен
        System.out.println(theFirstList.isEmpty());

        System.out.println("\nExample: method .contains()");

        // Проверка дали списъкът съдържа даден елемент
        System.out.println(theFirstList.contains("Perth"));

        System.out.println("\nExample: method .clear()");

        // Изчистване (изтриване) на списък
        theFirstList.clear();
        System.out.println(theFirstList.isEmpty());

        System.out.println("\nExample: method .addAll()");

        // Добавяне на колекция от елементи в списък
        theSecondList.addAll(new LinkedList<>(Arrays.asList(3, 6, 9, 12, 15)));
        System.out.println(theSecondList);
        theSecondList.addAll(3, new LinkedList<>(Arrays.asList(10, 11)));
        System.out.println(theSecondList);

        System.out.println("\nExample: method .removeAll()");

        // Премахване на група от елементи от списък
        theSecondList.removeAll(new LinkedList<>(Arrays.asList(10, 11)));
        System.out.println(theSecondList);

        System.out.println("\nExample: method .get(), .getFirst(), .peekFirst(), .getLast() and .peekLast()");

        // Взимане на елемент от списък
        System.out.println(theSecondList.getFirst());
        System.out.println(theSecondList.peekFirst());
        System.out.println(theSecondList.get(2));
        System.out.println(theSecondList.getLast());
        System.out.println(theSecondList.peekLast());

        System.out.println("\nExample: method .indexOf() and .lastIndexOf()");

        // Определяне на индекса на елемент
        theSecondList.addAll(new LinkedList<>(Arrays.asList(27, 18, 36, 3, 72, 54, 9)));
        System.out.println(theSecondList);
        System.out.println(theSecondList.indexOf(12));
        System.out.println(theSecondList.lastIndexOf(3));

        System.out.println("\nExample: method .iterator()");

        // Итериране (преминаване) на елементите на списък
        Iterator<Integer> iterator = theSecondList.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("\nExample: method .nCopies(count, element)");

        // Запълване на списък с n на брой копия на елемент
        theSecondList = new LinkedList<>(Collections.nCopies(10, 18));
        System.out.println(theSecondList);
    }
}
