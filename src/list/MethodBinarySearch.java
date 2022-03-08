package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MethodBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        Random randomSign = new Random();

        for (int a = 0; a < 100000; a++) {
            int current = random.nextInt(10000) + 1;
            if(randomSign.nextInt(2) != 0) {
                current *= -1;
            }
            numbers.add(current);
        }

        // За да използвам метода .binarySearch(), колекцията трябва да бъде сортирана
        Collections.sort(numbers);
        // Метода .binarySearch() - връща индекса на търсеният ключ, ако той се намира в колекцията
        System.out.println(Collections.binarySearch(numbers, 19));
        System.out.println(numbers.get(Collections.binarySearch(numbers, 19)));
    }
}
