package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = Integer.parseInt(input.nextLine().trim());

        int[][] matrix = new int[rows][columns];
        int[][] subMatrix = new int[3][3];
        long maximalSum = 0L, currentSum = 0L;

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                matrix[a][b] = input.nextInt();
            }
        }

        for (int e = 0; e < rows - 2; e++) {
            for (int f = 0; f < columns - 2; f++) {
                currentSum += Arrays.stream(matrix[e]).skip(f).limit(3).reduce(0, Integer::sum);
                currentSum += Arrays.stream(matrix[e + 1]).skip(f).limit(3).reduce(0, Integer::sum);
                currentSum += Arrays.stream(matrix[e + 2]).skip(f).limit(3).reduce(0, Integer::sum);
                if(maximalSum < currentSum) {
                    maximalSum = currentSum;
                    subMatrix[0] = Arrays.stream(matrix[e]).skip(f).limit(3).toArray();
                    subMatrix[1] = Arrays.stream(matrix[e + 1]).skip(f).limit(3).toArray();
                    subMatrix[2] = Arrays.stream(matrix[e + 2]).skip(f).limit(3).toArray();
                }
                currentSum = 0L;
            }
        }

        System.out.printf("Sum = %d%n", maximalSum);
        for(int[] a :subMatrix) {
            for(int el : a) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}



//Condition

//Write a program that reads a rectangular integer matrix of size N x M and finds in it the square 3 x 3 that has maximal sum of its elements.
//On the first line, you will receive the rows N and columns M.
//On the next N lines you will receive each row with its elements.
//Print the elements of the 3 x 3 square as a matrix, along with their sum.



//Tests

//Input
//5 6
//2 4 8 4 2 20
//3 6 9 6 3 27
//4 8 12 8 4 36
//5 10 15 10 5 45
//6 12 18 12 6 54

//Output
//Sum = 180
//8 4 36
//10 5 45
//12 6 54


//Input
//6 4
//2 7 1 9
//3 0 6 4
//8 1 5 3
//0 9 6 2
//2 5 1 8
//1 7 4 6

//Output
//Sum = 48
//9 6 2
//5 1 8
//7 4 6
