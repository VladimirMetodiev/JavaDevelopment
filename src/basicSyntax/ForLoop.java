package basicSyntax;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Example 1");

        int number = Integer.parseInt(input.nextLine());

        for (int a = 0; a < number; a++) {
            System.out.printf("Count is: %d%n", a + 1);
        }


        System.out.println("\nExample 2");

        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());

        for (int b = x; b <= y; b++) {
            if(b < y) System.out.print(b + " ");
            else System.out.println(b);
        }

        for (int c = x; c <= y; c++) {
            if(c % 2 != 0) {
                if(c < y) System.out.print(c + " ");
                else System.out.println(c);
            }
        }
    }
}
