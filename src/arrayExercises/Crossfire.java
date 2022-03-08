package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

/*
 * "Houston, we have a problem!" разполагам с няколко примера за изходящият резултат, които си противоречат.
 * Ако съдя по единият пример, за ВЗРИВЕНИТЕ числа, не трябва да принтирам нищо (те изчезват), а ако на същият ред има още числа да принтирам тях.
 * Ако съдя по другият пример, за едноцифрените ВЗРИВЕНИ числа, трябва да принтирам 1 интервал, за двуцифрените 2, за трицифрените 3 и т.н.
 * @author Vladimir Metodiev
 * @version 2.1
 */

public class Crossfire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = Integer.parseInt(input.nextLine().trim());

        int[][] matrix = new int[x][y];
        int counter = 1;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter++;
            }
        }

        String command;

        while(!(command = input.nextLine()).equals("Nuke it from orbit")) {
            int[] data = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[data[0]][data[1]] = -1;

            for (int a = 1; a <= data[2]; a++) {
                try {
                    matrix[data[0] - a][data[1]] = -1;
                } catch (Exception ex) {
                    System.out.print("");
                }
                try {
                    matrix[data[0] + a][data[1]] = -1;
                } catch (Exception ex) {
                    System.out.print("");
                }
                try {
                    matrix[data[0]][data[1] - a] = -1;
                } catch (Exception ex) {
                    System.out.print("");
                }
                try {
                    matrix[data[0]][data[1] + a] = -1;
                } catch (Exception ex) {
                    System.out.print("");
                }
            }
            remove(matrix);
        }

        for (int f = 0; f < matrix.length; f++) {
            for (int g = 0; g < matrix[f].length; g++) {
                if(matrix[f][g] > 0) System.out.print(matrix[f][g] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] remove(int[][] matrix) {
        for (int m = 0; m < matrix.length; m++) {
            int[] current = new int[matrix[m].length];
            int counter = 0;
            for (int n = 0; n < matrix[m].length; n++) {
                if(matrix[m][n] > 0) {
                    current[counter] = matrix[m][n];
                    counter++;
                }
            }
            matrix[m] = current;
        }
        return matrix;
    }
}



//Condition

//You will receive two integers which represent the dimensions of a matrix. Then, you must fill the matrix with increasing
//integers starting from 1, and continuing on every row, like this:
//first row: 1, 2, 3, …, n
//second row: n + 1, n + 2, n + 3, …, n + n
//third row: 2 * n + 1, 2 * n + 2, …, 2 * n + n
//You will also receive several commands in the form of 3 integers separated by a space. Those 3 integers will represent
//a row in the matrix, a column and a radius. You must then destroy the cells which correspond to those arguments cross-like.
//Destroying a cell means that, that cell becomes completely nonexistent in the matrix. Destroying cells cross-like means that
//you form a cross figure with center point - equal to the cell with coordinates – the given row and column, and lines
//with length equal to the given radius. See the examples for more info.
//The input ends when you receive the command “Nuke it from orbit”. When that happens, you must print what has remained from the initial matrix.

//Input
//>>> On the first line you will receive the dimensions of the matrix. You must then fill the matrix according to those dimensions
//>>> On the next several lines you will begin receiving 3 integers separated by a single space, which represent the row, col and radius.
//You must then destroy cells according to those coordinates
//>>> When you receive the command “Nuke it from orbit” the input ends

//Output
//>>> The output is simple. You must print what is left from the matrix
//>>> Every row must be printed on a new line and every column of a row - separated by a space

//Constraints
//>>> The dimensions of the matrix will be integers in the range [2, 100]
//>>> The given rows and columns will be valid integers in the range [-2^31 + 1, 2^31 - 1]
//>>>  The radius will be in range [0, 2^31 - 1]
//>>> Allowed time/memory: 250ms/16MB



//Tests

//5 5
//3 3 2
//4 3 2
//Nuke it from orbit


//5 5
//4 4 4
//Nuke it from orbit


//10 10
//2 3 2
//3 6 5
//7 4 3
//Nuke it from orbit



//Solution

/*
 * @author Vladimir Metodiev
 * @version 1.1
 */

//public class Crossfire {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();
//        int y = Integer.parseInt(input.nextLine().trim());
//
//        int[][] matrix = new int[x][y];
//        int counter = 1;
//
//        for(int i = 0; i < matrix.length; i++) {
//            for(int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = counter++;
//            }
//        }
//
//        String command;
//
//        while(!(command = input.nextLine()).equals("Nuke it from orbit")) {
//            int[] data = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
//            matrix[data[0]][data[1]] = -1;
//
//            for (int a = 1; a <= data[2]; a++) {
//                try {
//                    matrix[data[0] - a][data[1]] = -1;
//                } catch (Exception ex) {
//                    System.out.print("");
//                }
//                try {
//                    matrix[data[0] + a][data[1]] = -1;
//                } catch (Exception ex) {
//                    System.out.print("");
//                }
//                try {
//                    matrix[data[0]][data[1] - a] = -1;
//                } catch (Exception ex) {
//                    System.out.print("");
//                }
//                try {
//                    matrix[data[0]][data[1] + a] = -1;
//                } catch (Exception ex) {
//                    System.out.print("");
//                }
//            }
//        }
//
//        counter = 1;
//
//        for (int b = 0; b < matrix.length; b++) {
//            for (int e = 0; e < matrix[b].length; e++) {
//                if(matrix[b][e] == -1) {
//                    for (int f = 0; f <= ("" + counter).length(); f++) {
//                        System.out.print(" ");
//                    }
//                }
//                else {
//                    System.out.print(matrix[b][e] + " ");
//                }
//                counter++;
//            }
//            System.out.println();
//        }
//    }
//}
