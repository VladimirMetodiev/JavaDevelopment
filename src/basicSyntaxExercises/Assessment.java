package basicSyntaxExercises;

import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = Integer.parseInt(input.nextLine());

        if(value < 0 || value > 100) {
            System.out.println("Wrong value!");
        }
        else if(value < 16) {
            System.out.println("Weak");
        }
        else if(value < 36) {
            System.out.println("Good");
        }
        else if(value < 56) {
            System.out.println("Confirmed expectations");
        }
        else if(value < 76) {
            System.out.println("Exceeded expectations");
        }
        else {
            System.out.println("Excellent");
        }
    }
}
