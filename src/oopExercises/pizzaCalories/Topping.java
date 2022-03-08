package oopExercises.pizzaCalories;

public class Topping {
    private ToppingType toppingType;
    private double weight;

    public Topping(String topping, double weight) {
        this.setToppingType(topping);
        this.setWeight(topping, weight);
    }

    public ToppingType getToppingType() {
        return toppingType;
    }

    public void setToppingType(String str) {
        ToppingType toppingType;

        switch (str.toLowerCase()) {
            case "meat": toppingType = ToppingType.MEAT; break;
            case "cheese": toppingType = ToppingType.CHEESE; break;
            case "veggies": toppingType = ToppingType.VEGGIES; break;
            case "sauce": toppingType = ToppingType.SAUCE; break;
            default: toppingType = ToppingType.UNKNOWN; break;
        }

        if(toppingType != ToppingType.MEAT &&
                toppingType != ToppingType.CHEESE &&
                toppingType != ToppingType.VEGGIES &&
                toppingType != ToppingType.SAUCE) throw new IllegalArgumentException("Cannot place " + str + " on top of your pizza.");

        this.toppingType = toppingType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(String str, double weight) {
        if(weight < 1 || weight > 50) throw new IllegalArgumentException(str + " weight should be in the range [1..50].");
        this.weight = weight;
    }

    public double calculateToppingCalories() {
        return 2.0 * weight * toppingType.getModifier();
    }
}
