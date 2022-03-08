package io.fileClass;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 1.0
 */

public class SearchAFile {
    private static ArrayList<File> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a directory:");
        File directory = new File(input.nextLine());
        System.out.println("Enter a file name:");
        String fileName = input.nextLine();

        ArrayList<File> searchResult;
        try {
            searchResult = search(directory, fileName);
        }
        catch (Exception ex) {
            System.out.println(">>> There is not such directory.");
            return;
        }

        System.out.println("Search result:");
        if(!result.isEmpty()) for(File f : searchResult) System.out.println(">>> " + f.getPath());
        else System.out.println(">>> There is not such file.");
    }

    public static ArrayList<File> search(File directory, String fileName) {
        File[] array = directory.listFiles();

        for (int a = 0; a < array.length; a++) {
            if(array[a].isFile()) {
                if(array[a].getName().equals(fileName)) {
                    result.add(array[a]);
                }
            }
            else {
                search(array[a], fileName);
            }
        }

        return result;
    }
}



//Test

//src
//Start.java

//src
//AccountingDepartment.java

//text
//Hamlet.txt

//pictures
//Duke.jpg

//files
//Duke.jpg

//text\philosophy\John_Stuart_Mill
//Philosophy.txt
