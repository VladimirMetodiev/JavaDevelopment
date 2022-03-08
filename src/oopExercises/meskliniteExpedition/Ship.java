package oopExercises.meskliniteExpedition;

import java.util.List;

public class Ship {
    private List<Seat> passengerSeats;

    public Ship(List<Seat> passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public List<Seat> getPassengerSeats() {
        return passengerSeats;
    }
}
