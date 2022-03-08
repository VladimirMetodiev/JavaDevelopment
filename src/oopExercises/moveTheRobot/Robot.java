package oopExercises.moveTheRobot;

public class Robot {
    private String identifier;
    private int x;
    private int y;
    private Direction direction;

    public Robot() {
    }

    public Robot(String identifier, int x, int y, Direction direction) {
        this.identifier = identifier;
        this.x = x;
        this.y = y;
        this.direction = direction;
        System.out.printf("Robot %s is ready for action%n", identifier);
        getCoordinatesAndDirection();
    }

    public String getIdentifier() {
        return identifier;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        // завърти се на 90 градуса обратно на часовниковата стралка

        if(direction == Direction.UP) direction = Direction.LEFT;
        else if(direction == Direction.RIGHT) direction = Direction.UP;
        else if(direction == Direction.DOWN) direction = Direction.RIGHT;
        else direction = Direction.DOWN;
        getCoordinatesAndDirection();
    }

    public void turnRight() {
        // завърти се на 90 градуса по часовниковата стралка

        if(direction == Direction.UP) direction = Direction.RIGHT;
        else if(direction == Direction.RIGHT) direction = Direction.DOWN;
        else if(direction == Direction.DOWN) direction = Direction.LEFT;
        else direction = Direction.UP;
        getCoordinatesAndDirection();
    }

    public void stepForward(Playground playground) {
        // 1 стъпка напред, означава, че робота изменя позицията си с 1-ца, в направлението, в което "гледа"

        boolean flag = true;

        if(direction == Direction.UP && y < playground.getWidth()) ++y;
        else if(direction == Direction.RIGHT && x < playground.getLength()) ++x;
        else if(direction == Direction.DOWN && y > 1) --y;
        else if(direction == Direction.LEFT && x > 1) --x;
        else flag = false;

        if(!flag) System.out.println("You can't move the robot in this direction.");

        getCoordinatesAndDirection();
    }

    public static void message(){
        System.out.println("Choose: \"move\", \"turn left\", \"turn right\", \"end\"");
    }

    private void getCoordinatesAndDirection() {
        System.out.printf("Coordinates: x = %d and y = %d%n", x, y);
        System.out.printf("Direction: %s%n", direction);
    }
}



//Some code

//    public static void moveRobot(Robot robot, int toX, int toY) {
//        do {
//            if(robot.getX() < toX) {
//                while(robot.getDirection() != Direction.RIGHT) {
//                    robot.turnRight();
//                }
//                robot.stepForward();
//            }
//            else if(robot.getX() > toX) {
//                while(robot.getDirection() != Direction.LEFT) {
//                    robot.turnLeft();
//                }
//                robot.stepForward();
//            }
//        }
//        while(robot.getX() == toX);
//
//        do {
//            if(robot.getY() < toY) {
//                while(robot.getDirection() != Direction.UP) {
//                    robot.turnRight();
//                }
//                robot.stepForward();
//            }
//            else if(robot.getY() > toY) {
//                while(robot.getDirection() != Direction.DOWN) {
//                    robot.turnLeft();
//                }
//                robot.stepForward();
//            }
//        }
//        while(robot.getY() == toY);
//    }



//100/100 - при автономно движение на робота

//    public static void moveRobot(Robot robot, int toX, int toY) {
//        boolean flag = false;
//
//        while(robot.getX() != toX) {
//            if(!flag) {
//                if(robot.getX() < toX) {
//                    while(robot.getDirection() != Direction.RIGHT) {
//                        robot.turnRight();
//                    }
//                }
//                else if(robot.getX() > toX) {
//                    while(robot.getDirection() != Direction.LEFT) {
//                        robot.turnLeft();
//                    }
//                }
//                flag = true;
//            }
//
//            robot.stepForward();
//        }
//
//        flag = false;
//
//        while(robot.getY() != toY) {
//            if(!flag) {
//                if(robot.getY() < toY) {
//                    while(robot.getDirection() != Direction.UP) {
//                        robot.turnRight();
//                    }
//                }
//                else if(robot.getY() > toY) {
//                    while(robot.getDirection() != Direction.DOWN) {
//                        robot.turnLeft();
//                    }
//                }
//                flag = true;
//            }
//
//            robot.stepForward();
//        }
//    }
