package io.zipFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Vladimir Metodiev
 * @version 3.0
 */

public class ZipOutputStreamClass {
    public static void main(String[] args) {
        /*
         * Java предоставя функционалност за работа zip-архиви. За това в пакет java.util.zip са определени два класа:
         * ZipOutputStream и ZipInputStream.
         *
         * ZipOutputStream се използва за създаване на zip-архив.
         * Конструктори:
         * ZipOutputStream​(OutputStream out)
         * ZipOutputStream​(OutputStream out, Charset charset)
         *
         * За да запиша файл в zip-архив, трябва да създам ОТДЕЛЕН ZipEntry обект за файла, в конструктора, на който
         * се поставя името на файла за архивиране. Добавянето на ZipEntry обект в архив, става чрез метод .putNextEntry(),
         * извикан от ZipOutputStream обекта.
         *
         * Класът ZipInputStream се използва за четене на zip-архив. В конструкторът му се поставя поток указващ на zip-архив.
         * Конструктори:
         * ZipInputStream​(InputStream in)
         * ZipInputStream​(InputStream in, Charset charset)
         *
         * За четене на файлове от zip-архива, ZipInputStream използва метода .getNextEntry(), който връща обект от тип ZipEntry.
         * Този обектът представлява ОТДЕЛЕН запис в zip-архива.
         */

        String fileForArchiveCopy = "text\\philosophy\\The_Categories.txt";

        try(ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("text\\philosophy\\The_Categories.zip"));
            FileInputStream fis = new FileInputStream(fileForArchiveCopy)) {

            ZipEntry entry = new ZipEntry("The_Categories.txt");
            zipOut.putNextEntry(entry);

            byte[] buffer = new byte[1024];
            int length;

            while((length = fis.read(buffer)) >= 0) {
                zipOut.write(buffer, 0, length);
            }

            zipOut.closeEntry();
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}



//Solution

//    public static void main(String[] args) {
//        String fileForArchiveCopy = "text\\philosophy\\The_Categories.txt";
//
//        try(ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("text\\philosophy\\The_Categories.zip"));
//            FileInputStream fis = new FileInputStream(fileForArchiveCopy)) {
//
//            ZipEntry entry = new ZipEntry("The_Categories.txt");
//            zipOut.putNextEntry(entry);
//
//            int current;
//
//            while((current = fis.read()) != -1) {
//                zipOut.write(current);
//            }
//
//            zipOut.closeEntry();
//        }
//        catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }



//    public static void main(String[] args) {
//        String fileForArchiveCopy = "text\\philosophy\\The_Categories.txt";
//
//        try(ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("text\\philosophy\\The_Categories.zip"));
//            FileInputStream fis = new FileInputStream(fileForArchiveCopy)) {
//
//            ZipEntry entry = new ZipEntry("The_Categories.txt");
//            zipOut.putNextEntry(entry);
//
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer);
//
//            zipOut.write(buffer);
//
//            zipOut.closeEntry();
//        }
//        catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }