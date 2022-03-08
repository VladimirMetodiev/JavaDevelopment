package oop.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> instance = Class.forName("java.awt.Dimension");

            System.out.println("Constructors:");
            Constructor constructors[] = instance.getConstructors();
            for(int a = 0; a < constructors.length; a++) {
                System.out.println("   " + constructors[a]);
            }

            System.out.println("Fields:");
            Field fields[] = instance.getFields();
            for(int b = 0; b < fields.length; b++) {
                System.out.println("   " + fields[b]);
            }

            System.out.println("Methods:");
            Method methods[] = instance.getMethods();
            for(int c = 0; c < methods.length; c++) {
                System.out.println("   "+ methods[c]);
            }
        }
        catch(Exception ex){
            System.out.println("Exception: " + ex);
        }
    }
}
