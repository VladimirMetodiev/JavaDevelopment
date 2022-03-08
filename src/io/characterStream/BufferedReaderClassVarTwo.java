package io.characterStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClassVarTwo {
    public static void main(String[] args) throws IOException {
        char current;

        System.out.println("Writing or press \"Enter\" to quit.");

        try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) {
            while((current = (char)br1.read()) != (char)10) {
                System.out.print(current);
            }
            System.out.println("\n");
        }
    }
}



//Test

//What is GDP?
