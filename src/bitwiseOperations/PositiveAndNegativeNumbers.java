package bitwiseOperations;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int positive = 1;
        int negative = -1;

        System.out.println(String.format("%32s", Integer.toBinaryString(positive)).replace(' ', '0'));
        System.out.printf("%32s%n", Integer.toBinaryString(negative));

        System.out.println("---------->---------->---------->");

        positive = 888;
        negative = -128;

        System.out.println(String.format("%32s", Integer.toBinaryString(positive)).replace(' ', '0'));
        System.out.printf("%32s%n", Integer.toBinaryString(negative));
    }
}
