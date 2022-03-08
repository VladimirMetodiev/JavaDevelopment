package dateAndTime.newClasses;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodClass {
    public static void main(String[] args) {
        /*
         * Клас Period се използва, за да определим разликата между две дати;
         *
         * МЕТОДИ:
         *
         * >>> Създаване на обект на клас Period
         * Методът .between() създава обект, съдържащ разликата между две дати, представени от класа LocalDate;
         * Методът .of() - създава обект въз основа на броя на годините, месеците и дните;
         * Методът .ofYears() - създават обект въз основа само на годината;
         * Методът .ofMonths() - създават обект въз основа само на месеца;
         * Методът .ofWeeks() - създава обект въз основа на броя на седмиците - получаваме нулеви стойности за годината и месец, а броят на дните ще бъде равен на броя на дните в посочения брой седмици;
         * Методът .ofDays() създават обект въз основа само на дните;
         * Методът .parse() създава обект на базата на специално форматен символен низ;
         *
         * >>> Изменение на отделните компоненти на Period
         * Методът .withYears() - връща нов обект създаден въз основа на годините;
         * Методът .withMonths(int months) - връща нов обект създаден въз основа на месеците;
         * Методът .withDays(int days) - връща нов обект създаден въз основа на дните;
         *
         * >>> Добавяне и изваждане на стойност от компонентите на Period
         * Методът .plusYears(long years) - добавя години;
         * Методът .plusMonths(long months) - добавя месеци;
         * Методът .plusDays(long days) - добавя дни;
         * Методът .minusYears(long years) - изважда години;
         * Методът .minusMonths(long months) - изважда месеци;
         * Методът .minusDays(long days) - изважда дни;
         * Методът .multipliedBy() - умножава всичките компоненти с дадена стойност;
         * Методът .negated() - изменя знака на всичките компоненти на противоположния;
         * Методът .normalized() - нормализира стойностите на годините и месеците, но не и на дните;
         *
         * >>> Получаване на стойностите на отделните компоненти на Period
         * Методът .getYears() - връща годините;
         * Методът .getMonths() - връща месеците;
         * Методът .getDays() - връща дните;
         * Методът .toTotalMonths() - връща общия брой месеци, като се имат предвид стойността на компонентите година и месец;
         *
         * >>> Сравняване
         * Методът .equals() - сравнява два обекта, ако обектите са равни, тогава методът връща true, в противоположният случай връща false;
         * Методът .isNegative() - връща true, ако поне един компонент съдържа отрицателна стойност, или false в противоположният случай;
         * Методът .isZero() - връща true, ако всички компоненти съдържат стойността 0, или false в противоположният случай;
         *
         * >>> Получаване на количеството на дните между две дати
         * Методът public long until(Temporal endExclusive, TemporalUnit unit)
         *
         */

        LocalDate theFirst = LocalDate.of(2015, 11, 16);
        LocalDate theSecond = LocalDate.of(2016, 2, 21);
        Period period = Period.between(theFirst, theSecond);
        System.out.println(period);
        printLine();


        period = Period.of(3, 8, 14);
        System.out.println(period);
        printLine();


        System.out.println(Period.ofYears(15));
        System.out.println(Period.ofMonths(3));
        System.out.println(Period.ofWeeks(9));
        System.out.println(Period.ofDays(19));
        printLine();


        Period fromCharSequence = Period.parse("P5Y3M16D");
        System.out.println(fromCharSequence);
        printLine();


        theFirst = LocalDate.of(2018, 4, 9);
        theSecond = LocalDate.of(2019, 12, 31);
        period = Period.between(theFirst, theSecond);
        System.out.println(period);

        period = period.withYears(2);
        System.out.println(period);

        period = period.withMonths(7);
        System.out.println(period);

        period = period.withDays(19);
        System.out.println(period);
        printLine();


        period = Period.parse("P7Y7M7D");
        System.out.println(period);
        System.out.println(period.plusYears(3));
        System.out.println(period.plusMonths(20));
        System.out.println(period.plusDays(50));
        System.out.println(period.minusYears(3));
        System.out.println(period.minusMonths(20));
        System.out.println(period.minusDays(50));
        printLine();


        period = Period.parse("P2Y4M19D");
        System.out.println(period.multipliedBy(10));
        System.out.println(period.negated());
        printLine();


        System.out.println(Period.parse("P6Y2M15D").equals(Period.parse("P6Y2M15D")));
        System.out.println(Period.parse("P8Y6M20D").equals(Period.parse("P2Y11M19D")));

        System.out.println(Period.parse("P4Y-22M18D").isNegative());

        period = Period.between(LocalDate.of(2000, 8, 21), LocalDate.of(2000, 8, 21));
        System.out.println(period.isZero());
        printLine();


        System.out.println(Period.parse("P1Y638M19D").normalized());
        printLine();


        // Добавяне и изваждане на период от дата
        LocalDate someDate = LocalDate.of(2018, 6, 2);
        System.out.println(someDate);
        Period newPeriod = Period.parse("P33D");
        System.out.println(someDate.plus(newPeriod));

        newPeriod = Period.parse("P8M");
        System.out.println(someDate.minus(newPeriod));
        printLine();


        // Получаване на количеството на дните между две дати
        theFirst = LocalDate.of(2017, 11, 7);
        theSecond = LocalDate.of(2018, 6, 19);
        System.out.println(theFirst.until(theSecond, ChronoUnit.DAYS));

        System.out.println(theFirst.until(theSecond, ChronoUnit.WEEKS));

        // Алтернативно записване
        System.out.println(ChronoUnit.WEEKS.between(theFirst, theSecond));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
