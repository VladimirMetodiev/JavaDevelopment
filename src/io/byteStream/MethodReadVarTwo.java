package io.byteStream;

import java.io.IOException;

public class MethodReadVarTwo {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[1024];
        System.in.read(data);

        int counter = 0;

        for (int a = 0; a < data.length; a++) {
            if((char)data[a] == ' ') {
                ++counter;
                if(counter == 2) return;
                System.out.println();
            }
            else {
                System.out.print((char)data[a]);
                counter = 0;
            }
        }
    }
}



//Test

//decrement overflow console finite declare

//upset popular however although fate frost myth cub
