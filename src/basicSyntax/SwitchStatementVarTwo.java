package basicSyntax;

import java.util.Scanner;

public class SwitchStatementVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aDay = input.nextInt();

        switch (aDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Workday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("There isn't such day.");
                break;
        }
    }
}
