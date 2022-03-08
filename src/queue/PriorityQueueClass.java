package queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {

        // Инициализирам инстанция на PriorityQueue
        PriorityQueue<Integer> someNumbers = new PriorityQueue<>(Arrays.asList(29, 15, 42, 11, 26, 14, 38, 19));

        // Проверка дали PriorityQueue е празна
        System.out.println("Is the priority queue empty: " + someNumbers.isEmpty());
        System.out.println("--------------------------------------------------");

        // Принтиране
        for (int e : someNumbers) System.out.print(e + " ");
        System.out.println("\n--------------------------------------------------");

        /*
         * При обичайната опашка, когато взема елемент, то това е най-предният елемент, докато при PriorityQueue
         * ВЗИМАМ този елемент, който има най-висок приоритет. Ако не съм указал Comparator, сортирането в PriorityQueue
         * ще бъде направено по "натурален ред" и елемента с най-висок приоритет (който ще ВЗЕМА), ще бъде най-малкият.
         *
         * Когато ВЗИМАМ елемент той винаги е с най-висок приоритет, но ако принтирам всички елементи, то те може, да не са
         * правилно подредени.
         */

        // Добавям нов елемент - .offer()
        someNumbers.offer(22);
        someNumbers.offer(49);
        System.out.println("The priority queue: " + someNumbers);
        System.out.println("--------------------------------------------------");

        // Взимам елемент от началото на опашката без да го премахвам - .peek()
        System.out.println("Get: " + someNumbers.peek());
        System.out.println("--------------------------------------------------");

        // Взимам елемент от началото на опашката, след което го премахвам - .poll()
        System.out.println("Get it out: " + someNumbers.poll());
        System.out.println("The priority queue: " + someNumbers);
        System.out.println("--------------------------------------------------");

        // Взимам размера на опашката
        System.out.println("Size: " + someNumbers.size());
        System.out.println("--------------------------------------------------");

        // Проверявам дали указаният елемент се съдържа в опашката
        System.out.println("Does the queue contain: " + someNumbers.contains(26));
        System.out.println("Does the queue contain: " + someNumbers.contains(100));
        System.out.println("--------------------------------------------------");

        // Изваждане на елементите един по един
        System.out.println("The priority queue: " + someNumbers.toString());
        while(!someNumbers.isEmpty()) {
            System.out.printf("[%d] => ", someNumbers.poll());
            System.out.println(someNumbers.toString());
        }
        System.out.println("--------------------------------------------------");
    }
}
