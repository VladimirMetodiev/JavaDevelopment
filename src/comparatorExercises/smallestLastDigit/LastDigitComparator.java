package comparatorExercises.smallestLastDigit;

import java.util.Comparator;

public class LastDigitComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer digit1, Integer digit2) {
        return digit1 % 10 - digit2 % 10;
    }
}
