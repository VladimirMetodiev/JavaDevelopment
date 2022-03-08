package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dimensions = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int a = 0; a < dimensions[0]; a++) {
            sum += Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).reduce(0, Integer::sum);
        }

        System.out.printf("%d%n%d%n%d%n", dimensions[0], dimensions[1], sum);
    }
}



//Condition

//Write a program that reads a matrix from the console and prints:
//The count of rows
//The count of columns
//The sum of all matrix’s elements
//On the first line you will get the dimensions of the matrix in format {rows, columns}. On the next lines you will get
//the elements for each row separated with a coma.



//Tests

//Input
//3, 6
//7, 1, 3, 3, 2, 1
//1, 3, 9, 8, 5, 6
//4, 6, 7, 9, 1, 0

//Output
//3
//6
//76


//Input
//2, 5
//12, 4, 71, 48, 25
//63, 37, 16, 82, 53

//Output
//2
//5
//411


//Input
//3, 5
//1, 0, 1, 0, 1
//0, 2, 0, 2, 0
//3, 0, 3, 0, 3

//Output
//3
//5
//16



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int sum = 0;
//
//        int[] parameters = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
//
//        for (int a = 0; a < parameters[0]; a++) {
//            int[] row = Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
//
//            for (int b = 0; b < row.length; b++) {
//                sum += row[b];
//            }
//        }
//
//        System.out.println(parameters[0]);
//        System.out.println(parameters[1]);
//        System.out.println(sum);
//    }
