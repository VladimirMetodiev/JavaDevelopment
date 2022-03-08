package oop;

import java.util.ArrayList;

public class OperationInstanceOf {
    public static void main(String[] args) {
        /*
         * instanceof е бинарен оператор. Той се използва за проверка, дали даден обект е от даден клас. Ако обекта е от
         * посоченият клас, или може да бъде преобразуван към него, тогава операцията instanceof връща true,
         * в противен случай - връща false.
         *
         * Синтаксисът на оператора instanceof е следният:
         * (object) instanceof (type)
         *
         * Левият аргумент представлява референция към обект, най-често променлива или елемент на масив, докато десният
         * аргумент може да бъде клас, интерфейс или тип масив. Като десен аргумент не може да бъде използвана референция към
         * обект на клас java.lang.Class, нито String, представляващ името на класа.
         */

        /*
         * Преди да преобразувам неизвестен обект, трябва да проверя с instanceof дали е от сътветния клас.
         * Това помага да се избегне ClassCastException по време на изпълнение.
         */

        Car someCar = new Car("V8",4, 4, "Aston Martin");
        Lorry someLorry = new Lorry("V6", 4, 2, "Volvo FMX");
        System.out.println(someCar instanceof Car);
        System.out.println(someCar instanceof Vehicle);
        System.out.println(someLorry instanceof Vehicle);

        System.out.println("------------------------------");

        someLorry = null;
        System.out.println(someLorry instanceof Lorry);
        System.out.println(someLorry instanceof Vehicle);

        System.out.println("------------------------------");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        someLorry = new Lorry("V6", 4, 2, "Volvo FMX");
        vehicles.add(someCar);
        vehicles.add(someLorry);
        System.out.println(checkUp(vehicles, 0));
        System.out.println(checkUp(vehicles, 1));
    }

    private static boolean checkUp(ArrayList<Vehicle> array, int index) {
        if(array.get(index) instanceof Car) return true;
        else return false;
    }
}

class Vehicle {
    String engine;
    int countOfWheels;
    int countOfPassengers;

    public Vehicle(String engine, int countOfWheels, int countOfPassengers) {
        this.engine = engine;
        this.countOfWheels = countOfWheels;
        this.countOfPassengers = countOfPassengers;
    }

    public String getEngine() {
        return engine;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }
}

class Car extends Vehicle {
    String brand;

    public Car(String engine, int countOfWheels, int countOfPassengers, String brand) {
        super(engine, countOfWheels, countOfPassengers);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Lorry extends Vehicle {
    String brand;

    public Lorry(String engine, int countOfWheels, int countOfPassengers, String brand) {
        super(engine, countOfWheels, countOfPassengers);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
