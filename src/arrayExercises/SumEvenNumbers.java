package arrayExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        long sum = 0L;

        for(int item : array){
            if(item % 2 == 0)  sum += item;
        }

        System.out.println(sum);

        reader.close();
    }
}



//Condition

//Read an array from the console and sum only the even numbers.



//Tests

//1 2 3 4 5 6
//12

//3 5 7 9
//0

//2 4 6 8 10
//30

//432789488 623511772 1573465712 1768431595 843729464 628722583 999823000
//4473319436
