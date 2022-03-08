package bigNumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BigDecimalReadMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Обектите на класовете BigInteger и BigDecimal са неизменяеми (immutable). Когато извършваме математически операции
         * с техни обекти, се създава нов обект и му се присвоява резултата от операцията.
         */

        System.out.println("Enter a real number:");

        // Създаване на BigDecimal
        BigDecimal a = new BigDecimal(input.nextLine());
        BigDecimal b = BigDecimal.valueOf(8.16);
        BigDecimal c = new BigDecimal("8.16");
        // При BigDecimal мога да не поставя числото в кавички, но ще "ИЗГУБЯ" точността
        BigDecimal p = new BigDecimal(8.16);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(p);

        // Сравняване на два BigDecimal-а
        // За сравнение на два BigDecimal-а, методът BigDecimal.equals() не се препоръчва, защото той връща true само
        // ако 2-те числа имат една и съща стойност и мащаб (scale)
        System.out.println("\n" + a.compareTo(b));
        System.out.println(b.compareTo(c));

        // Математически действия с BigDecimal-и

        // Събиране
        BigDecimal d = a.add(b);
        System.out.println("\n" + d);
        // Изваждане
        System.out.println(a.subtract(b));
        // Умножение
        System.out.println(a.multiply(b));
        // Деление
        System.out.println(b.divide(a, RoundingMode.CEILING)); // Мога да не поставям RoundingMode, но при безкрайна дроб ще получа java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result
        // Деление със закръгляне
        System.out.println(b.divide(a, RoundingMode.HALF_UP));
        // Степенуване (в скобите на метода се пише степента)
        System.out.println(a.pow(4));
        // Определяне на по-голямата стойност
        System.out.println(BigDecimal.valueOf(169.36).max(BigDecimal.valueOf(81.27)));
        // Определяне на по-малката стойност
        System.out.println(BigDecimal.valueOf(169.36).min(BigDecimal.valueOf(81.27)));

        // Преобразуване на BigDecimal в примитивни типове с десетична запетая

        BigDecimal e = BigDecimal.valueOf(3.4);
        float floatNumber = e.floatValue();
        System.out.println("\n" + floatNumber);

        e = BigDecimal.valueOf(34.5);
        double doubleNumber = e.doubleValue();
        System.out.println(doubleNumber);

        e = BigDecimal.valueOf(144.4);
        int intNumber = e.intValue();
        System.out.println(intNumber);

        e = BigDecimal.valueOf(8198552921648689.5);
        long longNumber = e.longValue();
        System.out.println(longNumber);
    }
}



//Tests

//4.8
//5.19
//2.718281828459
//3.14159265358979323846
