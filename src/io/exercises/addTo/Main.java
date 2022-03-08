package io.exercises.addTo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        try(RandomAccessFile raf = new RandomAccessFile("src\\io\\exercises\\addTo\\Poem.txt", "rw")) {
            String line = "";
            long position = 0L;

            while(position < raf.length()) {
                line = raf.readLine();
                position = raf.getFilePointer();
            }
            if(!line.equalsIgnoreCase("by William Butler Yeats")) {
                raf.writeBytes("\nby William Butler Yeats\n");
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



// С така написаният код, добавям името на автора на част от първият ред на стихотворението

//    public static void main(String[] args) {
//        try(RandomAccessFile raf = new RandomAccessFile("src\\io\\exercises\\addTo\\Poem.txt", "rw")) {
//            raf.readLine();
//            long position = raf.getFilePointer();
//            if(!raf.readLine().equalsIgnoreCase("by William Butler Yeats")) {
//                raf.seek(position);
//                raf.writeBytes("by William Butler Yeats\n");
//            }
//        }
//        catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
