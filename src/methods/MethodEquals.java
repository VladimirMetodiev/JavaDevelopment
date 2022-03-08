package methods;

import java.util.ArrayList;

public class MethodEquals {
    public static void main(String[] args) {
        /*
         * Методът .equals() принадлежи на клас Object, с него се сравняват променливи от референтен тип.
         * class Object -> public boolean equals(Object obj) { return (this == obj); }
         *
         * Когато сравнявам две референтни променливи, методът .equals() работи като "==", т.е. връща true,
         * ако и двете имат препратка към един и същи обект, или false ако имат препратки към различни обекти.
         * Въпреки че два обекта може да бъдат идентични, .equals() ще върне false, защото променливите им,
         * имат препратки, към два отделни обекта. За да сравня коректно тези обекти, трябва да преопределя .equals().
         *
         */

        Car car1 = new Car("BMW", "black", "V8");
        Car car2 = new Car("BMW", "black", "V8");
        Car car3 = new Car("Mitsubishi", "red", "V8");
        Car car4 = car3;

        System.out.println(car1 == car2); // false
        System.out.println(car1.equals(car2)); // връщаше false преди да преопределя .equals()

        System.out.println(car3 == car4); // true
        System.out.println(car3.equals(car4)); // true

        System.out.println("------------------------------");

        ArrayList<Car> cars = new ArrayList<>();

        Car car5 = new Car("Mitsubishi", "red", "V8");
        cars.add(car1);
        cars.add(car3);

        System.out.println(cars.contains(car5)); // метода .contains() също работи с метода .equals() на клас Object
    }
}

class Car {
    String brand;
    String colour;
    String engine;

    public Car(String brand, String colour, String engine) {
        this.brand = brand;
        this.colour = colour;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        /*
         * Първо проверявам дали obj е от клас Car
         * Ако е от клас Car, проверявам:
         * Дали полето obj.brand е еднакво с полето brand на извикващият обект
         * Дали полето obj.colour е еднакво с полето colour на извикващият обект
         * Дали полето obj.engine е еднакво с полето engine на извикващият обект
         * Ако всички тези проверки върнат true, тогава метода .equals() връща true
         */

        if(obj instanceof Car) {
            // При сравненията, задължително трябва да преобразувам obj в Car
            return brand.equals(((Car) obj).brand) && colour.equals(((Car) obj).colour) && engine.equals(((Car) obj).engine);
        }
        else {
            return false;
        }
    }
}