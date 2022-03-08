package algorithms.sorting;

import algorithms.Support;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        mergeSort(array, 0, array.length - 1);
        Support.printTheArray(array);
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Намирам средната точка
            int middlePoint = (left + right) / 2;

            // Сортирам лявата и дясната половини
            mergeSort(array, left, middlePoint);
            mergeSort(array, middlePoint + 1, right);

            // Съединявам сортираните половини
            merge(array, left, middlePoint, right);
        }
    }

    private static void merge(int[] array, int left, int middlePoint, int right) {
        // Намирам размерите на двата подмасива, които ще бъдат обединени
        int size1 = middlePoint - left + 1;
        int size2 = right - middlePoint;

        // Създавам временни масиви
        int[] theLeft = new int[size1];
        int[] theRight = new int[size2];

        // Копирам данните във временните масиви
        for (int a = 0; a < size1; ++a) {
            theLeft[a] = array[left + a];
        }

        for (int b = 0; b < size2; ++b) {
            theRight[b] = array[middlePoint + 1 + b];
        }

        // Обединявам временните масиви

        // Първоначалните индекси съответно на theLeft и theRight
        int e = 0, f = 0;
        // Първоначалният индекс на обединения масив
        int u = left;

        while (e < size1 && f < size2) {
            if (theLeft[e] <= theRight[f]) {
                array[u] = theLeft[e];
                e++;
            }
            else {
                array[u] = theRight[f];
                f++;
            }
            u++;
        }

        // Копирам останалите елементи на theLeft, ако има такива
        while (e < size1) {
            array[u] = theLeft[e];
            e++;
            u++;
        }

        // Копирам останалите елементи на theRight, ако има такива
        while (f < size2) {
            array[u] = theRight[f];
            f++;
            u++;
        }
    }
}



// Merge sort - Сортиране чрез сливане



//Тестове

//10 101 13 0 62 14 1 27 49 8
//0 1 8 10 13 14 27 49 62 101

//29 8 88 49 64 71 2 89 46 64 77
//2 8 29 46 49 64 64 71 77 88 89

//10 66 78 56 6 30 100 89 67 27 78 8 27 100 57 78 20 27 31 6
//6 6 8 10 20 27 27 27 30 31 56 57 66 67 78 78 78 89 100 100

//1 1 0 0 1 0 1 0 1 0 1
//0 0 0 0 0 1 1 1 1 1 1
