package comparator.interfaceComparator;

import comparator.completeComparatorExample.AnotherPerson;

import java.util.*;

public class InterfaceComparator {

    public static void main(String[] args) {

        System.out.println("Example 1");

        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(9, 1, 7, 3, 5));
        System.out.println(digits);
        Collections.sort(digits, Comparator.naturalOrder());
        //Collections.sort(digits);                             // Дава аналогичен на горният резултат
        System.out.println(digits);
        Collections.sort(digits, Comparator.reverseOrder());
        //Collections.reverse(digits);                         // Дава аналогичен на горният резултат
        System.out.println(digits);
        Collections.sort(digits, (x, y) -> x.compareTo(y));
        System.out.println(digits);



        System.out.println("\nExample 2");

        TreeSet<String> words = new TreeSet<>(Comparator.reverseOrder());
        //TreeSet<String> words = new TreeSet<>((w1, w2) -> w2.compareTo(w1));          // Дава аналогичен на горният резултат
        words.addAll(Arrays.asList("struggle", "progress", "victory", "competition", "success"));
        System.out.println(words);



        System.out.println("\nExample 3");

        ArrayList<AnotherPerson> people = new ArrayList<>();
        people.add(new AnotherPerson("Anna", "Dimitrova", 20));
        people.add(new AnotherPerson("Vladimir", "Metodiev", 43));
        people.add(new AnotherPerson("Svetoslav", "Ognianov", 24));
        people.add(new AnotherPerson("Nina", "Petrova", 20));
        people.add(new AnotherPerson("Atanas", "Drinov", 28));
        people.add(new AnotherPerson("Nicola", "Todorov", 38));
        people.add(new AnotherPerson("Stoian", "Ivanov", 25));
        people.add(new AnotherPerson("Alexander", "Dimitrov", 28));

        //Collections.sort(people, ((a, b) -> a.getName().compareTo(b.getName())));

        Collections.sort(people, new Comparator<AnotherPerson>() {
            @Override
            public int compare(AnotherPerson p1, AnotherPerson p2) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
        });

        people.forEach(el -> System.out.printf("%s %s is %d years old.%n", el.getFirstName(), el.getLastName(), el.getAge()));



        System.out.println("\nExample 4");

        ArrayList<Double> realNumbers = new ArrayList<>(Arrays.asList(43.258, -21.3, 7.2, 313.0, -25.61, 82.6, 178.29, -53.831, 82.7, -21.2));

        Collections.sort(realNumbers, new Comparator<Double>() {
            @Override
            public int compare(Double num1, Double num2) {
                return Double.compare(num2, num1);
            }
        });

        realNumbers.forEach(el -> System.out.print(el + " "));



        System.out.println("\n\nExample 5");

        //Collections.sort(people, Comparator.comparingInt(AnotherPerson::getAge));

        people.sort(Comparator.comparingInt(AnotherPerson::getAge));
        people.forEach(el -> System.out.printf("[%d years old] -> %s %s%n", el.getAge(), el.getFirstName(), el.getLastName()));
    }
}