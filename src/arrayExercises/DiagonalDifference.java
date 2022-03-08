package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        int[][] matrix = new int[num][];
        int firstDiagonal = 0, secondDiagonal = 0;

        for (int a = 0; a < num; a++) {
            matrix[a] = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        for (int b = 0; b < num; b++) {
            firstDiagonal += matrix[b][b];
        }

        for (int e = num - 1; e >= 0; e--) {
            secondDiagonal += matrix[e][num - 1 - e];
        }

        System.out.printf("%d%n", Math.abs(firstDiagonal - secondDiagonal));
    }
}



//Tests

//Input
//2
//1 1
//1 1
//Output
//0

//Input
//2
//3 1
//1 3
//Output
//4

//Input
//3
//8 5 -11
//4 0 7
//-2 16 4
//Output
//25

//Input
//3
//11 2 4
//4 5 6
//10 8 -12
//Output
//15
