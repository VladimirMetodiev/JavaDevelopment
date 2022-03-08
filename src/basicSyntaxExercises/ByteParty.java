package basicSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lengthOfArray = Integer.parseInt(input.nextLine());

        int[] numbers = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            numbers[i] = input.nextInt();
        }
        input.nextLine();

        String command;

        while (!(command = input.nextLine().toLowerCase()).equals("party over")){
            String[] commandArray = command.split("\\s+");

            int instruction = Integer.parseInt(commandArray[0]);
            int position = Integer.parseInt(commandArray[1]);

            switch (instruction){
                case -1: flipBitsAt(position, numbers); break;
                case 0: setZeroToBitAt(position, numbers); break;
                case 1: setOneToBitAt(position, numbers); break;
            }
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }


    private static void flipBitsAt(int position, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] ^ (1  << position);
        }
    }


    private static void setOneToBitAt(int position, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int mask = 1 << position;
            numbers[i] = numbers[i] | mask;
        }
    }


    private static void setZeroToBitAt(int position, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int mask = ~(1 << position);
            numbers[i] = numbers[i] & mask;
        }
    }
}
