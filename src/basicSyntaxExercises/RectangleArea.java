package basicSyntaxExercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double area = a * b;

        System.out.printf("%.2f", area);
    }
}



//Condition

//Write a program that reads the sides of a rectangle (two integers a and b), calculates and prints the rectangle's area.
//Format the result to the second digit after the decimal separator.



//Test

//5 12
//60,00

//7 20
//140,00
