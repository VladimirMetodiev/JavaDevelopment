package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PrintList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));

        // Принтиране с for цикъл
        for (int a = 0; a < myList.size(); a++) {
            if(a < myList.size() - 1) System.out.print(myList.get(a) + ", ");
            else System.out.println(myList.get(a));
        }


        // Принтиране с for-each цикъл
        for (int element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();

        myList.forEach(el -> System.out.print(el + " "));
        System.out.println();


        // Принтиране с while цикъл
        int counter = 0;
        while (counter < myList.size()) {
            System.out.print(myList.get(counter) + " ");
            counter++;
        }
        System.out.println();


        // Принтиране с итератор
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");


        // Принтиране на списък от стрингове с методът .join()
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Sydney", "Melbourne", "Brisbane", "Perth", "Adelaide", "Gold Coast", "Wollongong", "Canberra"));
        System.out.print("Australian cities: " + String.join(", ", cities));
    }
}
