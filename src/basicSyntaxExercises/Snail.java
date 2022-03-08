package basicSyntaxExercises;

import java.util.Locale;
import java.util.Scanner;

public class Snail {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        double h = input.nextDouble();
        double a = input.nextDouble();
        double b = input.nextDouble();

        double result = h <= a ? 1 : Math.ceil((h - a) / (a - b)) + 1;

        System.out.println((int)result);
    }
}



//Condition

//Охлюв пълзи по вертикален стълб, който е висок H метра. Охлювът се издига с A метра за един ден и се спуска с В метра през нощта.
//В кой ден охлювът ще изпълзи до върха на стълба? Решете тази задача, без използването на if оператор и цикли.

//Входни данни
//Програмата получава естествени числа h, a, b като вход. Гарантирано е, че a > b.

//Изход
//Програмата трябва да изведе едно естествено число.



//Tests

//10
//4
//2
//4

//11
//4
//2
//5

//12
//4
//2
//5

//13
//4
//2
//6

//10
//4
//1
//3

//11
//4
//1
//4

//12
//4
//1
//4

//13
//4
//1
//4

//14
//4
//1
//5

//5
//6
//3
//1

//1
//11
//8
//1

//1
//30
//15
//1

//1
//20
//15
//1

//45
//11
//3
//6
