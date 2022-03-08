package io.fileClass;

import java.io.File;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 2.0
 */

public class FileCrawlVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory path:");
        File mainDirectory = new File(input.nextLine());
        isItAFile(mainDirectory);
    }

    private static void isItAFile(File dir) {
        File[] array = dir.listFiles();
        for(int a = 0; a < array.length; a++) {
            if(array[a].isFile()) {
                System.out.println("File name = " + array[a].getName());
                System.out.println("Location = " + array[a].getPath());
                System.out.println("Is the file hidden = " + array[a].isHidden());
                System.out.println("Can the file read = " + array[a].canRead());
                System.out.println("Is it possible to write in the file = " + array[a].canWrite());
                System.out.println("Can the file execute = " + array[a].canExecute());
                System.out.println("------------------------------");
            }
            else {
                isItAFile(array[a]);
            }
        }
    }
}



//Tests

//text\\philosophy

//src\\io
