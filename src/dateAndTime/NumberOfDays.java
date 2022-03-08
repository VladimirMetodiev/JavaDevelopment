package dateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();

        int day = Integer.parseInt(data.substring(0, 2));
        int month = Integer.parseInt(data.substring(2, 4));
        int year = Integer.parseInt(data.substring(4));

        LocalDate beginning = LocalDate.of(1, 1, 1);
        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(Duration.between(beginning.atStartOfDay(), date.atStartOfDay()).toDays() + 1L);
    }
}



//Условие

//Необходимо е да се пресметне броят на дните, от началото на ерата, до зададен ден включително. За началото на ерата,
//се счита първи януари на първата година.

//Входни данни
//Получаваме датата във формат DDMMYYYY.

//Изход
//Принтирайте търсеният брой на дните.



//Тестове

//05010001
//5

//25122000
//730479
