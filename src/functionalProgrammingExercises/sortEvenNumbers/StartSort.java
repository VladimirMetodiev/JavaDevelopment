package functionalProgrammingExercises.sortEvenNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StartSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(input.nextLine().split("\\s*,\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(num -> num % 2 != 0);
        printsList(numbers);

        numbers.sort((a, b) -> a.compareTo(b));
        printsList(numbers);
    }

    private static void printsList (List<Integer> list){
        for (int a = 0; a < list.size(); a++) {
            if(a < list.size() - 1) System.out.print(list.get(a) + ", ");
            else System.out.println(list.get(a));
        }
    }
}



//Condition

//Write a program that reads one line of Integers separated by ", ".
//Print the even numbers
//Sort them in ascending order
//Print them again.
//Use 2 Lambda Expressions to do so.



//Tests

//4, 2, 1, 3, 5, 7, 1, 4 , 2, 12
//4, 2, 4, 2, 12
//2, 2, 4, 4, 12

//1, 3, 5
//(no output)

//18, 26, 22 , 4, 38, 14, 26
//18, 26, 22, 4, 38, 14, 26
//4, 14, 18, 22, 26, 26, 38

//2, 4, 6
//2, 4, 6
//2, 4, 6