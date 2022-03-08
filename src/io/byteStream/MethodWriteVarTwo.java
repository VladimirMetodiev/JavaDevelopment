package io.byteStream;

import java.io.IOException;

public class MethodWriteVarTwo {
    public static void main(String[] args) throws IOException {
        int character;

        System.out.println("Enter some text:");
        while ((character = System.in.read()) != '\n') {
            System.out.write(character);
        }

        System.out.flush();
    }
}
