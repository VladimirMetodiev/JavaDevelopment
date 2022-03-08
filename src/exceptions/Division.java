package exceptions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        try { // Контролиран код
            System.out.print("Enter the first numbers: ");
            a = input.nextInt();
            System.out.print("Enter the second numbers: ");
            b = input.nextInt();

            System.out.println(a + " / " + b + " = " + (a / b));
        }
        catch (Exception ex) { // Обработка на грешка
            System.out.println("Error: " + ex);
            System.out.println("Description: " + ex.getMessage());
        }

    }
}



//Tests

//Input
//9
//0
//Output
//Error: java.lang.ArithmeticException: / by zero
//Description: / by zero

//Input
//6
//8.9
//Output
//Error: java.util.InputMismatchException
//Description: null

//Input
//19
//$
//Output
//Error: java.util.InputMismatchException
//Description: null

//Input
//Enter the first numbers: 27
//Enter the second numbers: 9
//Output
//27 / 9 = 3
