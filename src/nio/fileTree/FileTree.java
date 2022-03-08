package nio.fileTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTree {
    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("text\\philosophy");
        Path path = directory.toAbsolutePath();

        // Методът Files.walkFileTree(Path start, FileVisitor visitor) се използва за обхождане на директории
        Files.walkFileTree(path, new MyFileVisitor());
    }
}
