package arrayExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Vladimir Metodiev
 * @version 4.1
 */

public class TrickyOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int[] array = new int[n];
        int[] temporary = new int[n];

        IntStream.rangeClosed(1, n).forEach(num -> array[num - 1] = num);
        IntStream.rangeClosed(1, n).forEach(num -> temporary[num - 1] = num);

        IntStream.rangeClosed(0, b - a).forEach(index -> array[a - 1 + index] = temporary[b - 1 - index]);
        IntStream.rangeClosed(0, n - 1).forEach(index -> temporary[index] = array[index]);

        IntStream.rangeClosed(0, d - c).forEach(index -> array[c - 1 + index] = temporary[d - 1 - index]);

        IntStream.rangeClosed(0, n - 1).forEach(index -> System.out.print(array[index] + " "));
    }
}



//Условие

//Получавате поредица от естествени числа 1, 2, 3, ..., N (1 <= N <= 1000). Първо трябва да разположите в обратен ред една част
//от тази последователност, от елемент с номер A до елемент с номер B, а след това, да разположите в обратен ред втора част
//от тази последователност, от C до D (като: A < B; C < D; 1 <= A, B, C, D <= N).

//Входни данни
//Получавате последователност от естествени числа (разделени с интервал), в строго определен порядък: N A B C D.

//Изход
//Трябва да изведете получената последователност. Числата трябва да се извеждат разделени с интервал.



//Тестове

//9 2 5 6 9
//1 5 4 3 2 9 8 7 6

//10 1 4 7 8
//4 3 2 1 5 6 8 7 9 10

//15 3 8 11 13
//1 2 8 7 6 5 4 3 9 10 13 12 11 14 15

//15 3 11 8 13
//1 2 11 10 9 8 7 13 12 3 4 5 6 14 15

//11 2 7 2 7
//1 2 3 4 5 6 7 8 9 10 11

//11 7 9 2 5
//1 5 4 3 2 6 9 8 7 10 11



//Моето първо решение, което премина всички тестове

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int n = input.nextInt();
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int d = Integer.parseInt(input.nextLine().trim());
//
//        int[] array = new int[n];
//        int[] temporary;
//
//        for(int index = 1; index <= n; index++) {
//            array[index - 1] = index;
//        }
//
//        temporary = new int[b - a + 1];
//        System.arraycopy(array, a - 1, temporary, 0, temporary.length);
//
//        for(int index = a - 1; index < b; index++) {
//            array[index] = temporary[temporary.length - 1 - index + a - 1];
//        }
//
//        temporary = new int[d - c + 1];
//        System.arraycopy(array, c - 1, temporary, 0, temporary.length);
//
//        for(int index = c - 1; index < d; index++) {
//            array[index] = temporary[temporary.length - 1 - index + c - 1];
//        }
//
//        for(int num : array) System.out.print(num + " ");
//    }
