package io.byteStream;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class RandomAccessFileClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] usdBgn = Arrays.stream(input.nextLine().split(",\\s+")).mapToDouble(Double::parseDouble).toArray();
        double current;
        int counter = 0;

        // Open and use a random access file.
        try (RandomAccessFile raf = new RandomAccessFile("text\\ExchangeRates.dat", "rw")) {
            // Write, new data from the end-point of the file.
            raf.seek(raf.length());

            // Write values to the file.
            for (int a = 0; a < usdBgn.length; a++) {
                raf.writeDouble(usdBgn[a]);
            }

//            raf.seek(0); // seek to the first double
//            current = raf.readDouble();
//            System.out.println("The first value is: " + current);
//
//            raf.seek(8); // seek to the second double
//            current = raf.readDouble();
//            System.out.println("The second value is: " + current);
//
//            raf.seek(8 * 3); // seek to the fourth double
//            current = raf.readDouble();
//            System.out.println("The fourth value is: " + current);

            System.out.println();

            // Read values from the file.
            for (int b = 0; b < raf.length(); b++) {
                raf.seek(8 * b);
                current = raf.readDouble();
                System.out.print(current + " ");

                if(++counter == 10){
                    counter = 0;
                    System.out.println();
                }
            }
        }
        catch (EOFException ex1){
            System.out.println("End of file!");
        }
        catch (IOException ex2) {
            System.out.println("I/O Error: " + ex2);
        }
    }
}



//Tests

//1.63562, 1.63574, 1.63593, 1.63623, 1.63648, 1.63591, 1.63584, 1.63572, 1.63553, 1.63538
//1.63524, 1.63519, 1.63498, 1.63475, 1.63462, 1.63466, 1.63475, 1.63486, 1.63597, 1.63511
//1.63529, 1.63531, 1.63533, 1.63528, 1.63544, 1.63463, 1.63598, 1.63621, 1.63629, 1.63618
//1.63605, 1.63597, 1.63591, 1.63601, 1.63614, 1.63629, 1.63644, 1.63658, 1.63663, 1.63655



/*
 *
 * Класът RandomAccessFile не е производен от InputStream или OutputStream. Вместо това, той реализира
 * интерфейсите DataInput и DataOutput, в които са декларирани основните методи за Input/Output. Освен това,
 * той поддържа позиционирани заявки, т.е. позволява да се придвижим до желаната позиция във файла и да
 * прочетем или запишем желаното количество данни.
 *
 * КОНСТРУКТОРИ:
 * RandomAccessFile​(File file, String mode)
 * RandomAccessFile​(String name, String mode)
 *
 * Аргументът mode, указва режима за достъп, в който файлът ще бъде отворен. Възможните стойности са:
 * r - Отворен само за четене. Ако файлът не съществува ще бъде генерирано FileNotFoundException;
 * rw - Отворен за четене и писане. Ако файлът не съществува ще бъде създаден нов файл с нулева дължина;
 * rws - Отворен за четене и писане, като изисква, всяка актуализация на съдържанието на файла, или метаданните,
 * да се записва синхронно, в основното устройство за съхранение.
 * rwd - Отворен за четене и писане, като изисква, всяка актуализация на съдържанието на файла, да се записва
 * синхронно, в основното устройство за съхранение.
 *
 * Методът [void] seek(long position) - задава текущата позиция на указателя на файла;
 * Методът [long] getFilePointer() - връща текущата позиция във файла в байтове;
 * Методът [long] length() - връща дължината на файла в байтове;
 *
 * Специфика на позициите в RandomAccessFile: Например съхраняването на double-стойност изисква 8 байта,
 * всяка следваща double-стойност започва след 8-те байта на предишната стойност. С други думи, първата double-стойност
 * започва от нулевия байт, втората след 8-ят байт, третата след 16-тия и т.н. Следователно, за да прочете четвъртата
 * double-стойност, файловият указател трябва да бъде зададен с методът .seek() на 24-та байтова позиция.
 *
 */

/*
 * Файлът с файлово разширение .dat е бинарен файл, предназначен да съхранява информация за различни програми.
 * В повечето случаи .dat файла може да бъде отворен, само от програмата, която го е създала.
 */