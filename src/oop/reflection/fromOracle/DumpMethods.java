package oop.reflection.fromOracle;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DumpMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Class instance = Class.forName(input.nextLine());
            Method m[] = instance.getDeclaredMethods();
            for (int a = 0; a < m.length; a++) System.out.println(m[a].toString());
        }
        catch (Throwable ex) {
            System.err.println(ex);
        }
    }
}



//https://www.oracle.com/technical-resources/articles/java/javareflection.html



//Test

//java.util.Stack

//oop.staff.Employee



//Бележка: Тази програма зарежда посочения клас с помощта на class.forName, след това извиква метода .getDeclaredMethods(),
//за да извлече списъка с методи, дефинирани в указаният клас.
