package io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int current = -1;

        try{
            fis = new FileInputStream("text\\AtlanticPuffin.txt");
            fos = new FileOutputStream("text\\CopyOfShowText.txt", true);

            do{
                current = fis.read();
                if(current != -1) fos.write(current);
            } while(current != -1);
        }
        catch (FileNotFoundException ex1){
            System.out.println("No such file.");
        }
        finally {
            if(fis != null) fis.close();
            if(fos != null) fos.close();
        }
    }
}
