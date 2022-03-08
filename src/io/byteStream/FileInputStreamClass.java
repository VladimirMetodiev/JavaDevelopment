package io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClass {
    public static void main(String[] args) throws IOException{
        //Абсолютен път
        //String path = "C:\\Programming\\JavaApp\\JavaDevelopment\\text\\AtlanticPuffin.txt";

        //Относителен път
        String path = "text\\AtlanticPuffin.txt";

        FileInputStream fis = null;
        int current;

        try{
            fis = new FileInputStream(path);

            while ((current = fis.read()) != -1){
                System.out.print((char)current);
            }
        }
        catch (FileNotFoundException ex1){
            System.out.println(ex1.getMessage());
        }
        finally {
            if(fis != null) fis.close();
        }
    }
}



//Another solution

//    public static void main(String[] args) {
//        String path = "text\\AtlanticPuffin.txt";
//
//        FileInputStream fis = null;
//        int current;
//
//        try{
//            fis = new FileInputStream(path);
//
//            while ((current = fis.read()) != -1){
//                System.out.print((char)current);
//            }
//        }
//        catch (FileNotFoundException ex1){
//            System.out.println(ex1.getMessage());
//        }
//        catch (IOException ex2){
//            System.out.println(ex2.getMessage());
//        }
//        finally {
//            try{
//                if(fis != null) fis.close();
//            }
//            catch (IOException ex3){
//                System.out.println(ex3.getMessage());
//            }
//        }
//    }
