package oopExercises.shoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) throw new IllegalArgumentException("Name cannot be an empty string");
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost < 0) throw new IllegalArgumentException("Money cannot be a negative number");
        this.cost = cost;
    }
}
