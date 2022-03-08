package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumOnTheSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt(), window = Integer.parseInt(input.nextLine().trim());
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] subArray = new int[window];

        for (int a = window - 1; a < length; a++) {
            System.arraycopy(array, a - window + 1, subArray, 0, subArray.length);
            System.out.println(Arrays.stream(subArray).min().getAsInt());
        }
    }
}



//Условие

//Дадена е последователност от цели числа с дължина N. Можем да вземаме, само по един сегмент от тази последователност, който се вижда
//през "прозорец" с дължина K. Прозорецът се придвижва от началото към края със стъпка 1, т.е. първо виждаме в "прозореца", първите K
//числа (0, 1 ... Xk), а на следващата стъпка ще видим в прозореца следващите K числа (1, 2 ... Xk), и така до края на поредицата.
//Необходимо е за всяка позиция на "прозореца" да се определи минимума в него.

//Входни данни
//На първият ред получаваме две цели числа N и K (1 <= N <= 150000, 1 <= K <= 10000, K < N) – дължините на последователността и "прозореца";
//Следващият ред съдържа N числа - самата числова последователност;

//Изход
//На следнащите N − K + 1 реда, принтирайте минимумът за всяка позиция на "прозореца".



//Тестове

//7 3
//1 3 2 4 5 3 1
//1
//2
//2
//3
//1

//10 4
//2 8 5 19 13 11 20 6 24 -5
//2
//5
//5
//11
//6
//6
//-5
