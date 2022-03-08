package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        array = bubbleSort(array);
        printTheArray(array);
    }

    public static int[] bubbleSort(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = 0; b < array.length - 1 - a; b++) {
                if(array[b] > array[b + 1]) {
                    int temporary = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temporary;
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



//Bubble sort - Метод на мехурчето



//Тестове

//49 5 89 86 29 97 91 80 70 90 81 20 79 45 76
//5 20 29 45 49 70 76 79 80 81 86 89 90 91 97

//93 80 27 14 5 16 90 66 49 25 99 88 17 34 85 38 3 22
//3 5 14 16 17 22 25 27 34 38 49 66 80 85 88 90 93 99

//23 69 32 60 97 60 38 46 44 75 26 46 95 64 31 87 60 3 98 44
//3 23 26 31 32 38 44 44 46 46 60 60 60 64 69 75 87 95 97 98
