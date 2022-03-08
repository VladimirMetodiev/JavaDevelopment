package basicSyntaxExercises;

import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = Integer.parseInt(input.nextLine());
        checkAdded(target);
        checkSubtracted(target);
    }

    static void checkAdded(int target){
        for (int a = 1; a <= 20; a++) {
            for (int b = 1; b <= 20; b++) {
                if(a + b == target){
                    System.out.printf("%d + %d = %d%n", a, b, target);
                }
            }
        }
    }

    static void checkSubtracted(int target){
        for (int a = 1; a <= 20; a++) {
            for (int b = 1; b <= 20; b++) {
                if(a - b == target){
                    System.out.printf("%d - %d = %d%n", a, b, target);
                }
            }
        }
    }
}



//Condition

//Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers
//between 1 and 20, which, if added or subtracted, result in the target.



//Tests

//Input
//5
//Output
//1 + 4 = 5
//2 + 3 = 5
//3 + 2 = 5
//4 + 1 = 5
//6 - 1 = 5
//7 - 2 = 5
//8 - 3 = 5
//9 - 4 = 5
//10 - 5 = 5
//11 - 6 = 5
//12 - 7 = 5
//13 - 8 = 5
//14 - 9 = 5
//15 - 10 = 5
//16 - 11 = 5
//17 - 12 = 5
//18 - 13 = 5
//19 - 14 = 5
//20 - 15 = 5


//Input
//35
//Output
//15 + 20 = 35
//16 + 19 = 35
//17 + 18 = 35
//18 + 17 = 35
//19 + 16 = 35
//20 + 15 = 35


//Input
//0
//Output
//1 - 1 = 0
//2 - 2 = 0
//3 - 3 = 0
//4 - 4 = 0
//5 - 5 = 0
//6 - 6 = 0
//7 - 7 = 0
//8 - 8 = 0
//9 - 9 = 0
//10 - 10 = 0
//11 - 11 = 0
//12 - 12 = 0
//13 - 13 = 0
//14 - 14 = 0
//15 - 15 = 0
//16 - 16 = 0
//17 - 17 = 0
//18 - 18 = 0
//19 - 19 = 0
//20 - 20 = 0


//Input
//100
//Output
//

