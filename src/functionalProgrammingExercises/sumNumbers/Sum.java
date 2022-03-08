package functionalProgrammingExercises.sumNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(input.nextLine().split("\\s*,\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Integer sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.printf("Count = %d%n", numbers.size());
        System.out.printf("Sum = %d%n", sum);
    }
}



//Condition

//Write a program that reads one line of Integers separated by ", ". Print the count of the numbers and their sum.



//Tests

//4, 2, 1, 3, 5, 7, 1, 4, 2, 12
//Count = 10
//Sum = 41

//2, 4, 6
//Count = 3
//Sum = 12

//18, 6, 21, 39, 14  , 2, 25, 19
//Count = 8
//Sum = 144

//3, -11, -17, 14, 6, -9, -3, 13, 2, 17, -6, 9, -2, -14, 11, -13
//Count = 16
//Sum = 0
