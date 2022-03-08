package basicSyntaxExercises;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startNumber = input.nextInt();
        int endNumber = input.nextInt();

        BigInteger product = BigInteger.ONE;

        for (int a = startNumber; a <= endNumber; a++) {
            product = product.multiply(BigInteger.valueOf(a));
        }

        System.out.printf("product[%d..%d] = %s", startNumber, endNumber, product);
    }
}



//Condition

//Write a program that calculates the product of all numbers in the interval [n..m] by given n and m.



//Tests

//1   5
//product[1..5] = 120

//3 20
//product[3..20] = 1216451004088320000

