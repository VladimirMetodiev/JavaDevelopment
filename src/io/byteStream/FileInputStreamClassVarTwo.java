package io.byteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClassVarTwo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int current = -1;

        try {
            fis = new FileInputStream("text\\AtlanticPuffin.txt");
            do {
                current = fis.read();
                if(current != -1) System.out.print((char)current);
            } while(current != -1);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            try{
                if(fis != null) fis.close();
            }
            catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
