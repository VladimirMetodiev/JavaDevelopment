package functionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upperBound = Integer.parseInt(input.nextLine());
        int[] divisors = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        BiFunction<int[], Integer, Boolean> checkUp = (arr, num) -> {
            boolean flag = true;
            for (int a = 0; a < arr.length; a++) {
                if(num % arr[a] != 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        };

        for (int b = 1; b <= upperBound; b++) {
            if(checkUp.apply(divisors, b)) System.out.print(b + " ");
        }
    }
}



//Condition

//Find all numbers in the range 1..N that are divisible by the numbers of a given sequence. Use predicates.



//Test

//Input
//10
//1 1 1 2
//Output
//2 4 6 8 10


//Input
//100
//2 5 10 20
//Output
//20 40 60 80 100
