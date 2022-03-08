package functionalProgrammingExercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GettingDistinctStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> list = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());

        Function<List<String>, Set<String>> distinct = someList -> someList.stream().distinct().collect(Collectors.toSet());
        System.out.println(String.join(", ", distinct.apply(list)));
    }
}



//Condition

//Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
//The order of elements in the result list may be any (elements will be sorted by the testing system).

//If the input list doesn't contain any strings then the result list should be empty.



//Tests

//Java Python PHP Python Java C++ Python
//Java, C++, PHP, Python

//papaya banana fig papaya orange fig banana pomegranate
//papaya, banana, orange, fig, pomegranate



//Solutions

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        List<String> list = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());
//
//        Function<List<String>, List<String>> distinct = someList -> someList.stream().distinct().collect(Collectors.toList());
//        System.out.println(String.join(", ", distinct.apply(list)));
//    }


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        List<String> list = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());
//
//        Function<List<String>, ArrayList<String>> distinct = someList -> new ArrayList<String>(new HashSet<String>(someList));
//        System.out.println(String.join(", ", distinct.apply(list)));
//    }
