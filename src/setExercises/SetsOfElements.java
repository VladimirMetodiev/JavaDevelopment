package setExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetsOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] lengths = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        HashSet<Integer> first = new HashSet<>();
        HashSet<Integer> second = new HashSet<>();

        for (int a = 0; a < lengths[0]; a++) {
            first.add(Integer.parseInt(reader.readLine()));
        }

        for (int b = 0; b < lengths[1]; b++) {
            second.add(Integer.parseInt(reader.readLine()));
        }

        first.retainAll(second);

        Iterator<Integer> iterator = first.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        reader.close();
    }
}



//Condition

//On the first line you are given the length of two sets n and m. On the next n + m lines there are n numbers that are in the first set
//and m numbers that are in the second one. Find all non-repeating element that appears in both of them, and print them in same order at the console:
//Set with length n = 4: {1, 3, 5, 7}
//Set with length m = 3: {3, 4, 5}
//Set that contains all repeating elements -> {3, 5}



//Tests

//5 3
//19
//64
//2
//81
//14
//14
//19
//100

//3 3
//8
//6
//18
//25
//6
//74
