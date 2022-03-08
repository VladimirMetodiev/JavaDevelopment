package mathematics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Изчислява n-тият член от последователността на Фибоначи
 */

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        BigInteger fib1 = BigInteger.valueOf(1);
        BigInteger fib2 = BigInteger.valueOf(1);

        try{
            if(number <= 2) throw new IllegalArgumentException();
            number -= 2;
        }
        catch (IllegalArgumentException ex) {
            if(number == 1 || number == 2) {
                System.out.println(1);
            }
            System.exit(0);
        }

        while(number > 0) {
            BigInteger current = fib2;
            fib2 = fib2.add(fib1);
            fib1 = current;
            --number;
        }

        System.out.println(fib2);
    }
}
