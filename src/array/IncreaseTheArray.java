package array;

import java.util.Arrays;
import java.util.Scanner;

public class IncreaseTheArray {
    private static int[] array = new int[4];
    private static int value, tail = 0;

    private static void increase () {
        int[] temporary = new int[array.length];
        for(int a = 0; a < array.length; a++) temporary[a] = array[a];
        array = new int[temporary.length + 4];
        for(int b = 0; b < temporary.length; b++) array[b] = temporary[b];
        array[tail] = value;
        tail++;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;

        System.out.println("Enter an integer or \"end\":");

        while(!(command = input.nextLine()).equalsIgnoreCase("end")){
            try {
                value = Integer.parseInt(command);
                if(tail < array.length) {
                    array[tail] = value;
                    tail++;
                }
                else {
                    increase();
                }
            }
            catch (NumberFormatException ex) {
                System.out.println("This isn't an integer.");
            }
            System.out.println("Enter an integer or \"end\":");
        }

        for(int c = 0; c < tail; c++) {
            if(c < tail - 1) System.out.print(array[c] + ", ");
            else System.out.println(array[c]);
        }
    }
}
