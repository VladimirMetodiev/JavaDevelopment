package oopExercises.mood;

public enum Weekdays {
    MONDAY("very bad"), TUESDAY("bad"), WEDNESDAY("so-so"), THURSDAY("good"), FRIDAY("very good"), SATURDAY("excellent"), SUNDAY("good"), UNKNOWN("unknown ");

    private String mood;

    private Weekdays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
