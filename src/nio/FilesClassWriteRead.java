package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesClassWriteRead {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("text\\philosophy\\The_Nicomachean_Ethics_of_Aristotle.txt");
        Path destination = Paths.get("text\\philosophy\\Aristotle\\The_Nicomachean_Ethics_of_Aristotle.txt");
        if(!Files.exists(destination)) Files.createFile(destination);
        Files.write(destination, getSource(source).toString().getBytes());

        if(Files.exists(destination)) {
            System.out.println("File name = " + destination.getFileName());
            System.out.println("File size = " + Files.getAttribute(destination, "size"));
            System.out.println("------------------------------------------------------------\n");
        }

//        byte[] text = Files.readAllBytes(destination);
//
//        for (int a = 0; a < text.length; a++) {
//            System.out.print((char)text[a]);
//        }

        List<String> treatise = Files.readAllLines(destination);
        for(String str : treatise) {
            System.out.println(str);
        }
    }

    private static StringBuilder getSource(Path source) {
        StringBuilder sb = new StringBuilder();

        try(RandomAccessFile raf = new RandomAccessFile(source.toString(), "rw"); FileChannel channel = raf.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(128);
            int readByte = channel.read(buffer);

            while(readByte != -1) {
                buffer.flip();

                while(buffer.hasRemaining()) {
                    sb.append((char)buffer.get());
                }

                buffer.clear();
                readByte = channel.read(buffer);
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        return sb;
    }
}
