package basicSyntaxExercises;

import java.util.Scanner;

public class SecondAppearance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();

        if (!data.contains("f")) {
            System.out.println(-2);
        }
        else {
            // ДА ОБЪРНА ВНИМАНИЕ
            if (data.indexOf("f", data.indexOf("f") + 1) == -1) {
                System.out.println(-1);
            }
            else {
                System.out.println(data.indexOf("f", data.indexOf("f") + 1));
            }
        }
    }
}



//Условие

//Даден е символен низ. Намерете второто появяване на буквата f в този символен низ и отпечатайте индекса на това появяване.
//Ако буквата f се среща само веднъж в дадения низ, отпечатайте числото -1, а ако не се среща нито веднъж, отпечатайте числото -2.



//Тестове

//rabbit
//-2

//comfort
//-1

//fragrant pears
//-1

//coffee
//3

//office
//2

//five factories
//5



//Моето второ решение

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String data = input.next();
//        System.out.println(!data.contains("f") ? -2 : data.indexOf("f", data.indexOf("f") + 1));
//    }


