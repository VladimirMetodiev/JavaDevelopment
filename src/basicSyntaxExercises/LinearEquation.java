package basicSyntaxExercises;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        // a * x + b = 0 => x = -b / a
        // Вариант 1: a == 0 и b == 0 => infinity
        // Вариант 2: a == 0 и b != 0 => no
        // Вариант 3: a != 0 и b == 0 => yes, x == 0
        // Вариант 4: a != 0 и b != 0 и -b % a != 0 => no
        // Вариант 5: a != 0 и b != 0 и -b % a == 0 => yes
        // Ред: Result -> NO -> INF

        if(a != 0) {
            if(-b % a == 0) {
                System.out.println(-b / a);
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            if(b != 0) {
                System.out.println("NO");
            }
            else {
                System.out.println("INF");
            }
        }
    }
}



//Условие

//Решете уравнението ax + b = 0 в цели числа.

//Входни данни
//Въвеждат се 2 цели числа: a и b.

//Изход
//Необходимо е да се изведат всички решения, ако броят им е краен, ако няма решения се извежда "NO" (без кавички), и "INF" (без кавички),
//ако има безкрайно много решения.
