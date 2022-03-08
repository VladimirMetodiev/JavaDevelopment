package oopExercises.carTracking;

public class CourierCar {
    private String carModel;
    private Engine engine;
    private Cargo cargo;
    private Tires tires;

    public CourierCar(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType, double Tire1Pressure, int Tire1Age, double Tire2Pressure, int Tire2Age, double Tire3Pressure, int Tire3Age, double Tire4Pressure, int Tire4Age) {
        this.carModel = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires = new Tires(Tire1Pressure, Tire1Age, Tire2Pressure, Tire2Age, Tire3Pressure, Tire3Age, Tire4Pressure, Tire4Age);
    }

    public String getCarModel() {
        return carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tires getTires() {
        return tires;
    }
}
