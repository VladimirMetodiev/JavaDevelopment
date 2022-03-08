package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Zeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long count = LongStream.generate(() -> input.nextLong()).limit(num).filter(x -> x == 0).count();
        System.out.println(count);
    }
}



//Условие

//Дадено е числото N, а след това се дават N на брой цели числа. Изчислете и принтирайте, какъв е броят на нулите сред тях.



//Тестове

//6
//2 8 0 6 0 0
//3

//3
//1 2 3
//0



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int num = input.nextInt();
//        int[] numbers = new int[num];
//
//        for (int a = 0; a < num; a++) {
//            numbers[a] = input.nextInt();
//        }
//
//        System.out.println(Arrays.stream(numbers).filter(x -> x == 0).count());
//    }
