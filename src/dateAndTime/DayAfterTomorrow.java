package dateAndTime;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class DayAfterTomorrow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        LocalDate date = LocalDate.of(arr[2], arr[1], arr[0]);
        date = date.plusDays(2);
        System.out.printf("%d %d %d", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }
}



//Условие

//По зададена дата, трябва да се определи, каква дата ще бъде вдругиден.



//Тестове

//1 5 1998
//3 5 1998

//22 12 2010
//24 12 2010
