package oopExercises.nextSecond;

import java.util.Arrays;
import java.util.Scanner;

public class AddSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;

        getMessage();
        while(!(command = input.nextLine()).equals("end")) {
            try {
                int[] data = Arrays.stream(command.split(":")).mapToInt(Integer::parseInt).toArray();
                NextSecond time = new NextSecond(data[0], data[1], data[2]);

                System.out.println("Enter seconds:");
                int seconds = Integer.parseInt(input.nextLine());
                for(int a = 0; a < seconds; a++) time.addOneSecond();

                System.out.println(time);
                getMessage();
            }
            catch (NumberFormatException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException ex) {
                System.out.println("Incomplete time!");
            }
            catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

    private static void getMessage() {
        System.out.println("Please, enter an hour, minutes and seconds separated by a colon or \"end\":");
    }
}
