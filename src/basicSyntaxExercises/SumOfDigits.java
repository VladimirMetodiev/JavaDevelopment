package basicSyntaxExercises;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(input.nextLine()));
        int sum = 0;

        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);
    }
}



//Condition

//Дадено е трицифрено число (то може да бъде и отрицателно). Намерете сбора от цифрите му.



//Test

//458
//17
