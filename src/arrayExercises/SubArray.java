package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int startIndex = -1, count = -1, counter = 0;

        System.out.println("Enter a start index:");

        while(startIndex < 0 || startIndex > array.length - 1) {
            startIndex = Integer.parseInt(input.nextLine());
            if(startIndex < 0 || startIndex > array.length - 1) System.out.println("Wrong start index. Please, enter a correct value.");
        }

        System.out.println("Enter a count:");

        while(count < 0 || startIndex + count - 1 > array.length - 1) {
            count = Integer.parseInt(input.nextLine());
            if(count < 0 || startIndex + count - 1 > array.length - 1) System.out.println("Wrong count. Please, enter a correct value.");
        }

        int[] newArray = new int[count];

        for (int a = startIndex; a <= startIndex + count - 1; a++) {
            newArray[counter++] = array[a];
        }

        System.out.println(Arrays.toString(newArray));
    }
}



//Tests

//3 19 20 70 13 2 88 16 72 96
//3
//7
//[70, 13, 2, 88, 16, 72, 96]


//3 19 20 70 13 2 88 16 72 96
//9
//1
//[96]


//3 19 20 70 13 2 88 16 72 96
//5
//0
//[]


//3 19 20 70 13 2 88 16 72 96
//8
//2
//[72, 96]
