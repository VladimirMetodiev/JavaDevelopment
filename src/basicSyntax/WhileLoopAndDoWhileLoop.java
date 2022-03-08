package basicSyntax;

import java.util.Scanner;

public class WhileLoopAndDoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Цикъл с условие
        System.out.println("While loop");

        int number = Integer.parseInt(input.nextLine());
        int counter = 0;

        while (counter < number) {
            if(counter < number - 1) System.out.print(counter + 1 + " ");
            else System.out.println(counter + 1);
            counter++;
        }


        System.out.println("\nDo-While loop");

        counter = 1;

        // Цикъл с пост-условие
        do {
            System.out.print(counter + " ");
        }
        while (counter++ < 10);

        /*
         * УПРАВЛЯВАЩИ КОМАНДИ В ТЯЛОТО НА ЦИКЪЛ
         * continue - прекратява изпълнението на кода в тялото на цикъла и изпълнява преминете към логическото условие на цикъла. Ако условието на цикъла върне true, изпълнението на цикъла ще продължи.
         * break - незабавно прекратява изпълнението на цикъла и преминава към първата команда извън него.
         */

    }
}
