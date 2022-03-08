package oop.reflection.fromOracle;

import java.lang.reflect.Constructor;

public class DiscoverConstructor {
    private int x;
    private double y;

    public DiscoverConstructor() {
    }

    public DiscoverConstructor(int x) throws IllegalArgumentException {
        this.setX(x);
    }

    public DiscoverConstructor(int x, double y) throws IllegalArgumentException {
        this.setX(x);
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x < 0) throw new IllegalArgumentException();
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "DiscoverConstructor{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        try {
            Class cInstance = Class.forName("oop.reflection.fromOracle.DiscoverConstructor");

            Constructor[] constructorList = cInstance.getDeclaredConstructors();

            for (int i = 0; i < constructorList.length; i++) {
                Constructor constructor = constructorList[i];

                System.out.println("Name = " + constructor.getName());
                System.out.println("   declared class = " + constructor.getDeclaringClass());

                Class[] parameterTypes = constructor.getParameterTypes();

                for (int a = 0; a < parameterTypes.length; a++) {
                    System.out.println("   parameter # " + a + " " + parameterTypes[a]);
                }

                Class[] exceptionTypes = constructor.getExceptionTypes();

                for (int b = 0; b < exceptionTypes.length; b++) {
                    System.out.println("   exception # " + b + " " + exceptionTypes[b]);
                }
                System.out.println("------------------------------");
            }
        }
        catch (Throwable ex) {
            System.err.println(ex);
        }
    }
}



//https://www.oracle.com/technical-resources/articles/java/javareflection.html
