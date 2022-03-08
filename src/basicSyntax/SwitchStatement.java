package basicSyntax;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aDay;
        aDay = input.nextInt();

        switch (aDay) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("There isn't such day.");
                break;
            }
        }
    }
}
