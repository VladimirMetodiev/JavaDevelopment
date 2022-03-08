package functionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> anotherList = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int divisor = Integer.parseInt(input.nextLine());

        Collections.reverse(anotherList);

        BiConsumer<List<Integer>, Integer> printWithout = (list, num) -> {
            for(int e : list) if(e % num != 0) System.out.print(e + " ");
        };

        printWithout.accept(anotherList, divisor);
    }
}



//Condition

//Write a program that reverses a collection and removes elements that are divisible by a given integer n.



//Tests

//5 6 15 16 25 26 35 36 45 46
//5

//2 4 6 8 10
//2
//

//3 6 9 12 15
//7
