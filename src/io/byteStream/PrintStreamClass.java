package io.byteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamClass {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("text\\Martin_Seligman.txt");
            PrintStream printStream = new PrintStream("text\\Copy_Of_Martin_Seligman.txt")) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            printStream.write(buffer);
            System.out.println("The file has been written.");
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}


