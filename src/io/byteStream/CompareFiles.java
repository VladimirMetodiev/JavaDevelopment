package io.byteStream;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class CompareFiles {
    public static void main(String[] args) throws IOException {
        int first, second;
        boolean areTheyDifferent = true;

        long start = System.currentTimeMillis();
        try(FileInputStream theFirst = new FileInputStream("text\\AtlanticPuffin.txt"); FileInputStream theSecond = new FileInputStream("text\\CopyOfAtlanticPuffinVarTwo.txt")){
            do{
                first = theFirst.read();
                second = theSecond.read();

                if(first - second != 0){
                    areTheyDifferent = false;
                    break;
                }

            } while (first != -1 && second != -1);
        }
        catch (FileNotFoundException ex1){
            System.out.println("No such file.");
            return;
        }
        long end = System.currentTimeMillis();

        if(areTheyDifferent) System.out.println("The two files are identical.");
        else System.out.println("The two files are different.");
        System.out.printf("Time to perform the data check is %d milliseconds.%n", end - start);
    }
}
