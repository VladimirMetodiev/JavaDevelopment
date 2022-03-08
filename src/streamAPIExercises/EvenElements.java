package streamAPIExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays
                .stream(input.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .toArray();

        Arrays.stream(array).forEach(num -> System.out.print(num + " "));
    }
}



//Условие

//Получавам последователност от числа, която е на един ред. Числата са разделени с интервал. Трябва да принтирам само
//четните елементи, разделени с интервал.



//Тестове

//1 2 3 4 5 6
//2 4 6

//2 4 3 5 7 2 4
//2 4 2 4

//3 5 7 9
//
