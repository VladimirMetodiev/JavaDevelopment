package oop.solid.srp.phone;

public class PhoneClient {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(new ConnectionManagerImplementation(), new DataManagerImplementation());

        smartPhone.dial("+359888888888");
        smartPhone.send("How are you?");
        smartPhone.receive();
        smartPhone.disconnect();
    }
}
