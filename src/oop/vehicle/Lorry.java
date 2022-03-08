package oop.vehicle;

public class Lorry extends FuelAuto {
    private double cargoWeight = 0d;

    public Lorry(String producer, String model, String engineType, double availableFuel, double tankVolume, double cargoWeight) {
        super(producer, model, engineType, availableFuel, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("The lorry was initialized.");
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void load(){
        System.out.println("Cargo loaded.");
    }

    public void unload(){
        System.out.println("Cargo unloaded.");
    }
}
