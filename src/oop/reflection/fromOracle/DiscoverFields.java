package oop.reflection.fromOracle;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class DiscoverFields {
    String name = "Name";
    private double value;
    protected ArrayList<Integer> numbers;
    public static final int CONSTANT = 10;

    public static void main(String args[])
    {
        try {
            Class cInstance = Class.forName("oop.reflection.fromOracle.DiscoverFields");

            Field[] fieldList = cInstance.getDeclaredFields();

            for (int a = 0; a < fieldList.length; a++) {
                Field field = fieldList[a];

                System.out.println("Name = " + field.getName());
                System.out.println("   declared class = " + field.getDeclaringClass());
                System.out.println("   type = " + field.getType());
                int modifier = field.getModifiers();
                System.out.println("   modifiers = " + Modifier.toString(modifier));
                System.out.println("------------------------------");
            }
        }
        catch (Throwable ex) {
            System.err.println(ex);
        }
    }
}



//https://www.oracle.com/technical-resources/articles/java/javareflection.html
