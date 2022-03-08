package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelWriteToAFile {
    public static void main(String[] args) {
        try(RandomAccessFile raf = new RandomAccessFile("text\\SomeRandomWorkRecords.txt", "rw"); FileChannel channel = raf.getChannel()) {
            String text = "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle. [Albert Einstein]\n";

            // Указвам записът на нова информация, да започне от края на файла
            raf.seek(raf.length());

            // Има 2 начина, за да укажа, да бъде взет, ЦЕЛИЯТ размер на информацията за записване:
            // № 1
            ByteBuffer buffer = ByteBuffer.allocate(text.getBytes().length); // Указвам размера на буфера
            buffer.put(text.getBytes()); // Записвам в буфера

            buffer.flip();
            channel.write(buffer);
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
