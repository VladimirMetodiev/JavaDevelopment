package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = Integer.parseInt(input.nextLine());

        int[][] originalMatrix = new int[rows][];

        for (int a = 0; a < rows; a++) {
            originalMatrix[a] = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int[][] duplicateMatrix = new int[rows][originalMatrix[0].length];

        for(int y = 0; y < originalMatrix.length; y++){
            for (int z = 0; z < originalMatrix[y].length; z++) {
                duplicateMatrix[y][z] = originalMatrix[y][z];
            }
        }

        int[] parameters = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int wrongValue = originalMatrix[parameters[0]][parameters[1]];

        for (int b = 0; b < originalMatrix.length; b++) {
            for (int c = 0; c < originalMatrix[b].length; c++) {
                if(originalMatrix[b][c] == wrongValue){
                    duplicateMatrix[b][c] = 0;
                    if(b - 1 >= 0 && originalMatrix[b - 1][c] != wrongValue) {
                        duplicateMatrix[b][c] += originalMatrix[b - 1][c];
                    }
                    if(b + 1 <= originalMatrix.length - 1 && originalMatrix[b + 1][c] != wrongValue) {
                        duplicateMatrix[b][c] += originalMatrix[b + 1][c];
                    }
                    if(c - 1 >= 0 && originalMatrix[b][c - 1] != wrongValue) {
                        duplicateMatrix[b][c] += originalMatrix[b][c - 1];
                    }
                    if(c + 1 <= originalMatrix[b].length - 1 && originalMatrix[b][c + 1] != wrongValue) {
                        duplicateMatrix[b][c] += originalMatrix[b][c + 1];
                    }
                }
            }
        }

        for(int[] arr : duplicateMatrix) {
            for(int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}



//Condition

//You will be given the rows of a matrix. Then the matrix itself. Inside this matrix there are mistaken values which need
//to be replaced you will receive the wrong value at the last line. Those values should be replaced with the sum of the nearest elements
//in the four directions up, down, left and right, but only if they are valid values. At the end you have to print the fixed measurements.



//Tests

//Input
//3
//1 2 4
//4 6 7
//8 9 4
//1 0
//Output
//1 2 9
//15 6 7
//8 9 16

//Input
//3
//1 2 4 4
//4 6 4 3
//8 9 4 2
//1 0
//Output
//1 2 2 3
//15 6 9 3
//8 9 11 2
