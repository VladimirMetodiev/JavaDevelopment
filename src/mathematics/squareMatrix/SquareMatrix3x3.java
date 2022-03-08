package mathematics.squareMatrix;

import java.util.Scanner;

public class SquareMatrix3x3 {
    private int[][] matrix;

    public SquareMatrix3x3 () {
        matrix = new int[3][3];
        System.out.println("You created a matrix with 9 elements.");
    }

    public void fillTheMatrix() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                System.out.println("Enter a number:");
                matrix[m][n] = Integer.parseInt(sc.nextLine());
                counter++;
                System.out.printf("%d/9%n", counter);
            }
        }
    }

    public void print() {
        for (int[] m : matrix) {
            for (int n = 0; n < m.length; n++) {
                if(n < m.length - 1) System.out.print(m[n] + " ");
                else System.out.println(m[n]);
            }
        }
    }

    public void turn(){
        int[][] temporary = new int[3][3];

        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                temporary[n][m] = matrix[m][n];
            }
        }

        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                matrix[m][n] = temporary[m][n];
            }
        }
    }

    public void calculateTrace() {
        int trace = 0;

        for (int t = 0; t < matrix.length; t++) {
            trace += matrix[t][t];
        }

        System.out.println("Trace = " + trace);
    }


    public void calculateDeterminant() {
        int[][] temporary = new int[3][3 + 3 - 1];
        long current = 1L, determinant = 0L;

        for (int m = 0; m < temporary.length; m++) {
            for (int n = 0; n < temporary[m].length; n++) {
                if(n < 3) {
                    temporary[m][n] = matrix[m][n];
                }
                else {
                    temporary[m][n] = matrix[m][n - 3];
                }
            }
        }

        for (int k = 0; k < 3; k++) {
            for (int m = k; m < 3 + k; m++) {
                current *= temporary[m - k][m];
            }
            determinant += current;
            current = 1L;
        }

        for (int k = 0; k < 3; k++) {
            for (int m = temporary[0].length - 1; m > temporary[0].length - 1 - 3; m--) {
                current *= temporary[temporary[0].length - 1 - m][m - k];
            }
            determinant -= current;
            current = 1L;
        }

        System.out.printf("Determinant = %d%n", determinant);
    }
}
