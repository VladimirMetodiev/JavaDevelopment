package io.byteStream;

public class MethodWriteVarOne {
    public static void main(String[] args) {
        char[] letters = {'c', 'o', 'n', 'c', 'e', 'n', 't', 'r', 'a', 't', 'i', 'o', 'n'};

        for(int a = 0; a < letters.length; a++){
            System.out.write(letters[a]);
            System.out.write('\n');
        }
    }
}
