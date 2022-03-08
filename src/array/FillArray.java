package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FillArray {
    static final int EIGHT = 8;
    static final int NINE = 9;
    static final int TEN = 10;
    static final int HUNDRED = 100;
    static int current = 0;

    public static void main(String[] args) {
        int[] theFirstArray = new int[HUNDRED];

        Arrays.fill(theFirstArray, EIGHT);
        printArray(theFirstArray);

        int[] theSecondArray = IntStream.generate(() -> NINE).limit(HUNDRED).toArray();
        printArray(theSecondArray);
    }

    static void printArray(int[] arr){
        for (int a = 0; a < HUNDRED; a++) {
            if(++current == TEN){
                System.out.println(arr[a]);
                current = 0;
                continue;
            }
            System.out.print(arr[a] + ", ");
        }
        System.out.println();
    }
}
