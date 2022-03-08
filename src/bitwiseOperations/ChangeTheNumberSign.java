package bitwiseOperations;

import java.util.Scanner;

public class ChangeTheNumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        System.out.println(number + " => " + changeTheSign(number));

        /*
         * За да променя знакът на дадено число:
         *    1.Трябва да приложа върху него, операцията побитово отрицание;
         *    2.Да го събера с 1;
         */
    }

    private static int changeTheSign(int number) {
        return ~number + 1;
    }
}
