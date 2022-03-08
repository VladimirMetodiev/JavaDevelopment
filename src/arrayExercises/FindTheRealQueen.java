package arrayExercises;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] matrix = new char[8][8];

        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                matrix[a][b] = input.next().charAt(0);
            }
            input.nextLine();
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if(matrix[row][column] == 'q') {
                    if(checkRowsUp(matrix, row, column) &&
                            checkRowsDown(matrix, row, column) &&
                            checkColumnsLeft(matrix, row, column) &&
                            checkColumnsRight(matrix, row, column) &&
                            checkUpLeft(matrix, row, column) &&
                            checkUpRight(matrix, row, column) &&
                            checkDownLeft(matrix, row, column) &&
                            checkDownRight(matrix, row, column)) {
                        System.out.println(row + " " + column);
                    }
                }
            }
        }
    }

    private static boolean checkRowsUp(char[][] matrix, int row, int column){
        for(int index = row - 1; index >= 0; index--){
            if(matrix[index][column] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkRowsDown(char[][] matrix, int row, int column){
        for (int index = row + 1; index < 8; index++) {
            if(matrix[index][column] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkColumnsLeft(char[][] matrix, int row, int column){
        for (int index = column - 1; index >= 0; index--) {
            if(matrix[row][index] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkColumnsRight(char[][] matrix, int row, int column){
        for (int index = column + 1; index < 8; index++) {
            if(matrix[row][index] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkUpLeft(char[][] matrix, int row, int column){
        for(int a = row - 1, b = column - 1; (a <= b ? a : b) >= 0; a--, b--){
            if(matrix[a][b] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkUpRight(char[][] matrix, int row, int column){
        for(int index = 0; index < (row <= 8 - column - 1 ? row : 8 - column - 1); index++){
            if(matrix[row - 1 - index][column + 1 + index] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkDownLeft(char[][] matrix, int row, int column){
        for(int index = 0; index < (8 - row - 1 <= column ? 8 - row - 1 : column); index++){
            if(matrix[row + 1 + index][column - 1 - index] == 'q'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkDownRight(char[][] matrix, int row, int column){
        for(int a = row + 1, b = column + 1; (a >= b ? a : b) < 8; a++, b++){
            if(matrix[a][b] == 'q'){
                return false;
            }
        }
        return true;
    }
}



//Condition

//Write a program that reads (8 x 8) matrix of characters from the console. The matrix represents a chess board with figures on it.
//The figures can be - queens as char 'q' or any other ASCII symbol. There will be more than one queen but only one queen
//will have valid position, which is not attacked from any other queen and does not attack any other queen. In other word
//in the way of the valid queen there are no other queens, but there may be any other ASCII symbol. Your task is
//to read the chessboard and find the position of the valid queen. According to chess rules the queen can attack
//all the cells in horizontal vertical and both diagonals which cross the queen position.



//Tests

//p a p a p a p a
//p a p a p a p a
//p a q a p a q a
//p a p a p a p a
//p a p q p a p a
//p a p a p a p a
//p a q a p a q a
//p a p a p a p a
//4 3

//1 q q q 1 q q q
//q 1 q q 1 q q 1
//q q 1 q 1 q 1 q
//q q q 1 1 1 q q
//1 1 1 1 q 1 1 1
//q q q 1 1 1 q q
//q q 1 q 1 q 1 q
//q 1 q q 1 q q 1
//4 4
