package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = Integer.parseInt(input.nextLine().trim());

        String[][] table = new String[n][m];

        IntStream.range(0, n).forEach(row ->
                IntStream.range(0, m).forEach(col -> {
                    if (row == 0 || col == 0) {
                        table[row][col] = Integer.toString(1);
                    } else {
                        int current = Integer.parseInt(table[row - 1][col]) + Integer.parseInt(table[row][col - 1]);
                        table[row][col] = Integer.toString(current);
                    }
                }));

        IntStream.range(0, n).forEach(row -> System.out.println(String.join(" ", table[row])));
    }
}



//Условие

//Дадени са две числа n и m. Създайте двумерен масив [n][m] и го запълнете по следните правила: числата в ред 0 или
//колона 0 са равни на 1 (A[0][j] = 1, A[i][0] = 1). За всички останали елементи от масива A[i][j] = A[i-1][j] + A[i][j-1],
//т.е. всеки от оставалите елементи е равен на сумата от елемента вляво от него и елемента над него.

//Входни данни
//Програмата получава две числа n и m.

//Изход
//Принтирайте двумерният масив.



//Тестове

//4 4
//1 1 1 1
//1 2 3 4
//1 3 6 10
//1 4 10 20

//5 6
//1 1 1 1 1 1
//1 2 3 4 5 6
//1 3 6 10 15 21
//1 4 10 20 35 56
//1 5 15 35 70 126
