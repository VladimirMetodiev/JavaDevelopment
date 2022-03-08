package io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyThePicture {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        String path = "pictures\\Elements.jpg";
        int temporary;

        try{
            fis = new FileInputStream(path);
            fos = new FileOutputStream("pictures\\CopyOfElements.jpg");

            while((temporary = fis.read()) != -1) {
                fos.write(temporary);
            }

            System.out.println("The picture is copied.");
        }
        catch(FileNotFoundException ex){
            System.out.println("There isn't such file.");
        }
        finally {
            if(fis != null) fis.close();
            if(fos != null) fos.close();
        }
    }
}
