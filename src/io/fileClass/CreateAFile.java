package io.fileClass;

import java.io.File;
import java.io.IOException;

/**
 * @author Vladimir Metodiev
 * @version 1.0
 */

public class CreateAFile {
    public static void main(String[] args) throws IOException {
        File newFile = new File("text\\philosophy\\Aristotle\\The_Nicomachean_Ethics.txt");

        boolean result = newFile.createNewFile();

        if(result) {
            System.out.println("The file has been created successfully.");
        }
        else {
            System.out.println("The file already exists.");
        }
    }
}
