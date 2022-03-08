package oopExercises.aBox;

public class Validator {
    public static boolean isValid(double value) {
        return value > 0;
    }

    public static String isLengthValidReport(boolean isValid) {
        if(!isValid) throw new IllegalArgumentException("Length cannot be zero or negative.");
        else return "";
    }

    public static String isWidthValidReport(boolean isValid) {
        if(!isValid) throw new IllegalArgumentException("Width cannot be zero or negative.");
        else return "";
    }

    public static String isHeightValidReport(boolean isValid) {
        if(!isValid) throw new IllegalArgumentException("Height cannot be zero or negative.");
        else return "";
    }
}
