package dateAndTime.newClasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeClass {
    public static void main(String[] args) {
        /*
         * Класът LocalTime ни позволява да извършваме разнообразни действия с времето.
         *
         * МЕТОДИ:
         *
         * >>> Създаване на обект
         * Методът .now() - създава обект с текущото системно време;
         * Методът .of() - създава обект, като посочим конкретен час, минути, секунди, наносекунди;
         * Методът .ofSecondOfDay() - създава обект въз основа на броя на секундите;
         * Методът .ofNanoOfDay() - създава обект въз основа на броя наносекунди;
         * Методът .parse() - създава обект от символен низ със специален форматен;
         *
         * >>> Задаване на компонентите на времето
         * Методът public LocalTime withHour(int hour) - задава нова стойност за часа;
         * Методът public LocalTime withMinute(int minute) - задава нова стойност за минутите;
         * Методът public LocalTime withSecond(int second) - задава нова стойност за секундите;
         * Методът public LocalTime withNano(int nanoOfSecond) - задава нова стойност на наносекундите;
         *
         * >>> Получаване на компонентите на времето
         * Методът public int getHour() - връща час;
         * Методът public int getMinute() - връща минутите;
         * Методът public int getSecond() - връща секундите;
         * Методът public int getNano() - връща наносекундите;
         *
         * >>> Прибавяне на стойност към компонентите на времето
         * Методът .plusHours() - добавя посоченият брой часове към времето;
         * Методът .plusMinutes() - добавя посоченият брой минути към времето;
         * Методът .plusSeconds() - добавя посоченият брой секунди към времето;
         * Методът .plusNanos() - добавя посоченият брой наносекунди към времето;
         *
         * >>> Изваждане на стойност от компонентите на времето
         * Методът .minusHours() - изважда посоченият брой часове от времето;
         * Методът .minusMinutes() - изважда посоченият брой минути от времето;
         * Методът .minusSeconds() - изважда посоченият брой секунди от времето;
         * Методът .minusNanos() - изважда посоченият брой наносекунди от времето;
         *
         * >>> Преобразуване на обект от клас LocalTime в обект от клас LocalDateTime
         * Извършва се чрез метода .atDate()
         *
         * >>> Сравняване на два обекта от клас LocalTime
         * Методът .equals() - сравнява два LocalTime обекта, ако обектите са равни, тогава методът връща true, в противоположният случай връща false;
         * Методът .compareTo() - сравнява два LocalTime обекта, връща 0, ако обектите са равни, връща положителна стойност, ако първият обект е по-голям от вторият, връща отрицателна стойност, ако първият обект е по-малък от вторият;
         * Методът .isBefore() - сравнява два LocalTime обекта, връща true, ако първият обект е по-малък от вторият и false в противоположният случай;
         * Методът .isAfter() - сравнява два LocalTime обекта, връща true, ако първият обект е по-голям от вторият и false в противоположният случай;
         */

        System.out.println(LocalTime.MAX); // Максималното значение, което приема класът LocalTime е 23:59:59.999999999
        System.out.println(LocalTime.MIN); // Минималното значение, което приема класът LocalTime е 00:00
        printLine();


        LocalTime localTime = LocalTime.now();
        System.out.println("Method .now(): " + localTime);
        printLine();


        LocalTime time = LocalTime.of(19, 15, 24);
        System.out.println("Method .of(): " + time);
        printLine();


        time = LocalTime.ofSecondOfDay(58576);
        System.out.println("Method .ofSecondOfDay(): " + time);
        printLine();


        time = LocalTime.ofNanoOfDay(65880000000000L);
        System.out.println("Method .ofNanoOfDay(): " + time);
        printLine();


        time = LocalTime.parse("19:02:53");
        System.out.println("Method .parse(): " + time);

        time = LocalTime.parse("19.03", DateTimeFormatter.ofPattern("HH.mm"));
        System.out.println("Method .parse(): " + time);
        printLine();


        time = LocalTime.of(6, 15, 8);
        time = time.withHour(8);
        time = time.withMinute(22);
        time = time.withSecond(35);
        time = time.withNano(622000000);
        System.out.println(time.toString());
        printLine();


        System.out.println("Hour: " + time.getHour());
        System.out.println("Minutes: " + time.getMinute());
        System.out.println("Seconds: " + time.getSecond());
        System.out.println("Nanoseconds: " + time.getNano());
        printLine();


        time = LocalTime.of(15, 46, 18);
        LocalDate date = LocalDate.of(2005, 6, 9);
        System.out.println(time.atDate(date));
        printLine();


        LocalTime morning = LocalTime.of(6, 15, 37);
        LocalTime evening = LocalTime.of(21, 54, 20);

        System.out.println("Method .equals(): " + morning.equals(evening));
        System.out.println("Method .compareTo(): " + morning.compareTo(evening));
        System.out.println("Method .isBefore(): " + morning.isBefore(evening));
        System.out.println("Method .isAfter(): " + morning.isAfter(evening));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
