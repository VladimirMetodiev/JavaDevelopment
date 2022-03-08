package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int bombNumber = input.nextInt();
        int power = Integer.parseInt(input.nextLine().trim());

        for(int a = 0; a < numbers.size(); a++) {
            if(numbers.get(a).equals(bombNumber)) {
                int start = a - power >= 0 ? a - power : 0;
                int iteration = (a - power >= 0 ? power : a) + 1 + (a + power < numbers.size() - 1 ? power : numbers.size() - 1 - a);
                for (int b = start; b < start + iteration; b++) {
                    numbers.remove(start);
                }
                a = start - 1 >= 0 ? start - 1 : 0;
            }
        }

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}



//Condition

//Write a program that reads sequence of numbers and special bomb number with a certain power. Your task is to detonate
//every occurrence of the special bomb number and according to its power his neighbors from left and right. Detonations are performed
//from left to right and all detonated numbers disappear. Finally print the sum of the remaining elements in the sequence.



//Tests

//Input
//3 2 8 5 1 7 3 3
//5 2
//Output
//9


//Input
//1 13 2 5 27 1 11 1
//11 4
//Output
//14


//Input
//8 9 9 5 5 5
//9 1
//Output
//15


//Input
//11 11 14 11 11 11 11 14 11 11 11
//14 1
//Output
//55


//Input
//8 8 8 10 8 8 10 8 8 8 8 8 10 8
//10 2
//Output
//8


//Input
//10 6 6 6 10 6 6 6 6 6 10
//10 2
//Output
//6
