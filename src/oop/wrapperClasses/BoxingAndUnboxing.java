package oop.wrapperClasses;

import java.util.Scanner;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Процеса на капсулиране, на значението на стойностен тип, в обвиващ тип, се нарича опаковане

        byte byteVar = -128;
        short shortVar = -32768;
        int intVar = -2147483648;
        long longVar = -9223372036854775808L;
        float floatVar = 772.84f;
        double doubleVar = 6692.8761d;
        char charVar = 'J';
        boolean boolVar = true;



        // Опаковането се извършва "ръчно", а не автоматично

        Byte byteObj = new Byte(byteVar);
        Short shortObj = new Short(shortVar);
        Integer intObj = new Integer(intVar);
        Long longObj = new Long(longVar);
        Float floatObj = new Float(floatVar);
        Double doubleObj = new Double(doubleVar);
        Character charObj = new Character(charVar);
        Boolean boolObj = new Boolean(boolVar);

        // От JDK 9 горните конструктори са обявени за непрепоръчителни, вмосто тях се препоръчва метода .valueOf();

        byteObj = Byte.valueOf(byteVar);
        shortObj = Short.valueOf(shortVar);
        intObj = Integer.valueOf(intVar);
        longObj = Long.valueOf(longVar);
        floatObj = Float.valueOf(floatVar);
        doubleObj = Double.valueOf(doubleVar);
        charObj = Character.valueOf(charVar);
        boolObj = Boolean.valueOf(boolVar);



        // Процеса на извличане, на значението на стойностен тип, от обект на обвиващ тип, се нарича разопаковане.
        // Разопаковането се извършва ("ръчно", а не автоматично) чрез следните методи:

        byte newByteVar = byteObj.byteValue();
        short newShortVar = shortObj.shortValue();
        int newIntVar = intObj.intValue();
        long newLongVar = longObj.longValue();
        float newFloatVar = floatObj.floatValue();
        double newDoubleVar = doubleObj.doubleValue();
        char newCharVar = charObj.charValue();
        boolean newBoolVar = boolObj.booleanValue();

        System.out.println(newByteVar);
        System.out.println(newShortVar);
        System.out.println(newIntVar);
        System.out.println(newLongVar);
        System.out.println(newFloatVar);
        System.out.println(newDoubleVar);
        System.out.println(newCharVar);
        System.out.println(newBoolVar);
    }
}
