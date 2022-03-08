package comparatorExercises.pupils;

public class Pupil {
    private String name;
    private int rating;

    public Pupil (String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " " + rating;
    }
}
