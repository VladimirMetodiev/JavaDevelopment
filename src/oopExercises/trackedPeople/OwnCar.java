package oopExercises.trackedPeople;

public class OwnCar {
    private String carModel;
    private int carSpeed;

    public OwnCar(String carModel) {
        this.carModel = carModel;
    }

    public OwnCar(String carModel, int carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarSpeed() {
        return carSpeed;
    }
}
