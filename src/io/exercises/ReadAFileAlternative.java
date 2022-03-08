package io.exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAFileAlternative {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("text\\AntonyAndCleopatra.txt");
            fos = new FileOutputStream("text\\CopyOfAntonyAndCleopatra.txt");

            for (int a = fis.read(); a != -1; a = fis.read()) {
                fos.write(a);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("There is not such file.");
        }
        finally {
            if(fis != null) fis.close();
            if(fos != null) fos.close();
        }
    }
}
