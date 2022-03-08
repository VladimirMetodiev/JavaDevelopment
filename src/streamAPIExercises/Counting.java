package streamAPIExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int[] array = IntStream.generate(() -> input.nextInt()).limit(num).toArray();

        long zeros = Arrays.stream(array).filter(z -> z == 0).count();
        long positive = Arrays.stream(array).filter(p -> p > 0).count();
        long negative = Arrays.stream(array).filter(n -> n < 0).count();

        System.out.printf("%d %d %d", zeros, positive, negative);
    }
}



//Условие

//Въвежда се числото N, а след това N на брой цели числа. Пребройте колко от дадените N числа са нули, колко са положителни числа
//и колко са отрицателни числа. Принтирайте резултатите на един ред, разделини с интервал, като първо трябва да отпечатате броя на нулите,
//след това броя на положителните и отрицателните числа.



//Тестове

//5
//2 0 -6 8 19
//1 3 1

//5
//14 0 0 0 0
//4 1 0
