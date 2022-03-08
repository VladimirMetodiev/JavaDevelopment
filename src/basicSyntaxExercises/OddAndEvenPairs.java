package basicSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        if(array.length % 2 == 0){
            for (int a = 0; a < array.length; a += 2) {
                check(array[a], array[a + 1]);
            }
        }
        else{
            System.out.println("invalid length");
        }
    }

    private static void check(int x, int y){
        if(x % 2 == 0 && y % 2 == 0){
            System.out.printf("%d, %d -> both are even%n", x, y);
        }
        else if(x % 2 != 0 && y % 2 != 0){
            System.out.printf("%d, %d -> both are odd%n", x, y);
        }
        else{
            System.out.printf("%d, %d -> different%n", x, y);
        }
    }
}



//Condition

//You are given an array of integers as a single line, separated by a space. Write a program that checks
//consecutive pairs and prints if both are odd/even or not.
//Note that the array length should also be an even number.



//Tests

//Input
//1 2 3 4
//Output
//1, 2 -> different
//3, 4 -> different


//Input
//2 8 11 15 3 2
//Output
//2, 8 -> both are even
//11, 15 -> both are odd
//3, 2 -> different


//Input
//11 8 11 1 2
//Output
//invalid length
