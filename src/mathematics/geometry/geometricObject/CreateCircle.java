package mathematics.geometry.geometricObject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CreateCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle circle;

        try {
            System.out.println("Enter a radius:");
            circle = new Circle(Double.parseDouble(input.nextLine()));
        }
        catch (NumberFormatException ex) {
            return;
        }

        System.out.println("The circle has a radius = " + circle.getParameter());
        System.out.println("The circle area = " + new DecimalFormat("0.##").format(circle.getArea()));
        System.out.println("The circle perimeter = " + new DecimalFormat("0.##").format(circle.getPerimeter()));

        try {
            System.out.println("Enter a radius increment in percents:");
            circle.resize(Integer.parseInt(input.nextLine()));

            System.out.println("The circle has a radius = " + circle.getParameter());
            System.out.println("The circle area = " + new DecimalFormat("0.##").format(circle.getArea()));
            System.out.println("The circle perimeter = " + new DecimalFormat("0.##").format(circle.getPerimeter()));
        }
        catch (NumberFormatException ex) {
            System.err.println("The input must be an integer!");
        }
    }
}



//Tests

//6
//The circle has a radius = 6.0
//The circle area = 113,1
//The circle perimeter = 37,7
//Enter a radius increment in percents:
//50
//The circle has a radius = 9.0
//The circle area = 254,47
//The circle perimeter = 56,55


//8.12
//The circle has a radius = 8.12
//The circle area = 207,14
//The circle perimeter = 51,02
//Enter a radius increment in percents:
//10
//The circle has a radius = 8.932
//The circle area = 250,64
//The circle perimeter = 56,12
