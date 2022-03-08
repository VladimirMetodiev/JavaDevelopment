package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SomeBufferMethods {
    public static void main(String[] args) {
        try(RandomAccessFile raf = new RandomAccessFile("text\\EnglishAlphabet.txt", "r"); FileChannel channel = raf.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(8); // С метода .allocate(), ръчно заделям памет
            channel.read(buffer);
            buffer.flip(); // Метода .flip() задава текущата позиция в качеството на лимит (за буфера), след което задава като текущата позиция - нула
            System.out.print((char)buffer.get()); // Метода .get() връща байта от текущата позиция на буфера
            System.out.print((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind(); // Връща текущата позиция на буфера на нула
            System.out.print((char)buffer.get());
            System.out.print((char)buffer.get());
            System.out.println((char)buffer.get());

            System.out.println("------------------------------");

            buffer.compact(); // Методът .compact() записва непрочетените байтове от буфера, в неговото начало, и го допълва със следващите след тях байтове
            channel.read(buffer);
            buffer.flip();

            while(buffer.hasRemaining()) {
                System.out.print((char)buffer.get() + " ");
            }

            System.out.println("\n------------------------------");

            buffer.clear(); // Метода .clear() изчиства буфера
            channel.read(buffer);
            buffer.flip();

            System.out.println((char)buffer.get());
            buffer.mark(); // С метода .mark() отбелязвам текущата позиция, за да мога отново да се върна на нея

            while(buffer.hasRemaining()) {
                System.out.print((char)buffer.get() + " ");
            }
            System.out.println();

            buffer.reset(); // Метода .reset() връща текущата позиция, на маркираната по-рано позиция [.mark()]
            while(buffer.hasRemaining()) {
                System.out.print((char)buffer.get() + " ");
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
