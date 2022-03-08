package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ExchangeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        array = exchangeSort(array);
        printTheArray(array);
    }

    public static int[] exchangeSort(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = 1 + a; b < array.length; b++) {
                if (array[a] > array[b]) {
                    int temporary = array[a];
                    array[a] = array[b];
                    array[b] = temporary;
                }
            }
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



//Тестове

//5 6 4 8 2
//2 4 5 6 8

//10 -15 4 0 13 -8 14 21 6 11
//-15 -8 0 4 6 10 11 13 14 21

//8 3 16 47 5 16 -24 18 50 -14 50 0 33 19
//-24 -14 0 3 5 8 16 16 18 19 33 47 50 50

//1 1 1 0 1 0 0 1
//0 0 0 1 1 1 1 1
