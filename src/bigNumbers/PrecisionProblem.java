package bigNumbers;

import java.math.BigDecimal;
import java.util.Scanner;

public class PrecisionProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal a = new BigDecimal(input.nextLine()).setScale(7, BigDecimal.ROUND_DOWN);
        BigDecimal b = new BigDecimal(input.nextLine()).setScale(7, BigDecimal.ROUND_DOWN);
        BigDecimal c = new BigDecimal(input.nextLine()).setScale(7, BigDecimal.ROUND_DOWN);

        System.out.println(a.add(b).compareTo(c) == 0 ? "YES" : "NO");
    }
}



//Условие

//Дадени са три реални, положителни числа - a, b, c, които имат НЕ ПОВЕЧЕ от 7 цифри след десетичната точка. Проверете дали
//равенството a + b = c е вярно. Ако то е вярно, отпечатайте YES, ако не e, отпечатайте NO.



//Тестове

//1
//2
//5
//NO

//0.1
//0.2
//0.3
//YES

//10.0000001111
//90.9999999999
//101.0
//YES

//500.0000001
//600.00000069
//1100.0000007
//YES

//5893.5642782641
//68271.456585555
//74165.0208637
//YES

//28.9562843524
//22.1526488426
//40.0082637415
//NO
