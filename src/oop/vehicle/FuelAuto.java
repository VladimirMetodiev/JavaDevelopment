package oop.vehicle;

public class FuelAuto extends AutoParentClass {
    private double availableFuel = 0d;
    private double tankVolume = 0d;

    public FuelAuto(String producer, String model, String engineType, double availableFuel, double tankVolume) {
        super(producer, model, engineType);
        this.availableFuel = availableFuel;
        this.tankVolume = tankVolume;
    }

    public double getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(double availableFuel) {
        this.availableFuel = availableFuel;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void fuelUp(double fuelVolume){
        this.availableFuel += fuelVolume;
        System.out.println("Adding fuel.");
    }
}
