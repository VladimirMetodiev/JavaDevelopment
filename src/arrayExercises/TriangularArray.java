package arrayExercises;

import java.util.Scanner;

public class TriangularArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int[][] array = new int[length][];
        int numbers = 0;

        for (int a = 0; a < array.length; a++) {
            array[a] = new int[a + 1];

            for (int e = 0; e < array[a].length; e++) {
                array[a][e] = ++numbers;
            }
        }

        for(int[] arr : array) {
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
