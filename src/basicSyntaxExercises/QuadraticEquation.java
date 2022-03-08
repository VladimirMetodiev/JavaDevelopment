package basicSyntaxExercises;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());

        double discriminant = Math.pow(b, 2) - 4.0 * a * c;
        double x1, x2;

        if(discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            if(checkUp(x2) && checkUp(x1)) {
                if(x1 > x2) System.out.printf("%d %d", (int)x2, (int)x1);
                else System.out.printf("%d %d", (int)x1, (int)x2);
            }
            else {
                System.out.println("The equation does not have roots that are integers.");
            }
        }
        else if(discriminant == 0) {
            x1 = -b / (2 * a);
            if(checkUp(x1)) {
                System.out.print((int)x1);
            }
            else {
                System.out.println("The equation does not have roots that are integers.");
            }
        }
        else {
            System.out.println("The equation does not have roots.");
        }
    }

    private static boolean checkUp(double x) {
        return x % 1 == 0;
    }
}



//Условие

//Дадени са целите числа a, b, c. Намерете всички целочислени решения на квадратното уравнение a*x^2 + b*x + c = 0, ако има такива.

//Входни данни
//Дадени са три цели числа a, b, c, като a не е равно на 0.

//Изход
//Aко уравнението има два целочислени корена, отпечатайте двете цели числа, във възходящ ред, разделени с интервал, ако
//уравнението има един корен, отпечатайте едно цяло число. Ако уравнението няма корени, отпечатайте "The equation does not have roots.".
//Aко уравнението има корени, но те не са цели числа, отпечатайте "The equation does not have roots that are integers.".



//Quadratic equation

//a*x^2 + b*x + c = 0

//Discriminant: D = b^2 - 4*a*c

//D > 0 => x1 = (-b + D) / (2 * a) and x2 = (-b - D) / (2 * a)

//D = 0 => x1 = -b / (2 * a)

//D < 0 => no real roots



//Тестове

//1
//3
//-4
//-4 1

//1
//4
//4
//-2

//1
//-13
//12
//1 12

//5
//4
//3
//The equation does not have roots.

//5
//4
//-3
//The equation does not have roots that are integers.

//-2
//18
//9
//The equation does not have roots that are integers.

//3
//-2
//-1
//The equation does not have roots that are integers.

