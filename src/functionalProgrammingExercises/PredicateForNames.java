package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        String[] names = input.nextLine().split("\\s+");

        BiFunction<String, Integer, Boolean>  select = (str, num) -> str.length() <= num;

        for (int a = 0; a < names.length; a++) {
            if (select.apply(names[a], number)) System.out.println(names[a]);
        }
    }
}



//Write a predicate. Its goal is to check a name for its length and to return true if the names length is less or equal
//the passed integer. You will be given a string array with some names. Print the names, passing the condition in the predicate.



//Test

//Input
//5
//Vladimir Anna Alexander Ema William Sarah

//Output
//Anna
//Ema
//Sarah



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//        String[] names = input.nextLine().split("\\s+");
//
//        BiConsumer<String[], Integer> select = (array, num) -> {
//            for (String e : array) {
//                if(e.length() <= num) System.out.println(e + " ");
//            }
//        };
//
//        select.accept(names, number);
//    }
