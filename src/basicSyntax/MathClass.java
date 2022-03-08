package basicSyntax;

public class MathClass {
    public static void main(String[] args) {
        /*
         * За извършване на различни математически операции в Java, в пакета java.lang е дефиниран класа Math.
         */

        // Константи

        // PI
        System.out.println(Math.PI);

        // Неперово число
        System.out.println(Math.E);
        printLine();

        // Методи

        // Абсолютна стойност
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5L));
        System.out.println(Math.abs(5.5));
        System.out.println(Math.abs(-5.5F));
        printLine();

        // Степен - метода връща стойност от тип double (в примера числото 3 на степен 8)
        System.out.println(Math.pow(3, 8));
        printLine();

        // Корен квадратен - метода връща стойност от тип double
        System.out.println(Math.sqrt(1296));
        printLine();

        // Корен трети - метода връща стойност от тип double
        System.out.println(Math.cbrt(3375));
        printLine();

        // Натурален (естествен) логаритъм - метода връща стойност от тип double
        System.out.println(Math.log(64));
        printLine();

        // Десетичен логаритъм - метода връща стойност от тип double
        System.out.println(Math.log10(1000000));
        printLine();

        // Максимум
        System.out.println("Maximum = " + Math.max(19, 49));
        printLine();

        // Минимум
        System.out.println("Minimum = " + Math.min(-33.3, 52.4));
        printLine();

        // Методът .ceil() - връща число, което е закръглено нагоре до следващата по-висока цяла стойност;
        System.out.println(Math.ceil(38.45));
        printLine();

        // Метода .floor() - връща число, което е закръглено надолу до най-близката по-ниска цяла стойност;
        System.out.println(Math.floor(6.99));
        printLine();

        // Методът .round() - връща число, което е закръглено до най-близкото по-ниско цяло число, за числата с дробна част, по-малка от 0,5,
        // или число, което е закръглено до най-близкото по-високо цяло число, за числата с дробна част, по-голяма или равна на 0,5;
        System.out.println(Math.floor(9.49));
        System.out.println(Math.floor(9.99));
        printLine();

        // Методът .random() - връща случайна стойност между 0.0 и 1.0
        System.out.println("Random = " + Math.random());
        printLine();

        // Метода .toDegrees() превръща радианите в градуси
        System.out.println("Degrees = " + Math.toDegrees(1));
        printLine();

        // Метода .toRadians() превръща градусите в радиани
        System.out.println("Radians = " + Math.toRadians(171.88734));
        printLine();

        // Синус - метода връща стойност от тип double
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(225)));
        printLine();

        // Косинус - метода връща стойност от тип double
        System.out.println(Math.cos(Math.toRadians(0)));
        System.out.println(Math.cos(Math.toRadians(45)));
        printLine();

        // Тангенс - метода връща стойност от тип double
        System.out.println(Math.tan(Math.toRadians(0)));
        System.out.println(Math.tan(Math.toRadians(64)));
        printLine();

        // Методът .signum() - връща числото 1, ако стойността е положителна и -1, ако стойността е отрицателна;
        System.out.println(Math.signum(19.9));
        System.out.println(Math.signum(-5.3));
        printLine();
    }

    private static void printLine() {
        System.out.println("------------------------------");
    }
}
