package arrayExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SymmetricalMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int[][] matrix = new int[number][number];

        IntStream.range(0, number).forEach(x ->
                IntStream.range(0, number).forEach(y ->
                        matrix[x][y] = input.nextInt()));

        boolean isTheMatrixSymmetric = true;

        for (int b = 1; b < number; b++) {
            for (int e = 0; e <= b; e++) {
                if (matrix[b][e] != matrix[e][b]) {
                    isTheMatrixSymmetric = false;
                    break;
                }
            }
        }

        if (isTheMatrixSymmetric) System.out.println("yes");
        else System.out.println("no");
    }
}



//Проверете дали матрицата е симетрична спрямо главният диагонал. Главният диагонал е този, който минава от горният ляв ъгъл
//на двумерния масив до долния десен ъгъл.

//Входни данни
//Програмата получава като вход числото n, n <= 100, това е броят на редовете и колоните в масива.
//След това ще получите n реда от по n числа всеки, това са елементи на масива.

//Изход
//Програмата трябва да изведе думата yes за симетричен масив и думата no за несиметричен масив.



//Тестове

//4
//0 1 5 8
//1 0 2 7
//5 2 0 9
//8 7 9 0
//yes

//4
//0 1 5 8
//1 0 3 7
//5 2 0 9
//8 7 9 0
//no
