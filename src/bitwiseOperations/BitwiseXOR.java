package bitwiseOperations;

public class BitwiseXOR {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;

        System.out.println(Integer.toBinaryString(x));
        System.out.println("^");
        System.out.println(Integer.toBinaryString(y));
        System.out.println("-----");
        System.out.println(Integer.toBinaryString(x ^ y));
    }
}
