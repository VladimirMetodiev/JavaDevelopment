package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 05/02/22
 * Практикум по программированию
 * Мой експеримент: запълване на матрица с помоща на Stream
 */

public class FillingAMatrixUsingAStream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());
        int[][] squareMatrix = new int[number][number];

        IntStream.range(0, number).forEach(x -> IntStream.range(0, number).forEach(y -> squareMatrix[x][y] = input.nextInt()));



        int rows = input.nextInt(), columns = Integer.parseInt(input.nextLine().trim());
        int[][] matrix = new int[rows][columns];

        IntStream.range(0, rows).forEach(x -> IntStream.range(0, columns).forEach(y -> matrix[x][y] = input.nextInt()));



        printMatrix(squareMatrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
}



//4
//0 1 5 8
//1 0 2 7
//5 2 0 9
//8 7 9 0
//3 5
//2 4 6 8 10
//3 6 9 12 15
//5 10 15 20 25
