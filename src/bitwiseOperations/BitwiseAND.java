package bitwiseOperations;

public class BitwiseAND {
    public static void main(String[] args) {
        int x = 19;
        int y = 14;

        System.out.println(Integer.toBinaryString(x));
        System.out.println("&");
        System.out.println(Integer.toBinaryString(y));
        System.out.println("-----");
        System.out.println(Integer.toBinaryString(x & y));
        System.out.println("-----");
        System.out.println(Integer.toBinaryString(x & y) + " = " + (x & y));
    }
}
