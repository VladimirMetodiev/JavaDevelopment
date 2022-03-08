package arrayExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        int[] theFirst = new int[count];
        int[] theSecond = new int[count];
        String[] expression;

        for (int a = 0; a < count; a++) {
            expression = reader.readLine().split("\\s+");
            if(a % 2 == 0) {
                theFirst[a] = Integer.parseInt(expression[0]);
                theSecond[a] = Integer.parseInt(expression[1]);
            }
            else {
                theFirst[a] = Integer.parseInt(expression[1]);
                theSecond[a] = Integer.parseInt(expression[0]);
            }
        }

        print(theFirst);
        print(theSecond);

        reader.close();
    }

    static void print(int[] arr){
        for(int b = 0; b < arr.length; b++){
            System.out.print(arr[b] + " ");
        }
        System.out.println();
    }
}



//Condition

//Write a program which creates 2 arrays. You will be given an integer n. On the next n lines you get 2 integers.
//Form 2 arrays as shown below.



//Tests

//Input
//4
//1 5
//9 10
//31 81
//41 20
//Output
//1 10 31 20
//5 9 81 41


//Input
//2
//80 23
//31 19
//Output
//80 19
//23 31


//Input
//1
//5 6
//Output
//5
//6

