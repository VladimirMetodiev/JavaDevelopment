package streamAPI;

import java.util.Arrays;

import static java.util.stream.IntStream.range;

public class HowToFillMatrixUsingStream {
    public static void main(String[] args) {

        int[][] numbers = range(1, 5)
                .mapToObj(a -> range(1, 7).toArray())
                .toArray(int[][]::new);

        printTheMatrix(numbers);
    }

    private static void printTheMatrix(int[][] m) {
        for (int[] arr : m) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
