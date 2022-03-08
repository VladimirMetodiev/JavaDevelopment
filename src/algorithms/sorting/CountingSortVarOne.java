package algorithms.sorting;

import algorithms.Support;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortVarOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        array = countingSort(array);
        Support.printTheArray(array);
    }

    public static int[] countingSort(int[] array) {
        int max = array[0], counter = 0;

        for (int a = 1; a < array.length; a++) {
            if(array[a] > max) max = array[a];
        }

        int[] temporary = new int[max + 1];

        for (int b = 0; b < array.length; b++) {
            temporary[array[b]] += 1;
        }

        for (int e = 0; e < temporary.length; e++) {
            if(temporary[e] > 0) {
                for (int f = 0; f < temporary[e]; f++) {
                    array[counter] = e;
                    counter++;
                }
            }
        }

        return array;
    }
}



//Counting Sort - Сортиране чрез броене

//Бележка: Имплементирах алгоритъмът, така както го прочетох и разбрах.
//https://www.informatika.bg/lectures/fast-sorting-algorithms



//Тестове

//10 101 13 0 62 14 1 27 49 8
//0 1 8 10 13 14 27 49 62 101

//29 8 88 49 64 71 2 89 46 64 77
//2 8 29 46 49 64 64 71 77 88 89

//10 66 78 56 30 89 67 27 78 8 27 57 78 20 27 31
//8 10 20 27 27 27 30 31 56 57 66 67 78 78 78 89

//1 1 0 1 0 0 1 0 1
//0 0 0 0 1 1 1 1 1
