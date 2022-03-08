package comparatorExercises.pupils;

import java.util.Comparator;

public class PupilComparator implements Comparator<Pupil> {
    public int compare (Pupil p1, Pupil p2) {
        if(p1.getRating() > p2.getRating()) {
            return -1;
        }
        else if(p1.getRating() < p2.getRating()) {
            return 1;
        }
        else {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
