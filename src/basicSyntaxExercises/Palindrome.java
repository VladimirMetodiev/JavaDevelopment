package basicSyntaxExercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine().toLowerCase();
        StringBuilder reversed = new StringBuilder();

        expression = expression.replaceAll("[\\s,.?!-']", "");

        for (int a = expression.length() - 1; a >= 0; a--) {
            reversed.append(expression.charAt(a));
        }

        if(expression.equals("" + reversed)) System.out.println("It is a palindrome.");
        else System.out.println("It isn't a palindrome.");
    }
}



//Палиндромът е една или няколко думи или числа, които се четат по един и същ начин от ляво надясно и от дясно наляво.



//Tests

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
