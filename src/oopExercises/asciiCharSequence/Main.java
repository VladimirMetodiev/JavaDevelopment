package oopExercises.asciiCharSequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte[] array = input.nextLine().getBytes();

        AsciiCharSequence store = new AsciiCharSequence(array);

        try {
            System.out.println(store.length());

            System.out.println(store.charAt(72));

            System.out.println(store.subSequence(19, 26));

            System.out.println(store);
        }
        catch (IndexOutOfBoundsException ex) {
            System.err.println(ex.getMessage());
        }
    }
}



//Condition

//Напишете клас AsciiCharSequence, реализиращ компактно съхранение на последователност от ASCII-символи в байт масив.
//В сравнение с класът String, който съхранява всеки символ като char, AsciiCharSequence ще се записва в два пъти по-малко памет.
//Клас AsciiCharSequence трябва:
//   да реализира интерфейс java.lang.CharSequence;
//   да имам конструктор, приемащ байт масив;
//   в него да бъдат пренаписани методите length(), charAt(), subSequence() и toString()
//Сигнатурите на методите и очакванията за тяхното поведение, може да бъдат видяни, в описанието на интерфейса на java.lang.CharSequence.



//Test

//Input
//Genghis Khan, born Temujin, was the founder and first Great Khan of the Mongol Empire.

//Output
//86
//M
//Temujin
//Genghis Khan, born Temujin, was the founder and first Great Khan of the Mongol Empire.

