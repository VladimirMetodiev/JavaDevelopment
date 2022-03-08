package exceptions;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DivisionVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        DecimalFormat df = new DecimalFormat("0.####");

        double a, b;
        boolean continueLoop = true;

        do{
            try{
                a = input.nextDouble();
                b = input.nextDouble();
                if(b == 0) throw new ArithmeticException();
                System.out.println(df.format(a) + " / " + df.format(b) + " = " + df.format(a / b));
                continueLoop = false;
            }
            catch (InputMismatchException ex1){
                input.nextLine();
                System.out.println("The value which you entered isn't a number.");
            }
            catch (ArithmeticException ex2){
                input.nextLine();
                System.out.println("Dividing by zero isn't allowed.");
            }

        } while (continueLoop);
    }
}



//Tests

//16
//4
//16 / 4 = 4

//18.3
//5.4
//18,3 / 5,4 = 3,3889

//2
//3
//2 / 3 = 0,6667

//26
//0
//Dividing by zero isn't allowed.

//&
//The value which you entered isn't a number.

//83
//#
//The value which you entered isn't a number.

