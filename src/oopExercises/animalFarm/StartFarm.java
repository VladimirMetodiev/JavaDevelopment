package oopExercises.animalFarm;

import java.util.ArrayList;
import java.util.Scanner;

public class StartFarm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Chicken> chickenFarm = new ArrayList<>();
        int count = Integer.parseInt(input.nextLine());

        for (int a = 0; a < count; a++) {
            try {
                System.out.println("Enter a name:");
                String name = input.nextLine();
                System.out.println("Enter age:");
                int age = Integer.parseInt(input.nextLine());
                chickenFarm.add(new Chicken(name, age));
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                a--;
            }
        }

        int total = 0;

        for(Chicken chicken : chickenFarm) {
            System.out.println(chicken);
            total += chicken.getProductPerMonth();
        }

        System.out.printf("Total production of the farm for one month: %d eggs.%n", total);
    }
}



//Tests
//4
//Bella
//5
//Regina
//8
//Minx
//-13
//Minx
//13
//Hussy
//3
