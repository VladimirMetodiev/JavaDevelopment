package basicSyntaxExercises;

import java.util.Scanner;

public class NumberOfDecades {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println((number / 10) % 10);
    }
}



//Condition

//Дадено е неотрицателно цяло число. Намерете броя на десетките в неговия десетичен запис (т.е. втората цифра отдясно наляво).



//Tests

//592
//9

//9648
//4

//83467
//6

