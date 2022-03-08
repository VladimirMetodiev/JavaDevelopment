package io.characterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        int temporary;

        try{
            reader = new FileReader("text\\AtlanticPuffin.txt");
            writer = new FileWriter("text\\CopyOfAtlanticPuffin.txt");

            while((temporary = reader.read()) != -1) {
                writer.write(temporary);
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("There isn't such file.");
        }
        finally {
            if(reader != null) reader.close();
            if(writer != null) writer.close();
        }
    }
}
