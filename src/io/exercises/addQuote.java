package io.exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class addQuote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        File destination = new File("text\\SomeRandomWorkRecords.txt");

        try(FileOutputStream fos = new FileOutputStream(destination, true)) {
            System.out.println("Enter a quote:");
            String quote = input.nextLine() + "\n";
            byte[] buffer = quote.getBytes();
            fos.write(buffer);
        } catch (IOException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}



//Tests

//The world as we have created it is a process of our thinking. It cannot be changed without changing our thinking. [Albert Einstein]

//The true sign of intelligence is not knowledge but imagination. [Albert Einstein]

//Success requires persistence, the ability to not give up in the face of failure.  [Martin Seligman]

//While you can't control your experiences, you can control your explanations. [Martin Seligman]

//Authentic happiness derives from raising the bar for yourself, not rating yourself against others. [Martin Seligman]
