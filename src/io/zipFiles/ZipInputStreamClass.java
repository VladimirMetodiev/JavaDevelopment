package io.zipFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Vladimir Metodiev
 * @version 1.4
 */

public class ZipInputStreamClass {
    public static void main(String[] args) {
        try (ZipInputStream zipIn = new ZipInputStream(new FileInputStream("text\\philosophy\\Second_Treatise_of_Government_by_John_Locke.zip"))) {
            ZipEntry entry = zipIn.getNextEntry();
            String name;
            long size;

            while (entry != null) {
                name = entry.getName(); // получавам името на файла
                size = entry.getSize(); // получавам размера на файла в байтове
                System.out.printf("File name: %s%nFile size: %d%n", name, size);

                // Разопаковане на файл(-овете)
                FileOutputStream fos = new FileOutputStream("text\\philosophy\\New_" + name);

                int current;

                while((current = zipIn.read()) != -1) {
                    fos.write(current);
                }

                fos.flush();
                fos.close();
                entry = zipIn.getNextEntry();
            }

            zipIn.closeEntry();
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
