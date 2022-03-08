package basicSyntax;

import java.util.Scanner;

public class CheckIfInputIsInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();

        try {
            Integer.parseInt(data);
            System.out.println(data + " is a valid integer");
        }
        catch (NumberFormatException ex) {
            System.out.println(data + " is not a valid integer");
        }


        System.out.println("---------->---------->---------->");


        if (input.hasNextInt()) {
            System.out.println(Integer.parseInt(input.nextLine()) + " is a valid integer");
        }
        else {
            System.out.println(input.nextLine() + " is not a valid integer");
        }


        System.out.println("---------->---------->---------->");


        data = input.nextLine().trim();
        boolean flag = true;

        for (int a = 0; a < data.length(); a++) {
            if (a == 0 && data.charAt(a) == '-') {
                continue;
            }

            if (!Character.isDigit(data.charAt(a))) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(data + " is a valid integer");
        }
        else {
            System.out.println(data + " is not a valid integer");
        }
    }
}
