package io.characterStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Vladimir Metodiev
 * @version 1.0
 */

public class FileWriterFromAStringToAFile {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String text;

        while(!(text = input.nextLine()).equals("END")) {
            FileWriter writer = null;

            try {
                writer = new FileWriter("text//SomeRandomWorkRecords.txt", true);

                for (int a = 0; a < text.length(); a++) {
                    writer.write(text.charAt(a));
                }

                writer.write("\n");
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                if(writer != null) {
                    writer.close();
                }
            }
        }
    }
}



//Test

//Knowing yourself is the beginning of all wisdom. [Aristotle]
//It is the mark of an educated mind to be able to entertain a thought without accepting it. [Aristotle, Metaphysics]
//Happiness depends upon ourselves. [Aristotle]
//END
