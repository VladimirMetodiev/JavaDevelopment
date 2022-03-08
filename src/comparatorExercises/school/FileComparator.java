package comparatorExercises.school;

import java.util.Comparator;

public class FileComparator implements Comparator<PersonalFile> {
    public int compare(PersonalFile a, PersonalFile b) {
        if(a.getClassYear() - b.getClassYear() > 0) {
            return 1;
        }
        else if(a.getClassYear() - b.getClassYear() < 0) {
            return -1;
        }
        else {
            if(a.getDesignation().compareTo(b.getDesignation()) > 0) {
                return 1;
            }
            else if(a.getDesignation().compareTo(b.getDesignation()) < 0) {
                return -1;
            }
            else {
                if(a.getSurname().compareTo(b.getSurname()) > 0) {
                    return 1;
                }
                else if(a.getSurname().compareTo(b.getSurname()) < 0) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        }
    }
}
