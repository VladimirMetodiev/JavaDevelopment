package basicSyntaxExercises;

import java.util.Scanner;

public class XBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array = new int[8][32];
        String binary;
        int number, counter;

        for (int a = 0; a < 8; a++) {
            number = Integer.parseInt(input.nextLine());
            binary = Integer.toBinaryString(number);
            counter = 31;

            for (int b = binary.length() - 1; b >= 0; b--) {
                array[a][counter--] = binary.charAt(b) == 49 ? 1 : 0;
            }
        }

        counter = 0;

        for (int c = 0; c < 6; c++) {
            for (int d = 1; d < 30; d++) {
                if(array[c][d] == 1
                        && array[c][d + 1] == 0
                        && array[c][d + 2] == 1
                        && array[c + 1][d] == 0
                        && array[c + 1][d + 1] == 1
                        && array[c + 1][d + 2] == 0
                        && array[c + 2][d] == 1
                        && array[c + 2][d + 1] == 0
                        && array[c + 2][d + 2] == 1){
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}



//Condition

//You are given 8 positive 32-bit integer numbers. Write a program to count all X-bits.
//X-bits are groups of 9 bits (3 rows x 3 columns) forming the letter "X". Your task is to count all X-bits
//and print their count on the console. Valid X-bits consist of 3 numbers where their corresponding bit indexes
//are exactly {"101", "010", "101"}. All other combinations like: {"111", "010", "101"} or {"111", "111", "111"}
//are invalid. All valid X-bits can be part of multiple X-bits (with overlapping). Check the example on the right
//to understand your task better.

//Input
//The input data should be read from the console.
//On the first 8 lines, you will be given 8 32-bit positive integers.
//The input data will always be valid and in the format described. There is no need to check it explicitly.

//Output
//The output should be printed on the console. It should consist of exactly 1 line:
//At the first line print the count of the X-bits.

//Constraints
//The 8 input integers will be in the range [0 … 2 147 483 647].
//Allowed working time: 0.2 seconds. Allowed memory: 16 MB.



//Tests

//Input
//160
//64
//170
//4
//90
//167
//82
//165
//Output
//4


//Input
//7583
//1374
//12345
//8888
//91834
//1234
//1852
//24912
//Output
//0


//Input
//365
//146
//365
//365
//658
//365
//640
//160
//Output
//7



//Solutions

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        String binary = "";
//        int counter = 0, number, strPosition;
//        int[][] matrix = new int[8][32];
//
//        while(counter < 8){
//            number = Integer.parseInt(input.nextLine());
//            binary = Integer.toBinaryString(number);
//            strPosition = binary.length() - 1;
//
//            for (int position = 31; position >= 0; position--) {
//                if(position > 31 - binary.length()){
//                    if(binary.charAt(strPosition) == '0'){
//                        matrix[counter][position] = 0;
//                    }
//                    else if(binary.charAt(strPosition) == '1'){
//                        matrix[counter][position] = 1;
//                    }
//                }
//                else{
//                    break;
//                }
//
//                strPosition--;
//            }
//
//            counter++;
//        }
//
//        counter = 0;
//
//        for (int row = 0; row < 6; row++) {
//            for (int column = 1; column < 30; column++) {
//                if(matrix[row][column] == 1
//                        && matrix[row][column + 1] == 0
//                        && matrix[row][column + 2] == 1
//                        && matrix[row + 1][column] == 0
//                        && matrix[row + 1][column + 1] == 1
//                        && matrix[row + 1][column + 2] == 0
//                        && matrix[row + 2][column] == 1
//                        && matrix[row + 2][column + 1] == 0
//                        && matrix[row + 2][column + 2] == 1){
//                    counter++;
//                }
//            }
//        }
//
//        System.out.println(counter);
//    }



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int[][] matrix = new int[8][31];
//        int counter = 0;
//
//        for(int a = 0; a < 8; a++){
//            int number = Integer.parseInt(input.nextLine());
//            String binaryNumber = Integer.toBinaryString(number);
//
//            for(int b = matrix[a].length - 1; b >= 0; b--){
//                if(binaryNumber.length() - 31 + b < 0){
//                    break;
//                }
//                matrix[a][b] = Integer.parseInt("" + binaryNumber.charAt(binaryNumber.length() - 31 + b));
//            }
//        }
//
//        for(int c = 0; c < 6; c++){
//            for(int d = 0; rd < 29; d++){
//                if(matrix[c][d] == 1 &&
//                        matrix[c][d + 1] == 0 &&
//                        matrix[c][d + 2] == 1 &&
//                        matrix[c + 1][d] == 0 &&
//                        matrix[c + 1][d + 1] == 1 &&
//                        matrix[c + 1][d + 2] == 0 &&
//                        matrix[c + 2][d] == 1 &&
//                        matrix[c + 2][d + 1] == 0 &&
//                        matrix[c + 2][d + 2] == 1){
//                    counter++;
//                }
//            }
//        }
//
//        System.out.println(counter);
//    }
