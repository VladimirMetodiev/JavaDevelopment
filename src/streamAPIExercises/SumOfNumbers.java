package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.LongStream;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        long sum = LongStream.generate(() -> input.nextLong()).limit(n).sum();
        System.out.println(sum);
    }
}



//Условие

//На първи ред е дадено числото N, а след това се дават N на брой естествени числа. Изчислете и отпечатайте сумата на тези числа.


//Тестове

//3
//9
//5
//1
//15

//5
//42
//38
//22
//18
//9
//129