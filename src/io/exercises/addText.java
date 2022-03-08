package io.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Vladimir Metodiev
 * @version 1.7
 */

public class addText {
    public static void main(String[] args) {
        File source = new File("text\\AtlanticPuffin.txt");
        File destination = new File("text\\CopyOfAtlanticPuffin.txt");

        try(RandomAccessFile rafSource = new RandomAccessFile(source, "r");
            RandomAccessFile rafDestination = new RandomAccessFile(destination, "rw")) {
            rafDestination.seek(rafDestination.length());

            while(rafSource.getFilePointer() <= rafSource.length() - 1) {
                String line = rafSource.readLine();

                rafDestination.writeBytes(line);

                rafDestination.write(10);
                //rafDestination.writeChar((char)10);
                // .writeChar() - добавя един интервал пред символа
            }

        } catch (IOException ex) {
            System.err.println("Error: " + ex); // Експериментално
        }
    }
}



// Бележка: Възникна проблем, защото кодировката на файла, беше (променена на) UTF-16
