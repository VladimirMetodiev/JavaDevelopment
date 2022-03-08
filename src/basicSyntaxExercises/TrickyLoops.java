package basicSyntaxExercises;

import java.util.Scanner;

public class TrickyLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstLength = input.nextInt();

        for (int a = 0; a < firstLength; a++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int secondLength = input.nextInt();

            calculate(x, y, secondLength);
        }
    }

    static void calculate(int x, int y, int secondLength){
        double result = x;

        for (int b = 0; b < secondLength; b++) {
            result += Math.pow(2, b) * y;
            if(b < secondLength - 1) System.out.printf("%.0f, ", result);
            else System.out.printf("%.0f%n", result);
        }
    }
}



//Test

//Input
//2
//0 2 10
//5 3 5

//Output
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98
