package oopExercises.aBox;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class StartABox {
    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);

        double length, width, height;

        try {
            System.out.println("Enter length:");
            length = Double.parseDouble(input.nextLine());
            Validator.isLengthValidReport(Validator.isValid(length));
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        try {
            System.out.println("Enter width:");
            width = Double.parseDouble(input.nextLine());
            Validator.isWidthValidReport(Validator.isValid(width));
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        try {
            System.out.println("Enter height:");
            height = Double.parseDouble(input.nextLine());
            Validator.isHeightValidReport(Validator.isValid(height));
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        Box myBox = new Box(length, width, height);

        Class boxClass = myBox.getClass();
        Field[] fields = boxClass.getDeclaredFields();
        System.out.println(Arrays
                .stream(fields)
                .filter(f -> Modifier.isPrivate(f.getModifiers())).count());

        System.out.printf("Surface Area – %.2f%n", myBox.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area – %.2f%n", myBox.calculateLateralSurfaceArea());
        System.out.printf("Volume – %.2f%n", myBox.calculateVolume());
    }
}



//Tests

//Input
//2
//3
//4

//Output
//3
//Surface Area – 52,00
//Lateral Surface Area – 40,00
//Volume – 24,00


//Input
//1.3
//1
//6

//Output
//3
//Surface Area – 30,20
//Lateral Surface Area – 27,60
//Volume – 7,80


//Input
//5.3
//3.8
//12.4

//Output
//3
//Surface Area – 265,96
//Lateral Surface Area – 225,68
//Volume – 249,74


//Input
//9
//5
//-6

//Output
//Height cannot be zero or negative.


//Input
//-2
//7.6
//13

//Output
//Length cannot be zero or negative.


//Input
//12.62
//-3.75
//14.9

//Output
//Width cannot be zero or negative.
