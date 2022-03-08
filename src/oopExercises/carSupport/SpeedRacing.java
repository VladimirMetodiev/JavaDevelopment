package oopExercises.carSupport;

public class SpeedRacing {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private double distance = 0.0;

    public SpeedRacing(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
    }

    public void drive (String model, double amountOfKm) {
        if(amountOfKm * fuelCost <= fuelAmount) {
            fuelAmount -= amountOfKm * fuelCost;
            distance += amountOfKm;
        }
        else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public double getDistance() {
        return distance;
    }

    public String toString() {
        return String.format("%s %.2f %.0f", model, fuelAmount, distance);
    }
}
