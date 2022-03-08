package oop.nestedClasses.staticClass;

public class FirstOuterClass {
    private String colour;
    private int doorCount;
    private Engine engine;
    private static int experiment = 10;

    public FirstOuterClass(String colour, int doorCount, Engine engine) {
        this.colour = colour;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public Engine getEngine() {
        return engine;
    }

    public static int getExperiment() {
        return experiment;
    }

    public static void setExperiment(int experiment) {
        FirstOuterClass.experiment = experiment;
    }

    public void show () {
        System.out.println(Engine.countOfObjects);
    }

    @Override
    public String toString() {
        return String.format("This %s vehicle has %d doors and an engine with %d horsepower.", colour, doorCount, engine.horsePower);
    }

    public static class Engine {
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            //System.out.println(experiment);      // в статичният клас, мога да се обърна към статична променлива, на външният клас
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return String.format("This engine has %d horsepower.", horsePower);
        }
    }
}
