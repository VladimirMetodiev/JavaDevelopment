package oop.vehicle;

import java.util.Scanner;

public class StartVehicle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String producer, model, engineType;
        double availableFuel, tankVolume, cargoWeight;
        int passengerNumber;

        producer = input.nextLine();
        model = input.nextLine();
        engineType = input.nextLine().toLowerCase();

        Car car = new Car(producer, model, engineType);
        car.start();
        car.accelerate(25);
        car.accelerate(35);
        car.accelerate(40);
        car.stop();

        System.out.println();

        producer = input.nextLine();
        model = input.nextLine();
        engineType = input.nextLine().toLowerCase();
        availableFuel = Double.parseDouble(input.nextLine());
        tankVolume = Double.parseDouble(input.nextLine());
        passengerNumber = Integer.parseInt(input.nextLine());

        Bus bus = new Bus(producer, model, engineType, availableFuel, tankVolume, passengerNumber);
        bus.pickUpPassengers(35);
        bus.start();
        bus.accelerate(15);
        bus.accelerate(30);
        bus.accelerate(35);
        bus.stop();
        bus.releasePassengers(35);

        System.out.println();

        producer = input.nextLine();
        model = input.nextLine();
        engineType = input.nextLine().toLowerCase();
        availableFuel = Double.parseDouble(input.nextLine());
        tankVolume = Double.parseDouble(input.nextLine());
        cargoWeight = Double.parseDouble(input.nextLine());

        Lorry articulatedLorry = new Lorry(producer, model, engineType, availableFuel, tankVolume, cargoWeight);
        articulatedLorry.load();
        articulatedLorry.start();
        articulatedLorry.accelerate(20);
        articulatedLorry.accelerate(30);
        articulatedLorry.accelerate(30);
        articulatedLorry.stop();
        articulatedLorry.unload();
        articulatedLorry.fuelUp(100);

        input.close();
    }
}



//Test

//BMW
//M850i xDrive
//petrol
//Mercedes
//Tourismo
//diesel
//300
//480
//51
//MAN
//TGX 35.560
//diesel
//450
//600
//35000



//Test information

//car

//BMW
//series 3
//318i
//sedan
//hybrid
//156 horsepower
//8.4 s from 0 to 100 acceleration
//223 maximal speed
//60 l fuel tank
//42 kWh battery volume
//6.2 l/100 km
//94350 BGN price

//BMW
//series 8
//M850i xDrive
//coupe
//petrol
//530 horsepower
//3.7 s from 0 to 100 acceleration
//250 maximal speed
//60 l fuel tank
//9.8 l/100 km
//187150 BGN price


//bus

//Mercedes
//Tourismo
//diesel
//length 12295 mm
//width 2550 mm
//height 3680 mm
//Seats 51
//389.9 horsepower
//160 maximal speed
//480 l fuel tank


//lorry - articulated lorry

//MAN
//TGX 35.560
//diesel
//length 2280 mm
//width 2440 mm
//height 2150 mm
//640 horsepower
//120 maximal speed
//600 l fuel tank
