package io.scannerClass;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerClass {
    public static void main(String[] args) throws IOException {
        /*
         * Клас Scanner (java.util.Scanner) се използва за четене на данни от различни източници: от конзолата, от файлове и т.н.
         * Конструктори на клас Scanner:
         * Scanner(File source)
         * Scanner(File source, String charsetName)
         * Scanner(InputStream source)
         * Scanner(InputStream source, String charsetName)
         * Scanner(Path source)
         * Scanner(Path source, String charsetName)
         * Scanner(Readable source)
         * Scanner(ReadableByteChannel source)
         * Scanner(ReadableByteChannel source, String charsetName)
         * Scanner(String source)
         */

        Scanner stringInput = new Scanner("false\n1001011\n077\n33\nFF\n2.5\n12.7");

        // Задаване на местомоложение
        stringInput.useLocale(Locale.ENGLISH);      // метода .useLocale() задава местоположение
        System.out.println(stringInput.locale() + "\n");   // метода .locale() връща използваното местоположение

        // Методи на клас Scanner за четене на данни
        boolean isIt = stringInput.nextBoolean(); // false
        byte byteValue = stringInput.nextByte(2); // в двоична (бройна) система, 75
        short shortValue = stringInput.nextShort(8); // в осмична система, 63
        int integerValue = stringInput.nextInt(10); // в десетична система, 33
        long longValue = stringInput.nextLong(16); // в шеснайсетична система, 255
        float floatValue = stringInput.nextFloat(); // 2.5 [ако бъде въведено число с десетичен разделител "," може да хвърли InputMismatchException]
        double doubleValue = stringInput.nextDouble(); // 12.7 [ако бъде въведено число с десетичен разделител "," може да хвърли InputMismatchException]

        /*
         * Бележка: в собите на .nextByte(), .nextShort(), .nextInt() и .nextLong() може да се укаже radix.
         * Той приема стойности 2 за двоична система, 8 за осмична система, 10 десетична система (по подразбиране), 16 за шеснайсетична система;
         */

        System.out.printf("%b%n%d%n%d%n%d%n%d%n%f%n%f%n%n", isIt, byteValue, shortValue, integerValue, longValue, floatValue, doubleValue);

        stringInput = new Scanner("willpower self-control effort concentration \nadaptability creativity ingenuity");
        String theFirst = stringInput.next();                   // метода чете само една дума
        String theSecond = stringInput.nextLine().trim();       // метода чете един ред
        String theThird = stringInput.nextLine();               // метода чете един ред

        System.out.printf("%s%n%s%n%s%n%n", theFirst, theSecond, theThird);



        // Методи на клас Scanner позволяващи да се провери ТИПЪТ на все още непрочетените данни
        Scanner data = new Scanner("3.84\n3.92\n3.77\n3.83\n3.88\n4.05\n4.19");

        while (data.hasNextLine()) {
            System.out.printf("%.1f; ", Double.parseDouble(data.nextLine()));
        }
        System.out.println("\n");

        /*
         * .hasNextByte() - Има ли тип byte? Може ли да се преобразува в тип byte?
         * .hasNextShort() - Има ли тип short? Може ли да се преобразува в short?
         * .hasNextInt() - Има ли тип int? Може ли да се преобразува в int?
         * .hasNextLong() - Има ли тип long? Може ли да се преобразува в long?
         * .hasNextFloat() - Има ли тип float? Може ли да се преобразува в float?
         * .hasNextDouble() - Има ли тип double? Може ли да се преобразува в double?
         * .hasNextBoolean() - Има ли тип boolean? Може ли да се преобразува в boolean?
         * .hasNext() - Има ли друга дума (низ) там?
         * .hasNextLine() - Има ли следващ ред там?
         */



        // Създаване на екземпляр на клас скенер (четене на данни от файл)
        Scanner fileInput = null;
        try {
            fileInput = new Scanner(new File("text\\Hamlet.txt"));

            while (fileInput.hasNextLine()) {
                System.out.println(fileInput.nextLine());
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if(fileInput != null) fileInput.close();        // метода .close() затваря потока с данни
            System.out.println();
        }

        try(Scanner reader = new Scanner(new InputStreamReader(new FileInputStream("text\\AntonyAndCleopatra.txt")))) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            System.out.println();
        }



        // Методи .useDelimiter(), .delimiter(), .useRadix() и .radix()
        Scanner input = new Scanner("2 4 6 \n8 10 12 \n14 16 18");
        input.useDelimiter(Pattern.compile("\\s+"));
        while (input.hasNext()) {
            System.out.print(input.next() + "; ");
        }
        System.out.println("\nDelimiter: " + input.delimiter() + "\n");

        input = new Scanner("2 4 6 8 A C E 10 12");
        input.useRadix(16);
        while (input.hasNextInt()) {
            System.out.print(input.nextInt() + "; ");
        }
        System.out.println("\nRadix: " + input.radix() + "\n");

        /*
         * Метода .useDelimiter() - задава шаблон за разделяне на данните
         * Метода .delimiter() - показва регулярният израз (шаблона), който е използван
         * Метода .useRadix() - задава бройна система
         * Метода .radix() - показва основата на бройната система
         */

        /*
         * Метода .reset() - нулира настройките за разделителя, бройната система и местоположението;
         */



        // Създаване на екземпляр на клас Scanner (въвеждане на данни от конзолата)
        Scanner console = new Scanner(System.in);
        System.out.println(console.nextLine());
    }
}
