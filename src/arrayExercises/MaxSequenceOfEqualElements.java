package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int startIndex = 0, length = 1, currentIndex = -1, currentLength = 1;
        boolean flag = false;

        for (int a = 1; a < numbers.length; a++) {
            if(numbers[a - 1] == numbers[a]) {
                if(currentIndex == -1) {
                    currentIndex = a - 1;
                    flag = true;
                }
                ++currentLength;
                if(a == numbers.length - 1 && length < currentLength) {
                    startIndex = currentIndex;
                    length = currentLength;
                }
            }
            else if(flag && numbers[a - 1] != numbers[a]){
                if(length < currentLength){
                    startIndex = currentIndex;
                    length = currentLength;
                }

                currentIndex = -1;
                currentLength = 1;
                flag = false;
            }
        }

        for (int b = startIndex; b < startIndex + length; b++) {
            System.out.print(numbers[b] + " ");
        }
    }
}



//Condition

//Write a program that finds the longest sequence of equal elements in an array of integers. If several longest
//sequences exist, print the leftmost one.



//Tests

//2 1 1 2 3 3 2 2 2 1
//2 2 2


//1 1 1 2 3 1 3 3
//1 1 1


//4 4 4 4
//4 4 4 4


//0 1 1 5 2 2 6 3 3
//1 1


//1 8 8 6 6 6 3 7 7 7
//6 6 6


//8 2 4 4 6 6 6 5 9 9 9 9 9
//9 9 9 9 9
