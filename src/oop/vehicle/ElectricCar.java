package oop.vehicle;

public class ElectricCar extends AutoParentClass {
    private int batteryVolume = 0;
    private int passengerNumber = 0;
    private boolean isBatteryCharge = false;

    public ElectricCar(String producer, String model, int batteryVolume, int passengerNumber) {
        super(producer, model, "electric");
        this.batteryVolume = batteryVolume;
        this.passengerNumber = passengerNumber;
    }

    public void chargeTheBattery(){
        isBatteryCharge = true;
        System.out.println("Battery is charging.");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public boolean isBatteryCharge() {
        return isBatteryCharge;
    }

    public void setBatteryCharge(boolean batteryCharge) {
        isBatteryCharge = batteryCharge;
    }
}
