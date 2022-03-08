package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array;
        int searchedNumber;

        System.out.println("Enter the integers in the array separated by a space:");
        array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Enter an integer to search for:");
        searchedNumber = Integer.parseInt(input.nextLine());

        int index = sequentialSearch(array, searchedNumber);

        if (index == -1) {
            System.out.println("There isn't such number.");
        }
        else {
            System.out.printf("%d is at index %d.%n", searchedNumber, index);
        }
    }

    public static int sequentialSearch(int[] array, int number) {
        for (int a = 0; a < array.length; a++) {
            if(array[a] == number) return a;
        }

        return -1;
    }
}



//Sequential Search / Linear search - Последователно търсене / Линейно търсене



//Тестове

//36 -15 4 57 26 83 -61 8 32 75 14 -17 5 49 22
//75
//75 is at index 9.

//45 73 61 28 84 27 39 34 23 36 3 53 89 84 50 80 45 31 18 29
//29
//29 is at index 19.

//80 6 52 24 77
//80
//80 is at index 0.
