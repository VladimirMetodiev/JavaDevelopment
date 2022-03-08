package basicSyntaxExercises;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String theFirst = input.next();
        String theSecond = input.next();
        int theFirstNumber = Integer.parseInt(input.next());
        int theSecondNumber = Integer.parseInt(input.next());
        int theThirdNumber = Integer.parseInt(input.next());
        String theThird = input.next();

        int sum = theFirstNumber + theSecondNumber + theThirdNumber;

        System.out.printf("%s %s %s %d", theFirst, theSecond, theThird, sum);
    }
}



//Condition

//Write a program that reads:
//Two strings from the first line
//Three Integers which may be on multiple lines
//A string from the next line
//Print the output in the following format {firstWord} {secondWord} {thirdWord} {sumOfNumbers}.
//The sum of numbers should be an integer.



//Tests

//scanner system
//1 2 3
//in
//scanner system in 6

//Java Rocks
//5     12   -7
//End
//Java Rocks End 10



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String theFirst = input.next().trim();
//        String theSecond = input.nextLine().trim();
//        int firstNumber = input.nextInt();
//        int secondNumber = input.nextInt();
//        int thirdNumber = input.nextInt();
//        input.nextLine();
//        String theThird = input.nextLine();
//
//        System.out.printf("%s %s %s %realNumber", theFirst, theSecond, theThird, firstNumber + secondNumber + thirdNumber);
//    }
