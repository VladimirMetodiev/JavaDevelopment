package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println(IntStream.iterate(1, x -> x + 1).limit(number).map(x -> x * x).sum());
    }
}



//Условие

//По е дадено естествено число n, трябва изчислете сумата 1^2+2^2+...+n^2.

//Входни данни
//Въвежда се едно естествено число - n, което не надвишава 100.

//Изход
//Принтирайте сумата на квадратите от 1 до n.



//Тестове

//1
//1

//2
//5

//99
//328350
