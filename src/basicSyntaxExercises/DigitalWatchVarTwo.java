package basicSyntaxExercises;

import java.util.Scanner;

public class DigitalWatchVarTwo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int data = Integer.parseInt(input.nextLine());
        int seconds = data % 60;
        data = (data - seconds) / 60;
        int minutes = data % 60;
        int hours = (data - minutes) / 60;

        while(hours > 24) {
            hours -= 24;
        }

        System.out.printf("%d:%02d:%02d%n", hours == 24 ? 0 : hours, minutes, seconds);
    }
}



//Условие

//Електронният часовник показва времето във формат h:mm:ss, т.е. първо се записва количеството на часовете, след това
//минутите - задължително в двуцифрен формат, след това секундите, отново задължително в двуцифрен формат.
//Минутите и секундите се допълва до двуцифрен формат с нула отпред, когато е необходимо.

//Като вход се подават N изминали секунди от началото на дененонощието. Принтирайте показваното от часовника време.



//Tests

//3615
//1:00:15

//33254
//9:14:14

//152999
//18:29:59
