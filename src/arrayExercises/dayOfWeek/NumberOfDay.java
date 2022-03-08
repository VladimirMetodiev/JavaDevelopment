package arrayExercises.dayOfWeek;

import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String day = userInput.nextLine();

        switch (day){
            case "Monday": System.out.println(Days.Monday.getDay()); break;
            case "Tuesday": System.out.println(Days.Tuesday.getDay()); break;
            case "Wednesday": System.out.println(Days.Wednesday.getDay()); break;
            case "Thursday": System.out.println(Days.Thursday.getDay()); break;
            case "Friday": System.out.println(Days.Friday.getDay()); break;
            case "Saturday": System.out.println(Days.Saturday.getDay()); break;
            case "Sunday": System.out.println(Days.Sunday.getDay()); break;
            default: System.out.println("Invalid day!"); break;
        }
    }
}
