package oopExercises.catLady;

public class Cymric extends Cat {
    private double furLength;

    public Cymric(String breed, String name, double furLength) {
        super(breed, name);
        this.furLength = furLength;
    }

    public double getFurLength() {
        return furLength;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", getBreed(), getName(), furLength);
    }
}
