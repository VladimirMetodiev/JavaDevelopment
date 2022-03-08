package arrayExercises;

import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = Integer.parseInt(input.nextLine().trim());

        int[][] matrix = new int[rows][columns];

        for(int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                if(b < columns - 1) matrix[a][b] = input.nextInt();
                else matrix[a][b] = Integer.parseInt(input.nextLine().trim());
            }
        }

        int currentCol = columns - 1;
        int currentRow;

        while(currentCol >= 0) {
            currentRow = rows - 1;
            for (int e = currentCol; e <= columns - 1; e++) {
                System.out.print(matrix[currentRow--][e] + " ");
                if(currentRow < 0) {
                    break;
                }
            }
            System.out.println();
            currentCol--;
        }

        currentRow = rows - 2;

        while(currentRow >= 0) {
            currentCol = 0;
            for (int f = currentRow; f >= 0; f--) {
                System.out.print(matrix[f][currentCol++] + " ");
                if(currentCol == columns) {
                    break;
                }
            }
            System.out.println();
            currentRow--;
        }
    }
}



//Input
//3 3
//21 20 18
//19 17 14
//16 13 11

//Output
//11
//13 14
//16 17 18
//19 20
//21


//Input
//3 4
//21 20 18 15
//19 17 14 12
//16 13 11 10

//Output
//10
//11 12
//13 14 15
//16 17 18
//19 20
//21


//Input
//3 5
//21 20 18 15 13
//19 17 14 12 16
//16 13 11 10 20

//Output
//20
//10 16
//11 12 13
//13 14 15
//16 17 18
//19 20
//21


//Input
//4 3
//21 20 18
//19 17 14
//16 13 11
//11 23 14

//Output
//14
//23 11
//11 13 14
//16 17 18
//19 20
//21


//Input
//5 3
//21 20 18
//19 17 14
//16 13 11
//11 23 14
//19 15 22

//Output
//22
//15 14
//19 23 11
//11 13 14
//16 17 18
//19 20
//21

//Input
//1 3
//2 4 6

//Output
//6
//4
//2


//Input
//3 1
//3
//6
//9

//Output
//9
//6
//3
