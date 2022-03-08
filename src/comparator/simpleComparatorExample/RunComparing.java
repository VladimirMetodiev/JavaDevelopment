package comparator.simpleComparatorExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RunComparing {
    public static void main(String[] args) {
        ArrayList<Citizen> citizens = new ArrayList<>(Arrays.asList(new Citizen("Vladimir", "Metodiev", 30),
                new Citizen("Victor", "Todorov", 26),
                new Citizen("Ivan", "Dimitrov", 23),
                new Citizen("Ralitza", "Stoianova", 47),
                new Citizen("Anna", "Dimitrova", 28),
                new Citizen("Ivan", "Gerdjikov", 45),
                new Citizen("Teodor", "Georgiev", 21),
                new Citizen("Petet", "Atanasov", 63),
                new Citizen("Ivan", "Melnishky", 35),
                new Citizen("Svetoslava", "Atanasova", 32),
                new Citizen("Eva", "Trendafilova", 27),
                new Citizen("Teodor", "Stoyanov", 28),
                new Citizen("Ivan", "Dimitrov", 59),
                new Citizen("Petet", "Atanasov", 34),
                new Citizen("Ralitza", "Iordanova", 22),
                new Citizen("Victor", "Ivanov", 46),
                new Citizen("Peter", "Borislavov", 31)));

        Collections.sort(citizens, new NameComparator());

        citizens.forEach(el -> System.out.printf("%s %s is %d years old.%n", el.getName(), el.getSurname(), el.getAge()));
    }
}
