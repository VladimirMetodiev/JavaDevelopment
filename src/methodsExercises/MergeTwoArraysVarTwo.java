package methodsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArraysVarTwo {
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
        int index = 0, length1 = 0, length2 = 0;
        int[] result = new int[arr1.length + arr2.length];

        while (length1 < arr1.length || length2 < arr2.length) {
            if(length1 >= arr1.length) {
                result[index] = arr2[length2];
                length2++;
            }
            else if(length2 >= arr2.length) {
                result[index] = arr1[length1];
                length1++;
            }
            else if(arr1[length1] <= arr2[length2]) {
                result[index] = arr1[length1];
                length1++;
            }
            else {
                result[index] = arr2[length2];
                length2++;
            }
            index++;
        }

        return result;
    }
}



//Условие

//Реализирайте метод, който обединява два масива от цели числа, сортирани в нарастващ порядък, в един масив, сортиран по същия начин.
//Масивите могат да бъдат с всякаква дължина, включително нула.
//Обхождането на двата изходни масива, при създаването на крайният масив, трябва да бъде едновременно.
//Крайният масив трябва да бъде създаден в сортиран вид.
//Принтирайте резултата
