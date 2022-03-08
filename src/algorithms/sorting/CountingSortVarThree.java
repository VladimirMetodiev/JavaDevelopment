package algorithms.sorting;

import algorithms.Support;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortVarThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        countingSort(array);
        Support.printTheArray(array);
    }

    public static void countingSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;

        int count[] = new int[range];
        int output[] = new int[array.length];

        for (int a = 0; a < array.length; a++) {
            count[array[a] - min]++;
        }

        for (int b = 1; b < count.length; b++) {
            count[b] += count[b - 1];
        }

        for (int e = array.length - 1; e >= 0; e--) {
            output[count[array[e] - min] - e] = array[e];
            count[array[e] - min]--;
        }

        for (int d = 0; d < array.length; d++) {
            array[d] = output[d];
        }
    }
}



//Counting Sort - Сортиране чрез броене
