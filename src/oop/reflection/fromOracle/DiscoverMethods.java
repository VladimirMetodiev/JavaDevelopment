package oop.reflection.fromOracle;

import java.lang.reflect.Method;

public class DiscoverMethods {
    private int value;

    public DiscoverMethods(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int someMethod(Object obj, int x) throws NullPointerException {
        if (obj == null) throw new NullPointerException();
        return x;
    }

    private int anotherMethod(Object obj, int y) throws NullPointerException, IllegalArgumentException {
        if (obj == null) throw new NullPointerException();
        if (y < 0) throw new IllegalArgumentException();
        return y;
    }

    public static void main(String[] args) {
        try {
            Class c = Class.forName("oop.reflection.fromOracle.DiscoverMethods");

            Method methodList[] = c.getDeclaredMethods();
            for (int a = 0; a < methodList.length; a++) {
                Method m = methodList[a];

                System.out.println("Name = " + m.getName());
                System.out.println("   declared class = " + m.getDeclaringClass());

                Class[] parameterTypes = m.getParameterTypes(); // .getParameterTypes() връща масив Class<?>[]

                for (int b = 0; b < parameterTypes.length; b++) {
                    System.out.println("   parameter # " + b + " " + parameterTypes[b]);
                }

                Class[] exceptionTypes = m.getExceptionTypes(); // .getExceptionTypes() връща масив Class<?>[]

                for (int d = 0; d < exceptionTypes.length; d++) {
                    System.out.println("   exception # " + d + " " + exceptionTypes[d]);
                }

                System.out.println("   return type = " + m.getReturnType());
                System.out.println("   ------------------------------");
            }
        }
        catch (Throwable ex) {
            System.err.println(ex);
        }
    }
}



//https://www.oracle.com/technical-resources/articles/java/javareflection.html
