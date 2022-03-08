package arrayExercises;

import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt(), columns = Integer.parseInt(input.nextLine().trim());

        String[][] field = new String[rows][columns];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                field[x][y] = "0";
            }
        }

        int mines = Integer.parseInt(input.nextLine());

        for (int z = 0; z < mines; z++) {
            String[] data = input.nextLine().split("\\s+");
            field[Integer.parseInt(data[0]) - 1][Integer.parseInt(data[1]) - 1] = "*";
        }

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                if(field[a][b].equals("*")) continue;
                int result = 0;
                if(a - 1 >= 0 && b - 1 >= 0 && field[a - 1][b - 1].equals("*")) ++result;
                if(a - 1 >= 0 && field[a - 1][b].equals("*")) ++result;
                if(a - 1 >= 0 && b + 1 < columns && field[a - 1][b + 1].equals("*")) ++result;
                if(b - 1 >= 0 && field[a][b - 1].equals("*")) ++result;
                if(b + 1 < columns && field[a][b + 1].equals("*")) ++result;
                if(a + 1 < rows && b - 1 >= 0 && field[a + 1][b - 1].equals("*")) ++result;
                if(a + 1 < rows && field[a + 1][b].equals("*")) ++result;
                if(a + 1 < rows && b + 1 < columns && field[a + 1][b + 1].equals("*")) ++result;
                field[a][b] = Integer.toString(result);
            }
        }

        for (int e = 0; e < rows; e++) {
            for (int f = 0; f < columns; f++) {
                if(f < columns - 1) System.out.print(field[e][f] + " ");
                else System.out.println(field[e][f]);
            }
        }
    }
}



//Tests

//Input
//3 2
//2
//1 1
//2 2

//Output
//* 2
//2 *
//1 1

//Input
//5 5
//10
//1 1
//2 2
//2 4
//3 1
//3 2
//3 4
//4 2
//4 4
//5 2
//5 3

//Output
//* 2 2 1 1
//4 * 4 * 2
//* * 6 * 3
//4 * 6 * 2
//2 * * 2 1


//Input
//5 5
//6
//1 1
//1 2
//2 2
//2 4
//3 1
//3 2

//Output
//* * 3 1 1
//5 * 4 * 1
//* * 3 1 1
//2 2 1 0 0
//0 0 0 0 0
