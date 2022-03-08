package algorithms.recursion;

import java.util.Scanner;

public class TextInversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        System.out.println(inverse(expression));
    }

    private static String inverse(String text) {
        if(text.length() > 0) {
            return inverse(text.substring(1)) + text.charAt(0);
        }
        else {
            return "";
        }
    }
}



//Tests

//purposefulness

//I am persistently on the road to success

