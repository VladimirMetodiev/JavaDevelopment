package algorithms.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of integers to sort:");
        int number = Integer.parseInt(input.nextLine());

        int[] array = new int[number];
        Random random = new Random();

        for (int a = 0; a < number; a++) {
            array[a] = random.nextInt(99) + 1;
        }

        System.out.println("Input:");
        System.out.println(Arrays.toString(array));

        for (int b = 0; b < number - 1; b++) {
            for (int e = 0; e < number - 1 - b; e++) {
                if(array[e] > array[e + 1]) {
                    int temporary = array[e];
                    array[e] = array[e + 1];
                    array[e + 1] = temporary;
                }
            }
        }

        System.out.println("Output:");
        System.out.println(Arrays.toString(array));
    }
}
