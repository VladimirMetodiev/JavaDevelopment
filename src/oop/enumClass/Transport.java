package oop.enumClass;

public enum Transport {
    CAR(75), VAN(65), BUS(60), LORRY(70), TRAIN(80), AIRPLANE(900);

    private int typicalSpeed;

    Transport(int speed) {
        this.typicalSpeed = speed;
    }

    int getSpeed() { return typicalSpeed; }
}
