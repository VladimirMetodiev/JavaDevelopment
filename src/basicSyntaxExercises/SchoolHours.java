package basicSyntaxExercises;

import java.util.Scanner;

public class SchoolHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int classes = Integer.parseInt(input.nextLine()); // [1, 10]
        int minutes = 0;

        for (int a = 0; a < classes; a++) {
            if(a < classes - 1) {
                if(a % 2 == 0) minutes += 50;
                else minutes += 60;
            }
            else {
                minutes += 45;
            }
        }

        System.out.printf("%d:%02d%n", 9 + (minutes / 60), minutes % 60);
    }
}



//Условие

//В училище часовете започват в 9:00 часа. Продължителността на класът (бел. в България часът) е 45 минути, след 1-ви, 3-ти, 5-ти и т.н. класове,
//има 5 минути междучасие, а след 2-ри, 4-ти, 6-ти и т.н. класове - 15 минути. Определете кога приключва последният клас.

//Вход: цяло число, указващо, колко класа ще имат учениците, през този ден

//Тестове

//1
//9:45

//2
//10:35

//3
//11:35

//4
//12:25

//5
//13:25

//6
//14:15

//7
//15:15

//8
//16:05

//9
//17:05

//10
//17:55



//Another solution

//    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//        int classes = Integer.parseInt(input.nextLine()); // [1, 10]
//
//        int breaks = classes % 2 == 0 ? classes / 2 * 5 + (classes / 2 - 1) * 15 : classes / 2 * 5 + classes / 2 * 15;
//        int minutes = classes * 45 + breaks;
//
//        System.out.printf("%d:%d%n", 9 + (minutes / 60), minutes % 60);
//    }
