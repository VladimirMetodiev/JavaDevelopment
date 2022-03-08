package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        heapSort(array);
        printTheArray(array);
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        for (int a = n / 2 - 1; a >= 0; a--) {
            heapUp(array, n, a);
        }

        for (int b = n - 1; b > 0; b--) {
            int temporary = array[0];
            array[0] = array[b];
            array[b] = temporary;

            heapUp(array, b, 0);
        }
    }

    public static void heapUp(int[] array, int num, int i) {
        int biggest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < num && array[left] > array[biggest]) {
            biggest = left;
        }

        if (right < num && array[right] > array[biggest]) {
            biggest = right;
        }

        if (biggest != i) {
            int swap = array[i];
            array[i] = array[biggest];
            array[biggest] = swap;

            heapUp(array, num, biggest);
        }
    }

    private static void printTheArray(int[] someArray) {
        for (int z = 0; z < someArray.length; z++) {
            if (z < someArray.length - 1) System.out.print(someArray[z] + " ");
            else System.out.println(someArray[z]);
        }
    }
}



//Heap sort - Пирамидално сортиране



//Тестове

//6 13 95 79 41 0
//0 6 13 41 79 95

//36 44 18 8 39 25 8
//8 8 18 25 36 39 44

//96 60 9 48 96 32 71 28 28 53 53 72
//9 28 28 32 48 53 53 60 71 72 96 96

//17 8 34 -2 88 19 15 15 -12 98 4 52 -5 72 90
//-12 -5 -2 4 8 15 15 17 19 34 52 72 88 90 98

//1 0 1 1 0 0 1 0
//0 0 0 0 1 1 1 1
