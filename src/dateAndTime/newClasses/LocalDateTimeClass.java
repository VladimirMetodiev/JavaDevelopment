package dateAndTime.newClasses;

import java.time.LocalDateTime;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        /*
         * Класът LocalDateTime ни позволява да извършваме разнообразни действия с дати и време.
         *
         * МЕТОДИ:
         *
         * >>> Създаване на обект
         * Методът .now() - създава обект с текущата системна дата и време;
         * Методът .of() - създава обект, като посочим година, месец, ден, час, минути, секунди и наносекунди в параметрите;
         * Методът .ofEpochSecond() - създава обект въз основа на броя на секундите изминали от 1 януари 1970 г., наносекундите и обект на класа ZoneOffset, който определя часовата зона;
         * Методът .ofInstant() - създава обект на базата на екземпляр на класа Instant и часовата зона;
         * Методът .parse() - създава обект от символен низ със специален формат;
         *
         * >>> Задаване на компонентите на LocalDateTime
         * Методът .withYear() - задава нова стойност за годината;
         * Методът .withMonth() - задава новата стойност на месеца;
         * Методът .withDayOfMonth() - задава нова стойност на деня;
         * Методът .withDayOfYear() - задава нови стойности за месец и ден въз основа на номера на деня в годината;
         * Методът .withHour() - задава нова стойност за часа;
         * Методът .withMinute() - задава нова стойност за минутите;
         * Методът .withSecond() - задава нова стойност за секундите;
         * Методът .withNano() - задава нова стойност на наносекундите;
         *
         * >>> Получаване на компонентите на LocalDateTime
         * Методът .getYear() - връща годината;
         * Методът .getMonthValue() - връща месеца;
         * Методът .getMonth() - връща месеца;
         * Методът .getDayOfMonth() - връща деня от месеца;
         * Методът .getDayOfYear() - връща номера на деня в годината;
         * Методът .getDayOfWeek() - връща деня от седмицата, като стойност от изброяването на DayOfWeek;
         * Методът public int getHour() - връща час;
         * Методът public int getMinute() - връща минутите;
         * Методът public int getSecond() - връща секундите;
         * Методът public int getNano() - връща наносекундите;
         * Методът .toLocalDate() - връща обект от класа LocalDate;
         * Методът .toLocalTime() - връща обект от класа LocalTime;
         *
         * >>> Прибавяне на стойност към компонентите на LocalDateTime
         * Методът .plusYears() - добавя посочения брой години към датата;
         * Методът .plusMonths() - добавя посочения брой месеци към датата;
         * Методът .plusWeeks() - добавя посочения брой седмици към датата;
         * Методът .plusDays() - добавя посочения брой дни към датата;
         * Методът .plusHours() - добавя посоченият брой часове към времето;
         * Методът .plusMinutes() - добавя посоченият брой минути към времето;
         * Методът .plusSeconds() - добавя посоченият брой секунди към времето;
         * Методът .plusNanos() - добавя посоченият брой наносекунди към времето;
         *
         * >>> Изваждане на стойност от компонентите на LocalDateTime
         * Методът .minusYears() - изважда посочения брой години от датата;
         * Методът .minusMonths() - изважда посочения брой месеци от датата;
         * Методът .minusWeeks() - изважда посочения брой седмици от датата;
         * Методът .minusDays() - изважда посочения брой дни от датата;
         * Методът .minusHours() - изважда посоченият брой часове от времето;
         * Методът .minusMinutes() - изважда посоченият брой минути от времето;
         * Методът .minusSeconds() - изважда посоченият брой секунди от времето;
         * Методът .minusNanos() - изважда посоченият брой наносекунди от времето;
         *
         * >>> Сравняване на два обекта от клас LocalDateTime
         * Методът .equals() - сравнява два LocalDateTime обекта, ако обектите са равни, тогава методът връща true, в противоположният случай връща false;
         * Методът isEqual() - сравнява два LocalDateTime обекта, ако обектите са равни, тогава методът връща true, в противоположният случай връща false;
         * Методът .compareTo() - сравнява два LocalDateTime обекта, връща 0, ако обектите са равни, връща положителна стойност, ако първият обект е по-голям от вторият, връща отрицателна стойност, ако първият обект е по-малък от вторият;
         * Методът .isBefore() - сравнява два LocalDateTime обекта, връща true, ако първият обект е по-малък от вторият и false в противоположният случай;
         * Методът .isAfter() - сравнява два LocalDateTime обекта, връща true, ако първият обект е по-голям от вторият и false в противоположният случай;
         *
         */

        LocalDateTime localDateTime = LocalDateTime.of(2000, 5, 14, 18, 30, 38, 654000000);
        System.out.println(localDateTime);
        printLine();


        System.out.println("Year: " + localDateTime.getYear());
        System.out.println("Month: " + localDateTime.getMonth());
        System.out.println("Month: " + localDateTime.getMonthValue());
        System.out.println("The day of the month: " + localDateTime.getDayOfMonth());
        System.out.println("The day of the year: " + localDateTime.getDayOfYear());
        System.out.println("The day of the week: " + localDateTime.getDayOfWeek());
        System.out.println("Hour: " + localDateTime.getHour());
        System.out.println("Minutes: " + localDateTime.getMinute());
        System.out.println("Seconds: " + localDateTime.getSecond());
        System.out.println("Nanoseconds: " + localDateTime.getNano());
        printLine();


        localDateTime = localDateTime.withYear(2001);
        localDateTime = localDateTime.withMonth(7);
        localDateTime = localDateTime.withDayOfMonth(18);
        localDateTime = localDateTime.withHour(8);
        localDateTime = localDateTime.withMinute(35);
        localDateTime = localDateTime.withSecond(14);
        localDateTime = localDateTime.withNano(196000000);
        System.out.println(localDateTime);
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
