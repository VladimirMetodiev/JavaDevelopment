package arrayExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] theFirst = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] theSecond = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int length = theFirst.length >= theSecond.length ? theFirst.length : theSecond.length;
        boolean isThereDifference = false;
        int index = 0;

        for(int a = 0; a < length; a++){
            index = a;
            try{
                if(theFirst[a] != theSecond[a]){
                    isThereDifference = true;
                    break;
                }
            }
            catch (Exception ex){
                isThereDifference = true;
                break;
            }
        }

        if (!isThereDifference) System.out.printf("Arrays are identical. Sum: %d", calculateSum(theFirst));
        else System.out.printf("Arrays are not identical. Found difference at %d index.", index);

        reader.close();
    }

    static int calculateSum(int[] arr){
        int sum = 0;
        for(int item : arr) sum += item;
        return sum;
    }
}



//Condition

//Read two arrays and print on the console whether they are identical or not. Arrays are identical if their elements
//are equal. If the arrays are identical find the sum of the first one and print on the console following message:
//"Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays differ and print on the console
//following message: "Arrays are not identical. Found difference at {index} index."



//Tests

//10 20 30
//10 20 30
//Arrays are identical. Sum: 60


//1 2 3 4 5
//1 2 4 3 5
//Arrays are not identical. Found difference at 2 index.


//1
//10
//Arrays are not identical. Found difference at 0 index.


//5 10 15 20
//5 10
//Arrays are not identical. Found difference at 2 index.


//14 23 16
//14 23 16 29
//Arrays are not identical. Found difference at 3 index.
