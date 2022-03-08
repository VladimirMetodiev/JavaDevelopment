package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveElementsWithIterator {
    public static void main(String[] args) {
        /*
         * Итераторът, за разлика от for-each, позволява премахването на елементи от дадена колекция.
         * Преди да премахна елемент, използвайки метода .remove(), задължително трябва да съм взел елемента, с метода .next(),
         * в противен случай ще бъде хвърлено изключение - IllegalStateException.
         */

        ArrayList<String> rivers = new ArrayList<>(Arrays.asList("Arno", "Volga", "Garonne", "Danube", "Dnieper", "Dniester", "Elbe", "Loire", "Maritsa", "Rhine", "Seine", "Struma", "Tiber"));

        Iterator<String> iterator = rivers.iterator();
        int counter = 1;

        while(iterator.hasNext()) {
            iterator.next();
            if(counter > 5) {
                iterator.remove();
            }
            counter++;
        }

        System.out.println(String.join(", ", rivers));
    }
}



//Another solution

//    public static void main(String[] args) {
//        ArrayList<String> rivers = new ArrayList<>(Arrays.asList("Arno", "Volga", "Garonne", "Danube", "Dnieper", "Dniester", "Elbe", "Loire", "Maritsa", "Rhine", "Seine", "Struma", "Tiber"));
//        rivers.stream().limit(5).forEach(e -> System.out.print(e + " "));
//    }
