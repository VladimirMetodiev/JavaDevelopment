package algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static algorithms.Support.printTheArray;

public class IntegerGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = Integer.parseInt(input.nextLine());

        int[] array = new int[number];

        Random random = new Random();

        for(int a = 0; a < number; a++) {
            array[a] = random.nextInt(choose(number));
        }

        printTheArray(array);
        Arrays.sort(array);
        printTheArray(array);
    }

    private static int choose(int number) {
        if(number < 100) return 101;
        else if(number < 1000) return 1001;
        else if(number < 10000) return 10001;
        else return 100001;
    }
}
