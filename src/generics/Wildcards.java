package generics;

import java.util.*;

public class Wildcards {
    public static void main(String[] args) {
        List theFirst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        printList(theFirst);
        List theSecond = new LinkedList<>(Arrays.asList(1.1, 1.2, 1.3, 1.4, 1.5));
        printList(theSecond);
        List theThird = new Vector<>(Arrays.asList("struggle", "fight", "hit", "advance", "progress"));
        printList(theThird);

        List<?> theFourth = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
        //Компилаторът няма да ми позволи да напиша: theFourth.add("five"); защото му е неизвестно, какви данни съдържа този списък,
        //затова той не допуска използването на методи, които променят списъка и дава грешка по време на компилация;

        // Правило: когато използвам wildcard с даден обект, не мога да използвам методи, които променят този обект.

        System.out.println(addNumbers(theFirst));
        System.out.println(addNumbers(theSecond));
    }

    // Ако вместо wildcard напиша Object, то тогава, като аргумент ще мога да приемам, само списъци съдържащи данни от тип Object;

    private static void printList(List<?> list){
        System.out.println("The " + list.getClass().getSimpleName() + " contains: " + list);
    }

    private static double addNumbers (List<? extends Number> list) {
        double sum = 0.0;
        for(Number el : list) sum += el.doubleValue();
        return sum;
    }
}
