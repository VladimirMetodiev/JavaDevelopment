package oop.cars;

public class Hybrid extends Auto {
    private int batteryVolume = 0;
    private int countOfBattery = 0;
    private boolean isBatteryCharge = false;

    public Hybrid (String producer, String model, String engineType, int horsepower, double maxSpeed, double availableFuel, double tankVolume, int batteryVolume, int countOfBattery) {
        super(producer, model, engineType, horsepower, maxSpeed, availableFuel, tankVolume);
        this.batteryVolume = batteryVolume;
        this.countOfBattery = countOfBattery;
        isBatteryCharge = true;
        System.out.println("The hybrid car was initialized.");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getCountOfBattery() {
        return countOfBattery;
    }

    public void setCountOfBattery(int countOfBattery) {
        this.countOfBattery = countOfBattery;
    }

    public boolean isBatteryCharge() {
        return isBatteryCharge;
    }

    public void setBatteryCharge(boolean batteryCharge) {
        isBatteryCharge = batteryCharge;
    }

    public void chargeTheBattery(){
        isBatteryCharge = true;
        System.out.println("Battery is charging.");
    }

    @Override
    public String toString(){
        return String.format("%s model %s with %s engine, %d horsepower, %d kWh battery and maximal speed %.1f km/h.", getProducer(), getModel(), getEngineType(), getHorsepower(), batteryVolume, getMaxSpeed());
    }
}
