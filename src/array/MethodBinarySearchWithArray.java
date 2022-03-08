package array;

import java.util.Arrays;

public class MethodBinarySearchWithArray {
    public static void main(String[] args) {
        int[] numbers = {200, 6 , 49, -15, 3, 160, -52, 94, 37, -100, 79, 61, 19, -34, 12};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 37);

        if(index >= 0) System.out.println("Index: " + index);
        else System.out.println("There isn't such number.");
    }
}
