package oop.cars;

public class Car extends Auto {
    public Car(String producer, String model, String engineType, int horsepower, double maxSpeed, double availableFuel, double tankVolume) {
        super(producer, model, engineType, horsepower, maxSpeed, availableFuel, tankVolume);
        System.out.println("The car was initialized.");
    }
}
