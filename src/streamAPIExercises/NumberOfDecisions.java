package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.Stream;

public class NumberOfDecisions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        long count = Stream
                .iterate(0, x -> x + 1)
                .limit(1001)
                .filter(x -> (a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d) / (x - e) == 0)
                .count();

        System.out.println(count);
    }
}



//Условие

//Въвеждат се 5 цели числа: a, b, c, d и e. Намерете всички целочислени решения на уравнението ( a*x^3 + b*x^2 + c*x + d ) / ( x - e ) = 0
//за диапазона [0, 1000] и принтирайте техния брой.



//Тестове

//1
//-5
//6
//0
//1
//3

//1
//2
//3
//4
//5
//0

