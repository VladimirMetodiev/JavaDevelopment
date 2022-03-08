package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WithFor {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));

        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
    }
}
