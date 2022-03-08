package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = Integer.parseInt(input.nextLine().trim());

        int[][] first = new int[rows][columns];

        for (int a = 0; a < rows; a++) {
            first[a] = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        rows = input.nextInt();
        columns = Integer.parseInt(input.nextLine().trim());

        int[][] second = new int[rows][columns];

        for (int b = 0; b < rows; b++) {
            second[b] = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        if(first.length != second.length || first[0].length != second[0].length) {
            System.out.println("not equal");
            return;
        }

        if(compare(first, second)) System.out.println("equal");
        else System.out.println("not equal");
    }

    private static boolean compare(int[][] first, int[][] second) {
        for(int e = 0; e < first.length; e++) {
            for(int f = 0; f < first[e].length; f++) {
                if(first[e][f] != second[e][f]) return false;
            }
        }
        return true;
    }
}



//Condition

//Write a program that reads two integer matrices (2D arrays) from the console and compares them element by element.
//For better reuse of the code, you could do the comparison in a method, which returns true if they are equal and false if not.
//Each matrix definition on the console will contain a line with a positive integer number R – the number of rows in the matrix
//and C – the number of columns – followed by R lines containing the C numbers, separated by spaces (each line will have an equal
//amount of numbers.
//The matrices will have at most 10 rows and at most 10 columns.
//Print equal if the matrices match, and not equal if they don’t match.



//Tests

//2 3
//1 2 3
//2 1 3
//2 3
//1 2 3
//2 1 3
//equal


//2 3
//1 2 3
//4 5 6
//2 2
//1 3
//4 5
//not equal


//3 3
//1 2 3
//2 1 3
//3 2 1
//3 3
//2 2 2
//4 4 4
//6 6 6
//not equal


//3 3
//1 2 3
//2 1 3
//3 2 1
//3 3
//1 2 3
//2 1 3
//3 8 1
//not equal


//1 10
//0 1 2 3 4 5 6 7 8 9
//1 10
//0 1 2 3 4 5 6 7 8 9
//equal


//2 4
//8 5 -6 7
//2 11 9 1
//2 4
//8 5 -6 7
//2 11 9 1
//equal


//4 3
//1 0 1
//0 1 0
//1 1 0
//0 1 1
//4 3
//1 0 1
//0 1 0
//1 1 0
//0 1 1
//equal



//Solution

//public class CompareMatrices {
//    private static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int[][] theFirstMatrix, theSecondMatrix;
//        int[] parameters;
//
//        parameters = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        theFirstMatrix = getMatrixNumbers(parameters[0], parameters[1]);
//
//        parameters = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        theSecondMatrix = getMatrixNumbers(parameters[0], parameters[1]);
//
//        if(theFirstMatrix.length != theSecondMatrix.length || theFirstMatrix[0].length != theSecondMatrix[0].length){
//            System.out.println("not equal");
//            return;
//        }
//
//        if(compare(theFirstMatrix, theSecondMatrix)) {
//            System.out.println("equal");
//        }
//        else {
//            System.out.println("not equal");
//        }
//    }
//
//    static int[][] getMatrixNumbers(int rows, int columns){
//        int[][] matrix = new int[rows][columns];
//
//        for (int a = 0; a < matrix.length; a++) {
//            for (int b = 0; b < matrix[a].length; b++) {
//                matrix[a][b] = input.nextInt();
//            }
//            input.nextLine();
//        }
//
//        return matrix;
//    }
//
//    static boolean compare(int[][] matrix1, int[][] matrix2){
//        for (int a = 0; a < matrix1.length; a++) {
//            for (int b = 0; b < matrix1[a].length; b++) {
//                if (matrix1[a][b] != matrix2[a][b]) return false;
//            }
//        }
//
//        return true;
//    }
//}
