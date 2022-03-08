package oop.enumClass;

public class DisplayTypicalSpeed {
    public static void main(String[] args) {
        // В Java изброимият тип е клас, той може да има конструктор и променлива, която можем да вземем с гетер
        System.out.printf("The typical speed of %s is %d.%n%n", Transport.TRAIN, Transport.TRAIN.getSpeed());

        for(Transport item : Transport.values()){
            System.out.printf("The typical speed of %s is %d.%n", item, item.getSpeed());
        }
    }
}
