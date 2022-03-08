package string.formatterClass;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class FormatterClass {
    public static void main(String[] args) {
        /*
         * Клас Formatter се използва за форматиране на изхода. Той осигурява поддръжка, за преобразуване на форматът на
         * различни типове данни: числа, низове, време, дати и т.н. Също така поддържа специфичен Locale изход.
         *
         * КОНСТРУКТОРИ:
         * Formatter()
         * Formatter(Appendable a)
         * Formatter(Appendable a, Locale l)
         * Formatter(File file)
         * Formatter(File file, String csn)
         * Formatter(File file, String csn, Locale l)
         * Formatter(Locale l)
         * Formatter(OutputStream os)
         * Formatter(OutputStream os, String csn)
         * Formatter(OutputStream os, String csn, Locale l)
         * Formatter(PrintStream ps)
         * Formatter(String fileName)
         * Formatter(String fileName, String csn)
         * Formatter(String fileName, String csn, Locale l)
         *
         * МЕТОДИ:
         * [void] close()
         * [void] flush()
         * [Formatter] format(Locale l, String format, Object... args)
         * [Formatter] format(String format, Object... args)
         * [IOException] ioException()
         * [Locale] locale()
         * [Appendable] out()
         * [String] toString()
         */

        String str1 = "How was your day?";
        Formatter toConsole = new Formatter();
        System.out.println(toConsole.format("Hi, %S %s", "Anna.", str1));


        StringBuilder sb = new StringBuilder();
        String str2 = "Hi, love. It was terribly busy. And you?";
        for(int a = 0; a < str2.length(); a++) sb.append(str2.charAt(a));
        toConsole = new Formatter(sb, Locale.ENGLISH);
        System.out.println(toConsole);


        toConsole = new Formatter();
        double someRealNumber = 0.1415926535897932;
        toConsole.format("%f = %e", someRealNumber, someRealNumber);
        System.out.println(toConsole);


        toConsole = new Formatter();
        toConsole.format("hexadecimal number %X = octal number %o", 196, 196);
        System.out.println(toConsole);


        toConsole = new Formatter();
        toConsole.format("ROI = %d%%", 40);
        System.out.println(toConsole);


        toConsole = new Formatter();
        Calendar calendar = Calendar.getInstance();
        toConsole.format("%tr", calendar);
        System.out.println(toConsole);


        toConsole = new Formatter();
        toConsole.format("%tc", calendar);
        System.out.println(toConsole);


        toConsole = new Formatter();
        toConsole.format("%tl:%tM", calendar, calendar);
        System.out.println(toConsole);


        toConsole = new Formatter();
        toConsole.format("%tB %tb %tm", calendar, calendar, calendar);
        System.out.println(toConsole);


        toConsole = new Formatter();
        toConsole.format("|%f|%n|%12f|%n|%012f|%n|%-12f|", 3.141592, 3.141592, 3.141592, 3.141592);
        System.out.println(toConsole);


        toConsole = new Formatter();
        int x = 10, y = 2;
        toConsole.format("%B", x > y);
        System.out.println(toConsole);

        // $ указва индекса на аргумента
        toConsole = new Formatter();
        toConsole.format("%5$d %2$d %4$d %1$d %3$d %1$d", 10, 20, 30, 40, 50);
        System.out.println(toConsole);


        // Обектът от тип Formatter трябва да се затвори, когато приключи работата с него.
        toConsole.close();
    }
}
