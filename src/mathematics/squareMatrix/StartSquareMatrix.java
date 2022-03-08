package mathematics.squareMatrix;

import java.util.Scanner;

public class StartSquareMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SquareMatrix myMatrix;

        try {
            System.out.println("Enter a size:");
            int num = Integer.parseInt(input.nextLine());
            myMatrix = new SquareMatrix(num);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        myMatrix.fillTheMatrix();

        System.out.println();
        myMatrix.print();

        System.out.println();
        myMatrix.calculateTrace();

        System.out.println("\nDeterminant = " + myMatrix.calculateDeterminant());

        myMatrix.turn();

        System.out.println();
        myMatrix.print();
    }
}
