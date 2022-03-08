package streamAPIExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TheNumberOfTheMaximumElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(array).max().getAsInt();

        IntStream.iterate(0, x -> x + 1)
                .filter(x -> array[x] == max)
                .map(x -> x + 1)
                .limit(1)
                .forEach(System.out::println);
    }
}



//Условие

//Напишете програма, която намира номера на максималния елемент в масива.

//Входни данни
//Първият ред съдържа едно естествено число N, което не надвишава 1000 - размера на масива.
//Вторият ред съдържа N числа – елементи на масива (цели числа не по-големи по абсолютна стойност от 1000).

//Изход
//Принтирайте едно число - номера на максималния елемент в масива (НОМЕРАТА на елементите в масива, започват от 1-ца).



//Тестове

//5
//5 4 3 2 1
//1

//10
//20 16 30 24 37 14 10 29 20 11
//5
