package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array;
        int searchedNumber;

        System.out.println("Enter the integers in the array separated by a space:");
        array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Enter an integer to search for:");
        searchedNumber = Integer.parseInt(input.nextLine());

        Arrays.sort(array);

        int index = binarySearch(array, searchedNumber);

        if(index == -1) {
            System.out.println("There isn't such number.");
        }
        else {
            System.out.printf("%d is at index %d.%n", searchedNumber, index);
        }
    }

    public static int binarySearch(int[] array, int number) {
        int start = 0;
        int end = array.length - 1;
        int middlePoint;

        while(start <= end) {
            middlePoint = (start + end) / 2;

            if(array[middlePoint] == number) {
                return middlePoint;
            }
            else if(array[middlePoint] < number) {
                start = middlePoint + 1;
            }
            else {
                end = middlePoint - 1;
            }
        }

        return -1;
    }
}



//Binary Search - Двоично търсене - използва се за намиране на стойност в подредена структура от данни.



//Tests

//8 11 12 18 48 72 92
//8
//8 is at index 0.

//21 30 35 36 48 51 63 76
//76
//76 is at index 7.

//7 18 21 23 25 39 62 70 91 97
//39
//39 is at index 5.

//4 9 29 31 35 42 52 75 83
//38
//There isn't such number.

//4 7 22 43 71 76 80 85 88 95 99
//100
//There isn't such number.

//28 29 34 54 65
//10
//There isn't such number.
