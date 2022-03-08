package oopExercises.shoppingSpree;

import java.util.ArrayList;

public class Consumer {
    private String name;
    private double money;
    private ArrayList<Product> bagOfProducts;

    public Consumer(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) throw new IllegalArgumentException("Name cannot be an empty string");
        this.name = name;
    }

    public void setMoney(double money) {
        if(money < 0) throw new IllegalArgumentException("Money cannot be a negative number");
        this.money = money;
    }

    public void addProduct(String product, double price) {
        if(price > money) throw new IllegalArgumentException(this.name + " can't afford " + product);
        bagOfProducts.add(new Product(product, price));
        System.out.printf("%s bought %s%n", name, product);
        money -= price;
    }

    public void printReport(){
        System.out.printf("%s has %.2f and he/she bought: ", name, money);

        if (bagOfProducts.size() > 0) {
            for (int a = 0; a < bagOfProducts.size(); a++) {
                if (a < bagOfProducts.size() - 1) System.out.printf("%s, ", bagOfProducts.get(a).getName());
                else System.out.println(bagOfProducts.get(a).getName());
            }
        }
        else {
            System.out.println("Nothing");
        }
    }
}
