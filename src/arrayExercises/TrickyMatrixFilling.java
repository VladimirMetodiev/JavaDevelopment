package arrayExercises;

import java.util.Scanner;

public class TrickyMatrixFilling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data = input.nextLine().split(",\\s+");


        int[][] array = new int[Integer.parseInt(data[0])][Integer.parseInt(data[0])];

        if(data[1].equals("A")) {
            array = getPatternA(array);
        }
        else if(data[1].equals("B")) {
            array = getPatternB(array);
        }

        for(int[] a : array) {
            for(int el : a) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getPatternA(int[][] arr) {
        int counter = 1;
        for (int a = 0; a < arr[0].length; a++) {
            for (int b = 0; b < arr.length; b++) {
                arr[b][a] = counter++;
            }
        }
        return arr;
    }

    private static int[][] getPatternB(int[][] arr) {
        int counter = 1;
        for (int a = 0; a < arr[0].length; a++) {
            if (a % 2 == 0) {
                for (int b = 0; b < arr.length; b++) {
                    arr[b][a] = counter++;
                }
            }
            else {
                for (int b = arr.length - 1; b >= 0; b--) {
                    arr[b][a] = counter++;
                }
            }
        }
        return arr;
    }
}



//Tests

//2, A
//1 3
//2 4

//2, B
//1 4
//2 3

//3, A
//1 4 7
//2 5 8
//3 6 9

//3, B
//1 6 7
//2 5 8
//3 4 9

//4, A
//1 5 9 13
//2 6 10 14
//3 7 11 15
//4 8 12 16

//4, B
//1 8 9 16
//2 7 10 15
//3 6 11 14
//4 5 12 13

//7, B
//1 14 15 28 29 42 43
//2 13 16 27 30 41 44
//3 12 17 26 31 40 45
//4 11 18 25 32 39 46
//5 10 19 24 33 38 47
//6 9 20 23 34 37 48
//7 8 21 22 35 36 49
