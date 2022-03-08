package comparator.simpleComparatorExample;

import java.util.Comparator;

public class NameComparator implements Comparator<Citizen> {

//      Класически вариант

//    @Override
//    public int compare(Citizen c1, Citizen c2) {
//        if(c1.getName().compareTo(c2.getName()) > 0){
//            return 1;
//        }
//        else if(c1.getName().compareTo(c2.getName()) < 0){
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }

//      Подобрен вариант

    @Override
    public int compare(Citizen c1, Citizen c2) {
        int result = c1.getName().compareTo(c2.getName());

        if(result == 0){
            result = c1.getSurname().compareTo(c2.getSurname());

            if(result == 0){
                result = c1.getAge() - c2.getAge();

                if(result > 0) return 1;
                else if (result < 0) return -1;
                else return 0;
            }
            else {
                return result;
            }
        }
        else {
            return result;
        }
    }
}
