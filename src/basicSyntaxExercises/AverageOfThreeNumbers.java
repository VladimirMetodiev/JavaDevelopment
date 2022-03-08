package basicSyntaxExercises;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double theFirstNumber = input.nextDouble();
        double theSecondNumber = input.nextDouble();
        double theThirdNumber = input.nextDouble();

        double average = (theFirstNumber + theSecondNumber + theThirdNumber) / 3.0;

        System.out.printf("%.2f", average);
    }
}



//Condition

//Write program that reads three numbers. Print the average of the three, formatted to the second digit after the decimal point.



//Tests

//2   4.5  3
//3,17

//3.1 4 15
//7,37
