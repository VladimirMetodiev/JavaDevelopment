package oopExercises.moveTheRobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveItToTheGoal {
    public static void main(String[] args) {
        int length, width, x, y;
        String id, direction, command;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            do {
                System.out.println("Enter length of the playground:");
                length = Integer.parseInt(reader.readLine());
            }
            while (length < 2 || length > 1000);

            do {
                System.out.println("Enter width of the playground:");
                width = Integer.parseInt(reader.readLine());
            }
            while (width < 2 || width > 1000);


            Playground playground = new Playground(length, width);
            Robot robot = new Robot();


            System.out.println("Enter an identifier of the robot:");
            id = reader.readLine();

            do {
                System.out.println("Enter the x coordinate:");
                x = Integer.parseInt(reader.readLine());
            }
            while (x < 1 || x > playground.getLength());

            do {
                System.out.println("Enter the y coordinate:");
                y = Integer.parseInt(reader.readLine());
            }
            while (y < 1 || y > playground.getWidth());

            do {
                System.out.println("Enter direction:");
                direction = reader.readLine().toLowerCase();
                switch (direction) {
                    case "up": robot = new Robot(id, x, y, Direction.UP); break;
                    case "down": robot = new Robot(id, x, y, Direction.DOWN); break;
                    case "left": robot = new Robot(id, x, y, Direction.LEFT); break;
                    case "right": robot = new Robot(id, x, y, Direction.RIGHT); break;
                    default: direction = ""; break;
                }
            }
            while (direction.equals(""));


            do {
                System.out.println("Enter x and y coordinates of the goal:");
                System.out.print("x = ");
                x = Integer.parseInt(reader.readLine());
                System.out.print("y = ");
                y = Integer.parseInt(reader.readLine());
            }
            while ((x < 1 || x > playground.getLength()) && (y < 1 || y > playground.getWidth()));


            Goal goal = new Goal(x, y);


            if(robot.getX() == goal.getX() && robot.getY() == goal.getY()) {
                System.out.println("\nYou won!");
                System.out.println("Game over.");
                return;
            }

            Robot.message();

            while(!(command = reader.readLine().toLowerCase()).equals("end")) {
                switch (command) {
                    case "move": robot.stepForward(playground); break;
                    case "turn left": robot.turnLeft(); break;
                    case "turn right": robot.turnRight(); break;
                    default: System.out.println("Wrong command!"); break;
                }

                if(robot.getX() == goal.getX() && robot.getY() == goal.getY()) {
                    System.out.println("\nYou won!");
                    break;
                }

                Robot.message();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Game over.");
    }
}
