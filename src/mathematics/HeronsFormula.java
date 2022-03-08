package mathematics;

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        double c = Double.parseDouble(input.nextLine());

        double semiPerimeter = (a + b + c) / 2.0;
        double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

        if(triangleArea > 0) {
            System.out.println(triangleArea);
        }
        else{
            System.out.println("These values can't be sides of a triangle.");
        }
    }
}



//Tests

//4
//3
//5
//6.0

//4
//13
//15
//24.0

//2
//3
//5
//These values can't be sides of a triangle.

//2
//3
//8
//These values can't be sides of a triangle.

