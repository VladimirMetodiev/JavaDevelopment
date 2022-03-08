package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int counter = 0;

        for (int a = 0; a < number; a++) {
            if(array[a] > 0) counter++;
        }

        System.out.println(counter);
    }
}



//Условие

//Даден е масив от цели числа. Напишете програма, която изчислява броя на положителните числа, от елементите на масива.

//Входни данни
//На първият ред се дава числото N - броят на елементите в масива (1 <= N <= 10000). След това, на вторият ред, се дават N на брой цели числа,
//разделени с интервал - елементите на масива.

//Изход
//Едно число - броят на положителните елементи в масива.



//Тестове

//Input
//1
//5
//Output
//1

//Input
//1
//-5
//Output
//0

//Input
//4
//-3 -2 -1 0
//Output
//0

//Input
//5
//1 2 3 -1 -4
//Output
//3



//Решение

//    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        System.out.println(Arrays.stream(array).filter(element -> element > 0).count());
//    }
