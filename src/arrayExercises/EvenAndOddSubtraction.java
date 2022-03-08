package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int oddSum = 0, evenSum = 0, difference;

        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for(int item : array){
            if(item % 2 == 0){
                evenSum += item;
            }
            else{
                oddSum += item;
            }
        }

        difference = evenSum - oddSum;
        System.out.println(difference);
    }
}



//Condition

//Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.



//Tests

//1 2 3 4 5 6
//3

//3 5 7 9
//-24

//2 4 6 8 10
//30

//28 15 -6 37 -14 -19 3 -29
//1
