package io.characterStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 1.0
 */

public class TryWithResources {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data;

        try (FileWriter writer = new FileWriter("text\\SomeRandomWorkRecords.txt", true)) {
            while(!(data = input.nextLine()).equals("END")) {
                for (int a = 0; a < data.length(); a++) {
                    writer.write(data.charAt(a));
                }
                writer.write("\n");
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}



//Test

//He who has overcome his fears will truly be free. [Aristotle]
//Pleasure in the job puts perfection in the work. [Aristotle]
//It is during our darkest moments that we must focus to see the light. [Aristotle]
//END
