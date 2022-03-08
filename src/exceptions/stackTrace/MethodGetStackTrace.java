package exceptions.stackTrace;

public class MethodGetStackTrace {
    public static void main(String[] args){
        getTest();
    }

    public static void getTest(){
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(StackTraceElement info: methods) System.out.println(info);
    }
}



//Result

//java.lang.Thread.getStackTrace(Thread.java:1559)                                       => Метода Thread.getStackTrace е извикан от метода MethodGetStackTrace.getTest
//exceptions.stackTrace.MethodGetStackTrace.getTest(MethodGetStackTrace.java:10)         => Метода MethodGetStackTrace.getTest е извикан от метода MethodGetStackTrace.main
//exceptions.stackTrace.MethodGetStackTrace.main(MethodGetStackTrace.java:5)             => Метода MethodGetStackTrace.main е входна точка, него никой не го е извикал, той е първият метод от веригата на извикванията

