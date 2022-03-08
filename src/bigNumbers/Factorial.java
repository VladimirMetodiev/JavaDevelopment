package bigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Изчислете факториел по дадена положителна стойност
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println(factorial(number));
    }

    private static BigInteger factorial(int num) {
        BigInteger result = new BigInteger("1");
        for (int a = 1; a <= num; a++) {
            result = result.multiply(BigInteger.valueOf(a));
        }
        return result;
    }
}



//Факториел n! = (n-1)! * n

// 0 -> 1
// 1 -> 1
// 2 -> 2
// 3 -> 6
// 4 -> 24
// 5 -> 120
// 6 -> 720
// 7 -> 5040
// 8 -> 40320
// 9 -> 362880
//10 -> 3628800
//11 -> 39916800
//12 -> 479001600
//13 -> 6227020800
//14 -> 87178291200
//15 -> 1307674368000
//16 -> 20922789888000
//17 -> 355687428096000
//18 -> 6402373705728000
//19 -> 121645100408832000
//20 -> 2432902008176640000
