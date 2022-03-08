package oopExercises.carDealer;

public class Engine {
    private String model;
    private int power;
    private int displacement = -1;
    private String efficiency = "";

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
