package oopExercises.shoppingSpree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StartShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data;
        String expression;
        ArrayList<Consumer> consumers = new ArrayList<>();
        ArrayList<Product> goods = new ArrayList<>();

        String[] rawData = input.nextLine().split(";");

        for (int a = 0; a < rawData.length; a++) {
            data = rawData[a].split("=");
            try{
                consumers.add(new Consumer(data[0], Double.parseDouble(data[1])));
            }
            catch(NumberFormatException ex1) {
                System.out.println("Money must be numbers");
            }
            catch(IllegalArgumentException ex2) {
                System.out.println(ex2.getMessage());
            }
        }

        rawData = input.nextLine().split(";");

        for (int b = 0; b < rawData.length; b++) {
            data = rawData[b].split("=");
            try{
                goods.add(new Product(data[0], Double.parseDouble(data[1])));
            }
            catch(NumberFormatException ex1) {
                System.out.println("Money must be numbers");
            }
            catch(IllegalArgumentException ex2) {
                System.out.println(ex2.getMessage());
            }
        }

        while(!(expression = input.nextLine()).equalsIgnoreCase("end")) {
            data = expression.split(",\\s+");

            try{
                int index = getProductIndex(goods, data[1]);
                Product current = goods.get(index);

                index = getCustomerIndex(consumers, data[0]);
                consumers.get(index).addProduct(current.getName(), current.getCost());
            }
            catch(NumberFormatException ex1) {
                System.out.println("Money must be numbers");
            }
            catch(IllegalArgumentException ex2) {
                System.out.println(ex2.getMessage());
            }
            catch (Exception ex3) {
                System.out.println("There isn't such subject");
            }
        }

        consumers.sort(Comparator.comparing(Consumer::getName));

        System.out.println("REPORT:");

        for (Consumer consumer : consumers) {
            consumer.printReport();
        }
    }

    private static int getProductIndex(ArrayList<Product> list, String name) {
        int result = -1;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)) {
                result = i;
                break;
            }
        }

        return result;
    }

    private static int getCustomerIndex(ArrayList<Consumer> list, String name) {
        int result = -1;

        for (int k = 0; k < list.size(); k++) {
            if(list.get(k).getName().equals(name)) {
                result = k;
                break;
            }
        }

        return result;
    }
}



//Tests - да обърна внимание, че на първи ред получавам списък с клиенти, а на втори ред - списък с продукти и цени

//Peter=21;Nicola=4
//Bread=1;Coffee package=5.6;Soap=1.65;Milk=1.5;
//Peter, Bread
//Nicola, Milk
//Nicola, Coffee package
//Peter, Milk
//Peter, Soap
//END


//Nina=0
//Coffee package=5.6
//Nina, Coffee package
//END


//Ivan=-150
//Coffee package=5.6;
//Ivan, Coffee package
//END


//Irina=10
//Bread=1;Coffee package=5.6;Soap=1.65;Milk=1.5;Yogurt=-1
//Irina, Bread
//Irina, Yogurt
//Irina, Coffee package
//Irina, Coffee package
//END


//Vladimir=16.25;Sarah=86.4;Peter=200;Nicola=2.6;Eva=1000;Ivan=20
//Bread=1;Coffee package=5.6;Soap=1.65;Milk=1.5;Yogurt=0.8;Mineral water=1.2;Beer=2.6;Ice-cream box=4.6;Box of eggs=1.8;Butter=3.6;Tin of fish=2.65;Chocolates=3.89
//Sarah, Chocolates
//Sarah, Coffee package
//Sarah, Soap
//Peter, Bread
//Peter, Tin of fish
//Peter, Box of eggs
//Peter, Beer
//Nicola, Bread
//Nicola, Tin of fish
//Alex, Ice-cream box
//Vladimir, Milk
//Vladimir, Yogurt
//Vladimir, Yogurt
//Eva, Bread
//Eva, Butter
//Eva, Box of eggs
//Eva, Mineral water
//Eva, Chocolates
//END
