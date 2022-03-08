package basicSyntaxExercises;

import java.util.Scanner;

public class Discount {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity:");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.println("Enter a price:");
        double price = Double.parseDouble(input.nextLine());
        double discount = 0.25;
        double cost;

        cost = quantity >= 10 ? quantity * price * (1 - discount) : quantity * price;

        System.out.printf("The cost is: %.2f", cost);
    }
}
