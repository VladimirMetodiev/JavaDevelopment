package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int index = getIndexOfTheBiggest(numbers, 0);
        int theBiggest = numbers[index];

        System.out.print(theBiggest + " ");

        while (index < numbers.length - 1) {
            index = getIndexOfTheBiggest(numbers, index + 1);
            theBiggest = numbers[index];
            System.out.print(theBiggest + " ");
        }


    }


    static int getIndexOfTheBiggest(int[] arr, int index){
        int currentIndex = index, currentTheBiggest = arr[index];

        for (int a = index + 1; a < arr.length; a++) {
            if(currentTheBiggest <= arr[a]) {
                currentTheBiggest = arr[a];
                currentIndex = a;
            }
        }

        return currentIndex;
    }
}



//Condition

//Write a program to find all the top integers in an array. A top integer is an integer which is bigger than
//all the elements to its right.



//Tests

//1 4 3 2
//4 3 2


//14 24 3 19 15 17
//24 19 17


//27 19 42 2 13 45 48
//48


//5 7 10 14 25 5 25 20 7 10 15 5
//25 20 15 5


//5 7 10 14 25 25 25
//25



//Unsuccessful attempt to construct recursion -> remains for homework

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] numbers = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        int index = getIndexOfTheBiggest(numbers);
//        getTop(numbers, index);
//    }
//
//    static void getTop(int[] arr, int index){
//        int temporary = getIndexOfTheBiggest(Arrays.copyOf(arr, index));
//
//        while(temporary != index){
//            temporary = index;
//            getTop(arr, temporary);
//        }
//
//        System.out.print(arr[temporary] + " ");
//    }
//
//    static int getIndexOfTheBiggest(int[] arr){
//        int index = 0;
//
//        for (int a = 1; a < arr.length; a++) {
//            if(arr[index] <= arr[a]) index = a;
//        }
//
//        return index;
//    }
