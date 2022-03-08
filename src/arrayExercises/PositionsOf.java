package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = Integer.parseInt(input.nextLine().trim());

        int[][] array = new int[rows][columns];

        for(int a = 0; a < rows; a++) {
            for(int b = 0; b < columns; b++) {
                array[a][b] = input.nextInt();
            }
        }

        int number = input.nextInt();

        if(!search(array, number)) System.out.println("not found");
    }

    private static boolean search(int[][] arr, int num) {
        boolean flag = false;

        for(int e = 0; e < arr.length; e++) {
            for(int f = 0; f < arr[e].length; f++) {
                if(arr[e][f] == num) {
                    System.out.printf("%d %d%n", e, f);
                    flag = true;
                }
            }
        }

        return flag;
    }
}



//Condition

//Write a program that reads a matrix of integers from the console, then a number and prints all the positions at which
//that number appears in the matrix.
//The matrix definition on the console will contain a line with two positive integer numbers R and C – the number of rows
//and columns in the matrix – followed by R lines, each containing C numbers (separated by spaces), representing each row of the matrix.
//The number you will need to find the positions of will be entered on a single line, after the matrix.
//You should print each position on a single line – first print the row, then the column at which the number appears.
//If the number does not appear in the matrix, print not found



//Tests

//Input
//3 3
//1 0 1
//1 1 1
//0 0 1
//0
//Output
//0 1
//2 0
//2 1

//Input
//2 3
//1 2 3
//4 2 2
//2
//Output
//0 1
//1 1
//1 2

//Input
//2 3
//1 -2 -3
//4 -5 6
//5
//Output
//not found

//Input
//3 3
//8 32 18
//74 -2 52
//16 38 -6
//-6
//Output
//2 2

//Input
//2 2
//-6 -6
//-6 -6
//6
//Output
//not found

//Input
//2 2
//-6 -6
//-6 -6
//-6
//Output
//0 0
//0 1
//1 0
//1 1



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int[] parameters = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//
//        int[][] matrix = new int[parameters[0]][parameters[1]];
//
//        for (int a = 0; a < matrix.length; a++) {
//            for (int b = 0; b < matrix[a].length; b++) {
//                matrix[a][b] = input.nextInt();
//            }
//            input.nextLine();
//        }
//
//        int number = Integer.parseInt(input.nextLine());
//        boolean flag = false;
//
//        for (int c = 0; c < matrix.length; c++) {
//            for (int d = 0; d < matrix[c].length; d++) {
//                if(matrix[c][d] == number) {
//                    flag = true;
//                    System.out.printf("%d %d%n", c, d);
//                }
//            }
//        }
//
//        if(!flag) System.out.println("not found");
//    }
