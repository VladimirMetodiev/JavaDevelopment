package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lowerBound = input.nextInt();
        int upperBound = input.nextInt();
        input.nextLine();
        String exp = input.nextLine().toLowerCase();

        BiConsumer<Integer, Integer> printOdd = (a, b) -> {
            for (int i = a; i <= b; i++) {
                if(i % 2 != 0) System.out.print(i + " ");
            }
        };

        BiConsumer<Integer, Integer> printEven = (a, b) -> {
            for (int i = a; i <= b; i++) {
                if(i % 2 == 0) System.out.print(i + " ");
            }
        };

        switch (exp) {
            case "odd": printOdd.accept(lowerBound, upperBound); break;
            case "even": printEven.accept(lowerBound, upperBound); break;
            default: break;
        }
    }
}



//Condition

//You are given a lower and an upper bound for a range of integer numbers. Then a command specifies if you need to list
//all even or odd numbers in the given range. Use predicates that need to be passed to a method.



//Tests

//0 9
//odd

//14 39
//even

//5 6
//odd

//5 6
//even
