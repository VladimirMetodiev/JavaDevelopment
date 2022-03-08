package oopExercises.pokemonTrainer;

public class Pokemon {
    private String name;
    private String element;
    private double health;

    public Pokemon(String name, String element, double health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
