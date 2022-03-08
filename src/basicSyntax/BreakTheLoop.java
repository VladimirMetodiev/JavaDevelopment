package basicSyntax;

import java.util.Scanner;

public class BreakTheLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int searchNumber = Integer.parseInt(input.nextLine());

        boolean foundIt = false;

        for (int a = start; a <= end; a++) {
            if (a == searchNumber) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.printf("Found the number %d%n", searchNumber);
        }
        else {
            System.out.println("There isn't such number");
        }
    }
}
