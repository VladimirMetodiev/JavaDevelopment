package basicSyntaxExercises;

import java.util.Scanner;

public class PublicTransport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int planned = Integer.parseInt(input.nextLine());

        int countOfTickets1 = 0, countOfTickets2 = 0,  countOfTickets3 = 0;

        while(planned > 0) {
            if(planned >= 60) {
                countOfTickets3 += 1;
                planned -= 60;
            }
            else if(planned > 34) {
                countOfTickets3 += 1;
                planned -= 60;
            }
            else if(planned > 30) {
                countOfTickets1 += planned % 10;
                planned -= planned % 10;
                countOfTickets2 += planned / 10;
                planned -= planned;
            }
            else if(planned >= 9) {
                countOfTickets2 += 1;
                planned -= 10;
            }
            else {
                countOfTickets1 += planned;
                planned -= planned;
            }
        }

        System.out.printf("%d %d %d", countOfTickets1, countOfTickets2, countOfTickets3);
    }
}



//Условие

//В България през 90-те години на 20 век, парите губят покупателна стойност, заради хипер-инфлация. В софийският градски транспорт,
//билет за едно пътуване струва 15 лева, билет (талон) за 10 пътувания струва 125 лева, билет (талон) за 60 пътувания струва 440 лева.
//Един пътникът планира да направи n пътувания. Определете колко билета от всеки тип трябва да закупи, така че общият брой на
//платените пътувания да не е по-малък от n, а общата цена на закупените билети да е минимална.

//Входни данни
//Дадено е едно положително, цяло число n - броят на пътуванията.

//Изход
//Отпечатайте три цели числа, равни на необходимия брой билети за 1, 10, 60 пътувания.



//Тестове

//5
//5 0 0

//8
//8 0 0

//9
//0 1 0

//8
//8 1 0

//19
//0 2 0

//32
//2 3 0

//50
//0 0 1

//129
//0 1 2
