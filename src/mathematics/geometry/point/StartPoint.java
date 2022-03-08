package mathematics.geometry.point;

import java.util.Arrays;
import java.util.Scanner;

public class StartPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Create a new point:");
        System.out.print("Enter x = ");
        int x = input.nextInt();
        System.out.print("Enter y = ");
        int y = input.nextInt();

        Point myPoint = new Point(x, y);

        System.out.println("Create a new point:");
        System.out.print("Enter x = ");
        x = input.nextInt();
        System.out.print("Enter y = ");
        y = input.nextInt();

        Point newPoint = new Point();
        newPoint.setPoint(x, y);

        System.out.println(myPoint);
        System.out.println("Point" + Arrays.toString(newPoint.getPoint()));
        System.out.println("Distance = " + myPoint.distanceBetweenTwoPoints(newPoint.getX(), newPoint.getY()));
    }
}



//Tests

//Input
//5
//8
//14
//19

//Output
//Point[5, 8]
//Point[14, 19]
//Distance = 14.212670403551895



//Input
//10
//15
//10
//15

//Output
//Point[10, 15]
//Point[10, 15]
//Distance = 0.0



//Input
//9
//21
//-3
//-11

//Output
//Point[9, 21]
//Point[-3, -11]
//Distance = 34.17601498127012
