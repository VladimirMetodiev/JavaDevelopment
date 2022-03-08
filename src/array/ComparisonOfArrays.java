package array;

import java.util.Arrays;

public class ComparisonOfArrays {
    public static void main(String[] args) {
        /*
         * Съдържанието на два масива, може да бъде сравнено с метода equals на КЛАСЪТ Arrays.
         * Методът equals (на Object) сравнява дали двете референции (на двата масива) водят до един и същ обект.
         */

        int[] first = {2, 4, 6, 8, 10};
        int[] second = {2, 4, 6, 8, 10};
        boolean one = Arrays.equals(first, second);
        System.out.println(one);

        System.out.println(first.equals(second));

        int[][] third = {{1, 2}, {3, 4}};
        int[][] fourth = {{1, 2}, {3, 5}};
        boolean two = Arrays.deepEquals(third, fourth);
        System.out.println(two);

    }
}
