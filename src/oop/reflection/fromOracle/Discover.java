package oop.reflection.fromOracle;

import java.lang.reflect.Method;

public class Discover {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.lang.String");
            Method methods[] = c.getDeclaredMethods();
            for(Method m : methods) System.out.println(m);
        }
        catch (Throwable ex) {
            System.out.println(ex);
        }
    }
}

//връща: [модификатор] [тип на връщаната стойност] [метод с приеманите от него параметри]