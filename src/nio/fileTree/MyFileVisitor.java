package nio.fileTree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor implements FileVisitor<Path> {
    /*
     * Четирите метода на интерфейса FileVisitor връщат обект от тип FileVisitResult.
     * FileVisitResult има следните константи:
     * CONTINUE - означава, че обхождането на файловете трябва да продължи;
     * TERMINATE - означава, че обхождането на файловете трябва да бъде прекратено;
     * SKIP_SUBTREE - означава, че в дадената директория не е нужно да се влиза;
     * SKIP_SIBLINGS - означава, че в дадената директория, обхождането на останалите файлове, не е нужно;
     */
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}
