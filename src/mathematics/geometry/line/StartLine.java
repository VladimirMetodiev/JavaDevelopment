package mathematics.geometry.line;

import mathematics.geometry.point.Point;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StartLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(">>> Create a new line");
        System.out.println("Enter the coordinates X1 and Y1:");
        Point beginning = new Point(input.nextInt(), input.nextInt());
        System.out.println("Enter the coordinates X2 and Y2:");
        Point end = new Point(input.nextInt(), input.nextInt());

        Line theFirst = new Line(beginning, end);

        System.out.println(theFirst);
        System.out.println("Its length is: " + new DecimalFormat("0.##").format(theFirst.getLength()));

        System.out.println("--------------------------------------------------");

        System.out.println(">>> Create a new line");
        System.out.print("Enter X1 = ");
        int x1 = input.nextInt();
        System.out.print("Enter Y1 = ");
        int y1 = input.nextInt();
        System.out.print("Enter X2 = ");
        int x2 = input.nextInt();
        System.out.print("Enter Y2 = ");
        int y2 = input.nextInt();

        Line theSecond = new Line(x1, y1, x2, y2);

        System.out.println(theSecond);
        System.out.println("Its length is: " + new DecimalFormat("0.##").format(theSecond.getLength()));

        System.out.println("--------------------------------------------------");

        Line theThird = new Line();

        System.out.println(">>> Create a new line");
        System.out.print("Enter X1 = ");
        x1 = input.nextInt();
        System.out.print("Enter Y1 = ");
        y1 = input.nextInt();
        theThird.setA(x1, y1);
        System.out.print("Enter X2 = ");
        x2 = input.nextInt();
        System.out.print("Enter Y2 = ");
        y2 = input.nextInt();
        theThird.setB(x2, y2);

        System.out.println(theThird);
        System.out.println("Its length is: " + new DecimalFormat("0.##").format(theThird.getLength()));

        System.out.println("--------------------------------------------------");
    }
}
