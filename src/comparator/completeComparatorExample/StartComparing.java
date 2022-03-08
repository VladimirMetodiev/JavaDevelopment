package comparator.completeComparatorExample;

import java.util.ArrayList;
import java.util.Collections;

public class StartComparing {
    public static void main(String[] args) {
        ArrayList<AnotherPerson> people = new ArrayList<>();
        people.add(new AnotherPerson("Anna", "Dimitrova", 20));
        people.add(new AnotherPerson("Vladimir", "Metodiev", 40));
        people.add(new AnotherPerson("Nina", "Petrova", 30));
        people.add(new AnotherPerson("Atanas", "Todorov", 50));
        people.add(new AnotherPerson("Stoian", "Ivanov", 25));


        System.out.println("Sorting by First Name:");
        Collections.sort(people);
        for(AnotherPerson e: people){
            System.out.printf("%s %s is %d years old.%n", e.getFirstName(), e.getLastName(), e.getAge());
        }


        System.out.println("\nSorting by Last Name:");
        Collections.sort(people, new LastNameComparator());
        for(AnotherPerson e: people){
            System.out.printf("%s %s is %d years old.%n", e.getFirstName(), e.getLastName(), e.getAge());
        }


        System.out.println("\nSorting by Age:");
        Collections.sort(people, new AgeComparator());
        for(AnotherPerson e: people){
            System.out.printf("%s %s is %d years old.%n", e.getFirstName(), e.getLastName(), e.getAge());
        }
    }
}
