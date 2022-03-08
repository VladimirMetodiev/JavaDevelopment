package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Snake {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = Integer.parseInt(input.nextLine().trim());

        int[][] matrix = new int[n][m];

        IntStream.range(0, n).forEach(x -> IntStream.range(0, m).forEach(y -> {
            if(x % 2 == 0) matrix[x][y] = x * m + y;
            else matrix[x][y] = x * m + m - 1 - y;
        }));

        int maxIntervals = Integer.toString(matrix[n - 1][matrix[n - 1].length - 1]).length();

        IntStream.range(0, n).forEach(x -> IntStream.range(0, m).forEach(y -> {
            int digits = Integer.toString(matrix[x][y]).length();

            for (int a = 0; a < maxIntervals - digits; a++) System.out.print(" ");

            if(y < m - 1) System.out.print(matrix[x][y] + " ");
            else System.out.println(matrix[x][y]);
        }));
    }
}



//Условие

//Създайде матрица с n реда и m колони. Запълнете я "змиевидно" с цели числа започващи от 0, които постепенно нарастват с 1-ца.
//Запълването на четните редове е от ляво на дясно, а на нечетните от дясно на ляво. Принтирайте матрицата, като извежданите числа
//трябва да бъдат подравнени в дясно, между тях да има поне един интервал разстояние, а в края на редовете не трябва да остава
//излишен интервал.



//Тестове

//2 2
//0 1
//3 2

//3 5
// 0  1  2  3  4
// 9  8  7  6  5
//10 11 12 13 14

//4 6
// 0  1  2  3  4  5
//11 10  9  8  7  6
//12 13 14 15 16 17
//23 22 21 20 19 18

//4 10
// 0  1  2  3  4  5  6  7  8  9
//19 18 17 16 15 14 13 12 11 10
//20 21 22 23 24 25 26 27 28 29
//39 38 37 36 35 34 33 32 31 30

//11 10
//  0   1   2   3   4   5   6   7   8   9
// 19  18  17  16  15  14  13  12  11  10
// 20  21  22  23  24  25  26  27  28  29
// 39  38  37  36  35  34  33  32  31  30
// 40  41  42  43  44  45  46  47  48  49
// 59  58  57  56  55  54  53  52  51  50
// 60  61  62  63  64  65  66  67  68  69
// 79  78  77  76  75  74  73  72  71  70
// 80  81  82  83  84  85  86  87  88  89
// 99  98  97  96  95  94  93  92  91  90
//100 101 102 103 104 105 106 107 108 109
