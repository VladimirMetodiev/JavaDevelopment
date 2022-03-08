package io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamWithBuffer {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("text\\He_wishes_for_the_Cloths_of_Heaven.txt")) {
            byte[] buffer = new byte[fis.available()]; // Създавам byte масив
            fis.read(buffer); // Прочитам входящият поток в buffer
            for (int a = 0; a < buffer.length; a++) {
                System.out.print((char)buffer[a]); // От buffer записвам на конзолата
            }
        } catch (FileNotFoundException ex) {
            System.out.println("There isn't such file.");
        } catch (IOException ex) {
            System.out.println("I/O Exception: " + ex);
        }
    }
}
