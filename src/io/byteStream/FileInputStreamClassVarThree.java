package io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClassVarThree {
    public static void main(String[] args) throws IOException {
        int current;

        try(FileInputStream fis = new FileInputStream("text\\AtlanticPuffin.txt")) {
            do {
                current = fis.read();
                if(current != -1) System.out.print((char)current);
            } while(current != -1);
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
