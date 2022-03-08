package exceptions;

public class ThrowAnExceptionVarThree {
    public static void main(String[] args) {
        try{
            generatesAnError();
        }
        catch (IllegalAccessError ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void generatesAnError() throws IllegalAccessError {
        throw new IllegalArgumentException("Mega-big mistake!");
    }
}

//Бележка 1: ако даден метод, генерира контролируемо изключение, което не се обработва, тогава в сигнатурата на метода,
//след ключовата дума throws, трябва да бъде указан класът на генерираното изключение.

//Бележка 2: ако в даден метод, възникне изключение, което не се обработва и не е указано в сигнатурата на метода,
//то тогава виртуалната машина аварийно завършва програмата, генерира съобщение за грешка и принтира Stack Trace.
