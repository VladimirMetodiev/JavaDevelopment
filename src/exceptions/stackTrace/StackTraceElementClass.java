package exceptions.stackTrace;

public class StackTraceElementClass {
    public static void main(String[] args) {
        getTest();
    }

    public static void getTest() {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(StackTraceElement info: methods) {
            System.out.println(info.getClassName());
            System.out.println(info.getMethodName());

            System.out.println(info.getFileName());
            System.out.println(info.getLineNumber());
            System.out.println();
        }
    }
}


//Методи на клас StackTraceElement
//
//[String] getClassName() => Връща името на класа
//[String] getMethodName() => Връща името на метода
//[String] getFileName() => Връща името на файла (в един файл, може да има повече от един клас)
//[int] getLineNumber() => Връща номера на реда във файла, в който е бил извикан методът
//[String] getModuleName() => Връща името на модула (може да бъде null)
//[String] getModuleVersion() => Връща версията на модула (може да бъде null)
