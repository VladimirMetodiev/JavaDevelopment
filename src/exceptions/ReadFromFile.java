package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String expression;

        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader("text\\TheAtlanticPuffin.txt")); //AtlanticPuffin.txt

            while((expression = reader.readLine()) != null) {
                System.out.println(expression);
            }
        }
        catch (FileNotFoundException ex1){
            System.out.println("There isn't such file.");
        }
        finally {
            if(reader != null) reader.close();
        }
    }
}
