package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SwapThePlacesInThePair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int a = 0; a < (number % 2 == 0 ? number : number - 1); a += 2) {
            int temporary = array[a];
            array[a] = array[a + 1];
            array[a + 1] = temporary;
        }

        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}



//Условие

//Напишете програма, която разменя местата на съседни елементи на масив (разменете 1-ви елемент с 2-ри, 3-ти с 4-ти и т.н.,
//ако елементите са нечетен брой, тогава последният елемент остава на своето място).
//
//Входни данни
//На първи ред се дава числото N - броят на елементите в масива (1 <= N <= 35). След това, на втори ред, се дават N цели числа,
//разделени с интервал - елементите на масива.

//Изход
//Принтирайте масивът, получен след пренареждане на елементите. Числата трябва да бъдат принтирани, разделени с интервал.



//Тестове

//6
//4 5 3 4 2 3
//5 4 4 3 3 2

//5
//2 1 4 3 5
//1 2 3 4 5

//1
//5
//5
