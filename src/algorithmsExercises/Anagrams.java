package algorithmsExercises;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] theFirst = input.nextLine().toCharArray();
        char[] theSecond = input.nextLine().toCharArray();

        theFirst = countingSort(theFirst);
        theSecond = countingSort(theSecond);

        System.out.println(new String(theFirst).equals(new String(theSecond)) ? "YES" : "NO");
    }

    private static char[] countingSort(char[] array) {
        int max = array[0], counter = 0;

        for (int a = 1; a < array.length; a++) {
            if(array[a] > max) max = array[a];
        }

        int[] temporary = new int[max + 1];

        for (int b = 0; b < array.length; b++) {
            temporary[array[b]] += 1;
        }

        for (int e = 0; e < temporary.length; e++) {
            if(temporary[e] > 0) {
                for (int f = 0; f < temporary[e]; f++) {
                    array[counter] = (char)e;
                    counter++;
                }
            }
        }

        return array;
    }
}



//Условие - Anagrams

//Анаграма се нарича дума (или израз), която може да бъде получена от символите на друга дума (израз).
//Дадени са две думи (изрази), състоящи се от малки латински букви и цифри. Принтирайте "YES", ако въведените думи (изрази),
//са анаграми една на друга, или принтирайте "NO", ако не са.



//Тестове

//capital
//factory
//NO

//tutor
//tutorial
//NO

//brag
//grab
//YES

//inch
//chin
//YES

//listen
//silent
//YES

//players
//parsley
//YES

//peach
//cheap
//YES

//night
//thing
//YES

//a gentleman
//elegant man
//YES

//the detectives
//detect thieves
//YES

//the eyes
//they see
//YES
