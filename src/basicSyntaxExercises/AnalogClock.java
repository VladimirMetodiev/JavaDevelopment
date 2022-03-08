package basicSyntaxExercises;

import java.util.Scanner;

public class AnalogClock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double data = Double.parseDouble(input.nextLine());

        if(data >= 0.5) {
            int hours = (int)data / 30;
            int minutes = (int)((data - hours * 30) * 2.0);
            System.out.printf("%02d:%02d", hours, minutes);
        }
        else {
            System.out.println("12:00");
        }
    }
}



//Условие

//Ако приемем, че началото на часовниковата скала е 12 часът, часовата стрелка се премества на d градуса от началото.
//Определете колко цели часа h и цели минути m е часа.

//Входни данни
//Въвежда се цяло число d (0 <= d < 360).

//Изход
//Принтирайте часа.



//Тестове

//0.5
//00:01

//36.5
//01:13

//37
//01:14

//59.5
//01:59

//60
//02:00

//193
//06:26

//359.5
//11:59

//360
//12:00
