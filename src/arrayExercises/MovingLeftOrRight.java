package arrayExercises;

import java.util.Scanner;

public class MovingLeftOrRight {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());
        int[] array = new int[number];

        for (int a = 0; a < number; a++) {
            array[a] = input.nextInt();
        }

        int moving = input.nextInt();

        if(moving > 0) {
            for (int b = 0; b < moving; b++) {
                int current = array[number - 1];
                for (int c = number - 2; c >= 0; c--) {
                    array[c + 1] = array[c];
                }
                array[0] = current;
            }
        }
        else {
            for (int d = 0; d < Math.abs(moving); d++) {
                int current = array[0];
                for (int e = 1; e < number; e++) {
                    array[e - 1] = array[e];
                }
                array[number - 1] = current;
            }
        }

        for(int num : array) System.out.print(num + " ");
    }
}



//Условие

//Първо получавате цялото число N, след това получавате поредица от N цели числа (1 <= N <= 100000) и накрая числото K ( |K| <= 100000).
//Преместете цялата последователност - циклично, надясно с |K| елемента, ако K е положително, или наляво, ако е отрицателно.

//В тази задача допълнителни масиви (списъци) не могат да се използват. Трябва да трансформирате съществуващия масив (списък)
//и да го отпечатате.

//Входни данни
//Първият ред съдържа естественото число N, вторият ред съдържа N цели числа, а последният ред съдържа цялото число K.

//Изход
//Принтирайте получената последователност. Числата трябва да се извеждат разделени с интервал.



//Тестове

//3
//1 2 3
//0
//1 2 3

//4
//2 4 6 8
//-4
//2 4 6 8

//5
//5 3 7 4 6
//3
//7 4 6 5 3

//8
//19 49 21 53 -6 72 14 68
//-5
//72 14 68 19 49 21 53 -6
