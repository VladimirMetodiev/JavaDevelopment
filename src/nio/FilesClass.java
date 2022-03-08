package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FilesClass {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text\\philosophy\\Aristotle\\Nicomachean_Ethics.txt");
        Path directoryPath = Paths.get("text\\philosophy\\Aristotle\\Metaphysics");

        // Методи .exists() и .createFile()
        if(!Files.exists(filePath)) {
            Files.createFile(filePath); // Методът .createFile() хвърля IOException
        }

        // Метод .createDirectories()
        if(!Files.exists(directoryPath)) {
            Files.createDirectories(directoryPath); // Методът .createDirectories() хвърля IOException
        }

        // Методи, с които получавам информация за файла:
        System.out.println("Files.isHidden(filePath) = " + Files.isHidden(filePath));
        System.out.println("Files.isReadable(filePath) = " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) = " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) = " + Files.isExecutable(filePath));
        System.out.println("------------------------------");

        // Методът .isSameFile() проверява дали пътищата, указани като негови аргументи, водят до един и същи файл. В такъв случай връща true.
        // Ако пътищата водят до два файла, дори те да носят едно и също име и да имат едно и също съдържание, метода връща false.
        Path otherFilePath = Paths.get("text\\philosophy\\Aristotle\\The_Categories.txt");
        Path anotherFilePath = Paths.get("text\\philosophy\\The_Categories.txt");
        System.out.println("Files.isSameFile(otherFilePath, anotherFilePath)) = " + Files.isSameFile(otherFilePath, anotherFilePath));
        System.out.println("------------------------------");

        // Методът .size() връща размера на файла в байтове
        System.out.println("Files.size(filePath) = " + Files.size(otherFilePath));
        System.out.println("------------------------------");

        // Методът .getAttribute() връща стойността на указаният атрибут
        System.out.println("Files.getAttribute(filePath, \"size\") = " + Files.getAttribute(otherFilePath, "size"));
        System.out.println("Files.getAttribute(filePath, \"creationTime\") = " + Files.getAttribute(otherFilePath, "creationTime"));
        System.out.println("------------------------------");

        // Методът .readAttributes() връща обект от тип Map<String, Object>, който съдържа атрибутите на указаният файл
        // В скобите на метода, на мястото на атрибутите, за да укажа "всички", пиша "*".
        Map<String, Object> attributes = Files.readAttributes(otherFilePath, "*");
        for(Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("------------------------------");


    }
}



// Notes

// public static Object getAttribute(Path path, String attribute, LinkOption... options) throws IOException

// PARAMETERS:
// path - the path to the file
// attribute - the attribute to read
// options - options indicating how symbolic links are handled
// RETURNS:
// the attribute value

