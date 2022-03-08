package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

import static algorithms.Support.printTheArray;

public class ShellSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers in the array separated by a space:");
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        shellSort(array);
        printTheArray(array);
    }

    public static void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int a = gap; a < arr.length; a++) {
                int temporary = arr[a];
                int b;

                for (b = a; b >= gap && arr[b - gap] > temporary; b -= gap) {
                    arr[b] = arr[b - gap];
                }

                arr[b] = temporary;
            }
        }
    }
}



//Shell sort, Shell's method - Сортиране на Шел, Метод на Шел

//gap - представлява разликата между два елемента;



//85 4
//4 85

//62 55 22 89 59
//22 55 59 62 89

//11 54 -8 78 90 50 93 13 70 0 36 63 -4 3
//-8 -4 0 3 11 13 36 50 54 63 70 78 90 93

//22 18 19 21 63 100 9 55 100 17 92 56 82 100 9 32 88 30 25 65 70
//9 9 17 18 19 21 22 25 30 32 55 56 63 65 70 82 88 92 100 100 100
