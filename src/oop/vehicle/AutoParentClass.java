package oop.vehicle;

public class AutoParentClass {
    private String producer = null;
    private String model = null;
    private EngineType engineType = EngineType.PETROL;
    private double currentSpeed = 0d;
    protected boolean isRunning = false;

    public AutoParentClass(){

    }

    public AutoParentClass(String producer, String model, String engineType) {
        this.producer = producer;
        this.model = model;
        if(engineType.equals("petrol")){
            this.engineType = EngineType.PETROL;
        }
        else if(engineType.equals("diesel")){
            this.engineType = EngineType.DIESEL;
        }
        else if(engineType.equals("electric")){
            this.engineType = EngineType.ELECTRIC;
        }
        else if(engineType.equals("hybrid")){
            this.engineType = EngineType.HYBRID;
        }
        else {
            this.engineType = EngineType.UNKNOWN;
        }
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if(engineType.equals("petrol")){
            this.engineType = EngineType.PETROL;
        }
        else if(engineType.equals("diesel")){
            this.engineType = EngineType.DIESEL;
        }
        else if(engineType.equals("electric")){
            this.engineType = EngineType.ELECTRIC;
        }
        else if(engineType.equals("hybrid")){
            this.engineType = EngineType.HYBRID;
        }
        else {
            this.engineType = EngineType.UNKNOWN;
        }
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void start(){
        isRunning = true;
        System.out.println("Vehicle is starting.");
    }

    public void stop(){
        isRunning = false;
        currentSpeed = 0.0;
        System.out.println("Vehicle has stopped.");
    }

    public void accelerate(double kilometersPerHour){
        currentSpeed += kilometersPerHour;
        System.out.printf("Accelerating. Current speed is %.1f km/h.%n", currentSpeed);
    }
}
