package oopExercises.meskliniteExpedition;

public class Seat {
    private int loadCapacity;
    private Reserved reserved = Reserved.NOT_RESERVED;

    public Seat(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public Reserved getReserved() {
        return reserved;
    }

    public void setReserved(Reserved reserved) {
        this.reserved = reserved;
    }
}
