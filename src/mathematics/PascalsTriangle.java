package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from 0 to N:");
        int number = Integer.parseInt(input.nextLine());
        int num = number + 1;

        int[][] matrix = new int[num][];

        // Jagged array
        for (int z = 0; z < num; z++) {
            int[] current = new int[z + 1];
            matrix[z] = Arrays.copyOf(current, current.length);
        }

        for (int a = 0; a < num; a++) {
            for (int b = 0; b < a + 1; b++) {
                if(b == 0) matrix[a][b] = 1;
                else if(b < matrix[a].length - 1) matrix[a][b] = matrix[a - 1][b - 1] + matrix[a - 1][b];
                else matrix[a][b] = 1;
            }
        }

        System.out.printf("%d%n----------%n", number);
        for(int[] arr : matrix) {
            for (int e = 0; e < arr.length; e++) {
                if(e < arr.length - 1) System.out.print(arr[e] + " ");
                else System.out.println(arr[e]);
            }
        }
    }
}



//Биномен коефициент на естествените числа k и n е броят на всички възможни k-елементни подмножества на дадено n-елементно множество.
//Биномният коефициент също е естествено число.

//Триъгълникът на Паскал - представлява "безкрайна таблица" на биномните коефициенти, която е най-удобно да бъде представена
//във формата на триъгълник. В нея се разполагат биномните коефициенти за n и k.

//Триъгълникът на Паскал се конструира по следния начин. Първият ред се състои от една единица. Всеки следващ ред, съдържа по едно число
//повече от предишният. Първото и последното от тези числа са равни на 1-ца, а всички останали числа се изчисляват като сума от числата
//над тях.

//n = 0:     1
//n = 1:    1 1
//n = 2:   1 2 1
//n = 3:  1 3 3 1
//n = 4: 1 4 6 4 1



//Тестове

//0
//0
//----------
//1

//1
//1
//----------
//1
//1 1

//2
//2
//----------
//1
//1 1
//1 2 1

//3
//3
//----------
//1
//1 1
//1 2 1
//1 3 3 1

//4
//4
//----------
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1

//5
//5
//----------
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1

//6
//6
//----------
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//1 6 15 20 15 6 1

//7
//7
//----------
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//1 6 15 20 15 6 1
//1 7 21 35 35 21 7 1
