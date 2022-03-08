package bigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberOfCombinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = new BigInteger(input.nextLine());
        BigInteger k = new BigInteger(input.nextLine());
        System.out.println(getFactorial(n).divide((getFactorial(k).multiply(getFactorial(n.subtract(k))))));
    }

    public static BigInteger getFactorial(BigInteger x) {
        if(x.equals(BigInteger.valueOf(1))) {
            return BigInteger.valueOf(1);
        }
        else {
            return x.multiply(getFactorial(x.subtract(BigInteger.valueOf(1))));
        }
    }
}


//Условие

//Дадени са естествените числа n и k, изчислете стойността C = n! / (k!*(n - k)!) - броя на комбинациите от n елемента по k.
//n и k (n > k; n, k <= 30 )

