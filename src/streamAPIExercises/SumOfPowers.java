package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.LongStream;

public class SumOfPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = Long.parseLong(input.nextLine());

        long result = LongStream
                .iterate(0, x -> x + 1)
                .limit(n + 1)
                .map(x -> (long)Math.pow(2, x))
                .sum();

        System.out.println(result);
    }
}



//Условие

//Дадено е числото N, което не превишава 30. Изчислете: 1 + 2^1 + 2^2 + 2^3 +…+ 2^N



//Тестове

//3
//15

//4
//31
