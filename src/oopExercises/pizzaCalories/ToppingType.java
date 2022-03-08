package oopExercises.pizzaCalories;

public enum ToppingType {
    MEAT(1.2), VEGGIES(0.8), CHEESE(1.1), SAUCE(0.9), UNKNOWN(0.0);

    private double modifier;

    ToppingType(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
