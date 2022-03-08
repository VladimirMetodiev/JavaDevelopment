package basicSyntax;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int maxValue;

        maxValue = a >= b ? a : b;

        System.out.println(maxValue);
    }
}
