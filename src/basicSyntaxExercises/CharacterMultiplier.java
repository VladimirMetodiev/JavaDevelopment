package basicSyntaxExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CharacterMultiplier {
    private static int total = 0;

    private static void process(String first, String second){
        char ch1, ch2;

        for (int a = 0; a < first.length(); a++) {
            ch1 = first.charAt(a);
            if(a < second.length()) {
                ch2 = second.charAt(a);
            }
            else {
                ch2 = 1;
            }
            total += ch1 * ch2;
        }
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String[] two = reader.readLine().trim().split("\\s+");
            process(two[0].length() >= two[1].length() ? two[0] : two[1], two[0].length() >= two[1].length() ? two[1] : two[0]);
            System.out.println(total);
        }
    }
}



//Condition

//Create a program that takes two strings as arguments and returns the sum of their character codes multiplied in pairs
//(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum, then continue with the next two characters).
//If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.



//Tests

//Adam John
//37988

//123 522
//7647

//a aGaa
//9674

// graphics picture
//80353



//Another excellent solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String one = input.next();
//        String two = input.next();
//
//        int num1 = 0, num2 = 0, total = 0;
//
//        for (int i = 0; i < (one.length() >= two.length() ? one.length() : two.length()); i++) {
//            if(i < one.length()){
//                num1 = one.charAt(i);
//            }
//            else{
//                num1 = 1;
//            }
//
//            if(i < two.length()){
//                num2 = two.charAt(i);
//            }
//            else{
//                num2 = 1;
//            }
//
//            total += num1 * num2;
//        }
//
//        System.out.println(total);
//    }
