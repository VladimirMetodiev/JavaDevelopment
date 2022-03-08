package oopExercises.pizzas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        String command;
        System.out.println("Enter a name of pizza:");
        String name = input.nextLine();
        System.out.println("Enter quantity:");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.println("Enter price:");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Enter size: S, M, L or XL");
        String size = input.nextLine().toLowerCase();

        Pizza newOrder = new Pizza(name, quantity, price, size);
        newOrder.calculateDeliveryPrice();

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("Choose command: \"cost\", \"discount\", \"order\", \"end\"");
        while(!(command = input.nextLine().toLowerCase()).equals("end")){
            switch (command){
                case "cost": System.out.println(df.format(newOrder.getCost())); break;
                case "discount": System.out.println(newOrder.getDiscount()); break;
                case "order": System.out.println(newOrder.toString()); break;
                default: System.out.println("Wrong command."); break;
            }
        }

        input.close();
    }
}



//Test information

//Margarita
//11.0

//Chickenita
//14.9

//Italian classic
//12.9

//Riveroni
//15.9

//Chick-Chi-Rick
//14.9

//Hawaii
//11.9

//Pizza Gaucho
//13.9
