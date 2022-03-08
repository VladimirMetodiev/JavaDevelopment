package io.fileClass;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 2.1
 */

public class WhatDoesItContainVarTwo {
    static ArrayList<String> files = new ArrayList<>();
    static ArrayList<String> directories = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory path:");
        File directory = new File(input.nextLine());
        search(directory);

        Collections.sort(files);
        Collections.sort(directories);

        System.out.println("The directory " + directory.getName() + " contains:");

        System.out.printf("Files: [%d]%n", files.size());
        for(String f : files) System.out.println("    " + f);

        System.out.printf("Directories: [%d]%n", directories.size());
        for(String d : directories) System.out.println("    " + d);
    }

    static void search(File dir) {
        File[] array = dir.listFiles();
        for (int a = 0; a < array.length; a++) {
            if(array[a].isFile()) {
                files.add(array[a].getName());
            }
            else {
                directories.add(array[a].getName());
                search(array[a]);
            }
        }
    }
}



//Test

//text\\philosophy

//src\\io
