package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Stack е устарял synchronized клас. Работи на принципа LIFO: последен - влязъл, пръв излязъл.
         * Към настоящият момент не се препоръчва за употреба.
         */

        /*
         * Методи на клас Stack
         * - .push(element) – добавя нов елемент на върха на стека
         * - .pop() – връща най-горния елемент като го премахва от стека
         * - .peek() – връща най горния елемент без да го премахва от стека
         * - .size() – връща броя на елементите в стека
         * - .clear() – премахва всички елементи от стека
         * - .isEmpty() - проверява дали стека е празен
         * - .contains(element) – проверява дали указаният елемент се съдържа в стека
         * - .toArray() – връща масив, съдържащ елементите на стека
         */

        Stack<String> stack = new Stack<>();
        //Danube, Amazon, Indus, Yellow River, Volga, Nile, Yangtze, Ganges, Ob, Mississippi

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


        // Взимам броят на елементите, от позицията на указаният обект, до върхът на стека (включително), ако указаният елемент не е намерен, получавам -1
        System.out.println("Search: " + stack.search("Nile"));
        System.out.println("Search: " + stack.search("Amazon"));
        System.out.println("------------------------------");


        // Изваждане на елементите един по един
        while(!stack.isEmpty()) {
            stack.pop();
            System.out.println(stack.toString());
        }

        /*
         * Ако обекта от тип Stack е празен, и се опитам да взема и принтирам елемент с метода .pop() или .peek(),
         * се хвърля изключение - java.util.EmptyStackException.
         */
    }
}
