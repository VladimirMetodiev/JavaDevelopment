package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split("\\s+");

        Function<String[], Integer> counter = (arr) -> {
            int count = 0;
            for(String element : arr) {
                if(element.charAt(0) >= 65 && element.charAt(0) <= 90) {
                    ++count;
                }
            }
            return count;
        };

        System.out.println(counter.apply(words));

        Consumer<String[]> print = array -> {
            for(String element : array) {
                if(element.charAt(0) >= 65 && element.charAt(0) <= 90) {
                    System.out.println(element);
                }
            }
        };

        print.accept(words);
    }
}



//Condition

//Write a program that reads one line of text from the console. Print the count of words that start with a Uppercase letter,
//after that checkUp all these words in the same order, like you found them in the text.



//Tests

//The following example shows how to use Lambda expressions
//2
//The
//Lambda

//On November 4, 2008, Senator Barack Obama of Illinois was elected president of the United States
//8
//On
//November
//Senator
//Barack
//Obama
//Illinois
//United
//States
