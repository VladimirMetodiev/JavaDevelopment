package algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static algorithms.Support.printTheArray;

public class RealNumberGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = Integer.parseInt(input.nextLine());

        double[] realNumbers = new double[number];

        Random random = new Random();

        for(int a = 0; a < number; a++) {
            realNumbers[a] = random.nextDouble() * random.nextInt(choose(number));
        }

        printTheArray(realNumbers);
        printTheNumbersRounded(realNumbers);
        Arrays.sort(realNumbers);
        printTheArray(realNumbers);
        printTheNumbersRounded(realNumbers);
    }

    private static void printTheNumbersRounded(double[] arr) {
        for(int b = 0; b < arr.length; b++) {
            if(b < arr.length - 1) System.out.printf("%.2f ", arr[b]);
            else System.out.printf("%.2f%n", arr[b]);
        }
    }

    private static int choose(int number) {
        if(number < 51) return 101;
        else if(number < 101) return 501;
        else return 1001;
    }
}
