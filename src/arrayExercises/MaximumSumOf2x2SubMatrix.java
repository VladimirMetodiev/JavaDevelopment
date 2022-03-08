package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, currentSum, maxSum = Integer.MIN_VALUE;
        int[][] matrix;

        int[] data = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        matrix = new int[data[0]][data[1]];

        for (int a = 0; a < data[0]; a++) {
            matrix[a] = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        for (int b = 0; b < data[0] - 1; b++) {
            for (int c = 0; c < data[1] - 1; c++) {
                currentSum = matrix[b][c] + matrix[b][c + 1] + matrix[b + 1][c] + matrix[b + 1][c + 1];

                if(currentSum > maxSum) {
                    num1 = matrix[b][c];
                    num2 = matrix[b][c + 1];
                    num3 = matrix[b + 1][c];
                    num4 = matrix[b + 1][c + 1];
                    maxSum = currentSum;
                }
            }
        }

        System.out.printf("%d %d%n%d %d%n%d%n", num1, num2, num3, num4, maxSum);
    }
}



//Condition

//Write a program that reads a matrix from the console. Then find the biggest sum of a 2x2 sub-matrix. Print the sub-matrix and its sum.
//On the first line you will get the dimensions of the matrix in format {rows, columns}. On the next lines you will get the elements
//for each row separated with a coma.



//Tests

//Input
//3, 6
//7, 1, 3, 3, 2, 1
//1, 3, 9, 8, 5, 6
//4, 6, 7, 9, 1, 0
//Output
//9 8
//7 9
//33

//Input
//2, 4
//10, 11, 12, 13
//14, 15, 16, 17
//Output
//12 13
//16 17
//58

//Input
//3, 7
//-12, -11, -83, -3, -22, -41, -1
//-101, -3, -49, -28, -77, -6, -62
//-50, -8, -39, -4, -85, -11, -150
//Output
//-3 -49
//-8 -39
//-99
