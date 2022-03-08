package io.fileClass;

import java.io.File;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 1.1
 */

public class FileCrawl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory path:");
        String path = input.nextLine();
        File mainDirectory = new File(path);
        isADirectory(mainDirectory);
    }

    private static void isADirectory(File d) {
        File[] array = d.listFiles();
        for (int a = 0; a < array.length; a++) {
            if(array[a].isDirectory()) {
                isADirectory(array[a]);
            }
            else {
                System.out.println("File name = " + array[a].getName());
                System.out.println("Location = " + array[a].getPath());
                System.out.println("Is the file hidden = " + array[a].isHidden());
                System.out.println("Can the file read = " + array[a].canRead());
                System.out.println("Is it possible to write in the file = " + array[a].canWrite());
                System.out.println("Can the file execute = " + array[a].canExecute());
                System.out.println("------------------------------");
            }
        }
    }
}



//Test

//text\\philosophy
