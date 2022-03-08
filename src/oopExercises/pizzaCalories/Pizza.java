package oopExercises.pizzaCalories;

public class Pizza {
    private String name;
    private Dough dough;
    private Topping[] topping;
    private int counterOfToppings = 0;


    public Pizza(String name, int count) {
        this.setName(name);
        if(count < 0 || count > 10) throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        this.topping = new Topping[count];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 1 || name.length() > 15) throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        this.name = name;
    }

    public void setDough(String type, String kind, double doughWeight) {
        dough = new Dough(type, kind, doughWeight);
    }

    public void setTopping(String toppingType, double toppingWeight) {
        if(counterOfToppings < topping.length) {
            topping[counterOfToppings] = new Topping(toppingType, toppingWeight);
            counterOfToppings++;
        }
    }

    public int getCounterOfToppings() {
        return counterOfToppings;
    }

    public double calculatePizzaCalories() {
        double toppingCalories = 0.0;

        for(int a = 0; a < this.counterOfToppings; a++) {
            toppingCalories += topping[a].calculateToppingCalories();
        }

        return this.dough.calculateDoughCalories() + toppingCalories;
    }

    @Override
    public String toString() {
        return String.format("%s – %.2f", name, calculatePizzaCalories());
    }
}
