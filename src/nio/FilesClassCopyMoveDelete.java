package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesClassCopyMoveDelete {
    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("text\\philosophy\\Ethics");
        Path file = Paths.get("text\\philosophy\\Ethics\\Nicomachean_Ethics.txt");

        if(!Files.exists(directory)) {
            Files.createDirectories(directory);
        }

        // Методът .copy() копира от посоченият източник, указаният му файл/директория.
        // В пътя задължително трябвя да укажа името на файла
        Path source = Paths.get("text\\philosophy\\Aristotle\\Nicomachean_Ethics.txt");
        if(!Files.exists(file)) {
            Files.copy(source, file);
        }

        // Методът .copy() може да копира файл, на мястото на файл със същото име, но в скобите на метода, трябва да бъде добавена
        // опцията StandardCopyOption.REPLACE_EXISTING, в противен случай ще хвърли грешка.
        Files.copy(source, file, StandardCopyOption.REPLACE_EXISTING);

        // Методът .move() премества файл
        Path destination = Paths.get("text\\philosophy\\Nicomachean_Ethics.txt");
        if(Files.exists(file)) {
            try {
                Files.move(file, destination);
            } catch (IOException ex) {
                System.out.println("The file already exists.");
            }
        }

        // Чрез методът .move() мога да преименувам файл, това става като на мястото на източника укажа файла,
        // а на мястото на дестинацията укажа същият път, само че променя името на файла.
        //Files.move(Paths.get("text\\philosophy\\Aristotle\\Nicomachean_Ethics.txt"), Paths.get("text\\philosophy\\Aristotle\\The_Nicomachean_Ethics_of_Aristotle.txt"));

        // Методът .delete() изтрива указаният файл/директория
        Files.delete(Paths.get("text\\philosophy\\Nicomachean_Ethics.txt"));
        Files.delete(Paths.get("text\\philosophy\\Ethics"));
    }
}
