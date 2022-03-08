package oop.cars;

public class Engine extends Fuel {
    private int horsepower = 0;
    private double maxSpeed = 0d;

    public Engine(double availableFuel, double tankVolume) {
        super(availableFuel, tankVolume);
    }

    public Engine(double availableFuel, double tankVolume, int horsepower, double maxSpeed) {
        super(availableFuel, tankVolume);
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
    }



    protected int getHorsepower() {
        return horsepower;
    }

    protected void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    protected double getMaxSpeed() {
        return maxSpeed;
    }

    protected void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void work () {
        System.out.println("The engine works.");
    }

    public void off () {
        System.out.println("The engine was off.");
    }
}
