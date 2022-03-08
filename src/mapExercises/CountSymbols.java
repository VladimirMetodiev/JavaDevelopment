package mapExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        TreeMap<Character, Integer> symbols = new TreeMap<>();

        for (int a = 0; a < expression.length(); a++) {
            char current = expression.charAt(a);

            if(!symbols.containsKey(current)) {
                symbols.put(current, 1);
            }
            else {
                symbols.put(current, symbols.get(current) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}



//Condition

//Write a program that reads some text from the console and counts the occurrences of each character in it.
//Print the results in alphabetical (lexicographical) order.



//Test

//Input
//TreeSet is similar to HashSet except that it sorts the elements in the ascending order while HashSet does not maintain any order.

//Output
// : 21 time/s
//.: 1 time/s
//H: 2 time/s
//S: 3 time/s
//T: 1 time/s
//a: 8 time/s
//c: 2 time/s
//d: 4 time/s
//e: 17 time/s
//g: 1 time/s
//h: 6 time/s
//i: 9 time/s
//l: 3 time/s
//m: 3 time/s
//n: 8 time/s
//o: 6 time/s
//p: 1 time/s
//r: 7 time/s
//s: 9 time/s
//t: 14 time/s
//w: 1 time/s
//x: 1 time/s
//y: 1 time/s
