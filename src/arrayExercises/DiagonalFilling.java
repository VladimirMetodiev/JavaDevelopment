package arrayExercises;

import java.util.Scanner;

public class DiagonalFilling {
    private static int n, m, row, column, counter = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();

        int[][] matrix = new int[n][m];

        for(int a = 0; a < m; a++) {
            row = 0;
            column = a;
            matrix = fill(matrix);
        }

        for (int b = 1; b < n; b++) {
            row = b;
            column = m - 1;
            matrix = fill(matrix);
        }

        print(matrix);
    }

    private static int[][] fill(int[][] matrix) {
        while(true) {
            counter++;
            matrix[row][column] = counter;
            if(row == n - 1 || column == 0) break;
            ++row;
            --column;
        }
        return matrix;
    }

    private static void print(int[][] matrix) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if(y < m - 1) System.out.printf("%3d", matrix[x][y]);
                else System.out.printf("%3d%n", matrix[x][y]);
            }
        }
    }
}



//Условие

//Дадени са числата n (1 <= n <= 10) и m (1 <= m <= 10). Създайте int масив с n реда и m колони. Запълнете го по диагонал с последователно
//нарастващи с 1-ца, цели числа, като първият член на тази последователност е числото 0. Запълването трябва да се направи, отляво надясно,
//отгоре надолу и по диагоналите успоредни на диагонала, започващ от горният десен ъгъл, и отиващ надоло и вляво. Принтирайте матрицата,
//като изводът трябва да бъде така форматиран, че да бъдат оставени точно по 3 позиции, за извода на всяко число.



//Тестове

//1 1
//  0

//1 10
//  0  1  2  3  4  5  6  7  8  9

//2 2
//  0  1
//  2  3

//3 5
//  0  1  3  6  9
//  2  4  7 10 12
//  5  8 11 13 14

//4 10
//  0  1  3  6 10 14 18 22 26 30
//  2  4  7 11 15 19 23 27 31 34
//  5  8 12 16 20 24 28 32 35 37
//  9 13 17 21 25 29 33 36 38 39

//10 4
//  0  1  3  6
//  2  4  7 10
//  5  8 11 14
//  9 12 15 18
// 13 16 19 22
// 17 20 23 26
// 21 24 27 30
// 25 28 31 34
// 29 32 35 37
// 33 36 38 39

//10 10
//  0  1  3  6 10 15 21 28 36 45
//  2  4  7 11 16 22 29 37 46 55
//  5  8 12 17 23 30 38 47 56 64
//  9 13 18 24 31 39 48 57 65 72
// 14 19 25 32 40 49 58 66 73 79
// 20 26 33 41 50 59 67 74 80 85
// 27 34 42 51 60 68 75 81 86 90
// 35 43 52 61 69 76 82 87 91 94
// 44 53 62 70 77 83 88 92 95 97
// 54 63 71 78 84 89 93 96 98 99
