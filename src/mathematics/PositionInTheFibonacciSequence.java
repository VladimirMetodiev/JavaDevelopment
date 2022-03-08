package mathematics;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Определя дали дадено естествено число, е член на последователността на Фибоначи и връща неговата позиция в числовата редица.
 * Ако числото не е член на последователността връща -1.
 */

public class PositionInTheFibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger someNumber = new BigInteger(input.nextLine());
        boolean flag = true;
        int position = 2;

        BigInteger fib1 = BigInteger.valueOf(1);
        BigInteger fib2 = BigInteger.valueOf(1);

        while(someNumber.compareTo(fib2) > 0) {
            BigInteger current = fib2;
            fib2 = fib2.add(fib1);
            fib1 = current;

            position++;

            if(someNumber.compareTo(fib2) < 0) {
                flag = false;
            }
        }

        System.out.println(flag ? position : -1);
    }
}
