package io.characterStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClassVarThree {
    public static void main(String[] args) throws IOException {
        String line;

        System.out.println("Write \"finish\" to quit.");

        try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(line = br2.readLine()).equals("finish")) {
                System.out.println(line);
            }
        }
    }
}



//Test

//What is inflation?
//finish
