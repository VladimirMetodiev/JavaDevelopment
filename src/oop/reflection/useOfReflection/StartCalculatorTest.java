package oop.reflection.useOfReflection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class StartCalculatorTest {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(new FileReader("text\\TestUseOfReflection.txt"))) {
            while (reader.hasNextLine()) {
                String methodName = reader.nextLine();
                double firstArgument = Double.parseDouble(reader.nextLine());
                double secondArgument = Double.parseDouble(reader.nextLine());

                Calculator calculator = new Calculator();
                Class<?> instance = calculator.getClass();

                Method[] methods = instance.getDeclaredMethods();
                for(Method m : methods) {
                    if(m.getName().equals(methodName)) {
                        m.invoke(calculator, firstArgument, secondArgument);
                        break;
                    }
                }
            }
        }
        catch (FileNotFoundException ex1) {
            System.out.println("Exception: " + ex1.getMessage());
        }
        catch (IllegalAccessException ex2) {
            System.out.println("Exception: " + ex2.getMessage());
        }
        catch (InvocationTargetException ex3) {
            System.out.println("Exception: " + ex3.getMessage());
        }
    }
}
