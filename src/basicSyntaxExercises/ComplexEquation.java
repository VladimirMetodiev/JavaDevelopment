package basicSyntaxExercises;

import java.util.Scanner;

public class ComplexEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        //(c == 0 && d == 0) не е възможно по условие

        if(a == 0 && b == 0) {
            System.out.println("INF");
        }
        else if(a == 0) {
            System.out.println("NO");
        }
        else {
            if(-b % a != 0) {
                System.out.println("NO");
            }
            else {
                if(b * c != d * a) System.out.println(-b / a);
                else System.out.println("NO");
            }
        }


    }
}



//Условие

//Решете в цели числа уравнението (a*x + b) / (c*x + d) = 0.

//Входни данни
//Въвеждат се 4 числа: a, b, c и d;
//c и d не са равни на нула едновременно;

//Изход
//Необходимо е да се изведат всички целочислени решения, ако броят им е краен, "NO" (без кавички), ако няма целочислени решения
//и "INF" (без кавички), ако има безкрайно много решения.



//Тестове

//1
//1
//2
//2
//NO


//1
//2
//0
//3
//-2


//2
//8
//11
//0
//-4


//2
//-4
//7
//1
//2


//0
//0
//2
//3
//INF
