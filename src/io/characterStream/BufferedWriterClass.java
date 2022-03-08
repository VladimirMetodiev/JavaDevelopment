package io.characterStream;

import java.io.*;

public class BufferedWriterClass {
    public static void main(String[] args) {
        String temporary;
        int character;

        try(BufferedReader br = new BufferedReader(new FileReader("text\\HerringGull.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("text\\CopyOfHerringGull.txt"))) {

            // Решение с използването на метода .readLine()
            while ((temporary = br.readLine()) != null){
                bw.write(temporary);
                bw.newLine();           // Поставям нов ред
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}



// Решение с използването на метода .read()

//    public static void main(String[] args) {
//        String temporary;
//        int character;
//
//        try(BufferedReader br = new BufferedReader(new FileReader("text\\HerringGull.txt"));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("text\\CopyOfHerringGull.txt"))) {
//
//            while ((character = br.read()) != -1){
//                bw.write(character);
//            }
//        }
//        catch(IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
