package io.byteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamClassVarTwo {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("text\\Martin_Seligman.txt");
            PrintStream printStream = new PrintStream(System.out)) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            for (int a = 0; a < buffer.length; a++) {
                // За целите на експеримента пробвах, както с System.out, така и с printStream - резултатът е един и същ
                //System.out.print((char)buffer[a]);
                printStream.print((char)buffer[a]);
            }

            System.out.println("\n>>> The file was printed.");
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
