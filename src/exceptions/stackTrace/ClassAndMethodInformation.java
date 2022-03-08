package exceptions.stackTrace;

import java.util.Scanner;

public class ClassAndMethodInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(increase(Double.parseDouble(input.nextLine())));
        System.out.println(getCallerClassAndMethodName());
    }

    private static double increase(double num) {
        System.out.println(getCallerClassAndMethodName());
        return num * 1.5;
    }

    public static String getCallerClassAndMethodName() {

        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        if (methods.length <= 3 ) {
            return null;
        }
        else {
            return methods[2].getClassName() + "#" + methods[2].getMethodName();
        }
    }
}



//Condition

//Реализирайте метод, който позволява на други методи да знаят откъде са били извикани.
//Методът getCallerClassAndMethodName() трябва да върне името на класа и метода, от който е извикан методът, извикал този ПОМОЩЕН МЕТОД.
//Ако методът, който извика getCallerClassAndMethodName(), е входната точка към програмата, т.е. никой не го е извикал,
//трябва да върне null (референция null, а не String "null").



//Solution

//    public static String getCallerClassAndMethodName() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//
//        String message = "";
//
//        if(stackTraceElements.length > 3) {
//            StackTraceElement element = stackTraceElements[2];
//            String className = element.getClassName();
//            String methodName = element.getMethodName();
//            message = className + ": " + methodName;
//        }
//        else {
//            return null;
//        }
//        return message;
//    }
