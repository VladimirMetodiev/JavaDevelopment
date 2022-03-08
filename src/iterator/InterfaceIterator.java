package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class InterfaceIterator {
    public static void main(String[] args) {
        /*
         * За да се извърши итерация (преминаване) през всички елементи на дадена колекция, може да се използва
         * итератор. Това е обект от клас, който реализира един от двата интерфейса: Iterator или ListIterator.
         * Интерфейсът Iterator позволява да преминем през елементите на колекция и да извличаме или премахваме
         * елементи от нея.
         * Интерфейсът ListIterator разширява интерфейса Iterator и позволява двупосочно обхождане на списък,
         * също така добавя повече методи за модифициране на елементите му. ListIterator се използва от класове,
         * които реализират интерфейса List, т.е.класовете ArrayList и LinkedList.
         */

        ArrayList<String> states = new ArrayList<>(Arrays.asList("Bulgaria", "Romania", "Hungary", "Czech Republic", "Slovakia", "Austria", "Italy", "Switzerland", "France", "Germany", "Portugal", "Spain"));

        // Итератор се създава чрез методът .iterator(), по следният начин:
        Iterator<String> iterator = states.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");

        /*
         * Методи на интерфейс Iterator:
         * .forEachRemaining() - извършва даденото действие за всеки оставащ елемент, докато всички елементи бъдат обработени;
         * .hasNext() - връща true, ако итерацията има още елементи, в противен случай връща false;
         * .next() - връща текущият елемент в итерацията;
         * .remove() - премахва елемент от колекцията;
         *
         */

        // ListIterator се създава чрез методът .listIterator(), по следният начин:
        ListIterator<String> listIterator = states.listIterator();

        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + "; ");
        }
        System.out.println("\n");

        // След преминаването през всички елементи на списъка, текущият елемент в ListIterator-а е "Spain";
        // За да заместя текущият елемент с нов използвам метода .set();
        listIterator.set("Ireland");

        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " > ");
        }

        /*
         * Методи на интерфейсът ListIterator:
         * .add() - вмъква обект преди елемента, който трябва да бъде върнат при следващото повикване към .next();
         * .hasNext() - връща true, ако итерацията има още елементи, в противен случай връща false;
         * .hasPrevious() - връща true, ако в обратното преминаване има предишен елемент, в противен случай връща false;
         * .next() - връща текущият елемент в итерацията;
         * .previous() - връща текущият елемент в обратната итерацията;
         * .nextIndex() - връща индекса на следващия елемент, ако няма такъв, тогава връща размерът на списъка;
         * .previousIndex() - връща индекса на предишния елемент, ако няма такъв, тогава връща числото -1;
         * .remove() - премахва елемент от списъка;
         * .set() - поставя на мястото на текущия елемент, избран чрез извикване на .next() или .previous(), нов елемент;
         *
         */

    }
}
