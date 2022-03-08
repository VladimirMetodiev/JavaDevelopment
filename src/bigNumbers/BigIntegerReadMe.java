package bigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerReadMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");

        // Създаване на BigInteger
        BigInteger a = new BigInteger(input.nextLine());
        BigInteger b = BigInteger.valueOf(2147483647);
        BigInteger c = new BigInteger("2147483647");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Сравняване на два BigInteger-а
        System.out.println("\n" + a.compareTo(b));
        System.out.println(b.compareTo(c));

        // Математически действия с BigInteger-и

        // Събиране
        BigInteger d = a.add(b);
        System.out.println("\n" + d);
        // Изваждане
        System.out.println(a.subtract(b));
        // Умножение
        System.out.println(a.multiply(b));
        // Деление
        System.out.println(b.divide(a));
        // Остатък от целочислено деление
        System.out.println(b.mod(a));
        // Степенуване (в скобите на метода се пише степента)
        System.out.println(a.pow(3));


        // Преобразуване на BigInteger в примитивни типове

        BigInteger e = BigInteger.valueOf(16);
        byte byteNumber = e.byteValue();
        System.out.println("\n" + byteNumber);

        e = BigInteger.valueOf(32);
        short shortNumber = e.shortValue();
        System.out.println(shortNumber);

        e = BigInteger.valueOf(64);
        int intNumber = e.intValue();
        System.out.println(intNumber);

        e = BigInteger.valueOf(128);
        long longNumber = e.longValue();
        System.out.println(longNumber);
    }
}
