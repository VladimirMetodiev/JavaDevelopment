package basicSyntaxExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GetFirstOddOrEvenElements {
    public static void main(String[] arguments) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[] data = reader.readLine().split("\\s+");

        int number = Integer.parseInt(data[1]);
        String evenOdd = data[2].toLowerCase();

        for(int element : array){

            if(evenOdd.equals("even") && element % 2 == 0) {
                System.out.print(element + " ");
                number--;
            }
            if(evenOdd.equals("odd") && element % 2 != 0) {
                System.out.print(element + " ");
                number--;
            }
            if (number == 0) break;
        }

        reader.close();
    }
}



//Condition

//Write a program that returns the first N odd/even elements from a collection. Return as many as you can.
//Format of the input: Get {number of elements} {odd/even}



//Tests

//1 2 3 4 5
//Get 3 odd
//1 3 5

//11 6 2 8 1 0
//Get 8 even
//6 2 8 0

//15 17 22 19 21 54 27
//Get 10 odd
//15 17 19 21 27

//1 3 5 7 9 11
//Get 4 even
//

//22 24 36 48 52 66
//Get 6 even
//22 24 36 48 52 66

//11 3 23 65 91 4 18 6
//Get 4 even
//4 18 6
