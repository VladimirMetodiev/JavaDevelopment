package dateAndTime.oldClasses;

import java.util.Date;
import java.util.Locale;

public class DateAndTimeFormatting {
    public static void main(String[] args) {
        /*
         * ФЛАГОВЕ ЗА ФОРМАТИРАНЕ НА ДАТИ:
         *
         * %tY година в 4-цифрен формат, от 0000 до 9999
         * %ty година в 2-цифрен формат, от 00 до 99
         *
         * %tB пълното име на месеца, например, януари, февруари и т.н.
         * %tb съкратено име на месеца, например, Jan, Feb и т.н.
         * %tm месец, форматиран с водеща нула, например, 01 до 12
         *
         * %tA пълно име на деня от седмицата, например, неделя, понеделник
         * %ta съкратено име на деня от седмицата, например, нд, пн и т.н.
         *
         * %tc дата и час във формат %ta %tb %td %tT %tZ %tY, например, Mon Feb 17 03:56:12 PST 2020
         * %tF дата във формат %ty/%tm/%td
         * %tD дата във формат %tm/%td/%ty
         *
         * %tj ден от годината, например от 001 до 366
         * %td ден от месеца в двуцифрен формат, например от 01 до 31
         * %te ден от месеца във формат без водеща 0, например от 1 до 31
         *
         * %tT време в 24-часов формат, например, %tH:%tM:%tS
         * %tH час от деня в 24-часов формат, от 00 до 23
         * %tR време в 24-часов формат без секунди, например, %tH:%tM
         * %tk час от деня в 24-часов формат, без водеща нула, от 0 до 23
         * %tI час от деня за 12-часов формат, например, 01 до 12
         * %tl час от деня за 12-часов формат, без водеща нула, 1 до 12
         * %tM минутите в часа форматирани с нула в началото, например от 00 до 59
         * %tS секундите в минутата, състоящи се от две цифри, например от 00 до 59
         * %tp (или %Tp - в горен регистър) например, am, pm, AM, PM
         *
         * %tZ съкращение на часовата зона, например, PST, UTC и др.
         * %tz изместване на часовата зона например, +0300
         */

        Date date = new Date();

        // Параметри на Date форматът:
        // %[<Индекс>][<Флаг>][<Ширина>]t<Тип преобразуване на датата>

        System.out.printf("%1$td.%1$tm.%1$tY%n", date);
        printLine();


        // Вместо да указваме индекса и знака $, можем да използваме символа <, което означава "същия индекс като предходния".
        System.out.printf("%1$td.%<tm.%<tY%n", date);
        printLine();


        // Указване на ШИРИНА (след $ и пред t) - за датата 2, за месеца 3, за годината 5
        System.out.printf("%1$2td%<3tm%<5tY%n", date);
        printLine();


        // При указването на ШИРИНА, пред нея мога да поставя "-", което означава подравняване по левият край
        System.out.printf("%1$-3td%<-3tm%<4tY%n", date);
        printLine();


        // При форматирането на дата и време мога да укажа Locale

        // c означава текущо избраният за компютъра Locale
        System.out.printf("%tc%n", date);
        printLine();


        // Понякога е нужно да се укаже точно какъв Locale да бъде използван. В скобите на конструктора на Locale, първо се указва езика, а след него страната
        Locale locale_bg_BG = new Locale("bg", "BG");
        System.out.printf(locale_bg_BG, "%1$td %<tB %<tA %<tY %<tT%n", date);

        Locale locale_en_EN = new Locale("en", "GB");
        System.out.printf(locale_en_EN, "%1$td %<tB %<tA %<tY %<tT %<Tp%n", date);

        Locale locale_de_DE = new Locale("de", "DE");
        System.out.printf(locale_de_DE, "%1$td %<tB %<tA %<tY %<tT%n", date);
        printLine();


        System.out.printf(locale_bg_BG,"%1$td/%<tm/%1$tY [%1$tj day] %1$tR %1$tp%n", date);
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}