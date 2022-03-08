package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortInDescendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers separated by spaces:");
        int[] numbers = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

//        System.out.println("Unsorted numbers:");
//        System.out.println(Arrays.toString(numbers));

        for (int a = 0; a < numbers.length - 1; a++) {
            for (int b = 0; b < numbers.length - 1 - a; b++) {
                if(numbers[b] < numbers[b + 1]) {
                    int temporary = numbers[b];
                    numbers[b] = numbers[b + 1];
                    numbers[b + 1] = temporary;
                }
            }
        }

        System.out.println("Sorted numbers:");
        System.out.println(Arrays.toString(numbers));
    }
}



//Tests

//74 7 55 28 34 13 21 40 52 30 2 89
//[89, 74, 55, 52, 40, 34, 30, 28, 21, 13, 7, 2]

//12 54 15 16 87 70 60 69 29 17 91 4 12 42 92 78 54 96
//[96, 92, 91, 87, 78, 70, 69, 60, 54, 54, 42, 29, 17, 16, 15, 12, 12, 4]

//68 46 -78 44 40 5 20 53 -53 21 32 46 81 94 -10 95 93 77 38 13
//[95, 94, 93, 81, 77, 68, 53, 46, 46, 44, 40, 38, 32, 21, 20, 13, 5, -10, -53, -78]
