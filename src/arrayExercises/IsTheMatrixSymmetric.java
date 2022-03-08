package arrayExercises;

import java.util.Scanner;

public class IsTheMatrixSymmetric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int[][] matrix = new int[number][number];

        for (int a = 0; a < number; a++) {
            for (int f = 0; f < number; f++) {
                matrix[a][f] = input.nextInt();
            }
        }

        boolean isTheMatrixSymmetric = true;

        for (int b = 1; b < number; b++) {
            for (int e = 0; e <= b; e++) {
                if(matrix[b][e] != matrix[e][b]) {
                    isTheMatrixSymmetric = false;
                    break;
                }
            }
        }

        if(isTheMatrixSymmetric) System.out.println("yes");
        else System.out.println("no");
    }
}



//Условие

//Проверете дали матрицата е симетрична спрямо главния диагонал. Главният диагонал е този, който минава от горния ляв ъгъл
//на двумерният масив до долния десен ъгъл.

//Входни данни
//На първи ред получавате числото n (n <= 100), което е броят на редовете и колоните в матрицата. След това във входния поток
//има n реда от n числа всеки, това са елементите на двумерният масив.

//Изход
//Програмата трябва да отпечата думата yes за симетричен масив и думата no за несиметричен.



//Тестове

//2
//1 2
//2 1
//yes

//2
//1 3
//5 1
//no

//3
//0 1 2
//1 5 3
//2 3 4
//yes

//4
//1 1 2 3
//1 1 3 4
//2 3 1 5
//3 4 5 1
//yes

//4
//1 1 2 3
//1 1 3 9
//2 3 1 5
//3 8 5 1
//no
