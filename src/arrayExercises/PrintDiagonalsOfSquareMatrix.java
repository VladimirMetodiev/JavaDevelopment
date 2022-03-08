package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int[][] matrix = new int[number][number];

        for (int a = 0; a < number; a++) {
            matrix[a] = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        for (int b = 0; b < number; b++) {
            if(b < number - 1) System.out.print(matrix[b][b] + " ");
            else System.out.println(matrix[b][b]);
        }

        for (int c = number - 1; c >= 0; c--) {
            if(c > 0) System.out.print(matrix[c][number - 1 - c] + " ");
            else System.out.println(matrix[c][number - 1 - c]);
        }
    }
}



//Condition

//Write a program that reads a matrix from the console. Then print the diagonals. The matrix will always be square.
//On the first line you read a single integer N the matrix size. Then on each line N elements. The first diagonal should
//always start with the element at the first row and col, the second diagonal should start with the element at the last row and first col.



//Tests

//Input
//3
//1 2 3
//1 2 3
//1 2 3
//Output
//1 2 3
//1 2 3

//Input
//4
//1 2 3 2
//1 1 2 4
//1 2 1 4
//2 2 3 1
//Output
//1 1 1 1
//2 2 2 2
