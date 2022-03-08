package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInterface {
    public static void main(String[] args) {
        Path filePath = Paths.get("text\\philosophy\\Aristotle\\Politics.txt");
        Path directoryPath = Paths.get("text\\philosophy");

        // Методът .getFileName() връща името на файла/директорията
        System.out.println(".getFileName() = " + filePath.getFileName());
        System.out.println(".getFileName() = " + directoryPath.getFileName());
        System.out.println("------------------------------");

        // Методът .getParent() връща пътя на родителският файл/директория
        System.out.println(".getParent() = " + filePath.getParent());
        System.out.println(".getParent() = " + directoryPath.getParent());
        System.out.println("------------------------------");

        // Методът .getRoot() корена на файла/директорията [например C:\ или null]
        System.out.println(".getRoot() = " + filePath.getRoot());
        System.out.println(".getRoot() = " + directoryPath.getRoot());
        System.out.println("------------------------------");

        // Методът .isAbsolute() връща TRUE ако пътя е абсолютен и FALSE ако пътя е относителен
        System.out.println(".isAbsolute() = " + filePath.isAbsolute());
        System.out.println(".isAbsolute() = " + directoryPath.isAbsolute());
        System.out.println("------------------------------");

        // Методът .toAbsolutePath() връща абсолютният път на файла/директорията
        System.out.println(".toAbsolutePath() = " + filePath.toAbsolutePath());
        System.out.println(".toAbsolutePath() = " + directoryPath.toAbsolutePath());
        System.out.println("------------------------------");

        System.out.println("EXPERIMENT");
        System.out.println(".toAbsolutePath().getParent() = " + filePath.toAbsolutePath().getParent());
        System.out.println(".toAbsolutePath().getRoot() = " + directoryPath.toAbsolutePath().getRoot());
        System.out.println("------------------------------");

        // С методът .resolve() създавам обект, който обединява два пътя
        Path otherDirectory = directoryPath.resolve(filePath); // Обединих пътищата на дирикторията и файла, с които работя
        System.out.println(".resolve() = " + otherDirectory);
        System.out.println("------------------------------");

        // Ако имам обект, който представлява абсолютният път на файл, то МЕТОДЪТ .relativize(), връща относителният път на този файл,
        // спрямо зададена директория
        Path someFilePath = Paths.get("C:\\Programming\\JavaApp\\JavaDevelopment\\src\\io\\fileClass\\SearchAFile.java");
        Path someDirectoryPath = Paths.get("C:\\Programming\\JavaApp");
        System.out.println(".relativize() = " + someDirectoryPath.relativize(someFilePath));
        System.out.println("------------------------------");

        // Методът .getFileSystem()
        System.out.println(".getFileSystem() = " + filePath.getFileSystem());
        System.out.println(".getFileSystem() = " + directoryPath.getFileSystem());
        System.out.println("------------------------------");
    }
}
