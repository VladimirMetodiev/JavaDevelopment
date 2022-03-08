package mathematics.squareMatrix;

import java.util.Scanner;

public class SquareMatrix {
    private int size;
    private int[][] matrix;

    public SquareMatrix(int size) {
        this.create(size);
    }

    public void create(int size) {
        if(size < 0) throw new IllegalArgumentException("The size must be greater than or equal to 0.");
        this.size = size;
        matrix = new int[size][size];
    }

    public void fillTheMatrix() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                System.out.println("Enter a number:");
                matrix[m][n] = Integer.parseInt(sc.nextLine());
                counter++;
                System.out.printf("%d/%d%n", counter, size * size);
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
        int[][] temporary = new int[size][size];

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



    public long calculateDeterminant() {
        int sign = 1;
        long current = 1L, determinant = 0L;

        switch (size) {
            case 1: {
                determinant = matrix[0][0];
                break;
            }
            case 2: {
                determinant = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
                break;
            }
            case 3: {
                // Правило на Пиер Фредерик Сарус

                int[][] temporary = new int[size][size + size - 1];

                for (int m = 0; m < temporary.length; m++) {
                    for (int n = 0; n < temporary[m].length; n++) {
                        if(n < size) {
                            temporary[m][n] = matrix[m][n];
                        }
                        else {
                            temporary[m][n] = matrix[m][n - size];
                        }
                    }
                }

                for (int k = 0; k < size; k++) {
                    for (int m = k; m < size + k; m++) {
                        current *= temporary[m - k][m];
                    }
                    determinant += current;
                    current = 1L;
                }

                for (int k = 0; k < size; k++) {
                    for (int m = temporary[0].length - 1; m > temporary[0].length - 1 - size; m--) {
                        current *= temporary[temporary[0].length - 1 - m][m - k];
                    }
                    determinant -= current;
                    current = 1L;
                }

                break;
            }
            default: {
                // Правило на Пиер-Симон Лаплас

                SquareMatrix temporary = new SquareMatrix(size - 1);

                for (int a = 0; a < size; a++) {

                    for (int b = 1; b < size; b++) {
                        for (int c = 0; c < a; c++) {
                            temporary.matrix[b - 1][c] = matrix[b][c];
                        }

                        for (int d = a + 1; d < size; d++) {
                            temporary.matrix[b - 1][d - 1] = matrix[b][d];
                        }
                    }

                    determinant += sign * matrix[0][a] * temporary.calculateDeterminant();

                    sign *= (-1);
                }

                break;
            }
        }

        return determinant;
    }
}


