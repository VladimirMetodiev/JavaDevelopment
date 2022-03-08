package basicSyntax;

import java.util.ArrayList;
import java.util.Scanner;

public class TheSwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Example 1");

        System.out.println("\nEnter some number from 0 to 9:");
        int choice = Integer.parseInt(input.nextLine());

        switch (choice){
            case 0: System.out.println("Your choice is zero."); break;
            case 1: System.out.println("Your choice is one."); break;
            case 2: System.out.println("Your choice is two."); break;
            case 3: System.out.println("Your choice is three."); break;
            case 4: System.out.println("Your choice is four"); break;
            case 5: System.out.println("Your choice is five."); break;
            case 6: System.out.println("Your choice is six."); break;
            case 7: System.out.println("Your choice is seven."); break;
            case 8: System.out.println("Your choice is eight."); break;
            case 9: System.out.println("Your choice is nine."); break;
            default: System.out.println("There isn't such choice!"); break;
        }


        System.out.println("\nExample 2");

        System.out.println("\nEnter some day of week:");
        String dayOfWeek = input.nextLine().toLowerCase();

        switch(dayOfWeek){
            case "monday": System.out.println("This is the first day of week."); break;
            case "tuesday": System.out.println("This is the second day of week."); break;
            case "wednesday": System.out.println("This is the third day of week."); break;
            case "thursday": System.out.println("This is the fourth day of week."); break;
            case "friday": System.out.println("This is the fifth day of week."); break;
            case "saturday": System.out.println("This is the sixth day of week."); break;
            case "sunday": System.out.println("This is the seventh day of week."); break;
            default: System.out.println("Wrong data!"); break;
        }


        System.out.println("\nExample 3");

        System.out.println("\nEnter player's number from 1 to 10:");
        int player = Integer.parseInt(input.nextLine());

        ArrayList<String> players = new ArrayList<>();

        switch (player){
            case 1: players.add("Konstantin");
            case 2: players.add("Philip");
            case 3: players.add("John");
            case 4: players.add("Mario");
            case 5: players.add("Ema");
            case 6: players.add("Vladimir");
            case 7: players.add("Teodor");
            case 8: players.add("Gabriela");
            case 9: players.add("Jose");
            case 10: players.add("Alex"); break;
            default: System.out.println("There isn't such player!"); break;
        }


        if(!players.isEmpty()) {
            System.out.print("The selected players are: ");
            players.forEach(e -> System.out.print(e + "; "));
            System.out.println("\n");
        }
        else{
            System.out.println("There aren't any players!\n");
        }


        System.out.println("Example 4");

        System.out.println("\nEnter some number from 1 to 20:");
        choice = Integer.parseInt(input.nextLine());

        switch (choice){
            case 1: case 3: case 5: case 7: case 9: case 11: case 13: case 15: case 17: case 19:
                System.out.println("Odd number");
                break;
            case 2: case 4: case 6: case 8: case 10: case 12: case 14: case 16: case 18: case 20:
                System.out.println("Even number");
                break;
            default:
                System.out.println("There isn't such choice!");
                break;
        }
    }
}
