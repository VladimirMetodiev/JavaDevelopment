package oopExercises.carSupport;

import java.util.ArrayList;
import java.util.Scanner;

public class StartCarDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());
        ArrayList<SpeedRacing> cars = new ArrayList<>();
        String[] data;
        String command;

        for (int a = 0; a < number; a++) {
            data = input.nextLine().split("\\s+");
            cars.add(new SpeedRacing(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2])));
        }

        while(!(command = input.nextLine()).equals("End")) {
            data = command.split("\\s+");
            if(data[0].equals("Drive")) {
                for(SpeedRacing car : cars) {
                    if(car.getModel().equals(data[1])) car.drive(data[1], Double.parseDouble(data[2]));
                }
            }
        }

        cars.forEach(car -> System.out.println(car));
    }
}



//Tests

//2
//AudiA4 23 0.3
//BMW-M2 45 0.42
//Drive BMW-M2 56
//Drive AudiA4 5
//Drive AudiA4 13
//End
//AudiA4 17,60 18
//BMW-M2 21,48 56


//3
//AudiA4 18 0.34
//BMW-M2 33 0.41
//Ferrari-488Spider 50 0.47
//Drive Ferrari-488Spider 97
//Drive Ferrari-488Spider 35
//Drive AudiA4 85
//Drive AudiA4 50
//End
//Insufficient fuel for the drive
//Insufficient fuel for the drive
//AudiA4 1,00 50
//BMW-M2 33,00 0
//Ferrari-488Spider 4,41 97
