package stringExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Shift {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int a = 0; a < number - 1; a++) {
            sb.append(input.nextInt());
            sb.append((char)32);
        }

        sb.insert(0, input.nextLine().trim() + (char)32);

        int[] array = Arrays.stream(sb.toString().split("\\s")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}



//Условие

//Напишете програма, която измества елементите на масив надясно. Например, 0-вият елемент става 1-ви, 1-вият става 2-ри, и т.н.,
//до последният, който става 0-ев.

//Входни данни
//На първи ред се дава числото N - броят на елементите в масива (1 <= N <= 35). След това се записват N числа, разделени с интервал - елементите на масива. Масивът се състои от цели числа.

//Изход
//Необходимо е да се покаже масивът, получен след изместване на елементите. Числата трябва да се извеждат разделени с интервал.



//Тест

//6
//4 5 3 4 2 3
//3 4 5 3 4 2
