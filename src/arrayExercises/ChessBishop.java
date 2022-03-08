package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ChessBishop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = Integer.parseInt(input.nextLine());
        int y1 = Integer.parseInt(input.nextLine());
        int x2 = Integer.parseInt(input.nextLine());
        int y2 = Integer.parseInt(input.nextLine());

        int[][] chessBoard = new int[8][8];
        chessBoard[x1 - 1][y1 - 1] = 1;
        chessBoard[x2 - 1][y2 - 1] = 1;

        if(checkTheFirstDiagonal(chessBoard, x1 - 1, y1 - 1) || checkTheSecondDiagonal(chessBoard, x1 - 1, y1 - 1)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    static boolean checkTheFirstDiagonal(int[][] chessBoard, int x1, int y1) {
        boolean isThereAChessPiece = false;
        int bX = x1, bY = y1;

        while(true) {
            --bX;
            --bY;

            if(bX < 0 || bY < 0) {
                break;
            }

            if(chessBoard[bX][bY] == 1) {
                return true;
            }
        }

        bX = x1;
        bY = y1;

        while(true) {
            ++bX;
            ++bY;

            if(bX == 8 || bY == 8) {
                break;
            }

            if(chessBoard[bX][bY] == 1) {
                return true;
            }
        }

        return isThereAChessPiece;
    }

    static boolean checkTheSecondDiagonal(int[][] chessBoard, int x1, int y1) {
        boolean isThereAChessPiece = false;
        int bX = x1, bY = y1;

        while(true) {
            ++bX;
            --bY;

            if(bX == 8 || bY < 0)
                break;

            if(chessBoard[bX][bY] == 1)
                return true;
        }

        bX = x1;
        bY = y1;

        while(true) {
            --bX;
            ++bY;

            if(bX < 0 || bY == 8)
                break;

            if(chessBoard[bX][bY] == 1)
                return true;
        }

        return isThereAChessPiece;
    }

    static void display(int[][] chessBoard) {
        for(int[] arr : chessBoard) {
            System.out.println(Arrays.toString(arr));
        }
    }
}



//Condition

//Имаме шахматна дъска. Необходимо е да се определи дали офицерът (bishop), стоящ на квадрат с указани координати (номер на ред и номер на колона)
//бие фигура, стояща на друго указано поле.

//Входни данни
//Въвеждат се четири числа: координатите на офицера и координатите на другата фигура. Координатите са цели числа, в диапазона от 1 до 8.

//Изход
//Трябва да принтирам YES, ако офицерът е в състояние да победи друга фигура с указаните координати, с 1 ход,
//в противен случай трябва да принтирам NO.



//Alternative solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int x1 = input.nextInt();
//        int y1 = input.nextInt();
//        int x2 = input.nextInt();
//        int y2 = input.nextInt();
//
//        System.out.println(Math.abs(x1 - x2) == Math.abs(y1- y2) ? "YES" : "NO");
//    }
