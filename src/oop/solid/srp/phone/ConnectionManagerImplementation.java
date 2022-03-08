package oop.solid.srp.phone;

public class ConnectionManagerImplementation implements ConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connection established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected successfully");
    }
}
