package io.byteStream;

import java.io.*;

public class PrintStreamClassVarThree {
    public static void main(String[] args) {
        /* Experiment */
        try(FileInputStream fis = new FileInputStream("text\\Martin_Seligman.txt");
            FileOutputStream fos = new FileOutputStream("text\\Copy_Of_Martin_Seligman.txt");
            PrintStream printStream = new PrintStream(fos)) {

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            printStream.write(buffer);

            System.out.println("The file has been written.");
        }
        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
