package comparator.completeComparatorExample;

import java.util.Comparator;

public class LastNameComparator implements Comparator<AnotherPerson> {
    public int compare (AnotherPerson p1, AnotherPerson p2) {
        if(p1.getLastName().compareTo(p2.getLastName()) > 0) {
            return 1;
        }
        else if(p1.getLastName().compareTo(p2.getLastName()) < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
