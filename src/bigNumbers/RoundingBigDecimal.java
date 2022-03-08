package bigNumbers;

import methodsExercises.Arithmetic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingBigDecimal {
    public static void main(String[] args) {
        /*
         * В Java има възможност, да зададем броя на цифрите след десетичната запетая, на BigDecimal-числата, с които работим. Тава се
         * извършва чрез метода .setScale(), които има два параметъра, брой цифри и режим на закръгляне (rounding mode).
         * В Java съществуват 8 режима на закръгляне.
         */

        //BigDecimal.ROUND_CEILING - закръгля към по-голямата възможна стойност
        BigDecimal first = new BigDecimal(196.5555555555).setScale(2, BigDecimal.ROUND_CEILING);
        System.out.println(first);
        printLine();

        //BigDecimal.ROUND_FLOOR - закръгля към по-малката възможна стойност
        BigDecimal second = new BigDecimal(196.5555555555).setScale(2, BigDecimal.ROUND_FLOOR);
        System.out.println(second);
        printLine();

        //BigDecimal.ROUND_DOWN - отрязва цифрите след указаната стойност, без никакво закръгляне
        BigDecimal third = new BigDecimal(196.3456565656).setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println(third);
        printLine();

        //BigDecimal.ROUND_HALF_UP - закръгля към по-голямата възможна стойност, ако последващото число е >= 5
        BigDecimal fourth = new BigDecimal(196.3454343434).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(fourth);
        fourth = new BigDecimal(196.3434343434).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(fourth);
        printLine();

        //BigDecimal.ROUND_HALF_DOWN - закръгля към по-голямата възможна стойност, ако последващото число е >= 5
        BigDecimal fifth = new BigDecimal(196.4353434343).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(fifth);
        fifth = new BigDecimal(196.4343434343).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(fifth);
        printLine();

        //BigDecimal.ROUND_HALF_EVEN - закръгля към по-голямата възможна стойност, ако число е нечетно и последващото е >= 5
        BigDecimal sixth = new BigDecimal(2.5).setScale(0, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(sixth);
        sixth = new BigDecimal(3.5).setScale(0, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(sixth);
        printLine();

        //BigDecimal.ROUND_UP - закръгля ВИНАГИ към по-голямата възможна стойност
        BigDecimal seventh = new BigDecimal(8.4444).setScale(1, BigDecimal.ROUND_UP);
        System.out.println(seventh);
        seventh = new BigDecimal(8.4644).setScale(1, BigDecimal.ROUND_UP);
        System.out.println(seventh);
        printLine();

        //BigDecimal.ROUND_UNNECESSARY - се използва в случаите, когато режимът на закръгляване трябва да се предаде на някакъв метод,
        //но самото число не трябва да се закръгля. Ако се опитатеме да закръглим число с зададен режим ROUND_UNNECESSARY, то тогава
        //се хвърля ArithmeticException.
        try {
            BigDecimal eighth = new BigDecimal(5.5555).setScale(2, BigDecimal.ROUND_UNNECESSARY);
            System.out.println(eighth);
        }
        catch (ArithmeticException ex) {
            System.err.println("Exception: " + ex.getMessage());
        }
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
