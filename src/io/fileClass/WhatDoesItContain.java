package io.fileClass;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 1.0
 */

public class WhatDoesItContain {
    private static int files = 0;
    private static double fileSize = 0.0;
    private static int directories = 0;
    private static double directorySize = 0.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory path:");
        File directory = new File(input.nextLine());
        search(directory);

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("The directory " + directory.getName() + " contains:");

        if(files == 0 || files == 1) {
            System.out.println("File: " + files);
        }
        else {
            System.out.println("Files: " + files);
        }
        System.out.println("File size: " + df.format(fileSize / 1024) + " Kb");

        if(directories == 0 || directories == 1) {
            System.out.println("Directory: " + directories);
        }
        else {
            System.out.println("Directories: " + directories);
        }
        System.out.println("Directory size: " + df.format(directorySize / 1024) + " Kb");
    }

    private static void search(File dir) {
        File[] array = dir.listFiles();
        for (int a = 0; a < array.length; a++) {
            if(array[a].isFile()) {
                files++;
                fileSize += array[a].length();
            }
            else {
                directories++;
                directorySize += array.length;
                search(array[a]);
            }
        }
    }
}



//Test

//text\\philosophy

//src\\io
