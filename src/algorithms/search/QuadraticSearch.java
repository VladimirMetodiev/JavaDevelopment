package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class QuadraticSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array;
        int searchedNumber;

        System.out.println("Enter the integers in the array separated by a space:");
        array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Enter an integer to search for:");
        searchedNumber = Integer.parseInt(input.nextLine());

        Arrays.sort(array);
        int index = quadraticSearch(array, searchedNumber);

        if (index == -1) {
            System.out.println("There isn't such number.");
        }
        else {
            System.out.printf("%d is at index %d.%n", searchedNumber, index);
        }
    }

    public static int quadraticSearch(int[] array, int num) {
        int point1, point2, middle, first = 0, last = array.length - 1;

        while (first <= last) {
            middle = (first + last) / 2;
            point1 = first + (last - first) / 4;
            point2 = first + (last - first) * 3 / 4;

            if (num == array[middle]) {
                return middle;
            }
            else if (num == array[point1]) {
                return point1;
            }
            else if (num == array[point2]) {
                return point2;
            }
            else if (num < array[middle] && num < array[point1]) {
                last = point1 - 1;
            }
            else if (num < array[middle] && num > array[point1]) {
                first = point1 + 1;
                last = middle - 1;
            }
            else if (num > array[middle] && num > array[point2]) {
                first = point2 + 1;
            }
            else if (num > array[middle] && num < array[point2]) {
                first = middle + 1;
                last = point2 - 1;
            }
        }

        return -1;
    }
}



//Quadratic Search - Квадратично търсене - използва се за намиране на стойност в подредена структура от данни.



//Тестове

//2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36
//2
//2 is at index 0.

//2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36
//14
//14 is at index 6.

//2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36
//36
//36 is at index 17.

//2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36
//25
//There isn't such number.

//2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38
//38
//38 is at index 18.

//2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38
//20
//20 is at index 9.

//5 18 30 19 -8 6 10 -2 25 7 14 0 21 9 22
//14
//14 is at index 8.


