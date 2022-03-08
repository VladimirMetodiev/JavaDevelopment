package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortVarOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        quickSort(array, 0, array.length - 1);
        printTheArray(array);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = array[right];
            int index = (left - 1);

            for (int a = left; a < right; a++) {
                if (array[a] <= pivot) {
                    index++;
                    int temporary = array[index];
                    array[index] = array[a];
                    array[a] = temporary;
                }
            }

            int temporary  = array[index + 1];
            array[index + 1] = array[right];
            array[right] = temporary ;

            quickSort(array, left, index);
            quickSort(array, index + 1, right);
        }
    }

    private static void printTheArray(int[] array) {
        for (int e = 0; e < array.length; e++) {
            if (e < array.length - 1) System.out.print(array[e] + " ");
            else System.out.println(array[e]);
        }
    }
}


//Quick sort - Бързо сортиране



//Тестове

//41 24 67 76 45
//24 41 45 67 76

//98 84 13 6 7 77
//6 7 13 77 84 98

//90 76 18 54 1 100 54 96 27 52 83 57 24 83 89
//1 18 24 27 52 54 54 57 76 83 83 89 90 96 100

//50 13 100 63 15 85 87 43 70 64 33 55 85 -21 80 -30 24 1 -6 87
//-30 -21 -6 1 13 15 24 33 43 50 55 63 64 70 80 85 85 87 87 100

//30 25 30 30 25 30 25
//25 25 25 30 30 30 30
