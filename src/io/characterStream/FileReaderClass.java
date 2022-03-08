package io.characterStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        FileReader reader = null;
        int temporary = -1;

        try{
            reader = new FileReader("text\\AtlanticPuffin.txt");

            while((temporary = reader.read()) != -1) {
                System.out.print((char)temporary);
            }
        }
        catch (IOException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
