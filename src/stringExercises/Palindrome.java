package stringExercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine().toLowerCase();

        StringBuilder veracious = new StringBuilder();
        StringBuilder reversed = new StringBuilder();

        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                veracious.append(ch);
            }
        }

        if(veracious.toString().equals(reversed.append(veracious).reverse().toString())) {
            System.out.println("It is a palindrome.");
        }
        else {
            System.out.println("It isn't a palindrome.");
        }
    }
}



//Тестове

//194491
//It is a palindrome.


//ABBA
//It is a palindrome.


//Level
//It is a palindrome.


//144
//It isn't a palindrome.


//1011
//It isn't a palindrome.


//court
//It isn't a palindrome.


//Step on no pets
//It is a palindrome.


//No lemon, no melon
//It is a palindrome.


//Eva, can I see bees in a cave?
//It is a palindrome.


//Madam, I'm Adam.
//It is a palindrome.


//A man, a plan, a canal, Panama
//It is a palindrome.


//Why the head of the IMF should resign?
//It isn't a palindrome.
