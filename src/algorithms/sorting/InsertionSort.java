package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        array = insertionSort(array);
        printTheArray(array);
    }

    public static int[] insertionSort(int[] array) {
        for(int a = 1; a < array.length; a++) {
            int key = array[a];
            int position = a - 1;

            while(position >= 0 && array[position] > key) {
                array[position + 1] = array[position];
                position--;
            }

            array[position + 1] = key;
        }
        return array;
    }

    private static void printTheArray(int[] array) {
        for(int e = 0; e < array.length; e++) {
           if(e < array.length - 1) System.out.print(array[e] + " ");
           else System.out.println(array[e]);
        }
    }
}



//Insertion sort - Сортиране чрез вмъкване



//Тестове

//29 15 35 21 43 94 75 1
//1 15 21 29 35 43 75 94

//81 74 50 6 9 49 0 28 83
//0 6 9 28 49 50 74 81 83

//4 1 30 -62 88 -34 84 70 79 63 100 -41 61 58 82 26 -7 85 64 48
//-62 -41 -34 -7 1 4 26 30 48 58 61 63 64 70 79 82 84 85 88 100

