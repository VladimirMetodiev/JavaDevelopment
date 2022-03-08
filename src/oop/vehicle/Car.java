package oop.vehicle;

public class Car extends AutoParentClass {
    public Car(String producer, String model, String engineType) {
        super(producer, model, engineType);
        System.out.println("The car was initialized.");
    }
}
