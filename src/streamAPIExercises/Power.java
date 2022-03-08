package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println(LongStream.iterate(2, x -> x).limit(number).reduce(1, (long x, long y) -> x * y));
    }
}



//Условие

//Дадено е цялото неотрицателно число N (което не превишава 30). Изчислете 2^N.



//Тестове

//29
//536870912

//30
//1073741824

