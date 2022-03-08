package io.characterStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClassVarFour {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("text\\He_wishes_for_the_Cloths_of_Heaven.txt"))) {
            int temporary;
            while ((temporary = reader.read()) != -1) {
                System.out.print((char) temporary);
            }
        }
        catch (IOException ex) {
            System.err.println("I/O Exception: " + ex.getMessage());
        }

        System.out.println();

        try (BufferedReader reader = new BufferedReader(new FileReader("text\\The_lake_isle_of_Innisfree.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ex) {
            System.err.println("I/O Exception: " + ex.getMessage());
        }
    }
}
