package oopExercises.running;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int discipline;
        double result;

        Running running = new Running();

        try {
            System.out.println("Enter one of the following disciplines: 100, 200, 400, 800, 1000");
            discipline = Integer.parseInt(input.nextLine());
            running.setDiscipline(discipline);
        }
        catch (NumberFormatException ex) {
            System.out.println("Wrong sport discipline!");
            return;
        }

        try{
            while (true) {
                System.out.println("Enter the result of the run in seconds:");
                result = Double.parseDouble(input.nextLine());
                if(result > 0) break;
            }

            running.setResult(result);
        }
        catch (NumberFormatException ex){
            System.out.println("Wrong result!");
            return;
        }

        running.announceTheResult();
    }
}
