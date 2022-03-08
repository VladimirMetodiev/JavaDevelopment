package streamAPIExercises;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SaddlePoint {
    private static int counter = 0;

    private static List<Integer> getColumn(int[][] matrix, int col) {
        return IntStream
                .range(0, matrix.length)
                .map(x -> x = matrix[x][col])
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt(), col = Integer.parseInt(input.nextLine().trim());

        int[][] matrix = new int[row][col];

        IntStream.range(0, row).forEach(x -> IntStream.range(0, col).forEach(y -> {
            matrix[x][y] = input.nextInt();
        }));

        LinkedHashMap<Integer, List<Integer>> rows = new LinkedHashMap<>();
        LinkedHashMap<Integer, List<Integer>> columns = new LinkedHashMap<>();

        IntStream.range(0, row).forEach(x -> {
            rows.put(x, Arrays.stream(matrix[x]).boxed().collect(Collectors.toList()));
        });

        IntStream.range(0, col).forEach(y -> columns.put(y, getColumn(matrix, y)));

        IntStream.range(0, row).forEach(x -> {
            int min = rows.get(x).stream().mapToInt(Integer::intValue).min().orElse(0);
            IntStream.range(0, col).forEach(y -> {
                int max = columns.get(y).stream().mapToInt(Integer::intValue).max().orElse(0);
                if(min == max) ++counter;
            });
        });

        System.out.println(counter);
    }
}



//Условие

//Дадена е матрицата K. Тя има n реда и m колони. Седлова точка (Saddle point) в матрицата е елементът, който е ЕДНОВРЕМЕННО
//най-малък в даден ред и най-голям в дадена колона. Намерете броя на седловите точки в задената матрица.

//Входни данни
//Първият ред съдържа две цели числа n и m (1 <= n, m <= 750). На следващите n реда ще получите по m цели числа, които не
//надвишават 1000 по абсолютна стойност.

//Изход
//Принтирайте броя на седловите точки.



//Тестове

//2 2
//12 12
//12 12
//4

//3 4
//1 2 3 4
//6 12 18 24
//3 -3 6 -6
//1

//3 3
//9 9 9
//8 7 6
//5 4 3
//3



//Това е моето второ решение

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int row = input.nextInt(), col = Integer.parseInt(input.nextLine().trim()), counter = 0;
//
//        int[][] matrix = new int[row][col];
//
//        for(int a = 0; a < row; a++) {
//            for(int b = 0; b < col; b++) {
//                matrix[a][b] = input.nextInt();
//            }
//        }
//
//        for(int e = 0; e < row; e++) {
//            int min = Arrays.stream(matrix[e]).min().getAsInt();
//            int max = Integer.MIN_VALUE;
//
//            for(int f = 0; f < col; f++) {
//                for(int g = 0; g < row; g++) {
//                    if(matrix[g][f] > max) max = matrix[g][f];
//                }
//                if(min == max) ++counter;
//            }
//        }
//
//        System.out.println(counter);
//    }
