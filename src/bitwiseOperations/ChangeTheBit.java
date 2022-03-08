package bitwiseOperations;

import java.util.Scanner;

public class ChangeTheBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = Integer.parseInt(input.nextLine()); // числото чиито бит ще променяме
        System.out.println("Enter a position:");
        int bitPosition = Integer.parseInt(input.nextLine()); // позицията в бинарното число, на която ще променим стойността на битът

        System.out.printf("Change the bit to position %d%n", bitPosition);

        // За да създам маска, с която да променя указаният бит, трябва да преместя вляво първият бит на числото 1, (bitPosition - 1) пъти;
        bitPosition--;

        // За да получа маска, премесвам вляво битовата единица, на нужната позиция (т.е. на bitPosition - 1);
        int mask = 1 << bitPosition;
        System.out.println("mask = " + Integer.toString(mask, 2));

        System.out.println("number = " + number + " => " + Integer.toString(number, 2));

        // За да променя указаният бит използвам операцията XOR (изключващо ИЛИ), защото bit = 1 ^ 1 => 0, bit = 0 ^ 1 => 1
        // НАПРИМЕР:
        // number = 15
        // position = 3
        // number = 1111
        // operation   ^
        // mask      100
        // number = 1011
        number = number ^ mask;

        System.out.println("number = " + number + " => " + Integer.toString(number, 2));
    }
}
