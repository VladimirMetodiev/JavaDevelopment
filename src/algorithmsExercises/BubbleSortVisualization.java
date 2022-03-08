package algorithmsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortVisualization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        bubbleSort(array);
    }

    public static int[] bubbleSort(int[] array) {
        int counter = 1;
        for(int a = 0; a < array.length - 1; a++) {
            for(int b = 0; b < array.length - 1 - a; b++) {
                if(array[b] > array[b + 1]) {
                    int current = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = current;
                    System.out.printf("[%03d] ", counter++);
                    printTheArray(array);
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

//6 3 10 8

//97 91 23 24 39

//38 68 19 64 70 17 100 46

