package nio.fileTreeDelete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteDirectory {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("text\\deleteFromHere\\Plato");
        Files.walkFileTree(path, new AnotherFileVisitor());
    }
}
