package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueWithLinkedList {
    public static void main(String[] args) {
        // Индиректно създаване на инстанция на Queue чрез LinkedList
        Queue<String> queue = new LinkedList<>();

        // Проверка дали опашката е празна
        System.out.println("Is the queue empty: " + queue.isEmpty());
        System.out.println("--------------------------------------------------");

        // Добавяне на нови елементи в края на опашката - .offer()
        queue.offer("Sofia");
        queue.offer("Montana");
        queue.offer("Vidin");
        queue.offer("Targu Jiu");
        queue.offer("Timisoara");
        queue.offer("Szeged");
        queue.offer("Budapest");
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
        System.out.println("Does the queue contain: " + queue.contains("Sarajevo"));
        System.out.println("Does the queue contain: " + queue.contains("Budapest"));
        System.out.println("--------------------------------------------------");

        // Изваждане на елементите един по един
        while(!queue.isEmpty()) {
            queue.poll();
            System.out.println(queue.toString());
        }
    }
}
