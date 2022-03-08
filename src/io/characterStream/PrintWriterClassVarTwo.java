package io.characterStream;

import java.io.*;

public class PrintWriterClassVarTwo {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("text\\CarlRogers.txt"));
        PrintWriter pw = new PrintWriter("text\\CopyOfCarlRogers.txt")) {

            String text;

            while ((text = br.readLine()) != null) {
                pw.println(text);
            }

            System.out.println("The file has been written.");
        }
        catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }
}
