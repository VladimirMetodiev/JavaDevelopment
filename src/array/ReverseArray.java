package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int length = array.length - 1, current;

        for (int a = 0; a < array.length / 2; a++) {
            current = array[a];
            array[a] = array[length - a];
            array[length - a] = current;
        }

        System.out.println(Arrays.toString(array));
    }
}



//Tests

//3 6 9 12 15 17 19

//2 4 6 8 10 12

//5