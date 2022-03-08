package arrayExercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = Integer.parseInt(input.nextLine().trim());

        String[][] matrix = new String[rows][columns];

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                if(b < columns - 1) matrix[a][b] = input.next();
                else matrix[a][b] = input.nextLine().trim();
            }
        }

        String command;

        while(!(command = input.nextLine()).equals("END")) {
            String[] data = command.split("\\s+");
            int r1, c1, r2, c2;
            try {
                r1 = Integer.parseInt(data[1]);
                c1 = Integer.parseInt(data[2]);
                r2 = Integer.parseInt(data[3]);
                c2 = Integer.parseInt(data[4]);
            } catch (Exception ex) {
                System.out.println("Invalid input!");
                continue;
            }

            if(data[0].equals("swap") &&
                    r1 >= 0 && r1 < rows &&
                    c1 >= 0 && c1 < columns &&
                    r2 >= 0 && r2 < rows &&
                    c2 >= 0 && c2 < columns) {
                String current = matrix[r1][c1];
                matrix[r1][c1] = matrix[r2][c2];
                matrix[r2][c2] = current;

                makeABoastOf(matrix);
            }
            else {
                System.out.println("Invalid input!");
            }
        }
    }

    private static void makeABoastOf(String[][] matrix) {
        Consumer<String[][]> print = mat -> {
            for(String[] m : mat ) {
                for(String el : m) {
                    System.out.print(el + " ");
                }
                System.out.println();
            }
        };
        print.accept(matrix);
    }
}



//Condition

//Write a program which reads a STRING matrix from the console and performs certain operations with its elements. User input is
//provided in a similar way like in the problems above – first you read the dimensions and then the data.
//Your program should then receive commands in format: "swap row1 col1 row2c col2" where row1, row2, col1, col2
//are coordinates in the matrix. In order for a command to be valid, it should start with the "swap" keyword along with
//four valid coordinates (no more, no less). You should swap the values at the given coordinates (cell [row1, col1] withcell [row2, col2])
//and print the matrix at each step (thus you'll be able to check if the operation was performed correctly).
//If the command is not valid (doesn't contain the keyword "swap", has fewer or more coordinates entered or the given coordinates
//do not exist), print "Invalid input!" and move on to the next command. Your program should finish when the string "END" is entered.



//Tests

//Input
//2 3
//1 2 3
//4 5 6
//swap 0 0 1 1
//swap 10 9 8 7
//swap 0 1 1 0
//END

//Output
//5 2 3
//4 1 6
//Invalid input!
//5 4 3
//2 1 6


//Input
//1 2
//Hello World
//0 0 0 1
//swap 0 0 0 1
//swap 0 1 0 0
//END

//Output
//Invalid input!
//World Hello
//Hello World


//Input
//3 3
//$ % @
//G # ?
//& 5 !
//swap 1 0 2 2
//0 2 2 1
//swap 1 -1 2 -2
//swp  1 2 1 0
//swap 0 2 1 1
//END

//Output
//$ % @
//! # ?
//& 5 G
//Invalid input!
//Invalid input!
//Invalid input!
//$ % #
//! @ ?
//& 5 G
