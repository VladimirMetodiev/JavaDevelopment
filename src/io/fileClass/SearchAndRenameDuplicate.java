package io.fileClass;

import java.io.File;
import java.util.*;

/**
 * @author Vladimir Metodiev
 * @version 1.11
 */

public class SearchAndRenameDuplicate {
    private static LinkedHashMap<String, Long> files = new LinkedHashMap<>();
    private static int fileNumber = 2;
    private static int total = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a directory path:");
        File directory = new File(input.nextLine());

        if(!directory.isDirectory()) {
            System.out.println("It isn't a directory.");
            return;
        }

        searchDuplicate(directory);

        System.out.printf("%d duplicate(s) were found.%n", total);
        System.out.println("Files:");
        for(Map.Entry<String, Long> map : files.entrySet()) {
            System.out.println(map.getKey());
        }

        // Експеримент
        //WhatDoesItContainVarTwo.search(directory);
        //WhatDoesItContainVarTwo.files.forEach(System.out::println);
    }

    private static void searchDuplicate (File dir) {
        File[] array = dir.listFiles();
        array = sort(array);

        for (int a = 0; a < array.length; a++) {
            if(array[a].isFile()) {
                File current = new File(array[a].getPath());

                if(checkUp(array[a])) {
                    total++;

                    while (files.containsKey(array[a].getName())) {
                        int index = array[a].getPath().lastIndexOf(".");

                        String path = array[a].getPath().substring(0, index) +  "_" + fileNumber + array[a].getPath().substring(index);

                        while(check(array, path)) {
                            fileNumber++;
                            path = array[a].getPath().substring(0, index) +  "_" + fileNumber + array[a].getPath().substring(index);
                        }

                        array[a] = new File(path);
                    }

                    current.renameTo(new File(array[a].getPath()));
                    files.put(array[a].getName(), array[a].length());
                    fileNumber = 2;
                }
                else {
                    files.put(array[a].getName(), array[a].length());
                }
            }
            else {
                searchDuplicate(array[a]);
            }
        }
    }

    private static boolean checkUp(File file) {
        return files.containsKey(file.getName()) && files.containsValue(file.length());
    }

    private static boolean check(File[] arr, String str) {
        for(File f : arr) {
            if(f.getPath().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static File[] sort(File[] arr) {
        ArrayList<File> dir = new ArrayList<>();
        ArrayList<File> fil = new ArrayList<>();
        int counter = 0;

        for(int b = 0; b < arr.length; b++) {
            if(arr[b].isDirectory()) dir.add(arr[b]);
            else fil.add(arr[b]);
        }

        for (int g = 0; g < dir.size(); g++) {
            arr[g] = dir.get(g);
        }

        for (int h = dir.size(); h < arr.length; h++) {
            arr[h] = fil.get(counter++);
        }

        return arr;
    }
}



//Test

//text\\philosophy


