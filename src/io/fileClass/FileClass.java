package io.fileClass;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("text\\philosophy\\Aristotle\\The_Categories.txt");
        File directory = new File("C:\\Programming\\JavaApp\\JavaDevelopment\\text\\philosophy");

        // Методът .getAbsoluteFile() връща абсолютният път на файла/директорията
        System.out.println(".getAbsoluteFile() = " + file.getAbsoluteFile());
        System.out.println(".getAbsoluteFile() = " + directory.getAbsoluteFile());
        System.out.println("------------------------------");


        // Методът .isAbsolute() проверява дали пътят е абсолютен
        System.out.println(".isAbsolute() = " + file.isAbsolute());
        System.out.println(".isAbsolute() = " + directory.isAbsolute());
        System.out.println("------------------------------");


        // Методът .isDirectory() проверява дали обекта е директория (папка)
        System.out.println(".isDirectory() = " + file.isDirectory());
        System.out.println(".isDirectory() = " + directory.isDirectory());
        System.out.println("------------------------------");


        // Методът .isFile() проверява дали обекта е файл
        System.out.println(".isFile() = " + file.isFile());
        System.out.println(".isFile() = " + directory.isFile());
        System.out.println("------------------------------");


        // Методът .exists() проверява дали обекта съществува
        System.out.println(".exists() = " + file.exists());
        System.out.println(".exists() = " + directory.exists());

        File newFile = new File("text\\Conan_The_Barbarian.txt");
        File newDirectory = new File("C:\\Programming\\JavaApp\\JavaDevelopment\\text\\adventureFilms");
        System.out.println(".exists() = " + newFile.exists());
        System.out.println(".exists() = " + newDirectory.exists());
        System.out.println("------------------------------");


        // Методът .createNewFile() създава нов файл и връща true, а методът .mkdir() създава нова директория и връща true
        System.out.println(".createNewFile() = " + newFile.createNewFile());                    // throws IOException
        System.out.println(".mkdir() = " + newDirectory.mkdir());
        System.out.println(".createNewFile() = " + newFile.createNewFile());                    // ако файлът вече съществува .createNewFile() връща false
        System.out.println("------------------------------");


        // Методът .length() на класът File, връща размера на файла/директорията в байтове
        System.out.println(".length() = " + file.length());
        System.out.println(".length() = " + directory.length());
        System.out.println("------------------------------");


        // Методът .delete() на класът File, премахва указаният файла/директорията и връща true
        // Ако указаната папка е пълна, методът .delete() няма да я премахне и ще върне false
        // За да бъде премахната една папка, тя трябва да бъде празна
        System.out.println(".delete() = " + newFile.delete());
        System.out.println(".delete() = " + newDirectory.delete());
        System.out.println("------------------------------");


        // Методът .listFiles() на класът File, връща масив от тип File, съдържащ файловете и директории в указаната папка
        File[] array = directory.listFiles();
        for(File f : array) System.out.println(".listFiles() = " + f);
        System.out.println("------------------------------");


        // Методът .list() на класът File, връща масив от тип String, съдържащ файловете и директории в указаната папка
        String[] stringArray = directory.list();
        for(String s : stringArray) System.out.println(".list() = " + s);
        System.out.println("------------------------------");


        // Методи даващи информация за файл (или директория)
        System.out.println(".getName() = " + file.getName());                        // Връща името на файла/директорията
        System.out.println(".getParent() = " + file.getParent());                    // Връща пътя на родителската директория на файла/директорията
        System.out.println(".getPath() = " + file.getPath());                       // Връща пътя на файла/директорията
        System.out.println(".isHidden() = " + file.isHidden());                        // Проверява дали файла/директорията е скрит
        System.out.println(".canRead() = " + file.canRead());                         // Проверява дали файла може да се чете
        System.out.println(".canWrite() = " + file.canWrite());                        // Проверява дали във файла може да се пише
        System.out.println(".canExecute() = " + file.canExecute());                      // Проверява дали файлът е изпълним
        System.out.println("------------------------------");

        // Методът .renameTo() преименува файл/директория
    }
}
