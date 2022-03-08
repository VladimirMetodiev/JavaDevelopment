package oop.cars;

public class Auto extends Engine {
    private String producer = null;
    private String model = null;
    private EngineType engineType = EngineType.UNKNOWN;
    private boolean isTheCarRunning = false;
    private double currentSpeed = 0d;

    public Auto(double availableFuel, double tankVolume, String producer, String model, EngineType engineType) {
        super(availableFuel, tankVolume);
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
    }

    public Auto(String producer, String model, String engineType, int horsepower, double maxSpeed, double availableFuel, double tankVolume) {
        super(availableFuel, tankVolume, horsepower, maxSpeed);
        this.producer = producer;
        this.model = model;
        switch (engineType){
            case "petrol": this.engineType = EngineType.PETROL; break;
            case "diesel": this.engineType = EngineType.DIESEL; break;
            case "gas": this.engineType = EngineType.GAS; break;
            case "electric": this.engineType = EngineType.ELECTRIC; break;
            case "hybrid-petrol": this.engineType = EngineType.HYBRID_PETROL_ELECTRIC; break;
            case "hybrid-gas": this.engineType = EngineType.HYBRID_GAS_ELECTRIC; break;
            default: this.engineType = EngineType.UNKNOWN; break;
        }
    }

    protected String getProducer() {
        return producer;
    }

    protected void setProducer(String producer) {
        this.producer = producer;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected EngineType getEngineType() {
        return engineType;
    }

    protected void setEngineType(String engineType) {
        switch (engineType){
            case "petrol": this.engineType = EngineType.PETROL; break;
            case "diesel": this.engineType = EngineType.DIESEL; break;
            case "gas": this.engineType = EngineType.GAS; break;
            case "electric": this.engineType = EngineType.ELECTRIC; break;
            case "hybrid-petrol": this.engineType = EngineType.HYBRID_PETROL_ELECTRIC; break;
            case "hybrid-gas": this.engineType = EngineType.HYBRID_GAS_ELECTRIC; break;
            default: this.engineType = EngineType.UNKNOWN; break;
        }
    }

    protected void start(){
        isTheCarRunning = true;
        work();
        System.out.println("The car is starting.");
    }

    protected void stop(){
        currentSpeed = 0d;
        isTheCarRunning = false;
        System.out.println("The car has stopped.");
    }

    protected void accelerate(double acceleration){
        if(isTheCarRunning){
            if(currentSpeed + acceleration < getMaxSpeed()){
                currentSpeed += acceleration;
            }
            else{
                currentSpeed = getMaxSpeed();
            }
        }

        System.out.printf("The car accelerates. The current speed is %.1f.%n", currentSpeed);
    }

    protected void decelerate(double deceleration){
        if(isTheCarRunning && currentSpeed > 0){
            if(currentSpeed - deceleration > 0){
                currentSpeed -= deceleration;
                System.out.printf("The car decelerates. The current speed is %.1f.%n", currentSpeed);
            }
            else{
                stop();
            }
        }
    }

    @Override
    public void off () {
        if(!isTheCarRunning) {
            System.out.println("The engine was off.");
        }
        else{
            System.out.println("The vehicle is moving. It isn't off.");
        }
    }

    @Override
    public String toString(){
        return String.format("%s model %s with %s engine, %d horsepower and max speed %.1f km/h.", producer, model, getEngineType(), getHorsepower(), getMaxSpeed());
    }
}
