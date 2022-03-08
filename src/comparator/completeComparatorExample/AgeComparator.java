package comparator.completeComparatorExample;

import java.util.Comparator;

public class AgeComparator implements Comparator<AnotherPerson> {
    public int compare (AnotherPerson p1, AnotherPerson p2) {
        if(p1.getAge() > p2.getAge()) {
            return 1;
        }
        else if(p1.getAge() < p2.getAge()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
