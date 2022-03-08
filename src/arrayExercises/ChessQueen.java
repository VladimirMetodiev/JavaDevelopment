package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ChessQueen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = Integer.parseInt(input.nextLine());
        int y1 = Integer.parseInt(input.nextLine());
        int x2 = Integer.parseInt(input.nextLine());
        int y2 = Integer.parseInt(input.nextLine());

        int[][] chessBoard = new int[8][8];
        chessBoard[x1 - 1][y1 - 1] = 1;
        chessBoard[x2 - 1][y2 - 1] = 1;

        if(checkTheHorizontal(chessBoard, x1 - 1, y1 - 1) ||
                checkTheVertical(chessBoard, x1 - 1, y1 - 1) ||
                checkTheFirstDiagonal(chessBoard, x1 - 1, y1 - 1) ||
                checkTheSecondDiagonal(chessBoard, x1 - 1, y1 - 1)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    static boolean checkTheHorizontal(int[][] chessBoard, int x1, int y1) {
        boolean isThereAChessPiece = false;
        int bY = y1;

        while(true) {
            --bY;

            if(bY < 0) {
                break;
            }

            if(chessBoard[x1][bY] == 1) {
                return true;
            }
        }

        bY = y1;

        while(true) {
            ++bY;

            if(bY == 8) {
                break;
            }

            if(chessBoard[x1][bY] == 1) {
                return true;
            }
        }

        return isThereAChessPiece;
    }

    static boolean checkTheVertical(int[][] chessBoard, int x1, int y1) {
        boolean isThereAChessPiece = false;
        int bX = x1;

        while(true) {
            --bX;

            if(bX < 0) {
                break;
            }

            if(chessBoard[bX][y1] == 1) {
                return true;
            }
        }

        bX = x1;

        while(true) {
            ++bX;

            if(bX == 8) {
                break;
            }

            if(chessBoard[bX][y1] == 1) {
                return true;
            }
        }

        return isThereAChessPiece;
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

//Имаме шахматна дъска. Необходимо е да се определи дали царицата (queen), стояща на квадрат с указани координати (номер на ред и номер на колона)
//бие фигура, стояща на друго указано поле.

//Входни данни
//Въвеждат се четири числа: координатите на царицата и координатите на другата фигура. Координатите са цели числа, в диапазона от 1 до 8.

//Изход
//Трябва да принтирам YES, ако царицата е в състояние да победи друга фигура с указаните координати, с 1 ход,
//в противен случай трябва да принтирам NO.



//Tests

//3
//2
//2
//3
//YES


//3
//2
//3
//8
//YES


//3
//2
//5
//4
//YES


//3
//2
//7
//2
//YES


//3
//2
//2
//4
//NO


//3
//2
//4
//6
//NO


//3
//2
//5
//1
//NO


//3
//2
//7
//5
//NO


//3
//2
//8
//8
//NO


//4
//6
//7
//3
//YES



//My first solution

//    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//        int x1 = Integer.parseInt(input.nextLine());
//        int y1 = Integer.parseInt(input.nextLine());
//        int x2 = Integer.parseInt(input.nextLine());
//        int y2 = Integer.parseInt(input.nextLine());
//
//        System.out.println(Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2 ? "YES" : "NO");
//    }
