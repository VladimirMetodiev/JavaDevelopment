package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Да открия най-голямата стойност в списъка, и да я заменя навсякъде където се среща, със значението на най-малката стойност от списъка.
 */

public class MethodReplaceAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(input.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int min = Collections.min(list);
        int max = Collections.max(list);

        list.replaceAll(x -> x.equals(max) ? min : x);
        list.forEach(x -> System.out.print(x + " "));
    }
}



//Тестове

//10 4 6 3 4 8 10 7 5 10
//3 4 6 3 4 8 3 7 5 3

//22 -33 6 14 63 -50 34 18 63 41 63 7 58 63 11
//22 -33 6 14 -50 -50 34 18 -50 41 -50 7 58 -50 11
