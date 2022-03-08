package basicSyntaxExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double triangleArea = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);

        DecimalFormat df = new DecimalFormat("0.##");

        if(triangleArea > 0) System.out.println(df.format(triangleArea));
        else System.out.println(0);
    }
}



//Condition

//Write a program that reads 3 points in the plane (with integer x and y as coordinates), calculates and prints
//the area of the triangle composed by these 3 points. Round the result to a whole number. In case the three points
//do not form a triangle, print "0" as result.

//Formula: Triangle area = |(Ax * (By − Cy) + Bx * (Cy − Ay) + Cx * (Ay − By)) / 2|



//Tests

//1 1
//2 2
//3 3
//0

//2 3
//2 3
//5 4
//0

//53 18
//56 23
//24 27
//86

//-5 10
//25 30
//60 15
//575

