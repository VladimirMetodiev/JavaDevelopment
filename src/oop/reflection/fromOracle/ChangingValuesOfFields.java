package oop.reflection.fromOracle;

import java.lang.reflect.Field;

public class ChangingValuesOfFields {
    public double realNumber;

    public static void main(String[] args) {
        try {
            Class cInstance = Class.forName("oop.reflection.fromOracle.ChangingValuesOfFields");
            Field field = cInstance.getField("realNumber");

            ChangingValuesOfFields obj = new ChangingValuesOfFields();
            System.out.println("realNumber = " + obj.realNumber);

            field.setDouble(obj, 12.34);
            System.out.println("realNumber = " + obj.realNumber);
        }
        catch (Throwable ex) {
            System.err.println(ex);
        }
    }
}



//https://www.oracle.com/technical-resources/articles/java/javareflection.html
