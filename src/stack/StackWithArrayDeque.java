package stack;

import java.util.ArrayDeque;

public class StackWithArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Проверка дали стека е празен
        System.out.println("Is the stack empty: " + stack.isEmpty());
        System.out.println("------------------------------");

        // Добавяне на елементи
        stack.push("Danube");
        stack.push("Amazon");
        stack.push("Indus");
        stack.push("Yellow River");
        stack.push("Nile");
        stack.push("Volga");
        stack.push("Yangtze");
        stack.push("Ganges");
        stack.push("Ob");
        stack.push("Mississippi");
        System.out.println(stack.toString());
        System.out.println("------------------------------");


        // Взимам най-горният елемент без да го премахвам
        System.out.println("Get: " + stack.peek());
        System.out.println(stack.toString());
        System.out.println("------------------------------");


        // Взимам най-горният елемент и го премахвам
        System.out.println("Get it out: " + stack.pop());
        System.out.println(stack.toString());
        System.out.println("------------------------------");


        // Взимам размера на стека
        System.out.println("Size: " + stack.size());
        System.out.println("------------------------------");


        // Проверявам дали указаният елемент се съдържа в стека
        System.out.println("Does the stack contain: " + stack.contains("Yangtze"));
        System.out.println("Does the stack contain: " + stack.contains("Mississippi"));
        System.out.println("------------------------------");


        // Изваждане на елементите един по един
        while(!stack.isEmpty()) {
            stack.pop();
            System.out.println(stack.toString());
        }
    }
}
