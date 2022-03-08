package io.characterStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        char current;
        String line;
        BufferedReader br = null;

        System.out.println("Example 1");
        System.out.println("Writing or press \"Enter\" to quit.");

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            while((current = (char)br.read()) != (char)10) {
                System.out.print(current);
            }
            System.out.println("\n");
        }
        catch(IOException ex1) {
            System.out.println("I/O Exception: " + ex1);
        }


        System.out.println("Example 2");
        System.out.println("Write \"end\" to quit.");

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            while (!(line = br.readLine()).equals("end")) {
                System.out.println(line);
            }
        }
        catch (IOException ex2) {
            System.out.println("I/O Exception: " + ex2);
        }

        br.close();
    }
}



//Test

//Monetary policy is an action that central banks and governments take to influence how much money is in the economy and how much it costs to borrow.

//Monetary policy affects how much prices are rising – called the rate of inflation. Low and stable inflation is good for the economy and it is our main monetary policy aim.

