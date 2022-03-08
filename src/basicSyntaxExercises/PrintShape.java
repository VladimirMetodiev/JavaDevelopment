package basicSyntaxExercises;

import java.util.Scanner;

public class PrintShape {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        getMessage();
        int command = Integer.parseInt(input.nextLine().trim().toLowerCase());

        while (true) {
            if(command == 5) {
                break;
            }

            switch (command) {
                case 1: printRectangle(getLength(), getHeight()); break;
                case 2: printRightAngledTriangle (getLength()); break;
                case 3: printIsoscelesTriangle(); break;
                case 4: printRhombus(getLength()); break;
                default: System.out.println("There isn't such number."); break;
            }

            getMessage();
            command = Integer.parseInt(input.nextLine().trim().toLowerCase());
        }


    }

    static void getMessage() {
        System.out.println("Choose the number of shape: \"rectangle\" (1), \"right-angled triangle\" (2), \"isosceles triangle\" (3), \"rhombus\" (4) or \"end\" (5)");
    }

    static int getLength() {
        int length = -1;
        while (length < 2) {
            System.out.println("Enter length:");
            length = Integer.parseInt(input.nextLine());
            if(length < 2) {
                System.out.println("Wrong length!");
            }
        }
        return length;
    }

    static int getHeight() {
        int height = -1;
        while (height < 2) {
            System.out.println("Enter height:");
            height = Integer.parseInt(input.nextLine());
            if(height < 2) {
                System.out.println("Wrong height!");
            }
        }
        return height;
    }

    static void printRectangle (int a, int h) {
        for (int b = 0; b < a; b++) {
            System.out.print("*");
        }
        System.out.println();

        for (int c = 0; c < h - 2; c++) {
            System.out.print("*");
            for (int d = 0; d < a - 2; d++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int b = 0; b < a; b++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printRightAngledTriangle (int a) {
        for (int b = 1; b <= a; b++) {
            for (int c = 0; c < (b < a ? b : a); c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printIsoscelesTriangle() {
        int num = 2;
        while(num % 2 == 0 || num <= 1) {
            System.out.println("Enter an odd number:");
            num = Integer.parseInt(input.nextLine());
            if(num < 3) {
                System.out.println("The number is less than 3");
                continue;
            }
            if(num % 2 == 0) {
                System.out.println("This is an even number. Please, enter an odd number.");
            }
        }

        for (int rows = 1; rows <= num; rows++) {
            for (int spaces = num - rows - 1; spaces >= 0; spaces--) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < rows; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printRhombus(int a) {
        for (int rows = a; rows >= 1; rows--) {
            for (int spaces = 0; spaces < rows - 1; spaces++) {
                System.out.print(" ");
            }
            if(rows == 1 || rows == a) {
                printLine(a);
            }
            else {
                System.out.print("* ");
                for (int b = 0; b < (a - 2) * 2; b++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

    static void printLine(int a) {
        for (int b = 0; b < a; b++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
