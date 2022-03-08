package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class MyCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = Integer.parseInt(input.nextLine());

        LocalDate someDate = LocalDate.of(year, 1, 1);
        printCalendarOnMonth(someDate.getYear(), someDate.getMonthValue());

        for (int a = 0; a < 11; a++) {
            someDate = someDate.plusMonths(1);
            printCalendarOnMonth(someDate.getYear(), someDate.getMonthValue());
        }
    }

    private static String[] getNameMonths() {
        return new String[]{"Януари", "Февруари", "Март", "Април", "Май", "Юни", "Юли", "Август", "Септември", "Октомври", "Ноември", "Декември"};
    }

    private static String[] getNameWeeks() {
        return new String[]{"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Нд"};
    }

    private static String onCenter(String str, int length) {
        if (str == null) return "";

        int strLength = str.length();
        if (length <= 0 || strLength == 0) return "";

        if (strLength == length) return str;

        if (strLength > length) return str.substring(0, length);

        int start = (length - strLength) / 2;
        int end = length - start - strLength;
        char[] arrStart = new char[start];
        char[] arrEnd = new char[end];
        Arrays.fill(arrStart, ' ');
        Arrays.fill(arrEnd, ' ');
        return String.valueOf(arrStart) + str + String.valueOf(arrEnd);
    }

    private static void printCalendarOnMonth(int year, int month) {
        if (month < 1 || month > 12) return;

        LocalDate currentDate = LocalDate.of(year, month, 1);

        // Въвеждам името на месеца (и годината)
        String[] nameMonths = getNameMonths();
        System.out.println(onCenter(nameMonths[currentDate.getMonthValue() - 1] + " " + year, 28));

        // Въвеждам имената на дните от седмицата
        String[] nameWeek = getNameWeeks();
        for (int a = 0; a < nameWeek.length; a++) {
            System.out.print(onCenter(nameWeek[a], 4));
        }

        // Формирам отстъп за първият ред, защото месечните датите не винаги започват от първият ден на седмицата - понеделник
        int indent = 0;
        DayOfWeek firstDayOfWeek = DayOfWeek.MONDAY;
        LocalDate date = currentDate.withDayOfMonth(1);
        DayOfWeek currentDayOfWeek = date.getDayOfWeek();

        while (firstDayOfWeek != currentDayOfWeek) {
            indent++;
            date = date.minusDays(1);
            currentDayOfWeek = date.getDayOfWeek();
        }

        if (indent != 0) System.out.println();

        for (int b = 0; b < indent; b++) {
            System.out.print("    "); // поставям 4 интервала (за всяка дата)
        }

        // Принтирам числата на месечните дати
        for (int e = 1, j = currentDate.lengthOfMonth() + 1; e < j; e++) {
            if (currentDate.withDayOfMonth(e).getDayOfWeek() == firstDayOfWeek) System.out.println();
            System.out.printf("%3d ", e);
        }

        System.out.println("\n");
    }
}
