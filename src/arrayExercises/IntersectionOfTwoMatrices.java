package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = Integer.parseInt(input.nextLine());
        int columns = Integer.parseInt(input.nextLine());

        char[][] theFirst = new char[rows][columns];
        char[][] theSecond = new char[rows][columns];

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                if(b < columns - 1) theFirst[a][b] = input.next().charAt(0);
                else theFirst[a][b] = input.nextLine().trim().charAt(0);
            }
        }

        for (int c = 0; c < rows; c++) {
            for (int d = 0; d < columns; d++) {
                if(d < columns - 1) theSecond[c][d] = input.next().charAt(0);
                else theSecond[c][d] = input.nextLine().trim().charAt(0);
            }
        }

        for (int e = 0; e < rows; e++) {
            for (int f = 0; f < columns; f++) {
                if(theFirst[e][f] == theSecond[e][f]) System.out.print(theFirst[e][f] + " ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}



//Condition

//Write a program that reads two char matrices (A[][] and B[][]) of the same order M * N and prints third matrix C[][] which is filled
//with the intersecting elements of A and B, otherwise set the element to '*'. On the first two lines you receive M and N,
//then on 2 * M lines N characters – the matrices elements.
//The matrix elements may be any ASCII char except '*'.



//Test

//Input
//3
//4
//a b c d
//a b c d
//a b c d
//k b c k
//a b g d
//a k c d

//Output
//* b c *
//a b * d
//a * c d



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int rows = Integer.parseInt(input.nextLine());
//        int columns = Integer.parseInt(input.nextLine());
//
//        char[][] theFirst = new char[rows][columns];
//        char[][] theSecond = new char[rows][columns];
//
//        for (int a = 0; a < rows; a++) {
//            for (int b = 0; b < columns; b++) {
//                theFirst[a][b] = input.next().charAt(0);
//            }
//            input.nextLine();
//        }
//
//        for (int c = 0; c < rows; c++) {
//            for (int d = 0; d < columns; d++) {
//                theSecond[c][d] = input.next().charAt(0);
//            }
//            input.nextLine();
//        }
//
//        for (int e = 0; e < rows; e++) {
//            for (int f = 0; f < columns; f++) {
//                if(theFirst[e][f] != theSecond[e][f]) System.out.print("* ");
//                else System.out.print(theFirst[e][f] + " ");
//            }
//            System.out.println();
//        }
//    }
