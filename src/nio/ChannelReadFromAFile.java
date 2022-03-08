package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelReadFromAFile {
    public static void main(String[] arguments) {
        try(RandomAccessFile raf = new RandomAccessFile("text\\He_wishes_for_the_Cloths_of_Heaven.txt", "r"); FileChannel channel = raf.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(8); // С метода .allocate(), ръчно заделяме памет
            StringBuilder sb = new StringBuilder();
            int readByte = channel.read(buffer); // Методът .read() връща броя на прочетените байтове, или -1

            while((readByte) != -1) {
                buffer.flip();

                while(buffer.hasRemaining()) {
                    sb.append((char)buffer.get());
                }

                buffer.clear(); // Метода .clear() изчиства буфера, т.е. връща текущата позиция на буфера на нула и задава лимит нула
                readByte = channel.read(buffer);
            }

            System.out.println(sb.toString());
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
