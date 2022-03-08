package array;

import java.util.Arrays;

public class TheMultidimensionalArrays {
    public static void main(String[] args) {
        /*
         * МНОГОМЕРЕН МАСИВ - това е масив, който има повече от едно измерение.
         * Многомерните масиви могат да бъдат: ДВУМЕРНИ (матрици), ТРИМЕРНИ (кубове) и т.н.
         * - двумерните масиви се означават с двойка квадратни скоби - [][]
         * - тримерните масиви се означават с тройка квадратни скоби - [][][]
         * Многомерните масиви също така могат да бъдат разделени на:
         * - "Правоъгълни" - масиви имащи няколко измерения, в които всички редове имат еднаква дължина;
         * - "Зъбчати" - масиви, които съдържат някакъв брой вътрешни масиви, всеки от които има различна дължина;
         */

        int[][] matrix = {
                {2, 4, 6, 8, 10},       // row № 0
                {1, 3, 5, 7, 9}         // row № 1
        };

        int[][] jagged = {
                {1, 2, 3, 4, 5},                                            // row № 0
                {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000},        // row № 1
                {2019, 2020}                                                // row № 2
        };


        /* ДВУМЕРНИ МАСИВИ */

        /* Деклариране на двумерен масив */
        int[][] myMatrix;


        /* Създаване (заделяне) на двумерен масив */
        myMatrix = new int[10][10];


        /* Инициализиране на двумерен масив */
        double[][] anotherMatrix = {
                {1.25, 2.5, 3.25, 4.5, 5.25},
                {6.25, 7.5, 8.25, 9.5, 10.25},
                {11.25, 12.5, 13.25, 14.5, 15.25},
                {16.25, 17.5, 18.25, 19.5, 20.25}
        };


        /* Размерности на двумерен масив */
        System.out.printf("Rows: %d%n", anotherMatrix.length);
        System.out.printf("Columns: %d%n%n", anotherMatrix[0].length);


        /* Достъпването на елементите на двумерен масив става по индекс */
        double[][] someRealNumbers = new double[5][5];
        for (int row = 0; row < someRealNumbers.length; row++) {
            for (int column = 0; column < someRealNumbers[row].length; column++) {
                someRealNumbers[row][column] = (column + 1) * (row + 0.25);
            }
        }


        /* Принтиране на двумерен масив */
        for(double[] arr : someRealNumbers) {
            for(double d : arr) {
                System.out.print(d + " ");
            }
            System.out.println();
        }

        System.out.println("\n" + Arrays.deepToString(someRealNumbers));


        /* ТРИМЕРНИ МАСИВИ */

        /* Деклариране на тримерен масив */
        int[][][] myCube;


        /* Създаване (заделяне) на тримерен масив */
        myCube = new int[10][10][10];


        /* Инициализиране на тримерен масив */
        int[][][] anotherCube = {
                {
                        {1, 2, 3},
                        {2, 4, 6}
                },
                {
                        {3, 6, 9},
                        {4, 8, 12}
                },
                {
                        {5, 10, 15},
                        {6, 12, 18}
                }
        };


        /* Размерности на тримерен масив */
        System.out.printf("\nLayers: %d%n", anotherCube.length);
        System.out.printf("Rows: %d%n", anotherCube[0].length);
        System.out.printf("Columns: %d%n%n", anotherCube[0][0].length);


        /* Достъпването на елементите на тримерен масив става по индекс */
        String[][][] letters = new String[5][5][5];
        for (int layer = 'A'; layer < 'A' + letters.length; layer++) {
            for (int row = 'A'; row < 'A' + letters[layer - 'A'].length; row++) {
                for (int column = 'A'; column < 'A' + letters[layer - 'A'][row - 'A'].length; column++) {
                    letters[layer - 'A'][row - 'A'][column - 'A'] = "" + (char)layer + (char)row + (char)column;
                }
            }
        }


        /* Принтиране на тримерен масив */
        for(String[][] layer : letters) {
            for(String[] row : layer) {
                for(String str : row) {
                    System.out.print(str + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(letters));
    }
}
