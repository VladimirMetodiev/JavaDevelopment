package basicSyntaxExercises;

import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = a; i <= b; i++) {
            if(Math.sqrt(i) % 1 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}



//Условие

//Входни данни
//Въвеждат се двете цели числа a и b. Гарантирано е, че a не надвишава b.

//Изход
//Принтирайте, всички числа в диапазона от a до b (включително), които са пълни квадрати, разделени с интервал.
//Ако няма такива числа, тогава нищо не принтирайте нищо.



//Тестове

//2
//8
//4

//3
//36
//4 9 16 25 36

//5
//8
//

