package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class GnomeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        array = gnomeSort(array);
        printTheArray(array);
    }

    public static int[] gnomeSort(int[] array) {
        for(int a = 1; a < array.length; a++) {
            if (a > 0 && array[a] < array[a - 1]) {
                int temporary = array[a];
                array[a] = array[a - 1];
                array[a - 1] = temporary;
                a -= 2;
            }
        }
        return array;
    }

    private static void printTheArray(int[] array) {
        for(int b = 0; b < array.length; b++) {
            if(b < array.length - 1) System.out.print(array[b] + " ");
            else System.out.println(array[b]);
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
