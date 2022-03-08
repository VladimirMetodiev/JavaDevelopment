package dateAndTime.newClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateClass {
    public static void main(String[] args) {
        /*
         * Класът LocalDate ни позволява да извършваме разнообразни действия с дати.
         *
         * МЕТОДИ:
         *
         * >>> Създаване на обект
         * Методът .now() - създава обект с текущата системна дата;
         * Методът .of() - създава обект, като посочим конкретна дата, т.е. година, месец и ден в параметрите;
         * Методът .ofEpochDay() - създава обект въз основа на броя дни, изминали от 1 януари 1970 г.;
         * Методът .ofYearDay() - създава обект въз основа на годината и номера на деня в годината;
         * Методът .parse() - създава обект въз основа на символен низ;
         *
         * >>> Задаване на компонентите на датата
         * Методът .withYear() - задава нова стойност за годината;
         * Методът .withMonth() - задава новата стойност на месеца;
         * Методът .withDayOfMonth() - задава нова стойност на деня;
         * Методът .withDayOfYear() - задава нови стойности за месец и ден въз основа на номера на деня в годината;
         *
         * >>> Получаване на компонентите на датата
         * Методът .getYear() - връща годината;
         * Методът .getMonthValue() - връща месеца;
         * Методът .getMonth() - връща месеца;
         * Методът .getDayOfMonth() - връща деня от месеца;
         * Методът .getDayOfYear() - връща номера на деня в годината;
         * Методът .getDayOfWeek() - връща деня от седмицата, като стойност от изброяването на DayOfWeek;
         * Методът .lengthOfMonth() - връща броя на дните в месеца;
         * Методът .lengthOfYear() - връща броя на дните в годината;
         * Методът .isLeapYear() - връща true, ако годината е високосна, и false в противен случай;
         * Методът .toEpochDay() - връща броя на дните, изминали от 1 януари 1970 г.;
         *
         * >>> Добавяне и изваждане на стойности от компонентите на датата
         * Методът .plusYears() - добавя посочения брой години към датата;
         * Методът .plusMonths() - добавя посочения брой месеци към датата;
         * Методът .plusWeeks() - добавя посочения брой седмици към датата;
         * Методът .plusDays() - добавя посочения брой дни към датата;
         * Методът .minusYears() - изважда посочения брой години от датата;
         * Методът .minusMonths() - изважда посочения брой месеци от датата;
         * Методът .minusWeeks() - изважда посочения брой седмици от датата;
         * Методът .minusDays() - изважда посочения брой дни от датата;
         *
         * >>> Преобразуване на обект от клас LocalDate в обект от клас LocalDateTime
         * Методът .atStartOfDay() - добавя нулеви стойности за времето и връща обект от класа LocalDateTime;
         * Методът .atTime() - добавя посочените стойности за час, минути, секунди, наносекунди или за обект от тип LocalTime и връща обект на класа LocalDateTime;
         *
         * >>> Сравняване на два обекта от клас LocalDate
         * Методът .equals() - сравнява две дати, ако датите са равни, тогава методът връща true, в противен случай връща false;
         * Методът .isEqual() - сравнява две дати, ако датите са равни, тогава методът връща true, в противен случай връща false;
         * Методът .compareTo() - сравнява две дати, връща 0, ако датите са равни, връща положителна стойност, ако първата дата е по-голяма от втората, враща отрицателна стойност, ако първата дата е по-малка от втората;
         * Методът .isBefore() - връща true, ако ако първата дата е по-малка от втората и false в противоположният случай;
         * Методът .isAfter() - Връща true, ако първата дата е по-голяма от втората и false в противоположният случай;
         *
         */

        // Максималното значение, което приема класът LocalDate е +999999999-12-31
        System.out.println(LocalDate.MAX);

        // Минималното значение, което приема класът LocalDate е -999999999-01-01
        System.out.println(LocalDate.MIN);
        printLine();


        // public static LocalDate now()
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        printLine();


        // public static LocalDate of(int year, int month, int day)
        // public static LocalDate of(int year, Month month, int day)
        LocalDate pastDate = LocalDate.of(1978, 5, 14);
        LocalDate futureDate = LocalDate.of(2278, Month.MAY, 14);
        System.out.println(pastDate);
        System.out.println(futureDate);
        printLine();


        // public static LocalDate ofEpochDay(long epochDay)
        LocalDate someDate = LocalDate.ofEpochDay(new Date().getTime() / (24*60*60*1000)); // настоящата дата
        System.out.println(someDate);
        printLine();


        // public static LocalDate ofYearDay(int year, int dayOfYear)
        LocalDate someYear = LocalDate.ofYearDay(2000, 275);
        System.out.println(someYear);
        printLine();


        // public static LocalDate parse(CharSequence text)
        // public static LocalDate parse(CharSequence text, DateTimeFormatter formatter)
        LocalDate dateAsAString = LocalDate.parse("1999-06-21");
        System.out.println(dateAsAString);

        dateAsAString = LocalDate.parse("2011-08-10", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(dateAsAString);
        printLine();


        someDate = LocalDate.of(2002, 12, 24);
        System.out.println(someDate);
        someDate = someDate.withYear(2003);
        someDate = someDate.withMonth(1);
        someDate = someDate.withDayOfMonth(1);
        System.out.println(someDate);
        printLine();


        someDate = LocalDate.of(2003, 3, 6);
        System.out.println(someDate);
        someDate = someDate.withDayOfYear(115);
        System.out.println(someDate);
        printLine();


        System.out.println("Year: " + someDate.getYear());
        System.out.println("Month: " + someDate.getMonth());
        System.out.println("Month: " + someDate.getMonthValue());
        System.out.println("The day of the month: " + someDate.getDayOfMonth());
        System.out.println("The day of the year: " + someDate.getDayOfYear());
        System.out.println("The day of the week: " + someDate.getDayOfWeek());
        System.out.println("The length of the month: " + someDate.lengthOfMonth());
        System.out.println("The length of the year: " + someDate.lengthOfYear());
        System.out.println("Is it a Leap year: " + someDate.isLeapYear());
        printLine();


        someDate = LocalDate.of(2000, 1, 1);
        System.out.println(someDate);
        someDate = someDate.plusYears(1);
        System.out.println("Plus years: " + someDate);
        someDate = someDate.plusMonths(4);
        System.out.println("Plus months: " + someDate);
        someDate = someDate.plusWeeks(5);
        System.out.println("Plus weeks: " + someDate);
        someDate = someDate.plusDays(9);
        System.out.println("Plus days: " + someDate);
        printLine();


        someDate = someDate.minusDays(9);
        System.out.println("Minus days: " + someDate);
        someDate = someDate.minusWeeks(5);
        System.out.println("Minus weeks: " + someDate);
        someDate = someDate.minusMonths(4);
        System.out.println("Minus months: " + someDate);
        someDate = someDate.minusYears(1);
        System.out.println("Minus years: " + someDate);
        printLine();


        System.out.println("LocalDateTime");
        someDate = LocalDate.of(2005, 5, 5);
        LocalDateTime dateAndTime = someDate.atStartOfDay();
        System.out.println(dateAndTime);

        someDate = LocalDate.of(2006, 6, 6);
        dateAndTime = someDate.atTime(8, 12, 24);
        System.out.println(dateAndTime);
        printLine();


        pastDate = LocalDate.of(1492, 10, 14);
        futureDate = LocalDate.of(2492, 10, 14);
        System.out.println(pastDate.equals(futureDate));
        System.out.println(futureDate.compareTo(pastDate));
        System.out.println(pastDate.isBefore(futureDate));
        System.out.println(pastDate.isAfter(futureDate));
        printLine();


        // Преобразуване на датата в String
        System.out.println(someDate.toString());
        System.out.println(someDate.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
