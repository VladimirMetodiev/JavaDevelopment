package basicSyntaxExercises;

import java.util.Scanner;

public class TernaryOperatorOnly {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println(number % 2 == 0 ? number + 2 : number + 1);
    }
}


//Condition

//Дадено е цяло число n. Отпечатайте следващото четно число, след него. Когато решавате тази задача,
//не можете да използвате условни констукции - if, както и цикли.
