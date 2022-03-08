package listExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> subLists = Arrays.stream(input.nextLine().split("\\|")).collect(Collectors.toList());

        ArrayList<Integer> result = new ArrayList<>();

        for(int a = subLists.size() - 1; a >= 0; a--) {
            List<Integer> current;
            try {
                current = Arrays.stream(subLists.get(a).trim().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
            } catch (Exception ex) {
                continue;
            }
            result.addAll(current);
        }

        for(int el : result) System.out.print(el + " ");
    }
}



//Condition

// Write a program to append several lists of numbers.
// Lists are separated by ‘|’.
// Values are separated by spaces (‘ ’, one or several)
// Order the lists from the last to the first, and their values from left to right.



//Tests

//Input
//1 2 3 |4 5 6 |  7  8
//Output
//7 8 4 5 6 1 2 3

//Input
//7 | 4  5|1 0| 2 5 |3
//Output
//3 2 5 1 0 4 5 7

//Input
//1| 4 5 6 7  |  8 9
//Output
//8 9 4 5 6 7 1

//Input
// 19 12 25 |66|48 9 61 |  22  8 3| | 15 100 7
//Output
//15 100 7 22 8 3 48 9 61 66 19 12 25

//Input
//11 12| 13 14 15 |16 17 |  |
//Output
//16 17 13 14 15 11 12
