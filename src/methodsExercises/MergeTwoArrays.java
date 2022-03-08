package methodsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] theFirst, theSecond;

        String expression = input.nextLine();

        if(expression.equals("")) {
            theFirst = new int[0];
        }
        else {
            theFirst = Arrays.stream(expression.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        expression = input.nextLine();

        if(expression.equals("")) {
            theSecond = new int[0];
        }
        else {
            theSecond = Arrays.stream(expression.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println(Arrays.toString(mergeArrays(theFirst, theSecond)));
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        if(arr1.length == 0) {
            return arr2;
        }
        else if(arr2.length == 0) {
            return arr1;
        }
        else {
            int[] result = new int[arr1.length + arr2.length];
            for(int a = 0; a < arr1.length; a++) result[a] = arr1[a];
            for(int b = 0; b < arr2.length; b++) result[arr1.length + b] = arr2[b];
            Arrays.sort(result);
            return result;
        }
    }
}



//Условие

//Реализирайте метод, който обединява два масива от цели числа, сортирани в нарастващ порядък, в един масив, сортиран по същия начин.
//Масивите могат да бъдат с всякаква дължина, включително нула.
//Принтирайте резултата



//Тестове

//
//10 20 30 40 50
//[10, 20, 30, 40, 50]

//2 4 6 8 10
//
//[2, 4, 6, 8, 10]

//1 3 5 7 9
//2 4 6 8 10
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//2 3 7 12 15 21 21 22 29 49 51
//12 16 21 43 44 45 48 50
//[2, 3, 7, 12, 12, 15, 16, 21, 21, 21, 22, 29, 43, 44, 45, 48, 49, 50, 51]

//0 3 4 4 5 8 19
//2 4 4 6 8 11 14 17 20
//[0, 2, 3, 4, 4, 4, 4, 5, 6, 8, 8, 11, 14, 17, 19, 20]
