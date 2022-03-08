package arrayExercises;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class MagicSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int value = Integer.parseInt(input.nextLine());

        LinkedHashMap<Integer, Integer> pairs = new LinkedHashMap<>();

        for (int a = 0; a < numbers.length; a++) {
            for (int b = a + 1; b < numbers.length; b++) {
                if(numbers[a] + numbers[b] == value) {
                    if (!pairs.containsKey(numbers[a])) {
                        pairs.put(numbers[a], numbers[b]);
                    }
                }
            }
        }

        for(Map.Entry<Integer, Integer> element : pairs.entrySet()){
            System.out.printf("%d %d%n", element.getKey(), element.getValue());
        }
    }
}



//Condition

//Write a program, which prints all unique pairs in an array of integers whose sum is equal to a given number.



//Tests

//Input
//1 7 6 2 19 23
//8
//Output
//1 7
//6 2

//Input
//14 20 60 13 7 19 8
//27
//Output
//14 13
//20 7
//19 8


//5 8 15 2 6 18 2 5 4 19 12 26 0 1 8 15
//20
//5 15
//8 12
//15 5
//2 18
//18 2
//19 1
//12 8
