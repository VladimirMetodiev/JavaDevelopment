package oopExercises.carTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckUp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        ArrayList<CourierCar> cars = new ArrayList<>();

        for (int a = 0; a < number; a++) {
            String[] data = reader.readLine().split("\\s+");
            cars.add(new CourierCar(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), Integer.parseInt(data[6]), Double.parseDouble(data[7]), Integer.parseInt(data[8]), Double.parseDouble(data[9]), Integer.parseInt(data[10]), Double.parseDouble(data[11]), Integer.parseInt(data[12])));
        }

        switch (reader.readLine()){
            case "fragile": {
                cars.stream().filter(car -> car.getCargo().getCargoType().equals("fragile") && (car.getTires().getTire1Pressure() < 1 || car.getTires().getTire2Pressure() < 1 || car.getTires().getTire3Pressure() < 1 || car.getTires().getTire4Pressure() < 1)).forEach(car -> System.out.println(car.getCarModel()));
                break;
            }
            case "flamable": {
                cars.stream().filter(car -> car.getCargo().getCargoType().equals("flamable") && (car.getEngine().getEnginePower() > 250 || car.getEngine().getEnginePower() > 250 || car.getEngine().getEnginePower() > 250 || car.getEngine().getEnginePower() > 250)).forEach(car -> System.out.println(car.getCarModel()));
                break;
            }
            default: break;
        }

        reader.close();
    }
}



//Condition

//You are the owner of a courier company and want to make a system for tracking your cars and their cargo. Define a class Car
//that holds information about model, engine, cargo and a collection of exactly 4 tires. The engine, cargo and tire should be separate classes,
//create a constructor that receives all information about the Car and creates and initializes its inner components (engine, cargo and tires).
//On the first line of input you will receive a number N - the number of cars you have, on each of the next N lines you will receive information
//about a car in the format “<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType> <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>”
//where the speed, power, weight and tire age are integers, tire pressure is a double.
//After the N lines you will receive a single line with one of 2 commands “fragile” or “flamable” , if the command is “fragile”
//print all cars whose Cargo Type is “fragile” with a tire whose pressure is  < 1, if the command is “flamable” print all cars
//whose Cargo Type is “flamable” and have Engine Power > 250. The cars should be printed in order of appearing in the input.



//Tests

//Input
//2
//ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4
//Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1
//fragile

//Output
//Citroen2CV


//Input
//4
//ChevroletExpress 215 255 1200 flamable 2.5 1 2.4 2 2.7 1 2.8 1
//ChevroletAstro 210 230 1000 flamable 2 1 1.9 2 1.7 3 2.1 1
//DaciaDokker 230 275 1400 flamable 2.2 1 2.3 1 2.4 1 2 1
//Citroen2CV 190 165 1200 fragile 0.8 3 0.85 2 0.7 5 0.95 2
//flamable

//Output
//ChevroletExpress
//DaciaDokker

