package oop.solid.srp.phone;

public class SmartPhone implements ConnectionManager, DataManager {
    private ConnectionManager connection;
    private DataManager dataChannel;

    public SmartPhone(ConnectionManager connection, DataManager dataChannel) {
        this.connection = connection;
        this.dataChannel = dataChannel;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String message) {
        dataChannel.send(message);
    }

    @Override
    public int receive() {
        return dataChannel.receive();
    }
}
