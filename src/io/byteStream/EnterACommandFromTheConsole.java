package io.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * За да стартирам файла от конзолата, трябва да закоментирам "package io.byteStream".
 * Да компилирам файла в .class файл, с командата:
 * javac EnterACommandFromTheConsole.java
 * Да въведа командата:
 * java EnterACommandFromTheConsole FileName.txt CopyOfFileName.txt
 *
 */

public class EnterACommandFromTheConsole {
    public static void main(String[] args) throws IOException {
        int current;
        FileInputStream fis = null;
        FileOutputStream fos = null;

        if (args.length != 2) {
            System.out.println("Usage: CopyFile from ... to");
            return;
        }

        try {
            fis = new FileInputStream(args[0]);
            fos = new FileOutputStream(args[1], true);

            do {
                current = fis.read();
                if (current != -1) fos.write(current);
            } while (current != -1);

        }
        catch (IOException ex1) {
            System.out.println("I/O Error: " + ex1);
        }
        finally {
            try {
                if (fis != null) fis.close();
            }
            catch (IOException exc) {
                System.out.println("Error Closing Input File!");
            }
            try {
                if (fos != null) fos.close();
            }
            catch (IOException exc) {
                System.out.println("Error Closing Output File!");
            }
        }
    }
}
