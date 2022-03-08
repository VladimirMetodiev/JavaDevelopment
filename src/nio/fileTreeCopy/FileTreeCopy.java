package nio.fileTreeCopy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTreeCopy {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("text\\philosophy\\Aristotle");
        Path destination = Paths.get("text\\copyHere");
        Files.walkFileTree(source, new OtherFileVisitor(source, destination));
    }
}
