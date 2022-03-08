package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Concatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String theFirst = input.nextLine();
        String theSecond = input.nextLine();

        BiFunction<String, String, String> concat = (s1, s2) -> String.join(" ", s1, s2).toUpperCase();
        System.out.println(concat.apply(theFirst, theSecond));
    }
}



//Test

//yellow
//pears
//YELLOW PEARS


//Работещо решение - 100/100

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String theFirst = input.nextLine();
//        String theSecond = input.nextLine();
//
//        BiFunction<String, String, String> concat = (s1, s2) -> (s1 + " " + s2).toUpperCase();
//        System.out.println(concat.apply(theFirst, theSecond));
//    }



//Не поставя интервал между символните низове

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String theFirst = input.nextLine();
//        String theSecond = input.nextLine();
//
//        BiFunction<String, String, String> concat = (s1, s2) -> Stream.of(s1, s2).reduce("", String::concat).toUpperCase();
//        System.out.println(concat.apply(theFirst, theSecond));
//    }
