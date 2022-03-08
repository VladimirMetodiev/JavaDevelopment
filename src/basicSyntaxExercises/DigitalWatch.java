package basicSyntaxExercises;

import java.util.Scanner;

public class DigitalWatch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int minutes = number % 60;
        number -= minutes;

        while(number > 1440) {
            number -= 24 * 60;
        }

        int hours = number / 60;

        System.out.printf("%d:%02d%n", hours == 24 ? 0 : hours, minutes);
    }
}



//Tests

//1
//0:01

//320
//5:20

//150
//2:30

//1441
//0:01

//7679
//7:59



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int minutes = Integer.parseInt(input.nextLine()) % 1440;
//        System.out.printf("%d:%02d", minutes / 60, minutes % 60);
//    }

