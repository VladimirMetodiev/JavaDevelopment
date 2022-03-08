package oopExercises.mood;

import java.util.Scanner;

public class MyMood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day of week:");
        String day = input.nextLine().toLowerCase();

        Weekdays weekday = Weekdays.UNKNOWN;

        switch (day) {
            case "monday": weekday = Weekdays.MONDAY; break;
            case "tuesday": weekday = Weekdays.TUESDAY; break;
            case "wednesday": weekday = Weekdays.WEDNESDAY; break;
            case "thursday": weekday = Weekdays.THURSDAY; break;
            case "friday": weekday = Weekdays.FRIDAY; break;
            case "saturday": weekday = Weekdays.SATURDAY; break;
            case "sunday": weekday = Weekdays.SUNDAY; break;
            default: System.out.println("There isn't such day."); break;
        }

        if(!weekday.getMood().equals("unknown")) System.out.println("My mood is " + weekday.getMood() + ".");
    }
}
