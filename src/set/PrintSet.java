package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PrintSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(5, 9, 21, 0, 64, -28, 87, 45, -15, 39));

        System.out.print("With for loop: ");
        for(int element : numbers){
            System.out.print(element + " ");
        }

        System.out.print("\n" + "With an iterator: ");

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
