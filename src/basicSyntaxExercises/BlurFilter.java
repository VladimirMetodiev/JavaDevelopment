package basicSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int blurAmount = Integer.parseInt(input.nextLine());
        int rows = input.nextInt();
        int columns = input.nextInt();
        input.nextLine();
        long[][] array = new long[rows][columns];

        for (int a = 0; a < rows; a++) {
            array[a] = Arrays.stream(input.nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        }

        int x = input.nextInt();
        int y = input.nextInt();
        input.nextLine();

        if(x >= 0 && y >= 0 && x < rows && y < columns){
            array[x][y] += blurAmount;
        }

        if(x - 1 >= 0 && y - 1 >= 0) array[x - 1][y - 1] += blurAmount;
        if(y - 1 >= 0) array[x][y - 1] += blurAmount;
        if(x + 1 < rows && y - 1 >= 0) array[x + 1][y - 1] += blurAmount;
        if(x - 1 >= 0) array[x - 1][y] += blurAmount;
        if(x + 1 < rows) array[x + 1][y] += blurAmount;
        if(x - 1 >= 0 && y + 1 < columns) array[x - 1][y + 1] += blurAmount;
        if(y + 1 < columns) array[x][y + 1] += blurAmount;
        if(x + 1 < rows && y + 1 < columns) array[x + 1][y + 1] += blurAmount;

        for(long[] arr : array){
            for(long element : arr){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}




//Condition

//Boris is a bad photo editor, but he wants to do some amazing pictures for his Facebook page. He can’t do it alone,
//so he needs your help. For each picture, you will be given a matrix with pixels. Each pixel has weight. The blur filter
//is applied to a certain cell (pixel) and all cells around it. The blur has amount, which needs to be added to
//the weight of the pixel that it blurs. Print the matrix after the blur applied as output.

//Example: on the picture on the left apply blur with amount 2 over the pixel at position [2, 2].

//Input
//The input data should be read from the console.
//The first line holds the blur amount.
//The second line holds the number of rows r and columns c separated by a space.
//The next r lines hold the matrix numbers. Each line holds c integers, separated by space.
//The last line holds the coordinates of the blur – row and column, separated by space.
//The input data will always be valid and in the format described. There is no need to check it explicitly.

//Output
//The output should consist of the matrix after the blur filter is applied.

//Constraints
//The blur amount will be an integer number in the range [-2,147,483,648...2,147,483,647].
//The pixel weight will be an integer number in range [-2,147,483,648...2,147,483,647].
//The number of rows and columns will be an integer number in the range [1...20].



//Tests

//Input
//5
//3 4
//4 4 4 4
//5 5 5 5
//6 6 6 6
//2 3

//Output
//4 4 4 4
//5 5 10 10
//6 6 11 11


//Input
//9
//3 3
//1 1 1
//1 1 1
//1 1 1
//1 1

//Output
//10 10 10
//10 10 10
//10 10 10


//Input
//3
//3 4
//0 -5 4 20
//0 20 4 -5
//20 4 -5 0
//1 2

//Output
//0 -2 7 23
//0 23 7 -2
//20 7 -2 3


//Input
//3
//3 4
//4 4 4 4
//5 5 5 5
//6 6 6 6
//0 0

//Output
//7 7 4 4
//8 8 5 5
//6 6 6 6


//Input
//6
//4 3
//4 4 4
//5 5 5
//6 6 6
//7 7 7
//2 0

//Output
//4 4 4
//11 11 5
//12 12 6
//13 13 7


//Input
//2
//4 3
//4 4 4
//5 5 5
//6 6 6
//7 7 7
//1 2

//Output
//4 6 6
//5 7 7
//6 8 8
//7 7 7


//Input
//1
//5 5
//1 2 3 4 5
//2 3 4 5 6
//3 4 5 6 7
//4 5 6 7 8
//5 6 7 8 9


//Output
//2 3 4 4 5
//3 4 5 5 6
//4 5 6 6 7
//4 5 6 7 8
//5 6 7 8 9



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int blurAmount = Integer.parseInt(input.nextLine());
//        int[] parameter = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        long[][] matrix = new long[parameter[0]][parameter[1]];
//
//        for (int i = 0; i < matrix.length; i++) {
//            int[] current = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = current[j];
//            }
//        }
//
//        parameter = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//
//        matrix[parameter[0]][parameter[1]] += blurAmount;
//
//        if(parameter[0] > 0){
//            matrix[parameter[0] - 1][parameter[1]] += blurAmount;
//            if(parameter[1] > 0){
//                matrix[parameter[0] - 1][parameter[1] - 1] += blurAmount;
//            }
//            if(parameter[1] < matrix[parameter[0]].length - 1){
//                matrix[parameter[0] - 1][parameter[1] + 1] += blurAmount;
//            }
//        }
//
//        if(parameter[0] < matrix.length - 1){
//            matrix[parameter[0] + 1][parameter[1]] += blurAmount;
//            if(parameter[1] > 0){
//                matrix[parameter[0] + 1][parameter[1] - 1] += blurAmount;
//            }
//            if(parameter[1] < matrix[parameter[0]].length - 1){
//                matrix[parameter[0] + 1][parameter[1] + 1] += blurAmount;
//            }
//        }
//
//        if(parameter[1] > 0){
//            matrix[parameter[0]][parameter[1] - 1] += blurAmount;
//        }
//
//        if(parameter[1] < matrix[parameter[0]].length - 1){
//            matrix[parameter[0]][parameter[1] + 1] += blurAmount;
//        }
//
//        for (int k = 0; k < matrix.length; k++) {
//            for (int l = 0; l < matrix[k].length; l++) {
//                System.out.print(matrix[k][l] + " ");
//            }
//            System.out.println();
//        }
//    }



//Bad solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int blurAmount = Integer.parseInt(input.nextLine());
//        int rows = input.nextInt();
//        int columns = input.nextInt();
//        input.nextLine();
//        int[][] array = new int[rows][columns];
//
//        for (int a = 0; a < rows; a++) {
//            array[a] = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        int x = input.nextInt();
//        int y = input.nextInt();
//        input.nextLine();
//
//        if(x >= 0 && y >= 0 && x < rows && y < columns){
//            array[x][y] += blurAmount;
//
//            if(x - 1 >= 0 && y - 1 >= 0) array[x - 1][y - 1] += blurAmount;
//            if(y - 1 >= 0) array[x][y - 1] += blurAmount;
//            if(x + 1 < rows && y - 1 >= 0) array[x + 1][y - 1] += blurAmount;
//            if(x - 1 >= 0) array[x - 1][y] += blurAmount;
//            if(x + 1 < rows) array[x + 1][y] += blurAmount;
//            if(x - 1 >= 0 && y + 1 < columns) array[x - 1][y + 1] += blurAmount;
//            if(y + 1 < columns) array[x][y + 1] += blurAmount;
//            if(x + 1 < rows && y + 1 < columns) array[x + 1][y + 1] += blurAmount;
//        }
//
//        for(int[] arr : array){
//            for(int element : arr){
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
//    }
