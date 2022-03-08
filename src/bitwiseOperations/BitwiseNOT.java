package bitwiseOperations;

public class BitwiseNOT {
    public static void main(String[] args) {
        // ~ този оператор се нарича тилда
        int x = 19;

        System.out.println("~" + Integer.toBinaryString(x));
        System.out.println("---------->---------->---------->");
        System.out.println(Integer.toBinaryString(~x));
        System.out.println("---------->---------->---------->");
        System.out.println(Integer.toBinaryString(~x) + " = " + (~x));
    }
}
