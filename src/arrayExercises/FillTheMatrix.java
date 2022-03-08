package arrayExercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int[][] matrix = new int[number][number];

        int row = matrix.length - 1, column = 0;

        for (int a = 0; a < matrix.length; a++) {
            matrix[row--][column++] = 1;
        }

        for (int b = 1; b < matrix.length; b++) {
            row = matrix.length - 1;
            column = b;
            for (int e = b; e < matrix.length; e++) {
                matrix[row--][column++] = 2;
            }
        }

        for(int[] arr : matrix) {
            for (int f = 0; f < arr.length; f++) {
                if(f < arr.length - 1) System.out.print(arr[f] + " ");
                else System.out.println(arr[f]);
            }
        }
    }
}



//Условие

//Дадено е числото n, n <= 100. Създайте матрица n х n и я запълнете по следният начин:
//Числата по диагонала от горния десен до долния ляв ъгъл са равни на 1;
//Числата над този диагонал са равни на 0;
//Числата под този диагонал са равни на 2.

//Входни данни
//Получавате числото n като вход.

//Изход
//Принтирайте матрицата. Числата трябва да са разделени с интервал.
