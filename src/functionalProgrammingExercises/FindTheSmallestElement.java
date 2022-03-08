package functionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> find = (list) -> {
            int number = list.get(0);
            int index = 0;
            for (int a = 1; a < list.size(); a++) {
                if(number >= list.get(a)) {
                    number = list.get(a);
                    index = a;
                }
            }
            return index;
        };

        System.out.println(find.apply(intList));
    }
}



//Condition

//Write a program which is using a custom function to find the smallest integer in a sequence of integers. The input
//could have more than one space. Your task is to collect the integers from the console, find the smallest one and
//checkUp its index (if more than one such elements exist, checkUp the index of the rightmost one).



//Tests

//52 16 31 10 29 34 12 47
//3

//8 19 11 37 8 14 10 28
//4
