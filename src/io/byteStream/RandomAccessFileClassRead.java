package io.byteStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileClassRead {
    public static void main(String[] args) {
        try(RandomAccessFile raf = new RandomAccessFile("text\\He_wishes_for_the_Cloths_of_Heaven.txt", "r")) {
            for (int a = 0; a < raf.length(); a++) {
                //raf.seek(a);
                System.out.print((char)raf.read());
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("\n");

        try(RandomAccessFile raf = new RandomAccessFile("text\\The_lake_isle_of_Innisfree.txt", "r")) {
            long position = 0L;
            while(position < raf.length()) {
                //raf.seek(position);
                System.out.println(raf.readLine());
                position = raf.getFilePointer();
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}



// След като буквата или редът бъдат прочетени, позицията се променя автоматично;
