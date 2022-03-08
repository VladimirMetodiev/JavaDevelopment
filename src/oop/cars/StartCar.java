package oop.cars;

import java.util.Scanner;

public class StartCar {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String command;
        Car car = null;
        Hybrid hybrid = null;

        do{
            System.out.println("Choose a car or a hybrid:");
            command = input.nextLine().toLowerCase();
            switch (command){
                case "car": car = initializeCar(); break;
                case "hybrid": hybrid = initializeHybrid(); break;
                default: break;
            }
        }
        while(!command.equals("car") & !command.equals("hybrid"));

        if(car != null){
            System.out.println("Choose action: \"start\", \"accelerate\", \"decelerate\", \"stop\", \"fuel up\", \"off\", \"info\", \"end\"");

            while(!(command = input.nextLine().toLowerCase()).equals("end")){
                switch (command){
                    case "start": car.start(); break;
                    case "accelerate": {
                        System.out.println("Enter acceleration:");
                        car.accelerate(Double.parseDouble(input.nextLine()));
                        break;
                    }
                    case "decelerate": {
                        System.out.println("Enter deceleration:");
                        car.decelerate(Double.parseDouble(input.nextLine()));
                        break;
                    }
                    case "stop": car.stop(); break;
                    case "fuel up": {
                        System.out.println("Enter quantity of fuel:");
                        car.fuelUp(Double.parseDouble(input.nextLine()));
                        break;
                    }
                    case "off": car.off(); break;
                    case "info": System.out.println(car.toString()); break;
                    default: System.out.println("Wrong command!"); break;
                }
            }
        }
        else{
            System.out.println("Choose action: \"start\", \"accelerate\", \"decelerate\", \"stop\", \"fuel up\", \"charge\", \"info\", \"end\"");

            try{
                while(!(command = input.nextLine().toLowerCase()).equals("end")){
                    switch (command){
                        case "start": hybrid.start(); break;
                        case "accelerate": {
                            System.out.println("Enter acceleration:");
                            hybrid.accelerate(Double.parseDouble(input.nextLine()));
                            break;
                        }
                        case "decelerate": {
                            System.out.println("Enter deceleration:");
                            hybrid.decelerate(Double.parseDouble(input.nextLine()));
                            break;
                        }
                        case "stop": hybrid.stop(); break;
                        case "fuel up": {
                            System.out.println("Enter quantity of fuel:");
                            hybrid.fuelUp(Double.parseDouble(input.nextLine()));
                            break;
                        }
                        case "charge": hybrid.chargeTheBattery(); break;
                        case "off": hybrid.off(); break;
                        case "info": System.out.println(hybrid.toString()); break;
                        default: System.out.println("Wrong command!"); break;
                    }
                }
            }
            catch(NullPointerException ex){
                ex.getStackTrace();
            }
        }
    }

    private static Car initializeCar(){
        System.out.println("Enter a producer:");
        String producer = input.nextLine();
        System.out.println("Enter model:");
        String model = input.nextLine();
        System.out.println("Enter engine type:");
        String engineType = input.nextLine().toLowerCase();
        System.out.println("Enter horsepower:");
        int horsepower = Integer.parseInt(input.nextLine());
        System.out.println("Enter maximal speed:");
        double maxSpeed = Double.parseDouble(input.nextLine());
        System.out.println("Enter available fuel:");
        double availableFuel = Double.parseDouble(input.nextLine());
        System.out.println("Enter tank volume:");
        double tankVolume = Double.parseDouble(input.nextLine());
        return new Car(producer, model, engineType, horsepower, maxSpeed, availableFuel, tankVolume);
    }

    private static Hybrid initializeHybrid(){
        System.out.println("Enter a producer:");
        String producer = input.nextLine();
        System.out.println("Enter model:");
        String model = input.nextLine();
        System.out.println("Enter engine type:");
        String engineType = input.nextLine().toLowerCase();
        System.out.println("Enter horsepower:");
        int horsepower = Integer.parseInt(input.nextLine());
        System.out.println("Enter maximal speed:");
        double maxSpeed = Double.parseDouble(input.nextLine());
        System.out.println("Enter available fuel:");
        double availableFuel = Double.parseDouble(input.nextLine());
        System.out.println("Enter tank volume:");
        double tankVolume = Double.parseDouble(input.nextLine());
        System.out.println("Enter battery volume:");
        int batteryVolume = Integer.parseInt(input.nextLine());
        System.out.println("Enter count of battery:");
        int countOfBattery = Integer.parseInt(input.nextLine());
        return new Hybrid(producer, model, engineType, horsepower, maxSpeed, availableFuel, tankVolume, batteryVolume, countOfBattery);
    }
}



//Test information

//BMW
//series 3
//318i
//sedan
//hybrid    (hybrid-petrol)
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

//FORD
//Focus
//hatchback
//diesel
//150 horsepower
//8.7 s from 0 to 100 acceleration
//210 maximal speed
//53 l fuel tank
//5.2 l/100 km
//46600 BGN price
