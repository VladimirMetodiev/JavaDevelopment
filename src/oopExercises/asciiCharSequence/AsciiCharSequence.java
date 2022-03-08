package oopExercises.asciiCharSequence;

public class AsciiCharSequence implements CharSequence {
    private byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        //if(index < 0 || index >= array.length) throw new IndexOutOfBoundsException("The index is outside the array.");
        return (char)array[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        //if(start < 0 || start >= array.length && end < 0 || end >= array.length) throw new IndexOutOfBoundsException("The index is outside the array.");

        byte[] temporary = new byte[end - start];

        for(int a = start; a < end; a++) {
            temporary[a - start] = array[a];
        }

        return new AsciiCharSequence(temporary);
    }

    @Override
    public String toString() {
        return new String(array);
    }
}



//My first implementation

//public class AsciiCharSequence implements CharSequence {
//    private byte[] array;
//
//    public AsciiCharSequence(byte[] array) {
//        this.array = array;
//    }
//
//    @Override
//    public int length() {
//        return array.length;
//    }
//
//    @Override
//    public char charAt(int index) {
//        if(index < 0 || index >= array.length) throw new IndexOutOfBoundsException("The index is outside the array.");
//        return (char)array[index];
//    }
//
//    @Override
//    public AsciiCharSequence subSequence(int start, int end) {
//        if(start < 0 || start >= array.length && end < 0 || end >= array.length) throw new IndexOutOfBoundsException("The index is outside the array.");
//
//        byte[] temporary = new byte[end - start];
//
//        for(int a = start; a < end; a++) {
//            temporary[a - start] = array[a];
//        }
//
//        return new AsciiCharSequence(temporary);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for(byte b : array) {
//            sb.append((char)b);
//        }
//        return "" + sb;
//    }
//}