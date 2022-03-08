package io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int current = -1;

        try(FileInputStream fis = new FileInputStream("text\\TheGreatFrigatebird.txt");
            FileOutputStream fos = new FileOutputStream("text\\CopyOfTheGreatFrigatebird.txt", true)){

            do{
                current = fis.read();
                if(current != -1) fos.write(current);
            } while(current != -1);
        }
        catch (FileNotFoundException ex1){
            System.out.println("No such file.");
        }
    }
}



//Бележка: при завършването на блока try с ресурс, FileInputStream и FileOutputStream се затварят автоматично;
