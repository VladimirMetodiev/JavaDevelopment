package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int count = Integer.parseInt(input.nextLine());

        int temporary;

        for (int a = 0; a < count; a++) {
            temporary = numbers[0];
            for (int b = 1; b < numbers.length; b++) {
                numbers[b - 1] = numbers[b];
            }
            numbers[numbers.length - 1] = temporary;
        }

        for(int el : numbers) System.out.print(el + " ");
    }
}



//Condition

//Write a program that receives an array and number of rotations you have to perform (first element goes at the end).
//Print the resulting array.



//Tests

//51 47 32 61 21
//2
//32 61 21 51 47


//32 21 61 1
//4
//32 21 61 1


//2 4 15 31
//5
//4 15 31 2

//6 18 20 3 43 26
//20
//20 3 43 26 6 18
