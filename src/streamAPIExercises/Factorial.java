package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println(LongStream.rangeClosed(1, number).reduce(1, (long a, long b) -> a * b));
    }
}
