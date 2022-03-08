package oopExercises.carDealer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Consumer;

public class CheckUp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Engine> engines = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();
        int number, index = -1;
        String[] data;

        number = Integer.parseInt(reader.readLine());

        for (int a = 0; a < number; a++) {
            data = reader.readLine().split("\\s+");

            switch (data.length) {
                case 2: {
                    engines.add(new Engine(data[0], Integer.parseInt(data[1])));
                    break;
                }
                case 3: {
                    try {
                        engines.add(new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2])));
                    }
                    catch (Exception ex) {
                        engines.add(new Engine(data[0], Integer.parseInt(data[1]), data[2]));
                    }
                    break;
                }
                case 4: {
                    engines.add(new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]));
                    break;
                }
                default: break;
            }
        }

        number = Integer.parseInt(reader.readLine());

        for (int b = 0; b < number; b++) {
            data = reader.readLine().split("\\s+");

            for (int c = 0; c < engines.size(); c++) {
                if(engines.get(c).getModel().equals(data[1])) {
                    index = c;
                    break;
                }
            }

            switch (data.length) {
                case 2: {
                    cars.add(new Car(data[0], engines.get(index)));
                    break;
                }
                case 3: {
                    try {
                        cars.add(new Car(data[0], engines.get(index), Integer.parseInt(data[2])));
                    }
                    catch (Exception ex) {
                        cars.add(new Car(data[0], engines.get(index), data[2]));
                    }
                    break;
                }
                case 4: {
                    cars.add(new Car(data[0], engines.get(index), Integer.parseInt(data[2]), data[3]));
                    break;
                }
                default: break;
            }

        }

        Consumer<ArrayList<Car>> print = car -> {
            for (Car c : car) {
                System.out.println(c.getModel());
                System.out.println("  " + c.getEngine().getModel());
                System.out.println("    Power: " + c.getEngine().getPower());
                if(c.getEngine().getDisplacement() > -1) System.out.println("    Displacement: " + c.getEngine().getDisplacement());
                else System.out.println("    Displacement: n/a");
                if(!c.getEngine().getEfficiency().isEmpty()) System.out.println("    Efficiency: " + c.getEngine().getEfficiency());
                else System.out.println("    Efficiency: n/a");
                if(c.getWeight() > -1) System.out.println("    Weight: " + c.getWeight());
                else System.out.println("    Weight: n/a");
                if(!c.getColor().isEmpty()) System.out.println("    Color: " + c.getColor());
                else System.out.println("    Color: n/a");
            }
        };

        print.accept(cars);

        reader.close();
    }
}



//Condition

//Define two classes Car and Engine. A Car has a model, engine, weight and color. An Engine has model, power, displacement and efficiency.
//A Car’s weight and color and its Engine’s displacements and efficiency are optional.
//On the first line, you will read a number N which will specify how many lines of engines you will receive, on each of the next N lines
//you will receive information about an Engine in the following format “<Model> <Power> <Displacement> <Efficiency>”. After the lines with engines,
//on the next line you will receive a number M – specifying the number of Cars that will follow, on each of the next M lines information
//about a Car will follow in the following format “<Model> <Engine> <Weight> <Color>”, where the engine in the format will be
//the model of an existing Engine. When creating the object for a Car, you should keep a reference to the real engine in it,
//instead of just the engine’s model, note that the optional properties might be missing from the formats.
//Your task is to print each car (in the order you received them) and its information in the format defined bellow,
//if any of the optional fields has not been given print “n/a” in its place instead:
//<CarModel>:
//  <EngineModel>:
//    Power: <EnginePower>
//    Displacement: <EngineDisplacement>
//    Efficiency: <EngineEfficiency>
//  Weight: <CarWeight>
//  Color: <CarColor>



//Tests

//2
//V8-101 220 50
//V4-33 140 28 B
//3
//FordFocus V4-33 1300 Silver
//FordMustang V8-101
//VolkswagenGolf V4-33 Orange

//FordFocus
//  V4-33
//    Power: 140
//    Displacement: 28
//    Efficiency: B
//    Weight: 1300
//    Color: Silver
//FordMustang
//  V8-101
//    Power: 220
//    Displacement: 50
//    Efficiency: n/a
//    Weight: n/a
//    Color: n/a
//VolkswagenGolf
//  V4-33
//    Power: 140
//    Displacement: 28
//    Efficiency: B
//    Weight: n/a
//    Color: Orange



//4
//DSL-10 280 B
//V7-55 200 35
//DSL-13 305 55 A+
//V7-54 190 30 D
//4
//FordMondeo DSL-13 Purple
//VolkswagenPolo V7-54 1200 Yellow
//VolkswagenPassat DSL-10 1375 Blue
//FordFusion DSL-13

//FordMondeo
//  DSL-13
//    Power: 305
//    Displacement: 55
//    Efficiency: A+
//    Weight: n/a
//    Color: Purple
//VolkswagenPolo
//  V7-54
//    Power: 190
//    Displacement: 30
//    Efficiency: D
//    Weight: 1200
//    Color: Yellow
//VolkswagenPassat
//  DSL-10
//    Power: 280
//    Displacement: n/a
//    Efficiency: B
//    Weight: 1375
//    Color: Blue
//FordFusion
//  DSL-13
//    Power: 305
//    Displacement: 55
//    Efficiency: A+
//    Weight: n/a
//    Color: n/a