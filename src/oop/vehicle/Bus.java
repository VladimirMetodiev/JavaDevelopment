package oop.vehicle;

public class Bus extends FuelAuto {
    private int passengerNumber = 0;

    public Bus(String producer, String model, String engineType, double availableFuel, double tankVolume, int passengerNumber) {
        super(producer, model, engineType, availableFuel, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("The bus was initialized.");
    }

    public void fuelUp(){
        double volume = getTankVolume() - getAvailableFuel();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(double fuelVolume) {
        double volume = getAvailableFuel() + fuelVolume;

        if(volume > getTankVolume()){
            setAvailableFuel(getTankVolume());
        }
    }
    // Когато преопределям метода, задължително името на метода и параметрите трябва да съвпадат с оригиналният метод
    // Когато оригиналният метод хвърля изключение, преопределеният метод трябва да хвърли по-специфично определено изключение
    // Например: оригиналният метод -> throws IOException, преопределеният метод -> throws FileNotFoundException

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passengerNumber){
        this.passengerNumber += passengerNumber;
        System.out.printf("Pick Up %d passengers.%n", passengerNumber);
    }

    public void releasePassengers(int passengerNumber){
        if(isRunning){
            stop();
        }
        this.passengerNumber -= passengerNumber;
        if(passengerNumber > 1) System.out.printf("%d passengers realised.%n", passengerNumber);
        else if(passengerNumber == 1) System.out.printf("%d passenger realised.%n", passengerNumber);
    }
}
