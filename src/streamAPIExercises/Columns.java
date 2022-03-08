package streamAPIExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Columns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int length = Integer.parseInt(input.nextLine());

        int[][] matrix = new int[length][length];

        IntStream.range(0, length).forEach(x -> IntStream.range(0, length).forEach(y -> {
            matrix[x][y] = input.nextInt();
        }));

        IntStream.range(0, length).forEach(x -> {
            long count = IntStream.range(0, length).filter(y -> matrix[y][x] == number).count();
            if(count > 0) System.out.println("YES");
            else System.out.println("NO");
        });
    }
}



//Условие

//Дадена е таблица с числа, която има N реда и N колони. Дава се едно число Х, проверете в кои колони се съдържа това число.

//Входни данни
//Първият ред съдържа числото X, което не превишава по модул от 2*10^9. Вторият ред съдържа числото N (1 <= N <= 100). Следващите N реда
//съдържат по N цели числа, които не са по-големи по абсолютна стойност, от 2*10^9. Това са числата в таблицата.

//Изход
//За всяка колона, която съдържа числото X, отпечатайте YES (на нов ред), и NO в противоположният случай.



//Тестове

//14
//3
//11 19 16
//15 26 12
//37 14 18
//NO
//YES
//NO

//9
//4
//2 5 3 9
//4 8 2 7
//6 9 4 1
//1 7 6 4
//NO
//YES
//NO
//YES

//9
//4
//2 5 9 9
//9 8 2 7
//6 9 4 1
//1 7 6 4

//9
//4
//2 5 9 9
//9 8 2 7
//6 9 4 1
//1 7 6 4
//YES
//YES
//YES
//YES

//7
//4
//2 5 9 9
//5 8 2 3
//6 9 4 1
//1 3 6 4
//NO
//NO
//NO
//NO

//10
//1
//10
//YES
