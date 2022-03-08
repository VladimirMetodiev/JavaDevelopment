package arrayExercises;

import java.util.Scanner;

public class ChessKnight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = Integer.parseInt(input.nextLine());
        int y1 = Integer.parseInt(input.nextLine());
        int x2 = Integer.parseInt(input.nextLine());
        int y2 = Integer.parseInt(input.nextLine());

        int[][] chessBoard = new int[8][8];
        chessBoard[y1 - 1][x1 - 1] = 1;
        chessBoard[y2 - 1][x2 - 1] = 1;

        boolean result = false;

        if(y1 - 2 >= 0 && x1 - 3 >= 0 && chessBoard[y1 - 2][x1 - 3] == 1) {
            result = true;
        }

        if(y1 - 3 >= 0 && x1 - 2 >= 0 && chessBoard[y1 - 3][x1 - 2] == 1) {
            result = true;
        }

        if(y1 - 2 >= 0 && x1 + 1 < 8 && chessBoard[y1 - 2][x1 + 1] == 1) {
            result = true;
        }

        if(y1 - 3 >= 0 && x1 < 8 && chessBoard[y1 - 3][x1] == 1) {
            result = true;
        }

        if(y1 < 8 && x1 - 3 >= 0 && chessBoard[y1][x1 - 3] == 1) {
            result = true;
        }

        if(y1 + 1 < 8 && x1 - 2 >= 0 && chessBoard[y1 + 1][x1 - 2] == 1) {
            result = true;
        }

        if(y1 < 8 && x1 + 1 < 8 && chessBoard[y1][x1 + 1] == 1) {
            result = true;
        }

        if(y1 + 1 < 8 && x1 < 8 && chessBoard[y1 + 1][x1] == 1) {
            result = true;
        }

        if(result) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}



//Condition

//Имаме шахматна дъска. Трябва да определим дали коня (knight), стоящ на полето с указаните координати (номер на ред и номер на колона),
//бие фигура, стояща на друго поле с указани координати.

//Входни данни
//Въвеждат се четири числа: координатите на коня и координатите на друга фигура, всички координати са цели числа в диапазона от 1 до 8.

//Изход
//Програмата трябва да изведе YES, ако конят може да победи другата фигура с 1 ход, в противен случай, се извежда NO.



//Solution

//    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//        int x1 = Integer.parseInt(input.nextLine());
//        int y1 = Integer.parseInt(input.nextLine());
//        int x2 = Integer.parseInt(input.nextLine());
//        int y2 = Integer.parseInt(input.nextLine());
//
//        boolean doesItFight = Math.abs(x2 - x1) * Math.abs(y2 - y1) == 2;
//        System.out.println(doesItFight ? "YES" : "NO");
//    }
