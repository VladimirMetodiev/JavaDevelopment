package list;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Създаване на списък
        List<String> theFirstList = new ArrayList<>();
        ArrayList<Integer> theSecondList = new ArrayList<>();


        System.out.println("Example: Initialization");

        // Инициализиране на списък
        ArrayList<Long> theThirdList = new ArrayList<>(Arrays.asList(5000L, 6000L, 7000L, 8000L, 9000L));
        System.out.println(theThirdList.toString());

        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        List<Integer> theFourthList = Arrays.stream(input.nextLine().split(",\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        System.out.println(theFourthList.toString());


        System.out.println("\nExample: method .add()");

        // Добавяне на елемент
        theFirstList.add("Sydney");
        theFirstList.add("Melbourne");
        theFirstList.add("Brisbane");
        theFirstList.add("New York");
        theFirstList.add("Philadelphia");
        System.out.println(theFirstList);


        System.out.println("\nExample: method .remove()");

        // Премахване на елемент
        theFirstList.remove(3);
        theFirstList.remove("Philadelphia");
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
        theSecondList.addAll(new ArrayList<Integer>(Arrays.asList(3, 6, 9, 12, 15)));
        System.out.println(theSecondList);
        theSecondList.addAll(3, new ArrayList<>(Arrays.asList(10, 11)));
        System.out.println(theSecondList);


        System.out.println("\nExample: method .removeAll()");

        // Премахване на група от елементи от списък
        theSecondList.removeAll(new ArrayList<Integer>(Arrays.asList(10, 11)));
        System.out.println(theSecondList);


        System.out.println("\nExample: method .retainAll()");

        // Премахване на всички елементи, с изключение на указаните
        theSecondList.addAll(Arrays.asList(18, 21, 24, 27, 30));
        theSecondList.retainAll(Arrays.asList(6, 12, 18, 24, 30));
        System.out.println(theSecondList);


        System.out.println("\nExample: method .containsAll()");

        // Проверка дали списъкът съдържа ВСИЧКИ указани елементи
        System.out.println(theSecondList.containsAll(Arrays.asList(3, 6, 12, 18)));


        System.out.println("\nExample: method .subList(int fromIndex, int toIndex)");

        // Създаване на подсписък
        System.out.println("Sub-List: " + theSecondList.subList(1, 3));


        System.out.println("\nExample: method .get()");

        // Взимане на елемент от списък
        System.out.println(theSecondList.get(2));


        System.out.println("\nExample: method .indexOf() and .lastIndexOf()");

        // Определяне на индекса на елемент
        theSecondList.addAll(new ArrayList<>(Arrays.asList(27, 18, 36, 3, 72, 54, 9)));
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
        theSecondList = new ArrayList<>(Collections.nCopies(3, 9));
        System.out.println(theSecondList);
    }
}
