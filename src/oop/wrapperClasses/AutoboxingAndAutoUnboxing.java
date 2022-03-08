package oop.wrapperClasses;

import java.util.ArrayList;

public class AutoboxingAndAutoUnboxing {
    public static void main(String[] args) {

        // Процеса на автоматично капсулиране, на значението на стойностен тип, в обвиващ тип, се нарича автоопаковане

        Byte byteObj = 127;
        Short shortObj = 32767;
        Integer intObj = 2147483647;
        Long longObj = 9223372036854775807L;
        Float floatObj = 357.21f;
        Double doubleObj = 3.1415926535897932d;
        Character charObj = 'Q';
        Boolean boolObj = true;

        // Процеса на автоматично извличане, на значението на стойностен тип, от обект на обвиващ тип, се нарича авторазопаковане.

        byte newByteVar = byteObj;
        short newShortVar = shortObj;
        int newIntVar = intObj;
        long newLongVar = longObj;
        float newFloatVar = floatObj;
        double newDoubleVar = doubleObj;
        char newCharVar = charObj;
        boolean newBoolVar = boolObj;

        System.out.println(newByteVar);
        System.out.println(newShortVar);
        System.out.println(newIntVar);
        System.out.println(newLongVar);
        System.out.println(newFloatVar);
        System.out.println(newDoubleVar);
        System.out.println(newCharVar);
        System.out.println(newBoolVar);

        // ArrayList е структура която работи с обекти, затова при нея се използват обвиващи типове
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Извършва се автоопаковане
        arrayList.add(81);

        // Извършва се авторазопаковане
        int number = arrayList.get(0);
        System.out.println(number);
    }
}
