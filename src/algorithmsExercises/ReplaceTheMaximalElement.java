package algorithmsExercises;

import java.util.Scanner;

public class ReplaceTheMaximalElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int[] array = new int[number];

        for (int a = 0; a < number; a++) {
            array[a] = input.nextInt();
        }

        int maximalElement = 0;

        for (int b = 1; b < number; b++) {
            if(array[b] > array[maximalElement]) maximalElement = b;
        }

        if (array[0] < array[maximalElement]) {
            int current = array[maximalElement];
            array[maximalElement] = array[0];
            array[0] = current;
        }

        for (int e = 0; e < number; e++) {
            if(e < number - 1) System.out.print(array[e] + " ");
            else System.out.println(array[e]);
        }
    }
}



//Условие

//Разменете първия елемент от масив с елемента с максимална стойност.

//Входни данни
//На първият ред получаваме едно естествено число, което не надвишава 1000 - размера на масива;
//Вторият ред съдържа N числа - елементите на масива (цели числа, не по-големи от 1000 по абсолютна стойност);
//Ако има няколко елемента с максимална стойност, е необходимо да промените първия от тях;

//Изход
//Принтирайте полученият масив.



//Тестове

//5
//1 2 3 4 5
//5 2 3 4 1

//10
//4 12 3 25 7 11 25 8 25 19
//25 12 3 4 7 11 25 8 25 19

//5
//10 6 8 2 9
//10 6 8 2 9
