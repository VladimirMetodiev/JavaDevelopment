package stringExercises;

import java.util.Scanner;

public class CountOfPalindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for(int a = 1; a <= number; a++) {
            if((Integer.toString(a)).equals(sb.append(a).reverse().toString())) {
                counter++;
            }
            sb.setLength(0);
        }

        System.out.println(counter);
    }
}



//Условие

//Наричаме едно число (или израз) палиндром, ако то не се променя, при пренареждане на символите му в обратен ред.
//Напишете програма, която при зададено число K, изчислява и отпечатва броя на естествените палиндроми, които не надвишават K.

//Входни данни
//Получаваме едно число K (1 <= K <= 100000);

//Изход
//Необходимо е да изчислите и принтирате броя на естествените палиндроми, които не надвишават K.
