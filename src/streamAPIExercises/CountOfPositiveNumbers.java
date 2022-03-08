package streamAPIExercises;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long count = Arrays
                .stream(input.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(num -> num > 0)
                .count();

        System.out.println(count);
    }
}



//Условие

//Получавам последователност от числа, която е на един ред. Числата са разделени с интервал. Трябва да определя броя на
//положителните числа и да го принтирам.



//Тестове

//6 -12 8 -9 15 4 -2
//4

//-6 -7 -8
//0

//0 1 2 3
//3
