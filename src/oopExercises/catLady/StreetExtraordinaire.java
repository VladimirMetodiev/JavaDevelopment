package oopExercises.catLady;

public class StreetExtraordinaire extends Cat {
    private double decibelsOfMeows;

    public StreetExtraordinaire(String breed, String name, double decibelsOfMeows) {
        super(breed, name);
        this.decibelsOfMeows = decibelsOfMeows;
    }

    public double getDecibelsOfMeows() {
        return decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", getBreed(), getName(), decibelsOfMeows);
    }
}
