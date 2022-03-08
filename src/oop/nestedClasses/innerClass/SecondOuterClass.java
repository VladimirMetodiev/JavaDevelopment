package oop.nestedClasses.innerClass;

public class SecondOuterClass {
    String colour;
    int doorCount;
    Engine engine;

    public SecondOuterClass(String colour, int doorCount) {
        this.colour = colour;
        this.doorCount = doorCount;
    }

    public SecondOuterClass(String colour, int doorCount, int horsePower) {
        this.colour = colour;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return String.format("This %s vehicle has %d doors and an engine with %d horsepower.", colour, doorCount, engine.horsePower);
    }

    /* Inner class */
    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return String.format("This engine has %d horsepower.", horsePower);
        }
    }
}
