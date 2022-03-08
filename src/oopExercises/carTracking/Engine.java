package oopExercises.carTracking;

public class Engine {
    private int EngineSpeed;
    private int EnginePower;

    public Engine (){
    }

    public Engine (int EngineSpeed, int EnginePower){
        this.EngineSpeed = EngineSpeed;
        this.EnginePower = EnginePower;
    }

    public int getEngineSpeed() {
        return EngineSpeed;
    }

    public int getEnginePower() {
        return EnginePower;
    }
}
