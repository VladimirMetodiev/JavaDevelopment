package arrayExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSums {
    public static void main(String[] arguments) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int leftSum = 0, rightSum = 0, index = -1;

        for (int a = 0; a < array.length; a++) {
            if(a > 0 && a < array.length - 1){
                leftSum = getLeftSum(array, a);
                rightSum = getRightSum(array, a);
            }
            else if(a == 0){
                rightSum = getRightSum(array, a);
            }
            else{
                leftSum = getLeftSum(array, a);
            }

            if(leftSum == rightSum){
                index = a;
                break;
            }

            leftSum = 0;
            rightSum = 0;
        }

        if(index != -1){
            System.out.println(index);
        }
        else {
            System.out.println("no");
        }

        reader.close();
    }

    static int getLeftSum(int[] arr, int num){
        int sum = 0;
        for (int b = 0; b < num; b++) {
            sum += arr[b];
        }
        return sum;
    }

    static int getRightSum(int[] arr, int num){
        int sum = 0;
        for (int c = num + 1; c < arr.length; c++) {
            sum += arr[c];
        }
        return sum;
    }
}



//Condition

//Write a program that determines if there exists an element in the array such that the sum of the elements on its left
//is equal to the sum of the elements on its right. If there are no elements to the left / right, their sum is considered to be 0.
//Print the index that satisfies the required condition or “no” if there is no such index.



//Tests

//1 2 3 3
//2


//1 2
//no


//1
//0


//1 2 3
//no


//10 5 5 99 3 4 2 5 1 1 4
//3


//Бележка: при числова редица от повече от 2 нули, има един или повече възможни отговора!
//
//Например:
//0 0 0 0
//index 1 && index 2




//Another solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
//
//        int leftSum = 0;
//        int rightSum = 0;
//        int saveIndex = -1;
//
//        for(int a = 0; a < numbers.length; a++){
//            for(int b = 0; b < a; b++){
//                leftSum += numbers[b];
//            }
//            for(int c = a + 1; c < numbers.length; c++){
//                rightSum += numbers[c];
//            }
//            if(leftSum == rightSum){
//                saveIndex = a;
//                break;
//            }
//            leftSum = 0;
//            rightSum = 0;
//        }
//
//        if(saveIndex >= 0){
//            System.out.println(saveIndex);
//        }
//        else{
//            System.out.println("no");
//        }
//    }
