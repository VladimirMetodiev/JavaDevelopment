package arrayExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Rotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();

        long[][] matrix = new long[n][m];
        long[][] turned = new long[m][n];

        IntStream.range(0, n).forEach(x -> IntStream.range(0, m).forEach(y  -> {
            matrix[x][y] = input.nextLong();
        }));

        IntStream.range(0, n).forEach(x -> IntStream.range(0, m).forEach(y  -> {
            turned[y][n - 1 - x] = matrix[x][y];
        }));

        IntStream.range(0, m).forEach(x -> IntStream.range(0, n).forEach(y  -> {
            if(y < n - 1) System.out.print(turned[x][y] + " ");
            else System.out.println(turned[x][y]);
        }));
    }
}



//Условие

//Дадени са 2 цели, положителни числа N и M (1 <= N, M <= 50). Създайте двумерен масив N х M и го запълнете с получените на следващите редове
//стойности. След това завъртете двумерният масив, на 90 градуса, по часовниковата стрелка. Принтирайте резултата. Числата трябва да бъдат
//разделени с по един интервал, а на края на всеки ред, не трябва да остава излишен интервал.



//Тестове

//Input
//2 2
//1 2
//3 4
//Output
//3 1
//4 2

//Input
//3 4
//1 2 3 4
//5 6 7 8
//9 10 11 12
//Output
//9 5 1
//10 6 2
//11 7 3
//12 8 4
