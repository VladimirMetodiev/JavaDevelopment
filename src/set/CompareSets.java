package set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class CompareSets {
    public static void main(String[] args) {
        HashSet<Integer> theFirst = new HashSet<>();
        TreeSet<Integer> theSecond = new TreeSet<>();

        Random random = new Random();

        for (int a = 0; a < 10; a++) {
            int current = random.nextInt(100);
            theFirst.add(current);
            theSecond.add(current);
        }

        //Две множества са равни ако:
        // 1. двете колекции са множества;
        // 2. двете множества имат еднакъв размер;
        // 3. всеки член на първото множество се съдържа във второто множество;

        System.out.println("HashSet: " + theFirst + " size: " + theFirst.size());
        System.out.println("TreeSet: " + theSecond + " size: " + theSecond.size());

        if (theFirst.equals(theSecond)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
