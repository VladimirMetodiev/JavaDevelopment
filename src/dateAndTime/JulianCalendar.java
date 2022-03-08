package dateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class JulianCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        LocalDate date = LocalDate.ofYearDay(number, number);

        if(date.lengthOfYear() == 366 && date.compareTo(LocalDate.of(number, 2, 29)) >= 0) {
            date = date.plusDays(1);
        }

        System.out.printf("%d %d", date.getDayOfMonth(), date.getMonthValue());
    }
}



//Условие

//По дадено число n от 1 до 365, определете на кой ден, от кой месец, се пада денят на НЕВИСОКОСНА година с номер n.

//Входни данни
//Дадено е едно цяло число n.

//Изход
//Програмата трябва да отпечата две числа: ден от месеца (от 1 до 31) и номер на месеца (от 1 до 12), съответстващи на деня с номер n.



//Тестове

//90
//31 3

//59
//28 2

//60
//1 3

//64
//5 3

//365
//31 12
