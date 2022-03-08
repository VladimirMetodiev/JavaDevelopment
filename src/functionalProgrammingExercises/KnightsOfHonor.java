package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = input.nextLine().split("\\s+");

        Consumer<String[]> print = (arr) -> {
            for(String element : arr) System.out.printf("Sir %s%n", element);
        };

        print.accept(data);
    }
}



//Condition

//Write a program that reads a collection of names as strings from the console and then appends “Sir” in front of every
//name and prints it back onto the console. Use a Consumer<T>.



//Test

//Alexander Peter Vladimir Konstantin David
//Sir Alexander
//Sir Peter
//Sir Vladimir
//Sir Konstantin
//Sir David
