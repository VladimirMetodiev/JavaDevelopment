package basicSyntaxExercises;

import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.useLocale(Locale.US);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double theFirstResult = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))), ((a + b + c) / Math.sqrt(c)));
        double theSecondResult = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));
        double theThirdResult = Math.abs((((a + b +c) / 3.0) - ((theFirstResult + theSecondResult) / 2.0)));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", theFirstResult, theSecondResult, theThirdResult);
    }
}



//Tests

//5	2	3
//F1 result: 6,45; F2 result: 8,00; Diff: 3,89

//3.8	2.5	1.2
//F1 result: 569,60; F2 result: 45,84; Diff: 305,22
