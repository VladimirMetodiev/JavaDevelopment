package vector;

import java.util.*;

public class VectorClass {
    public static void main(String[] args) {
        /*
         * Класът Vector е устарял synchronized клас. Той е реализиран чрез масив от обекти, който може да нараства.
         * Подобно на масив, той съдържа компоненти, които могат да се достъпват по (целочислен) индекс. Въпреки това,
         * размерът на екземпляр от клас Vector може да нараства или да се свива, колкото е необходимо, за да се приспособи
         * към добавянето или премахването на елементи, след създаването на Vector-а.
         * Конструкторът, който създава празен екземпляр на Vector има първоначален капацитет по подразбиране 10. Този
         * капацитет ще се удвои (Vector-а ще се преоразмери), когато бъде въведен 11-ти елемент.
         * Класът вектор е синхронизиран, той се използва при многонишково програмиране.
         * Към настоящият момент не се препоръчва за използване;
         */

        Vector<String> vector1 = new Vector<>();

        System.out.println("Example: Initialization");

        // Инициализиране на Vector
        Vector<Integer> vector2 = new Vector<>(Arrays.asList(12, 16, 20, 24, 28));
        System.out.println(vector2.toString());

        System.out.println("\nExample: method .add(), .addElement() and .addAll()");

        // Добавяне на елемент
        vector1.add("Dallas");                   // Добавя елемент в края на Vector-а.
        vector1.addElement("Denver");       // Добавя елемент в края на Vector-а.
        vector1.addAll(new Vector<>(Arrays.asList("Houston", "Portland", "Cincinnati", "New Orleans", "Seattle", "Santa Fe", "Sao Paulo", "San Francisco")));
        System.out.println(vector1);

        System.out.println("\nExample: method .set() and .setElementAt()");

        // Замяна (поставяне) на елемент
        vector1.set(7, "New York");
        vector1.setElementAt("Philadelphia",8 );
        System.out.println(vector1);

        System.out.println("\nExample: method .get(), .firstElement() and .lastElement()");

        // Връща елементът от Vector-a със зададеният в скобите индекс
        System.out.println(vector1.get(3));

        // Връща първият елемент на Vector-a
        System.out.println(vector1.firstElement());

        // Връща последният елемент на Vector-a
        System.out.println(vector1.lastElement());

        System.out.println("\nExample: method .iterator()");

        // Итериране (преминаване) на елементите на списък
        Iterator<String> iterator = vector1.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("\nExample: method .indexOf() and .lastIndexOf()");

        // Определяне на индекса на елемент от Vector-a
        System.out.println(vector1.indexOf("Houston"));
        System.out.println(vector1.lastIndexOf("Seattle"));

        System.out.println("\nExample: method .copyInto()");

        // Копиране на елементите на Vector-a в масив
        String[] array = new String[vector1.size()];
        vector1.copyInto(array);
        System.out.println(Arrays.toString(array));

        System.out.println("\nExample: method .capacity()");

        // Връща текущият капацитет на Vector-a
        System.out.println(vector1.capacity());

        System.out.println("\nExample: method .size()");

        // Размер на Vector-a
        System.out.println(vector1.size());

        System.out.println("\nExample: method .setSize()");

        // Намаляване на размера на Vector-a (намаляване на броя на елементите с 2)
        vector1.setSize(vector1.size() - 2);
        System.out.println(vector1);
        System.out.println(vector1.size());

        System.out.println("\nExample: method .remove(), .removeElement() and .removeElementAt()");

        // Премахване на елемент от Vector-a
        vector1.remove(3);
        System.out.println(vector1);
        vector1.remove("Cincinnati");
        System.out.println(vector1);
        vector1.removeElement("New Orleans");
        System.out.println(vector1);
        vector1.removeElementAt(1);
        System.out.println(vector1);

        System.out.println("\nExample: method .isEmpty()");

        // Проверка дали Vector-a е празен
        System.out.println(vector1.isEmpty());

        System.out.println("\nExample: method .contains()");

        // Проверка дали Vector-a съдържа даден елемент
        System.out.println(vector1.contains("Caracas"));


        System.out.println("\nExample: method .clear()");

        // Изчистване (изтриване) на Vector-a
        vector1.clear();
        System.out.println(vector1.isEmpty());

        System.out.println("\nExample: method .nCopies(count, element)");

        // Запълване на Vector-a с n на брой копия на елемент
        vector1 = new Vector<>(Collections.nCopies(6, "SUCCESS"));
        System.out.println(vector1);
    }
}
