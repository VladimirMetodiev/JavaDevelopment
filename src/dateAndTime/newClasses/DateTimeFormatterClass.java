package dateAndTime.newClasses;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterClass {
    public static void main(String[] args) {
        /*
         * Класът DateTimeFormatter се използва за форматиране на извежданите дата и час и за определяне на формата
         * при преобразуване на низ в обекти на класовете LocalDate, LocalTime, LocalDateTime и Instant.
         *
         * МЕТОДИ:
         *
         * >>> Създаване на обект на класа DateTimeFormatter
         * Методът .ofLocalizedDate() - създава обект с формат, съответстващ на представянето на датата в компютъра;
         * Методът .ofLocalizedTime() - създава обект с формат, съответстващ на представянето на времето в компютъра;
         * Методът .ofLocalizedDateTime() - създава обект с формат, съответстващ на представянето на датата и времето в компютъра;
         * Методът .ofPattern() - създава обект с формат, който съответства на шаблона и на настоящия или указан Locale;
         *
         * >>> Специални символи
         * G - ера (например, сл. Хр.) - буквата може да се повтаря до пет пъти и на английските Locale могат да получат означенията: AD, Anno Domini или A;
         * y или yyyy - годината изписана с 4 цифри (например 2019 г.);
         * yy са последните две цифри на годината в ерата (от 00 до 99);
         * u или uuuu - четирицифрена година (например 2019 г.);
         * uu - последните две цифри на годината (от 00 до 99);
         * M или L - номер на месеца без водеща нула (от 1 до 12);
         * MM или LL - номер на месеца с водеща нула (от 01 до 12);
         * MMM - съкращение на месеца в зависимост от настройките на Locale (например Sep);
         * MMMM - име на месеца в зависимост от настройките на Locale (например September);
         * LLL - съкращение за месеца в зависимост от настройките на Locale (например Sep) [на английски език се показва номерът на месеца];
         * LLLL - името на месеца в зависимост от настройките на Locale (например September) [на английски език се показва номерът на месеца];
         * dd - числото на деня в месеца с водеща нула (от 01 до 31);
         * d - числото на деня в месеца без водеща нула (от 1 до 31);
         * w - седмица от годината без водеща нула;
         * ww - седмица от годината с водеща нула;
         * W - седмица от месеца без водеща нула;
         * D - номера на денят от началото на годината без водеща нула (от 1 до 366);
         * DDD - номера на денят от началото на годината с водеща нула (от 001 до 366);
         * F - денят от седмицата в месеца без водеща нула;
         * E - съкращение за деня от седмицата, в зависимост от настройките на Locale (например Чет);
         * EEEE - името на деня от седмицата в зависимост от настройките на Locale (например четвъртък);
         * H - час в 24-часов формат без водеща нула (от 0 до 23);
         * HH - час в 24-часов формат с водеща нула (от 00 до 23);
         * h - час в 12-часов формат без водеща нула (от 1 до 12);
         * hh - час в 12-часов формат с водеща нула (от 01 до 12);
         * k - час в 24-часов формат без водеща нула (от 1 до 24);
         * kk - час в 24-часов формат с водеща нула (от 01 до 24);
         * K - час в 12-часов формат без водеща нула (от 0 до 11);
         * KK - час в 12-часов формат с водеща нула (от 00 до 11);
         * m — минути без водеща нула (от 0 до 59);
         * mm — минути с водеща нула (от 00 до 59);
         * s — секунди без водеща нула (от 0 до 59);
         * ss - секунди с водеща нула (от 00 до 59);
         * a - AM или PM с главни букви (например AM);
         * S е милисекунди - буквата може да се повтори до 9 пъти - броят на буквите зависи от броя на цифрите - например SSS съответства на три цифри: 123;
         * n - наносекунди (например 646000000);
         * Z е изместването на часовата зона (например +0200);
         * ZZZZ - изместване на часовата зона (например GMT+02:00);
         * ZZZZZ - изместване на часовата зона (например +02:00);
         * O - изместване на часовата зона (например GMT+3);
         * X е изместването на часовата зона (например +03);
         * XX - изместване на часовата зона (например +0300);
         * XXX - изместване на часовата зона (например +03:00);
         * z е името на часовата зона (например EEST);
         * zzzz е името на часовата зона (Eastern European Summer Time);
         * VV е името на часовата зона (например Europe/Helsinki);
         *
         * >>> Методи, които се използват за преобразуване на обект от класа LocalDateTime в обект от някой от класовете ZonedDateTime или OffsetDateTime
         * Методът .atZone() - връща обект от класа ZonedDateTime;
         * Методът .atOffset() - връща обект на класа OffsetDateTime, като параметър методът приема обект на класа ZoneOffset;
         *
         */

        LocalDateTime dateAndTime = LocalDateTime.of(2011, 5, 1, 10, 45, 58, 296000000);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateAndTime.format(formatter));
        printLine();

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(dateAndTime.format(formatter));
        printLine();

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(dateAndTime.format(formatter));
        printLine();

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateAndTime.format(formatter));
        printLine();


        // С .ofLocalizedTime() мога да укажа само FormatStyle.MEDIUM и FormatStyle.SHORT
        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(dateAndTime.format(formatter));
        printLine();

        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(dateAndTime.format(formatter));
        printLine();


        // С public static DateTimeFormatter ofLocalizedDateTime(FormatStyle dateTimeStyle) мога да укажа само FormatStyle.MEDIUM и FormatStyle.SHORT
        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(dateAndTime.format(formatter));
        printLine();

        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dateAndTime.format(formatter));
        printLine();

        // public static DateTimeFormatter ofLocalizedDateTime(FormatStyle dateStyle, FormatStyle timeStyle)
        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT);
        System.out.println(dateAndTime.format(formatter));
        printLine();

        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
        System.out.println(dateAndTime.format(formatter));
        printLine();


        // public static DateTimeFormatter ofPattern(String pattern)
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dateAndTime.format(formatter));
        printLine();

        formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy - EEEE", new Locale("de", "DE"));
        System.out.println(dateAndTime.format(formatter));
        printLine();


        ZonedDateTime zdt = dateAndTime.atZone(ZoneId.systemDefault());
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("ZZZZ z");
        System.out.println(zdt.format(dtFormatter));
        printLine();

        ZoneId zoneId = ZoneId.of("Europe/Helsinki");
        zdt = dateAndTime.atZone(zoneId);
        dtFormatter = DateTimeFormatter.ofPattern("Z zzzz");
        System.out.println(zdt.format(dtFormatter));
        printLine();


        ZoneOffset z1 = ZoneOffset.ofHours(+5);
        ZoneOffset z2 = ZoneOffset.of("+7");
        System.out.println(z1.toString());
        System.out.println(z2.toString());

        OffsetDateTime odt = dateAndTime.atOffset(ZoneOffset.ofHours(3));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("O");
        System.out.println(odt);
        System.out.println(odt.format(dtf));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
