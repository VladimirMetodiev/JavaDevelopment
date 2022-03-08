package oopExercises.carTracking;

public class Tires {
    private double Tire1Pressure;
    private int Tire1Age;
    private double Tire2Pressure;
    private int Tire2Age;
    private double Tire3Pressure;
    private int Tire3Age;
    private double Tire4Pressure;
    private int Tire4Age;

    public Tires() {
    }

    public Tires(double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
        Tire1Pressure = tire1Pressure;
        Tire1Age = tire1Age;
        Tire2Pressure = tire2Pressure;
        Tire2Age = tire2Age;
        Tire3Pressure = tire3Pressure;
        Tire3Age = tire3Age;
        Tire4Pressure = tire4Pressure;
        Tire4Age = tire4Age;
    }

    public double getTire1Pressure() {
        return Tire1Pressure;
    }

    public int getTire1Age() {
        return Tire1Age;
    }

    public double getTire2Pressure() {
        return Tire2Pressure;
    }

    public int getTire2Age() {
        return Tire2Age;
    }

    public double getTire3Pressure() {
        return Tire3Pressure;
    }

    public int getTire3Age() {
        return Tire3Age;
    }

    public double getTire4Pressure() {
        return Tire4Pressure;
    }

    public int getTire4Age() {
        return Tire4Age;
    }
}
