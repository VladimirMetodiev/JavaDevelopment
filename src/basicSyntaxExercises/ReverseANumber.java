package basicSyntaxExercises;

import java.util.Scanner;

public class ReverseANumber {
    private int number;

    int getNumber() {
        return number;
    }

    void setNumber(int number){
        this.number = number;
    }

    private static int reverse (int number) {
        int result = 0;
        int current = number;
        do {
            result = result * 10 + current % 10;
            current /= 10;
        }
        while (current > 0);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());

        ReverseANumber rn1 = new ReverseANumber();

        rn1.setNumber(ReverseANumber.reverse(num));
        System.out.println(rn1.getNumber());
    }
}
