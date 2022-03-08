package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] numbers = Arrays.stream(userInput.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int length = numbers.length;

        while (length-- != 1){
            for (int a = 0; a < length; a++) {
                numbers[a] = numbers[a] + numbers[a + 1];
            }
        }

        System.out.println(numbers[0]);
    }
}



//Condition

//Write a program to read an array of integers and condense them by summing adjacent couples of elements until
//a single integer is obtained. For example, if we have 3 elements {2, 10, 3}, we sum the first two and the second
//two elements and obtain {2+10, 10+3} = {12, 13}, then we sum again all adjacent elements and obtain {12+13} = {25}.



//Tests

//2 10 3
//25

//5 0 4 1 2
//35

//15 15
//30

//1
//1
