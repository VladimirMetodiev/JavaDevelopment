package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine().toLowerCase();
        expression = expression.replaceAll("[\\s,.?!-']", "");

        List<Character> list = new ArrayList<>();
        for(char ch : expression.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator(); // по подразбиране обхождането на списъка започва от първият елемент
        ListIterator<Character> reverseIterator = list.listIterator(list.size()); // указвам обхождането на списъка да започне от последният елемент

        boolean isPalindrome = true;

        while(iterator.hasNext() && reverseIterator.hasPrevious()) {
            if(iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("It is a palindrome.");
        }
        else {
            System.out.println("It isn't a palindrome.");
        }
    }
}



//Tests

//ABBA
//It is a palindrome.


//Level
//It is a palindrome.


//6363
//It isn't a palindrome.


//987656789
//It is a palindrome.


//iterator
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


//It is a palindrome.
//It isn't a palindrome.
