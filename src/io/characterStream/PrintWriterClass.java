package io.characterStream;

import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        String[] arr1 = {"the first", "the second", "the third", "the fourth",};
        int[] arr2 = {1, 2, 3, 4};

        for(int a = 0; a < arr1.length; a++ ) {
            pw.println(arr1[a] + ": " + arr2[a]);
        }

        pw.close();
    }
}
