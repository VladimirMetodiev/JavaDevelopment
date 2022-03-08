package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.Function;

public class WritingClosures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int a = 1;
        final int b = 3;
        final int c = -4;
        double number = Double.parseDouble(input.nextLine());

        Function<Double, Double> calculate = x -> { return a * Math.pow(x, 2) + b * x + c; };
        System.out.println(calculate.apply(number));
    }
}



//Condition

//Using closure write a lambda expression that calculates a*x^2 + b*x + c where a, b, c are context final variables.
//They will be available in the context during testing.
//Note: the result is double.



//Tests

//1
//0.0

//18
//374.0

//5.5
//42.75

//-4
//0.0

//-8
//36.0

//0.5
//-2.25
