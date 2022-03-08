package basicSyntax;

import java.util.Scanner;

public class ConvertToDecimalNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String octalNumber = "121";
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        System.out.printf("Octal number %s = %d%n", octalNumber, decimalNumber);

        octalNumber = "61";
        decimalNumber = Integer.parseInt(octalNumber, 8);
        System.out.printf("Octal number %s = %d%n", octalNumber, decimalNumber);

        String hexadecimalNumber = "A9";
        decimalNumber = Integer.parseInt(hexadecimalNumber, 16);
        System.out.printf("Hexadecimal number %s = %d%n", hexadecimalNumber, decimalNumber);

        hexadecimalNumber = "3C1";
        decimalNumber = Integer.parseInt(hexadecimalNumber, 16);
        System.out.printf("Hexadecimal number %s = %d%n", hexadecimalNumber, decimalNumber);

        String binaryNumber = "01001001";
        decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.printf("Binary number %s = %d%n", binaryNumber, decimalNumber);

        binaryNumber = "101100101011";
        decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.printf("Binary number %s = %d%n", binaryNumber, decimalNumber);
    }
}
