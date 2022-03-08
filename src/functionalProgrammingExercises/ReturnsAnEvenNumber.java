package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.Function;

public class ReturnsAnEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        Function<Long, Long> getEven = x -> x % 2 == 0 ? x + 2 : x + 1;
        System.out.println(getEven.apply(number));
    }
}



//Condition

//Write a lambda expression that accepts a long value and returns the next even number.



//Tests

//2
//4

//3
//4

//220
//222

//221
//222
