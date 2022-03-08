package dateAndTime.oldClasses;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarClass {
    public static void main(String[] args) {
        /*
         * Клас Calendar
         *
         * СЪЗДАВАНЕ:
         * public static Calendar getInstance() - с настройки по подразбиране
         * public static Calendar getInstance(Locale aLocale) - с изрично указване на Locale
         * public static Calendar getInstance(TimeZone zone) - с изрично указване на часова зона
         * public static Calendar getInstance(TimeZone zone, Locale aLocale)
         *
         * МЕТОДИ:
         * .getInstance() - създава обект от тип Calendar;
         * .get(int field) - връща отделни компоненти на датата и времето;
         * .getTimeInMillis() - връща количеството на милисекундите от 1 януари 1970 г.;
         * .set() - задава стойност за всички, или само за определени компоненти на датата и времето;
         * .setTimeInMillis(long field) - задава времето във вид на милисекунди;
         * .clear() - изчиства стойностите на всички компоненти на датата и времето, или само значението, на указания компонент;
         * .equals() - сравнява две дати, ако датите са равни, тогава методът връща true, в противоположният случай връща false;
         * .compareTo() - сравнява две дати, връща 0, ако датите са равни, положителна стойност, ако първата дата е по-голяма от втората
         *  и отрицателна стойност, ако първата дата е по-малка от втората;
         *  .before() - връща true, ако първата дата е по-малка от втората и false в противоположният случай;
         *  .after() - връща true, ако първата дата е по-голяма от втората и false в противоположният случай;
         */

        // Създаването на обект от тип Calendar, се извършва чрез метода .getInstance()
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.toString());
        printLine();


        /*
         * Чрез метода .get() се получават отделните компоненти на датата и времето, на обект от клас Calendar.
         * public int get(int field)
         *
         * В параметъра field се използват следните константи:
         * ERA(0)
         * YEAR(1)
         * MONTH(2)
         * WEEK_OF_YEAR(3)
         * WEEK_OF_MONTH(4)
         * DATE(5)
         * DAY_OF_MONTH(5)
         * DAY_OF_YEAR(6)
         * DAY_OF_WEEK(7)
         * DAY_OF_WEEK_IN_MONTH(8)
         * AM_PM(9)
         * HOUR(10)
         * HOUR_OF_DAY(11)
         * MINUTE(12)
         * SECOND(13)
         * MILLISECOND(14)
         * ZONE_OFFSET(15)
         * DST_OFFSET (16)
         *
         * Всяка от тези константи, може да се използва в метода .set()
         */

        /*
         * При указване на константата MONTH, се връща значение, съответстващо на една от следните константи:
         * JANUARY(0)
         * FEBRUARY(1)
         * MARCH(2)
         * APRIL(3)
         * MAY(4)
         * JUNE(5)
         * JULY(6)
         * AUGUST(7)
         * SEPTEMBER(8)
         * OCTOBER(9)
         * NOVEMBER(10)
         * DECEMBER(11)
         * UNDECIMBER(12)
         */

        Locale locale_bg_Bg = new Locale("bg", "BG");
        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tT%n", calendar);

        switch(calendar.get(Calendar.MONTH)) {
            case 0: System.out.println("JANUARY"); break;
            case 1: System.out.println("FEBRUARY"); break;
            case 2: System.out.println("MARCH"); break;
            case 3: System.out.println("APRIL"); break;
            case 4: System.out.println("MAY"); break;
            case 5: System.out.println("JUNE"); break;
            case 6: System.out.println("JULY"); break;
            case 7: System.out.println("AUGUST"); break;
            case 8: System.out.println("SEPTEMBER"); break;
            case 9: System.out.println("OCTOBER"); break;
            case 10: System.out.println("NOVEMBER"); break;
            case 11: System.out.println("DECEMBER"); break;
            default: break;
        }
        printLine();


        /*
         * При указване на константата DAY_OF_WEEK, се връща значение, съответстващо на една от следните константи:
         * SUNDAY(1)
         * MONDAY(2)
         * TUESDAY(3)
         * WEDNESDAY(4)
         * THURSDAY(5)
         * FRIDAY(6)
         * SATURDAY(7)
         */

        System.out.printf(locale_bg_Bg, "%1$te %1$TB %1$tY %1$TA%n", calendar);

        switch(calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1: System.out.println("SUNDAY"); break;
            case 2: System.out.println("MONDAY"); break;
            case 3: System.out.println("TUESDAY"); break;
            case 4: System.out.println("WEDNESDAY"); break;
            case 5: System.out.println("THURSDAY"); break;
            case 6: System.out.println("FRIDAY"); break;
            case 7: System.out.println("SATURDAY"); break;
            default: break;
        }
        printLine();


        /*
         * При указване на константата AM_PM, се връща значение, съответстващо на една от следните стойности:
         * AM(0)
         * PM(1)
         */

        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tl:%1$tM %1$tp%n", calendar);

        switch(calendar.get(Calendar.AM_PM)) {
            case 0: System.out.println("AM"); break;
            case 1: System.out.println("PM"); break;
            default: break;
        }
        printLine();


        // Получаване на годината:
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        printLine();


        // Получаване на номера на текущата седмица от годината:
        System.out.println("WEEK OF YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        printLine();


        // Получаване на номера на текущата седмица от настоящия месец:
        System.out.println("WEEK OF MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        printLine();


        // Получаване на датата от настоящия месец:
        System.out.printf(locale_bg_Bg, "%1$te %1$TB %1$tY%n", calendar);
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        printLine();


        // Получаване на номера на текущият ден от годината
        System.out.println("DAY OF YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        printLine();


        // Получаване на деня от седмицата: SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7)
        System.out.println("DAY OF WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        printLine();


        // Получаване на часът в 12-часов и в 24-часов формат
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR OF DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        printLine();


        // Получаване на минутите
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        printLine();


        // Получаване на секундите
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        printLine();


        // Получаване на милисекундите
        System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
        printLine();


        // Получаване на часовата зона и часовото изместване
        System.out.printf("%tZ%n", calendar);
        System.out.printf("%tz%n", calendar);
        printLine();


        // Получаване на текущите дата и време във вид на милисекунди
        System.out.println(calendar.getTimeInMillis());
        printLine();


        // От обект на клас Calendar можем да създадем нова инстанция на клас Date
        Date date = calendar.getTime();
        System.out.println(date.toString());
        printLine();


        /*
         * Чрез метода .getDisplayName(), на класът Calendar, можем да получим символно название, за указаният компонент.
         * public String getDisplayName(int field, int style, Locale locale)
         */

        System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, new Locale("fr", "FR")));
        System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, locale_bg_Bg));
        printLine();


        /*
         * За да укажа точно определена от мен дата и време, мога да използвам един от следните методи:
         * public final void set(int year, int month, int date)
         * public final void set(int year, int month, int date, int hour, int minute)
         * public final void set(int year, int month, int date, int hour, int minute, int second)
         * public void set(int field, int value)
         * public void setTimeInMillis(long millis) - задавам дата и време във вид на милисекунди
         * public final void setTime(Date date) - задавам датата и времето, чрез обект на клас Date
         */


        Calendar otherCalendar = Calendar.getInstance();
        Date otherDate = new Date(561513797684L);


        otherCalendar.setTime(otherDate);
        System.out.printf(new Locale("de", "DE"), "%tc%n", otherCalendar);
        printLine();


        otherCalendar.setTimeInMillis(842536784956L);
        System.out.printf(new Locale("en", "GB"), "%tc%n", otherCalendar);
        printLine();


        otherCalendar.set(Calendar.DAY_OF_MONTH, 10);
        System.out.printf("%te%n", otherCalendar);

        otherCalendar.set(Calendar.MONTH, Calendar.JANUARY);
        System.out.printf("%TB%n", otherCalendar);

        otherCalendar.set(Calendar.YEAR, 1997);
        System.out.printf("%tY%n", otherCalendar);

        otherCalendar.set(1998, Calendar.MAY, 14);
        System.out.printf("%1$te %1$TB %1$tY%n", otherCalendar);

        otherCalendar.set(1999, Calendar.JULY, 12, 9, 35);
        System.out.printf("%1$te %1$TB %1$tY %1$tH:%1$tM%n", otherCalendar);

        otherCalendar.set(2000, Calendar.OCTOBER, 1, 8, 15, 30);
        System.out.printf("%1$te %1$TB %1$tY %1$tH:%1$tM:%1$tS%n", otherCalendar);
        printLine();


        // Изчистването на информацията, от инстанция на клас Calendar, става чрез метода .clear()
        otherCalendar.clear(Calendar.YEAR);
        System.out.printf("%tY%n", otherCalendar);

        otherCalendar.clear();
        System.out.printf("%1$te %1$TB %1$tY %1$tH:%1$tM:%1$tS%n", otherCalendar);
        printLine();


        // Сравняване на дати
        calendar.setTimeInMillis(672536784956L);
        otherCalendar.setTimeInMillis(672536795878L);

        System.out.printf("%1$te %1$TB %1$tY %1$tH:%1$tM:%1$tS%n", calendar);
        System.out.printf("%1$te %1$TB %1$tY %1$tH:%1$tM:%1$tS%n", otherCalendar);
        System.out.println("Method .equals(): " + calendar.equals(otherCalendar));
        System.out.println("Method .compareTo(): " + calendar.compareTo(otherCalendar));
        System.out.println("Method .after(): " + calendar.after(otherCalendar));
        System.out.println("Method .before(): " + calendar.before(otherCalendar));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
