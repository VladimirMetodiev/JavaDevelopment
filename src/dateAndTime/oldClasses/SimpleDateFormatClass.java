package dateAndTime.oldClasses;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatClass {
    public static void main(String[] args) {
        /*
         * За форматиране на датата и времето, може да бъде използван клас SimpleDateFormat.
         *
         * КОНСТРУКТОРИ:
         * SimpleDateFormat() - създаденият с този конструктор обект има формат: "dd.MM.yy H:mm"
         * SimpleDateFormat(String pattern)
         * SimpleDateFormat(String pattern, Locale locale)
         * SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols)
         *
         * Значения, които мога да използвам при конструирането на шаблон:
         * G - епоха (например AD);
         * y или yyyy е четирицифрена година (например 2005 г.);
         * yy са последните две цифри на годината (от 00 до 99);
         * M — номер на месеца без водеща нула (от 1 до 12);
         * MM — номер на месеца с водеща нула (от 01 до 12);
         * MMM - абревиатура на месеца в зависимост от настройките на Locale (например October);
         * MMMM - име на месеца в зависимост от настройките на Locale (например Oct);
         * dd - номера на деня в месеца с водеща нула (от 01 до 31);
         * d - номера на деня в месеца без водеща нула (от 1 до 31);
         * w - седмица в година без водеща нула;
         * ww - седмица в годината с водеща нула;
         * W - седмица в месец без водеща нула;
         * WW - седмица в месец с водеща нула;
         * D - ден от началото на годината (от 001 до 366);
         * F - денят от седмицата в месеца без водеща нула;
         * FF - денят от седмицата в месеца с водеща нула;
         * E - съкращение на деня от седмицата в зависимост от настройките на Locale (например ПТ);
         * EEEE - името на деня от седмицата в зависимост от настройките на Locale (например петък);
         * H - часове в 24-часов формат без водеща нула (от 0 до 23);
         * HH - часове в 24-часов формат с водеща нула (от 00 до 23);
         * h - часове в 12-часов формат без водеща нула (от 1 до 12);
         * hh - часове в 12-часов формат с водеща нула (от 01 до 12);
         * k - часове в 24-часов формат без водеща нула (от 1 до 24);
         * K - часове в 12-часов формат без водеща нула (от 0 до 11);
         * m — минути без водеща нула (от 0 до 59);
         * mm — минути с водеща нула (от 00 до 59);
         * s — секунди без водеща нула (от 0 до 59);
         * ss - секунди с водеща нула (от 00 до 59);
         * a - AM или PM с главни букви (например AM) [ante meridiem, post meridiem];
         * S - милисекунди;
         * z е името на часовата зона (например EET);
         * Z е изместването на часовата зона (например +0200);
         */

        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date(561513797684L)));
        printLine();


        sdf = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(new Date(561513797684L)));
        printLine();


        sdf = new SimpleDateFormat("dd/MM/yyyy EEEE hh:mm a z Z", new Locale("bg", "BG"));
        System.out.println(sdf.format(new Date(561513797684L)));
        printLine();


        DateFormatSymbols dFormat = new DateFormatSymbols();
        dFormat.setMonths(new String[] {"ЯНУАРИ", "ФЕВРУАРИ", "МАРТ", "АПРИЛ", "МАЙ", "ЮНИ", "ЮЛИ", "АВГУСТ", "СЕПТЕМВРИ", "ОКТОМВРИ", "НОЕМВРИ", "ДЕКЕМВРИ", ""});

        sdf = new SimpleDateFormat("dd MMMM yyyy", dFormat);
        System.out.println(sdf.format(new Date(561513797684L)));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
