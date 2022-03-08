package oopExercises.nextSecond;

public class NextSecond {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public NextSecond() {
    }

    public NextSecond(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >= 24) throw new IllegalArgumentException("This isn't hour.");
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute (int minute) {
        if(minute < 0 || minute >= 60) throw new IllegalArgumentException("This isn't minute.");
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        if(second < 0 || second >= 60) throw new IllegalArgumentException("This isn't second.");
        this.second = second;
    }

    public NextSecond addOneSecond() {
        ++second;

        if(this.second == 60) {
            second = 0;
            ++minute;
        }

        if(this.minute == 60) {
            minute = 0;
            ++hour;
        }

        if(this.hour == 24) {
            hour = 0;
        }

        return this;
    }

    public String toString() {
        return String.format("The time is: %02d:%02d:%02d", hour, minute, second);
    }
}
