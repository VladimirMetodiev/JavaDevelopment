package dateAndTime.oldClasses;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GregorianCalendarClass {
    public static void main(String[] args) {
        /*
         * Чрез класът GregorianCalendar се реализират както григорианският календар, така и юлианския календар. Този клас позволява
         * да получим достъп до отделните компоненти на датата и часа, както и да извършим различни манипулации с тях.
         *
         * КОНСТРУКТОРИ:
         * GregorianCalendar() - създава обект с текущото време
         * GregorianCalendar(int year, int month, int day)
         * GregorianCalendar(int year, int month, int day, int hour, int minute)
         * GregorianCalendar(int year, int month, int day, int hour, int minute, int second)
         * GregorianCalendar(Locale aLocale)
         * GregorianCalendar(TimeZone zone)
         * GregorianCalendar(TimeZone zone, Locale aLocale)
         *
         * Класът GregorianCalendar наследява клас Calendar, а следователно, наследява и всички негови методи.
         */


        // Създаване на инстанция с текущата дата и време (за компютъра)
        GregorianCalendar grCalendar = new GregorianCalendar();
        System.out.printf("%tc%n", grCalendar);
        printLine();


        // Създаване на инстанция с указване на точно определени дата и време
        GregorianCalendar specificDate = new GregorianCalendar(1999, Calendar.AUGUST, 24);
        System.out.printf("%1$td/%1$tm/%1$tY%n", specificDate);
        printLine();

        //Бележка: месеците могат да се укажат с цифра, номерацията им започва от нула;

        GregorianCalendar specificDateAndTime = new GregorianCalendar(2000, Calendar.JULY, 10, 9, 35);
        System.out.printf("%1$td/%1$tm/%1$tY %1$tR%n", specificDateAndTime);
        printLine();


        // Създаване на инстанция с указване на Locale
        Locale locale_en_GB = new Locale("en", "GB");
        GregorianCalendar specificLocale = new GregorianCalendar(locale_en_GB);
        System.out.printf(locale_en_GB, "%1$tA %1$td %1$tB %1$tY %1$tT %1$Tp%n", specificLocale);
        printLine();


        switch(grCalendar.get(Calendar.MONTH)) {
            case 0: System.out.println("ЯНУАРИ"); break;
            case 1: System.out.println("ФЕВРУАРИ"); break;
            case 2: System.out.println("МАРТ"); break;
            case 3: System.out.println("АПРИЛ"); break;
            case 4: System.out.println("МАЙ"); break;
            case 5: System.out.println("ЮНИ"); break;
            case 6: System.out.println("ЮЛИ"); break;
            case 7: System.out.println("АВГУСТ"); break;
            case 8: System.out.println("СЕПТЕМВРИ"); break;
            case 9: System.out.println("ОКТОМВРИ"); break;
            case 10: System.out.println("НОЕМВРИ"); break;
            case 11: System.out.println("ДЕКЕМВРИ"); break;
            default: break;
        }
        printLine();


        Locale locale_bg_Bg = new Locale("bg", "BG");
        System.out.printf(locale_bg_Bg, "%1$te %1$TB %1$tY %1$TA%n", grCalendar);

        switch(grCalendar.get(Calendar.DAY_OF_WEEK)) {
            case 1: System.out.println("НЕДЕЛЯ"); break;
            case 2: System.out.println("ПОНЕДЕЛНИК"); break;
            case 3: System.out.println("ВТОРНИК"); break;
            case 4: System.out.println("СРЯДА"); break;
            case 5: System.out.println("ЧЕТВЪРТЪК"); break;
            case 6: System.out.println("ПЕТЪК"); break;
            case 7: System.out.println("СЪБОТА"); break;
            default: break;
        }
        printLine();


        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tl:%1$tM %1$tp%n", grCalendar);

        switch(grCalendar.get(Calendar.AM_PM)) {
            case 0: System.out.println("am"); break;
            case 1: System.out.println("pm"); break;
            default: break;
        }
        printLine();


        // Получаване на годината:
        System.out.println("YEAR: " + grCalendar.get(Calendar.YEAR));
        printLine();


        // Получаване на номера на текущата седмица от годината:
        System.out.println("WEEK OF YEAR: " + grCalendar.get(Calendar.WEEK_OF_YEAR));
        printLine();


        // Получаване на номера на текущата седмица от настоящия месец:
        System.out.println("WEEK OF MONTH: " + grCalendar.get(Calendar.WEEK_OF_MONTH));
        printLine();


        // Получаване на датата от настоящия месец:
        System.out.printf(locale_bg_Bg, "%1$te %1$TB %1$tY%n", grCalendar);
        System.out.println("DATE: " + grCalendar.get(Calendar.DATE));
        printLine();


        // Получаване на номера на текущият ден от годината
        System.out.println("DAY OF YEAR: " + grCalendar.get(Calendar.DAY_OF_YEAR));
        printLine();


        // Получаване на деня от седмицата: SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7)
        System.out.println("DAY OF WEEK: " + grCalendar.get(Calendar.DAY_OF_WEEK));
        printLine();


        // Получаване на часът в 12-часов и в 24-часов формат
        System.out.println("HOUR: " + grCalendar.get(Calendar.HOUR));
        System.out.println("HOUR OF DAY: " + grCalendar.get(Calendar.HOUR_OF_DAY));
        printLine();


        // Получаване на минутите
        System.out.println("MINUTE: " + grCalendar.get(Calendar.MINUTE));
        printLine();


        // Получаване на секундите
        System.out.println("SECOND: " + grCalendar.get(Calendar.SECOND));
        printLine();


        // Получаване на милисекундите
        System.out.println("MILLISECOND: " + grCalendar.get(Calendar.MILLISECOND));
        printLine();


        // Получаване на часовата зона и часовото изместване
        System.out.printf("%tZ%n", grCalendar);
        System.out.printf("%tz%n", grCalendar);
        printLine();


        // Получаване на текущите дата и време във вид на милисекунди
        System.out.println(grCalendar.getTimeInMillis());
        printLine();


        // От обект на клас GregorianCalendar можем да създадем нова инстанция на клас Date
        Date date = grCalendar.getTime();
        System.out.println(date.toString());
        printLine();


        // Чрез метода .getDisplayName(), можем да получим символно название, за указаният компонент
        System.out.println(grCalendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, new Locale("fr", "FR")));
        System.out.println(grCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, locale_bg_Bg));
        printLine();


        /*
         * Компонентите на датата и времето могат да се изменят с методите:
         * public void add(int field, int amount)
         * public void roll(int field, int amount)
         * Разликата межде .add() и .roll(), е че .roll() не изменя значението на старшите компоненти, докато .add() ги изменя.
         */


        // Изменение на датата с определен брой дни
        grCalendar.add(Calendar.DAY_OF_MONTH, -18);
        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tl:%1$tM %1$tp%n", grCalendar);
        grCalendar.add(Calendar.DAY_OF_MONTH, 14);
        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tl:%1$tM %1$tp%n", grCalendar);
        printLine();


        // Изменение на месеца с определен брой месеци
        grCalendar.add(Calendar.MONTH, -15);
        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tl:%1$tM %1$tp%n", grCalendar);
        grCalendar.add(Calendar.MONTH, 3);
        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tl:%1$tM %1$tp%n", grCalendar);
        printLine();


        // Изменение на датата с определен брой дни, чрез метода .roll()
        // Например февруари има 28 дни. Ако датата е 12 февруари, намаляваме с -15, 12 - 12, и 28 - 3, новата дата ще бъде 25
        grCalendar.roll(Calendar.DAY_OF_MONTH, -15);
        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tl:%1$tM %1$tp%n", grCalendar);
        grCalendar.roll(Calendar.DAY_OF_MONTH, 25);
        System.out.printf(locale_bg_Bg,"%1$te %1$TB %1$tY %1$tl:%1$tM %1$tp%n", grCalendar);
        printLine();


        // Указване на точно определена от мен дата и време
        GregorianCalendar otherCalendar = new GregorianCalendar();
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


        // Изчистване на информацията за датата и времето
        otherCalendar.clear(Calendar.YEAR);
        System.out.printf("%tY%n", otherCalendar);

        otherCalendar.clear();
        System.out.printf("%1$te %1$TB %1$tY %1$tH:%1$tM:%1$tS%n", otherCalendar);
        printLine();


        // Сравняване на дати
        grCalendar.setTimeInMillis(672536784956L);
        otherCalendar.setTimeInMillis(672536795878L);

        System.out.printf("%1$te %1$TB %1$tY %1$tH:%1$tM:%1$tS%n", grCalendar);
        System.out.printf("%1$te %1$TB %1$tY %1$tH:%1$tM:%1$tS%n", otherCalendar);
        System.out.println("Method .equals(): " + grCalendar.equals(otherCalendar));
        System.out.println("Method .compareTo(): " + grCalendar.compareTo(otherCalendar));
        System.out.println("Method .after(): " + grCalendar.after(otherCalendar));
        System.out.println("Method .before(): " + grCalendar.before(otherCalendar));
        printLine();


        // Проверка дали указаната година е високосна
        GregorianCalendar anotherCalendar = new GregorianCalendar();
        System.out.println("Is it a leap year: " + anotherCalendar.isLeapYear(2011));
        System.out.println("Is it a leap year: " + anotherCalendar.isLeapYear(2012));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
