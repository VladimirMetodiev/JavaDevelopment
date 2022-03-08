package oop.solid.srp.phone;

public class DataManagerImplementation implements DataManager {

    @Override
    public void send(String message) {
        System.out.println("data send successfully");
    }

    @Override
    public int receive() {
        System.out.println("data received successfully");
        return 0;
    }
}
