package io.characterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Vladimir Metodiev
 * @version 1.0
 */

public class FileReaderFormAFileToTheConsole {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        int data;

        try{
            reader = new FileReader("text\\Hamlet.txt");
            while ((data = reader.read()) != -1) {
                System.out.print((char)data);
            }
        }
        catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }
        finally {
            if(reader != null) reader.close();
        }
    }
}
