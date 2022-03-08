package listExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers;
        try {
            numbers = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return;
        }

        numbers = numbers.stream().filter(e -> e >= 0).collect(Collectors.toList());
        Collections.reverse(numbers);

        if(!numbers.isEmpty()) numbers.forEach(e -> System.out.print(e + " "));
        else System.out.println("empty");
    }
}



//Condition

//Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
//In case of no elements left in the list, print "empty".



//Tests

//Input
//10 -5 7 9 -33 50
//Output
//50 9 7 10

//Input
//7 -2 -10 1
//Output
//1 7

//Input
//16 -22 -8 37 4 -63 0 16 99 -63
//Output
//99 16 0 4 37 16

//Input
//-1 -2 -3
//Output
//empty

//Input
//
//Output
//Exception: For input string: ""
