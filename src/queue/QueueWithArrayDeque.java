package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class QueueWithArrayDeque {
    public static void main(String[] args) {
        /*
         * Опашката е структура от данни, съхраняваща последователност от елементи, която работи според метода FIFO - първи влязъл,
         * първи излязъл. В опашката новите елементи се добавят най-отзад, а се взимат елементи, само от началото.
         *
         * В Java е създадена динамична реализация, на структурата опашка, чрез интерфейсът Queue<E>. Той наследява
         * интерфейса Collection и дефинира методите на структурата опашка. Интерфейс Queue<E> се разширява (наследява) от
         * интерфейс Deque<E>, който от своя страна се имплементира от класовете ArrayDeque<E> и LinkedList<E>.
         * Интерфейс Queue<E> също така се имплементира от клас AbstractQueue<E>, който от своя страна се наследява от PriorityQueue<E>.
         *
         * Интерфейс Deque<E> дефинира поведенито (т.е. методите) на двустранна опашка, т.е. може да функционира,
         * както като опашка, така и като стек.
         */

        /*
         * Интерфейсът Queue<Е> предоставя основните операции характерни за структурата опашка:
         * - offer() – добавя елемент в края на опашката;
         * - poll() – връща елемента от началото на опашката, след което го премахва, ако опашката е празна връща null;
         * - peek() – връща елементът от началото на опашката без да го премахва, ако опашката е празна връща null;
         * Допълнителни операции (методи):
         * - remove() - връща елемента от началото на опашката, след което го премахва, ако опашката е празна връща NoSuchElementException;
         * - element - връща елементът от началото на опашката без да го премахва, ако опашката е празна връща NoSuchElementException;
         * - clear() – премахва всички елементи от опашката;
         * - contains() – проверява дали елемента се съдържа в опашката;
         */

        /*
         * Класът ArrayDeque<E> разширява класа AbstractCollection и имплементира интерфейса Deque<E>. ArrayDeque не добавя свои собствени методи.
         * Класът ArrayDeque създава динамичен масив без ограничение на капацитета. Той може да бъде използван, както за създаването на
         * опашка (FIFO), така и за създаването на стек (LIFO).
         */

        /*
         * Класът LinkedList<E> също може да бъде използван, както за създаването на опашка, така и за създаването на стек.
         */


        // Създаване на инстанция на ArrayDeque
        ArrayDeque<String> queue = new ArrayDeque<>();

        // Проверка дали опашката е празна
        System.out.println("Is the queue empty: " + queue.isEmpty());
        System.out.println("--------------------------------------------------");

        // Добавяне на нови елементи в края на опашката - .offer()
        queue.offer("Vladimir");
        queue.offer("Alexander");
        queue.offer("Teodor");
        queue.offer("Liubomir");
        queue.offer("Ivan");
        queue.offer("Dobromir");
        queue.offer("Svetoslav");
        System.out.println("The queue: " + queue);
        System.out.println("--------------------------------------------------");

        // Взимам елемент от началото на опашката без да го премахвам - .peek()
        System.out.println("Get: " + queue.peek());
        System.out.println("--------------------------------------------------");

        // Взимам елемент от началото на опашката, след което го премахвам - .poll()
        System.out.println("Get it out: " + queue.poll());
        System.out.println("The queue: " + queue);
        System.out.println("--------------------------------------------------");

        // Взимам размера на опашката
        System.out.println("Size: " + queue.size());
        System.out.println("--------------------------------------------------");

        // Проверявам дали указаният елемент се съдържа в опашката
        System.out.println("Does the queue contain: " + queue.contains("Liubomir"));
        System.out.println("Does the queue contain: " + queue.contains("Peter"));
        System.out.println("--------------------------------------------------");

        // Изваждане на елементите един по един
        while(!queue.isEmpty()) {
            queue.poll();
            System.out.println(queue.toString());
        }
        System.out.println("--------------------------------------------------");



        // Някои допълнителни методи на интерфейс Deque

        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50, 55));

        // Добавяне на елемент: addFirst(), addLast(), offerFirst() и offerLast()
        deque.addFirst(5);
        deque.addLast(60);
        System.out.println("The queue: " + deque);
        System.out.println("--------------------------------------------------");
        deque.offerFirst(0);
        deque.offerLast(65);
        System.out.println("The queue: " + deque);
        System.out.println("--------------------------------------------------");

        // Връща указаният елемент, след което го премахва: removeFirst(), removeLast(), pollFirst() и pollLast()
        System.out.println("removeFirst(): " + deque.removeFirst());
        System.out.println("removeLast(): " + deque.removeLast());
        System.out.println("The queue: " + deque);
        System.out.println("--------------------------------------------------");
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("The queue: " + deque);
        System.out.println("--------------------------------------------------");

        // Връща указаният елемент, без да го премахва: getFirst(), getLast(), peekFirst() и peekLast
        System.out.println("getFirst(): " + deque.getFirst());
        System.out.println("getLast(): " + deque.getLast());
        System.out.println("The queue: " + deque);
        System.out.println("--------------------------------------------------");
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());
        System.out.println("The queue: " + deque);
        System.out.println("--------------------------------------------------");
    }
}















