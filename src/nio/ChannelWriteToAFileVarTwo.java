package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelWriteToAFileVarTwo {
    public static void main(String[] args) {
        try(RandomAccessFile raf = new RandomAccessFile("text\\SomeRandomWorkRecords.txt", "rw"); FileChannel channel = raf.getChannel()) {
            String text = "Life is like riding a bicycle. To keep your balance, you must keep moving. [Albert Einstein]\n";

            // Указвам записът на нова информация, да започне от края на файла
            raf.seek(raf.length());

            // Има 2 начина, за да укажа, да бъде взет, ЦЕЛИЯТ размер на информацията за записване:
            // № 2
            ByteBuffer buffer = ByteBuffer.wrap(text.getBytes()); // С метода .wrap() организирам масив в пределите на буфера

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
