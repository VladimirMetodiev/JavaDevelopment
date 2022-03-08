package comparatorExercises.exams;

import java.util.Comparator;

public class SchoolComparator implements Comparator<School> {
    @Override
    public int compare(School sch1, School sch2) {
        if(sch1.getAverageTotal() - sch2.getAverageTotal() > 0) {
            return -1;
        }
        else if(sch1.getAverageTotal() - sch2.getAverageTotal() < 0) {
            return 1;
        }
        else {
            if(sch1.getAverageMathematics() - sch2.getAverageMathematics() > 0) {
                return -1;
            }
            else if(sch1.getAverageMathematics() - sch2.getAverageMathematics() < 0) {
                return 1;
            }
            else {
                if(sch1.getAverageLanguage() - sch2.getAverageLanguage() > 0) {
                    return -1;
                }
                else if(sch1.getAverageLanguage() - sch2.getAverageLanguage() < 0) {
                    return 1;
                }
                else {
                    if(sch1.getAverageComputerScience() - sch2.getAverageComputerScience() > 0) {
                        return -1;
                    }
                    else if(sch1.getAverageComputerScience() - sch2.getAverageComputerScience() < 0) {
                        return 1;
                    }
                    else {
                        if(sch1.getNumber() - sch2.getNumber() > 0) {
                            return -1;
                        }
                        else if(sch1.getNumber() - sch2.getNumber() < 0) {
                            return 1;
                        }
                        else {
                            return 0;
                        }
                    }
                }
            }
        }
    }
}
