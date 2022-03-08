package arrayExercises;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int[][] matrix = new int[2 * number + 1][2 * number + 1];
        String direction = "left";
        int count = 2, counter = 0, row = matrix.length / 2 - 1, column = matrix[0].length / 2;

        for (int a = 1; a < Math.pow(2 * number + 1, 2); a++) {
            if(direction.equals("left") && counter < count) {
                if(counter != 0) column -= 1;
                matrix[row][column] = a;
                ++counter;
                if(counter == count) {
                    direction = "down";
                    counter = 0;
                }
            }
            else if(direction.equals("down") && counter < count) {
                row += 1;
                matrix[row][column] = a;
                ++counter;
                if(counter == count) {
                    direction = "right";
                    counter = 0;
                }
            }
            else if(direction.equals("right") && counter < count) {
                column += 1;
                matrix[row][column] = a;
                ++counter;
                if(counter == count) {
                    direction = "up";
                    counter = 0;
                }
            }
            else if(direction.equals("up") && counter < count) {
                row -= 1;
                matrix[row][column] = a;
                ++counter;
                if(counter == count) {
                    direction = "left";
                    counter = 0;
                    count += 2;
                    row -= 1;
                }
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        int sp = Integer.toString(matrix[0][matrix[0].length - 1]).length();

        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                for (int i = 0; i < sp - Integer.toString(matrix[a][b]).length(); i++) {
                    System.out.print(" ");
                }
                if(b < matrix[a].length - 1) System.out.print(matrix[a][b] + " ");
                else System.out.println(matrix[a][b]);
            }
        }
    }
}



//Условие

//Дадено е числото n. Създайте двумерен масив M[2*n+1][2*n+1] и го запълнете по спирала, започвайки с числото 0 разположено
//в централната клетка М[n+1][n+1]. Спиралата първо се издига нагоре, а след това се завърта обратно на часовниковата стрелка.
//Принтирайте запълненият двумерен масив. Принтираните числа трябва да бъдат подравнени, между тах трябва да има, най-малко, един
//интервал разстояние, а в края на всеки ред, не трябва да остава "излишен" интервал.



//Тестове

//2
//12 11 10  9 24
//13  2  1  8 23
//14  3  0  7 22
//15  4  5  6 21
//16 17 18 19 20

//5
// 90  89  88  87  86  85  84  83  82  81 120
// 91  56  55  54  53  52  51  50  49  80 119
// 92  57  30  29  28  27  26  25  48  79 118
// 93  58  31  12  11  10   9  24  47  78 117
// 94  59  32  13   2   1   8  23  46  77 116
// 95  60  33  14   3   0   7  22  45  76 115
// 96  61  34  15   4   5   6  21  44  75 114
// 97  62  35  16  17  18  19  20  43  74 113
// 98  63  36  37  38  39  40  41  42  73 112
// 99  64  65  66  67  68  69  70  71  72 111
//100 101 102 103 104 105 106 107 108 109 110
