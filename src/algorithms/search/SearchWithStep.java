package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class SearchWithStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array;
        int searchedNumber;
        int step;

        System.out.println("Enter the integers in the array separated by a space:");
        array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Enter an integer to search for:");
        searchedNumber = Integer.parseInt(input.nextLine());

        step = (int)Math.round(Math.sqrt(array.length));
        System.out.printf("The step is %d.%n", step);

        int index = searchWithStep(array, searchedNumber, step);

        if (index == -1) {
            System.out.println("There isn't such number.");
        }
        else {
            System.out.printf("%d is at index %d.%n", searchedNumber, index);
        }
    }

    public static int searchWithStep(int[] array, int number, int step) {
        for(int a = step - 1; a < array.length; a += a + step < array.length ? step : array.length - a - 1) {
            if(array[a] == number) {
                return a;
            }
            else if(array[a] > number) {
                return sequentialSearch(array, number, a - step + 1 > 0 ? a - step + 1 : 0, a);
            }
            if(a + step >= array.length) {
                return sequentialSearch(array, number, a + 1, array.length);
            }
        }

        return -1;
    }

    public static int sequentialSearch(int[] array, int number, int startIndex, int end) {
        while(startIndex < end) {
            if(array[startIndex] == number) {
                return startIndex;
            }
            ++startIndex;
        }

        return -1;
    }
}



//Search with step (Търсенето със стъпка) е търсене в сортиран списък.
//Програмиране = ++Алгоритми; - Преслав Наков, Панайот Добриков, [2012 г.] стр. 251



//Тестове

//6 16 18 19 20 25 43 44 50 51 60 65 72 73 74 81 84 85 86 95
//50
//The step is 4.
//50 is at index 8.

//5
//5
//The step is 1.
//5 is at index 0.

//22 34 44 68 78
//78
//The step is 2.
//78 is at index 4.

//18 23 24 64 79 82
//18
//The step is 2.
//18 is at index 0.

//2 26 34 38 42 48 82
//42
//The step is 3.
//42 is at index 4.

//2 26 34 38 42 48 82
//95
//The step is 3.
//There isn't such number.

//12 22 28 53 81 85 87 90
//10
//The step is 3.
//There isn't such number.

