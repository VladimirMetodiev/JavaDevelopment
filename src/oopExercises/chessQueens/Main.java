package oopExercises.chessQueens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<ChessQueens> queens = new ArrayList<>();

        for (int a = 0; a < 8; a++) {
            String[] data = input.nextLine().split("\\s+");
            queens.add(new ChessQueens(Integer.parseInt(data[0]), Integer.parseInt(data[1])));
        }

        boolean flag = false;

        for (int e = 0; e < queens.size(); e++) {
            for (int f = e + 1; f < queens.size(); f++) {
                if(queens.get(e).beat(queens.get(f).getX(), queens.get(f).getY())) {
                    flag = true;
                    break;
                }
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}



//Условие

//Известно е, че 8 царици могат да бъдат поставени на шахматна дъска 8х8, така че нито една да не биe, която и да било друга царица.
//Получавате подредбата на 8 царици на шахматната дъска, определете дали има двойка от тях, които се бият една друга.

//Входни данни
//Получавате на осем реда, по една двойки числа, разделени с интервал. Всяко число е от 1 до 8 и представлява координатите
//на една от цариците върху шахматната дъска.

//Изход
//Ако няма нито една двойка царици, които се бият една друга, отпечатайте NO, в противен случай отпечатайте YES.



//Тестове

//1 7
//2 4
//3 2
//4 8
//5 6
//6 1
//7 3
//8 5
//NO

//1 8
//2 7
//3 6
//4 5
//5 4
//6 3
//7 2
//8 1
//YES

