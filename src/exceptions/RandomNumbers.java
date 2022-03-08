package exceptions;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private static Object[] obj = new Object[]{1, 2, "three", 4, 5, 6, "seven", 8, 9, 10};

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        int number, index;

        for (int a = 1; a <= 10; a++) {

            try {
                try {
                    index = random.nextInt(12);
                    number = (int)obj[index];
                    numbers.add(number);
                }
                catch (ArrayIndexOutOfBoundsException ex1) {
                    System.out.println("Description: " + ex1);
                }
            }
            catch (Exception ex2) {
                System.out.println("Description: " + ex2);
            }
            finally {
                System.out.printf("%d random numbers was recorded.%n", a);
            }
        }
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
