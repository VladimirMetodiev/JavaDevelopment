package streamAPIExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SimpleStatistics {
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

//Дадени са N на брой цели числа. Пребройте колко от тези числа са нули, колко са положителни числа и колко са отрицателни числа.

//Входни данни
//На първи ред се въвежда числото N, а след това се въвеждат N на брой цели числа.

//Изход
//Необходимо е първо да отпечатате броя на нулите, след това броя на положителните числа и накрая броя отрицателните числа,
//разделени чрез интервал.



//Тестове

//10
//2 18 -5 33 0 16 -8 -91 -43 70
//1 5 4

//5
//-1
//-2
//-3
//-4
//-5
//0 0 5
