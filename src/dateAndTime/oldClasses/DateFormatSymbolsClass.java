package dateAndTime.oldClasses;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class DateFormatSymbolsClass {
    public static void main(String[] args) {
        /*
         * Класът DateFormatSymbols позволява да получим (или зададем) имената на компонентите на датата на езикът,
         * съответстващ на указания Locale.
         *
         * КОНСТРУКТОРИ:
         * DateFormatSymbols() - този конструктор създава обект с местоположението, указано в настройките на компютъра
         * DateFormatSymbols(Locale locale)
         *
         * МЕТОДИ:
         * Методът .getInstance() - създава обект от тип DateFormatSymbols;
         * Методът .getShortWeekdays() - връща масив със съкратените имена на дните от седмицата;
         * Методът .getWeekdays() - връща масив с пълните имена на дните от седмицата;
         * Методът .getShortMonths() - връща масив със съкратени имена на месеците;
         * Методът .getMonths() - връща масив с пълните имена на месеците;
         * Методът .getEras() - връща масив с имената на ерите;
         * Методът .getAmPmStrings() - връща масив със съкращенията за времето преди и след обяд;
         * Методът .setShortWeekdays() - задава нов масив със съкратените имена на дните от седмицата;
         * Методът .setWeekdays() - задава нов масив с пълните имена на дните от седмицата;
         * Методът .setShortMonths() - задава нов масив със съкратени имена на месеците;
         * Методът .setMonths() - задава нов масив с пълните имена на месеците;
         * Методът .setEras() - задава нов масив с имената на ерите
         * Методът .setAmPmStrings() - задава нов масив със съкращенията за времето преди и след обяд;
         */

        DateFormatSymbols dFormat1 = DateFormatSymbols.getInstance();
        DateFormatSymbols dFormat2 = DateFormatSymbols.getInstance(new Locale("de", "DE"));

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy EEEE hh:mm a z Z", dFormat1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy EEEE hh:mm a z Z", dFormat2);

        System.out.println(sdf1.format(new Date(561513797684L)));
        System.out.println(sdf2.format(new Date(561513797684L)));
        printLine();


        System.out.println(Arrays.toString(dFormat1.getShortWeekdays()));
        printLine();


        System.out.println(Arrays.toString(dFormat1.getWeekdays()));
        printLine();


        System.out.println(Arrays.toString(dFormat1.getShortMonths()));
        printLine();


        System.out.println(Arrays.toString(dFormat1.getMonths()));
        printLine();


        System.out.println(Arrays.toString(dFormat1.getEras()));
        printLine();


        System.out.println(Arrays.toString(dFormat1.getAmPmStrings()));
        printLine();


        dFormat1.setShortWeekdays(new String[]{"", "НД", "ПН", "ВТ", "СР", "ЧТ", "ПТ", "СБ"});
        sdf1 = new SimpleDateFormat("dd/MM/yyyy E hh:mm a z Z", dFormat1);
        System.out.println(sdf1.format(new Date(561513797684L)));
        printLine();


        dFormat1.setAmPmStrings(new String[]{"преди обед", "следобед"});
        sdf1 = new SimpleDateFormat("dd/MM/yyyy E hh:mm a z Z", dFormat1);
        System.out.println(sdf1.format(new Date(561513797684L)));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
