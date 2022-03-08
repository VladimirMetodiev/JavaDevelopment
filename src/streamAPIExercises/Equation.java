package streamAPIExercises;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        Stream.iterate(0, x -> x + 1)
                .limit(1001)
                .filter(x -> a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(x -> System.out.print(x + " "));
    }
}



//Условие

//Въвеждат се 4 цели числа: a, b, c и d. Намерете всички целочислени решения на уравнението a*x^3 + b*x^2 + c*x + d = 0 за
//диапазона [0, 1000] и ги отпечатайте във възходящ ред. Ако няма решения в този диапазон, тогава нищо не трябва да се принтира.



//Тестове

//1
//-5
//6
//0
//0 2 3

//2
//-2
//2
//-2
//1

//6
//-3
//2
//4
//