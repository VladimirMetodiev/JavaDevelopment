package io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamWithBuffer {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("text\\He_wishes_for_the_Cloths_of_Heaven.txt");
            FileOutputStream fos = new FileOutputStream("text\\Copy_Of_He_wishes_for_the_Cloths_of_Heaven.txt", true)) {
            byte[] buffer = new byte[fis.available()]; // Създавам byte масив
            fis.read(buffer, 0, buffer.length); // Прочитам входящият поток в buffer
            fos.write(buffer, 0, buffer.length); // От буфера записвам във файла
        }
        catch (FileNotFoundException ex) {
            System.out.println("There isn't such file.");
        }
        catch (IOException ex) {
            System.out.println("I/O Exception: " + ex);
        }
    }
}
