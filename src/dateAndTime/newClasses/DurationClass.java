package dateAndTime.newClasses;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationClass {
    public static void main(String[] args) {
        // Създаване на обект на клас Duration
        Duration duration = Duration.ofDays(19);
        System.out.println("Method .ofDays(): " + duration);

        duration = Duration.ofHours(86);
        System.out.println("Method .ofDays(): " + duration);

        duration = Duration.ofMinutes(45);
        System.out.println("Method .ofMinutes(): " + duration);

        duration = Duration.ofSeconds(120);
        System.out.println("Method .ofSeconds(): " +  duration);

        duration = Duration.ofSeconds(36, 684000000);
        System.out.println("Method .ofSeconds(): " + duration);

        duration = Duration.parse("P19DT6H15M18.684000S");
        System.out.println("Method .parse(): " + duration);

        duration = Duration.between(LocalDateTime.of(2019,1, 1, 0, 0), LocalDateTime.now());
        System.out.println("Method .between(): " + duration);
        printLine();


        // От обект на клас Duration, мога да взема сукунди и наносекунди
        duration = Duration.parse("P19DT6H15M18.684000S");
        System.out.println("Duration: " + duration);
        System.out.println("Seconds: " + duration.getSeconds());
        System.out.println("Nanoseconds: " + duration.getNano());

        System.out.println("Seconds: " + duration.get(ChronoUnit.SECONDS));
        System.out.println("Nanoseconds: " + duration.get(ChronoUnit.NANOS));
        printLine();


        // От обект на клас Duration, мога да получа броя на дните, часовете, минутите и милисекундите
        System.out.println("Days: " + duration.toDays());
        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());
        System.out.println("Milliseconds: " + duration.toMillis());
        System.out.println("Nanoseconds: " + duration.toNanos());
        printLine();


        // Добавяне и изваждане
        System.out.println("Duration: " + duration);

        System.out.println("Minus 10 days: " + duration.minusDays(10));
        System.out.println("Plus 19 days: " + duration.plusDays(19));

        System.out.println("Minus 15 hours: " + duration.minusHours(15));
        System.out.println("Plus 8 hours: " + duration.plusHours(8));

        System.out.println("Minus 45 minutes: " + duration.minusMinutes(45));
        System.out.println("Plus 20 minutes: " + duration.plusMinutes(20));

        System.out.println("Minus 38 seconds: " + duration.minusSeconds(38));
        System.out.println("Plus 200 seconds: " + duration.plusSeconds(200));
        printLine();


        // Алтернативен запис
        System.out.println("10 days before: " + duration.minus(10, ChronoUnit.DAYS));
        System.out.println("15 hours before: " + duration.minus(15, ChronoUnit.HOURS));
        System.out.println("45 minutes before : " + duration.minus(45, ChronoUnit.MINUTES));
        System.out.println("200 seconds later: " + duration.plus(200, ChronoUnit.SECONDS));
        printLine();


        LocalDate theFirstDate = LocalDate.of(2018, 5, 14);
        LocalDate theSecondDate = LocalDate.of(2019, 5, 14);

        System.out.println("Days: " + Duration.between(theFirstDate.atStartOfDay(), theSecondDate.atStartOfDay()).toDays());

        System.out.println("Hours: " + Duration.between(theFirstDate.atStartOfDay(), theSecondDate.atStartOfDay()).toHours());

        duration = Duration.between(theFirstDate.atStartOfDay(), theSecondDate.atStartOfDay());
        System.out.println("Seconds: " + duration.get(ChronoUnit.SECONDS));
        printLine();


        LocalTime start = LocalTime.of(1, 25, 16, 654000000);
        LocalTime end = LocalTime.of(2, 14, 38, 154400000);

        System.out.println("Seconds: " + Duration.between(start, end).getSeconds());
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
