package listExercises;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> list = Arrays.stream(input.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        list.sort(Comparator.naturalOrder());
        print(list);
    }

    private static void print(List<Double> list) {
        for (int a = 0; a < list.size(); a++) {
            if(a < list.size() - 1) System.out.print(new DecimalFormat("0.############").format(list.get(a)) + " <= ");
            else System.out.println(new DecimalFormat("0.############").format(list.get(a)));
        }
    }
}



//Condition

//Read a list of decimal numbers and sort them in increasing order. Print the output as shown in the examples below.
//1 <= 2 <= 3



//Tests

//Input
//8 2 7 3
//Output
//2 <= 3 <= 7 <= 8

//Input
//2 4 -9
//Output
//-9 <= 2 <= 4

//Input
//66.8 13 45.67 -21 53 72.3465 -23.9 100
//Output
//-23,9 <= -21 <= 13 <= 45,67 <= 53 <= 66,8 <= 72,3465 <= 100
