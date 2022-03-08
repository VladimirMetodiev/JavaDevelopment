package basicSyntaxExercises;

import java.util.Scanner;

public class CommonFractions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();
        int numerator, denominator;

        if(b >= d) denominator = b % d != 0 ? b * d : b;
        else denominator = d % b != 0 ? b * d : d;

        if(denominator == b) numerator = a + c * (b / d);
        else if (denominator == d) numerator = a * (d / b) + c;
        else numerator = a * d + c * b;

        for (int index = 2; index <= denominator ; index++) {
            if(numerator % index == 0 && denominator % index == 0) {
                numerator /= index;
                denominator /= index;
                index--;
            }
        }

        System.out.printf("%d/%d", numerator, denominator);
    }
}



//Условие

//Дадени са две обикновени дроби: a/b и c/d. Съберете ги и изведете резултата като обикновена дроб m/n.

//Входни данни
//Програмата получава като вход 4 естествени числа a, b, c, d, разделени с интервал, не по-големи от 100;

//Изход
//Програмата трябва да изведе 2 естествени числа m и n, така че m/n = a/b + c/d и дробта m/n да бъде несъкратима.



//Тестове

//1 3 1 2
//5/6

//2 15 1 15
//1/5
