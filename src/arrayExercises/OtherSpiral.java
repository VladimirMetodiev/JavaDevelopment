package arrayExercises;

import java.util.Scanner;

public class OtherSpiral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int[][] matrix = new int[number][number];

        int right = number, down = number - 1, left = number - 1, up = number - 3, row = 0, col = 0;

        while (true) {
            for (int a = 0; a < right; a++) {
                matrix[row][col] = 1;
                if(a < right - 1) ++col;
                else ++row;
            }
            if(right <= 2) {
                break;
            }
            for (int b = 0; b < down; b++) {
                matrix[row][col] = 1;
                if(b < down - 1) ++row;
                else --col;
            }
            for (int e = 0; e < left; e++) {
                matrix[row][col] = 1;
                if(e < left - 1) --col;
                else --row;
            }
            if(left == 2) {
                break;
            }
            for (int f = 0; f < up; f++) {
                matrix[row][col] = 1;
                if(f < up - 1) --row;
                else ++col;
            }
            right -= col == 1 ? 3 : 4;
            down -= 4;
            left -= 4;
            up -= 4;
        }

        for(int[] arr : matrix) {
            for(int a : arr) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}



//Условие

//Дадено е едно нечетно, положително, цяло число N (1 <= N <= 49). Създайте матрица с N реда и N колони. Запълнете я с 1-ци,
//по спирала, започвайки от горния ляв ъгъл и по посока на часовниковата стрелка. Между съседните извивки на спилата от 1-ци,
//трябва да остане спирала от нули. Принтирайте матрицата, като между извежданите числа не трябва да има интервали. Всеки ред
//от матрицата, трябва да бъде принтиран на нов ред.



//Тестове

//1
//1

//3
//111
//001
//111

//5
//11111
//00001
//11101
//10001
//11111

//7
//1111111
//0000001
//1111101
//1000101
//1011101
//1000001
//1111111

//9
//111111111
//000000001
//111111101
//100000101
//101110101
//101000101
//101111101
//100000001
//111111111

//11
//11111111111
//00000000001
//11111111101
//10000000101
//10111110101
//10100010101
//10101110101
//10100000101
//10111111101
//10000000001
//11111111111



//Моето първо решение

//public class OtherSpiral {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        if(number == 1) {
//            System.out.println(1);
//            return;
//        }
//
//        int[][] matrix = new int[number][number];
//
//        int row = 0, column = 0;
//        String direction = "right";
//
//        while (true) {
//            if(direction.equals("right")) {
//                matrix[row][column] = 1;
//                if(matrix[row][number - 1] == 0 && column + 1 < number - 1) {
//                    ++column;
//                }
//                else if(matrix[row][number - 1] == 0 && column + 1 == number - 1) {
//                    ++column;
//                    matrix[row][column] = 1;
//                    direction = "down";
//                    ++row;
//                }
//                else {
//                    if(matrix[row][column + 2] != 1) {
//                        ++column;
//                    }
//                    else {
//                        direction = "down";
//                        if(checkForEnd(direction, row, column, matrix)) break;
//                        ++row;
//                    }
//                }
//            }
//            else if(direction.equals("down")) {
//                matrix[row][column] = 1;
//                if(matrix[number - 1][column] == 0 && row + 1 < number - 1) {
//                    ++row;
//                }
//                else if(matrix[number - 1][column] == 0 && row + 1 == number - 1) {
//                    ++row;
//                    matrix[row][column] = 1;
//                    direction = "left";
//                    --column;
//                }
//                else {
//                    if(matrix[row + 2][column] != 1) {
//                        ++row;
//                    }
//                    else {
//                        direction = "left";
//                        if(checkForEnd(direction, row, column, matrix)) break;
//                        --column;
//                    }
//                }
//            }
//            else if(direction.equals("left")) {
//                matrix[row][column] = 1;
//                if(matrix[row][0] == 0 && column - 1 > 0) {
//                    --column;
//                }
//                else if(matrix[row][0] == 0 && column - 1 == 0) {
//                    --column;
//                    matrix[row][column] = 1;
//                    direction = "up";
//                    --row;
//                }
//                else {
//                    if(matrix[row][column - 2] != 1) {
//                        --column;
//                    }
//                    else {
//                        direction = "up";
//                        if(checkForEnd(direction, row, column, matrix)) break;
//                        --row;
//                    }
//                }
//            }
//            else if(direction.equals("up")) {
//                if(number > 3) matrix[row][column] = 1;
//                if(row - 2 > 0 && matrix[row - 2][column] != 1) {
//                    --row;
//                }
//                else {
//                    direction = "right";
//                    if(checkForEnd(direction, row, column, matrix)) break;
//                    ++column;
//                }
//            }
//        }
//
//        for(int[] arr : matrix) {
//            for(int a : arr) {
//                System.out.print(a);
//            }
//            System.out.println();
//        }
//    }
//
//    private static boolean checkForEnd(String dir, int row, int col, int[][] matrix) {
//        switch (dir) {
//            case "right": {
//                if(matrix[row][col + 2] != 1) {
//                    return false;
//                }
//                break;
//            }
//            case "down": {
//                if(matrix[row + 2][col] != 1) {
//                    return false;
//                }
//                break;
//            }
//            case "left": {
//                if(matrix[row][col - 2] != 1) {
//                    return false;
//                }
//                break;
//            }
//            case "up": {
//                if(matrix[row - 2][col] != 1) {
//                    return false;
//                }
//                break;
//            }
//        }
//        return true;
//    }
//}
