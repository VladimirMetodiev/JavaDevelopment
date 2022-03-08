package oopExercises.carTracking;

public class Cargo {
    private int CargoWeight;
    private String CargoType;

    public Cargo() {
    }

    public Cargo(int cargoWeight, String cargoType) {
        CargoWeight = cargoWeight;
        CargoType = cargoType;
    }

    public int getCargoWeight() {
        return CargoWeight;
    }

    public String getCargoType() {
        return CargoType;
    }
}
