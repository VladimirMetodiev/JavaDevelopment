package streamAPIExercises;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class SmallestOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        OptionalInt result = Arrays
                .stream(input.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 != 0)
                .min();

        if(result.isPresent()) {
            System.out.println(result.getAsInt());
        }
        else {
            System.out.println(0);
        }
    }
}



//Условие

//Получаваме списък с цели числа, като всички числа са на един ред и са разделени с интервал. Принтирайте стойността на
//най-малкият, нечетен елемент от списъка, а ако няма нечетни елементи, отпечатайте числото 0.



//Тестове

//14 3 22 0 9 1 18
//1

//2 4 6 8
//0

//3 82 49 51 -7 12 35 -2 73 21
//-7
