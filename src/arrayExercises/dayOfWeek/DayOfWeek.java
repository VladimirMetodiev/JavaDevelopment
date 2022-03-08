package arrayExercises.dayOfWeek;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int day = Integer.parseInt(userInput.nextLine());

        switch (day){
            case 1: System.out.println(Days.Monday); break;
            case 2: System.out.println(Days.Tuesday); break;
            case 3: System.out.println(Days.Wednesday); break;
            case 4: System.out.println(Days.Thursday); break;
            case 5: System.out.println(Days.Friday); break;
            case 6: System.out.println(Days.Saturday); break;
            case 7: System.out.println(Days.Sunday); break;
            default: System.out.println("Invalid day!"); break;
        }
    }
}
