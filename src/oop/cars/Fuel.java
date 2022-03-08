package oop.cars;

public class Fuel {
    private double availableFuel = 0d;
    private double tankVolume = 0d;

    public Fuel() {
    }

    public Fuel(double availableFuel, double tankVolume) {
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
        if(fuelVolume < tankVolume - availableFuel){
            this.availableFuel += fuelVolume;
            System.out.printf("You added %.1f l. fuel.%n", fuelVolume);
        }
        else if(fuelVolume >= (tankVolume - availableFuel)){
            if(tankVolume - availableFuel > 0) {
                double current = (tankVolume - availableFuel);
                this.availableFuel += current;
                System.out.printf("You added %.1f l. fuel.%n", current);
            }
            else{
                System.out.println("You didn't add fuel.");
            }
        }

    }
}
