package oopExercises.pizzaCalories;

import java.util.Scanner;

public class CalculateCalories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command;
        String[] data = input.nextLine().split("\\s+");
        Pizza pizza = null;

        try {
            pizza = new Pizza(data[1], Integer.parseInt(data[2]));
        }
        catch (NumberFormatException ex1) {
            return;
        }
        catch (IllegalArgumentException ex2) {
            System.out.println(ex2.getMessage());
            return;
        }

        while(!(command = input.nextLine()).equalsIgnoreCase("end")) {
            data = command.split("\\s+");

            try {
                switch (data[0]) {
                    case "Dough": {
                        pizza.setDough(data[1], data[2], Double.parseDouble(data[3]));
                        break;
                    }
                    case "Topping": {
                        pizza.setTopping(data[1], Double.parseDouble(data[2]));
                        break;
                    }
                    default: break;
                }
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        //System.out.println(pizza.getCounterOfToppings());
        System.out.println(pizza);
    }
}



//Condition

//A Pizza is made of a dough and different toppings. You should model a class Pizza which should have a name, dough and
//toppings as fields. Every type of ingredient should have its own class. Every ingredient has different properties:
//the dough can be white or wholegrain and in addition it can be crispy, chewy or homemade. The toppings can be of type meat,
//veggies, cheese or sauce. Every ingredient should have a weight in grams and a method for calculating its calories
//according its type. Calories per gram are calculated through modifiers. Every ingredient has 2 calories per gram as
//a base and a modifier that gives the exact calories. For example, a white dough has a modifier of 1.5, a chewy dough
//has a modifier of 1.1, which means that a white chewy dough weighting 100 grams will have 100 * 1.5 * 1.1 = 330.00 total calories.
//Your job is to model the classes in such a way that they are properly encapsulated and to provide a public method for every pizza
//that calculates its calories according to the ingredients it has.

//White – 1.5;
//Wholegrain – 1.0;
//Crispy – 0.9;
//Chewy – 1.1;
//Homemade – 1.0;

//Meat – 1.2;
//Veggies – 0.8;
//Cheese – 1.1;
//Sauce – 0.9;

//The input for a pizza consists of several lines. On the first line is the pizza name and the number of toppings it has.
//On the second line you will get input for the dough. On the next lines, you will receive every topping the pizza has.
//The number of lines for the toppings will correspond to the number of toppings declared on the first line.
//If creation of the pizza was successful print on a single line the name of the pizza and the total calories it has.

//Input
//Pizza <Name> <count of the Topping>
//Dough <Type> <Kind> <weight>
//Topping <Topping type> <weight>

//The name of the pizza should not be an empty string. Also it should not be longer than 15 symbols. If it doesn't fit
//this throw and exception with the message "Pizza name should be between 1 and 15 symbols."
//The number of toppings should be in range [0...10]. If not, throw an exception with the message "Number of toppings should be in range [0..10]."

//Your task is to print the name of the pizza and the total pizza calories.



//Tests

//Input
//Pizza Meatless 2
//Dough Wholegrain Crispy 100
//Topping Veggies 50
//Topping Cheese 50
//END

//Output
//Meatless – 370.00



//Input
//Pizza Meat-pizza 5
//Dough White cheWy 200
//Topping Meat 50
//Topping Cheese 50
//Topping meat 20
//Topping sauce 10
//Topping Meat 30
//END

//Output
//Meat-pizza – 1028.00



//Input
//Pizza Pepperoni 20
//Dough Tip500 Bulgarian 100
//Topping Mozzarella 50
//Topping Cheese 50
//Topping Pepperoni 20
//Topping Meat 10
//END

//Output
//Number of toppings should be in range [0..10].



//Input
//Pizza Pepperoni 2
//Dough Tip500 Bulgarian 100
//Topping Mozzarella 50
//Topping Cheese 50
//Topping Pepperoni 20
//Topping Meat 10
//END

//Output
//Invalid type of dough.



//Input
//Pizza Pepperoni 2
//Dough White Chewy 100
//Topping Mozzarella 50
//Topping Cheese 50
//Topping Pepperoni 20
//Topping Meat 10
//END

//Output
//Cannot place Mozzarella on top of your pizza.



//Input
//Pizza Meat-pizza 3
//Dough White Chewy 100
//Topping meat 30
//END

//Output
//Meat-pizza – 402,00



//Input
//Pizza Meat-pizza 1
//Dough White Chewy 100
//Topping Mackerel 500
//END

//Output
//Cannot place Mackerel on top of your pizza.



//Input
//Pizza Meat-pizza 2
//Dough White Chewy 100
//Topping Meat 500
//END

//Output
//Meat weight should be in the range [1..50].



//Input
//Pizza Meat-pizza 1
//Dough White Chewy 200.25
//Topping Meat 50
//END

//Output
//Dough weight should be in the range [1..200].



//Input
//Pizza Cheese-pizza 3
//Dough Brown Crispy 180
//Topping Cheese 50
//END

//Output
//Invalid type of dough.



//Input
//Pizza Cheese-pizza 8
//Dough Wholegrain Crispy 175
//Topping Meat 50
//Topping Cheese 50
//Topping Veggies 25
//Topping Sauce 35
//Topping Meat 15
//Topping Cheese 20
//END

//Output
//Cheese-pizza – 728,00



//Input
//Pizza Cheese-pizza 6
//Dough Wholegrain Crispy 175
//Topping Meat 50
//Topping Cheese 50
//Topping Veggies 25
//Topping Sauce 35
//Topping Meat 15
//Topping Cheese 20
//Topping Veggies 15
//Topping Sauce 15
//END

//Output
//Cheese-pizza – 728,00
