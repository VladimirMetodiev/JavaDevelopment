package dateAndTime.oldClasses;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        /*
         * Класът Date предоставя число от тип long, което представлява броят на милисекундите изминали от 1 януари 1970 г.
         *
         * Конструктори на клас Date:
         * Date()
         * Date(long date)
         *
         * Работата с класът Date се свежда до три действия: въвеждане на количеството на милисекундите, сравнение и извеждане на
         * количеството на милисекундите или на специално форматиран низ. За това са предназначени следните МЕТОДИ:
         * .setTime(long time) - задава нова стойност за количеството на милисекундите;
         * .getTime() - връща количеството на милисекундите;
         * .equals() - сравнява две дати, връща или true или false;
         * .compareTo() - сравнява две дати, връща 0, ако датите са равни, положително значение, ако първата дата е по-голяма от втората и
         * отрицателно значение, ако първата дата е по-малка от втората [theFirst.compareTo(theSecond)];
         * .before() - сравнява две дати, връща true, ако първата дата е по-малка от втората и false ако първата дата е по-голяма или
         * равна на втората;
         * .after() - сравнява две дати, връща true, ако първата дата е по-голяма от втората и false ако първата дата е по-малка или
         * равна на втората;
         * .toString() – връща символен низ представящ датата и часа въз основа на количеството на милисекундите;
         */

        // Милисекундите се взимат чрез метода .currentTimeMillis() на класа System
        long milliseconds = System.currentTimeMillis();
        System.out.println(milliseconds);
        printLine();

        // Създаване на обект от клас Date

        // Конструкторът без значение създава обект с текущата дата
        Date date1 = new Date();
        System.out.println(date1.toString());
        printLine();

        // Конструкторът със значение създава обект с указаната (в милисекунди) дата
        Date date2 = new Date(561513797684L);
        System.out.println(date2.toString());
        printLine();

        // Взимане на датата (в милисекунди) чрез метода .getTime()
        long current = date1.getTime();
        System.out.println("Method .getTime() = " + current);

        Date date3 = new Date(current);
        System.out.println(date3.toString());
        printLine();

        // Метод .setTime(long time) - задава нова стойност за количеството на милисекундите
        Date date4 = new Date();
        date4.setTime(4629182375432L);
        System.out.println(date4.toString());
        printLine();

        // Метод .equals() - сравнява две дати
        Date date5 = new Date(561513797684L);
        Date date6 = new Date(561513797684L);
        System.out.println("Method .equals() = " + date5.equals(date6));
        System.out.println("Method .equals() = " + date5.equals(date4));
        printLine();

        // Метод .compareTo() - сравнява две дати
        Date date7 = new Date(561513712638L);
        Date date8 = new Date(561513886898L);
        System.out.println("Method .compareTo() = " + date5.compareTo(date6));
        System.out.println("Method .compareTo() = " + date5.compareTo(date7));
        System.out.println("Method .compareTo() = " + date5.compareTo(date8));
        printLine();

        // Метод .before() - сравнява две дати, връща true, ако първата дата е по-малка от втората и false в противен случай
        System.out.println("Method .before() = " + date5.before(date6));
        System.out.println("Method .before() = " + date5.before(date7));
        System.out.println("Method .before() = " + date5.before(date8));
        printLine();

        // Метод .after() - сравнява две дати, връща true, ако първата дата е по-голяма от втората и false в противен случай
        System.out.println("Method .after() = " + date5.after(date6));
        System.out.println("Method .after() = " + date5.after(date7));
        System.out.println("Method .after() = " + date5.after(date8));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}

