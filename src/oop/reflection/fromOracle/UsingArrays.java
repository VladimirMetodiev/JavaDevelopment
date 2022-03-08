package oop.reflection.fromOracle;

import java.lang.reflect.Array;

public class UsingArrays {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.lang.String");
            Object array = Array.newInstance(c, 10);
            Array.set(array, 5, "this is a test");
            String str = (String)Array.get(array, 5);
            System.out.println(str);
        }
        catch (Throwable ex) {
            System.err.println(ex);
        }
    }
}



//https://www.oracle.com/technical-resources/articles/java/javareflection.html
