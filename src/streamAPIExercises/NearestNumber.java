package streamAPIExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NearestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(input.nextLine());

        int[] difference = Arrays.stream(array).map(x -> Math.abs(number - x)).toArray();
        int min = Arrays.stream(difference).min().getAsInt();

        IntStream.iterate(0, x -> x + 1)
                .limit(array.length)
                .filter(x -> difference[x] == min)
                .forEach(x -> System.out.print(array[x] + " "));
    }
}



//Условие

//Напишете програма, която намира елементът в масива, който е най-близък по стойност до дадено число.

//Входни данни
//Първият ред съдържа едно естествено число N, което не надвишава 1000 - размера на масива.
//Вторият ред съдържа N числа - елементите на масива (цели числа, които не надвишават по абсолютна стойност 1000).
//Третият ред съдържа едно цяло число X, което не надвишават по абсолютна стойност 1000.

//Изход
//Отпечатайте стойността на елемента от масива, който е най-близък до X. Ако има няколко такива числа, отпечатайте всяко от тях.



//Тестове

//5
//2 8 6 11 3
//5
//6

//8
//4 6 11 2 15 1 9 7
//3
//4 2

//6
//-10 12 4 17 -25 19
//-30
//-25

//4
//4 6 4 6
//5
//4 6 4 6
