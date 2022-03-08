package oop.reflection.fromOracle;

import java.lang.reflect.Method;
import java.util.Scanner;

public class InvokingMethodsByName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;

        System.out.println("Enter: \"add\", \"subtract\", \"multiply\", \"divide\" or \"end\":");

        while (!(command = input.nextLine().trim().toLowerCase()).equals("end")) {
            String methodName = command;
            switch (methodName) {
                case "add": break;
                case "subtract": break;
                case "multiply": break;
                case "divide": break;
                default: System.out.println("Wrong method! Enter: \"add\", \"subtract\", \"multiply\", \"divide\" or \"end\":"); continue;
            }

            try {
                System.out.println("Enter x and y:");
                double x = Double.parseDouble(input.nextLine());
                double y = Double.parseDouble(input.nextLine());

                InvokingMethodsByName im = new InvokingMethodsByName();
                Class cInstance = InvokingMethodsByName.class;

                Method[] methods = cInstance.getDeclaredMethods();
                for(Method m : methods) {
                    if(m.getName().equals(methodName)) {
                        System.out.println(m.invoke(im, x, y));
                        break;
                    }
                }
            }
            catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
            System.out.println("Enter: \"add\", \"subtract\", \"multiply\", \"divide\" or \"end\":");
        }
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide (double x, double y) {
        if(y == 0) throw new ArithmeticException("Can not divide by zero!");
        return x / y;
    }


}



//https://www.oracle.com/technical-resources/articles/java/javareflection.html



// При долното решение, се придържах стриктно съм примера от Oracle.

//    public static void main(String[] args) {
//        try {
//            Class cInstance = Class.forName("oop.reflection.fromOracle.InvokingMethodsByName");
//
//            Class[] parameterTypes = new Class[2];
//            parameterTypes[0] = Integer.TYPE;
//            parameterTypes[1] = Integer.TYPE;
//
//            Method method = cInstance.getMethod("add", parameterTypes);
//            InvokingMethodsByName methodObj = new InvokingMethodsByName();
//            Object[] argumentList = new Object[2];
//            argumentList[0] = new Integer(37);
//            argumentList[1] = new Integer(47);
//            Object obj = method.invoke(methodObj, argumentList);
//            Integer value = (Integer)obj;
//            System.out.println(value.intValue());
//        }
//        catch (Throwable ex) {
//            System.err.println(ex);
//        }
//    }
//
//    public int add(int x, int y) {
//        return x + y;
//    }
