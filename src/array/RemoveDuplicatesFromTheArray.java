package array;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromTheArray {
    public static void main(String[] args) {
        int[] theFirst = {10, -6, 14, 62, -6, 41, 12, 7, 41, 33, 33, 56, 8, 23, 10, 41};

        theFirst = Arrays.stream(theFirst).distinct().toArray();

        for(int element : theFirst) System.out.print(element + " ");
        System.out.println("\n");


        String[] theSecond = {"bay", "lowland", "forest", "unusually", "bay", "facility", "cosy", "cosy", "extra", "insurance", "forest", "bay", "opinion"};
        LinkedHashSet<String> removedDuplicates = new LinkedHashSet<>();

        for(String word : theSecond) removedDuplicates.add(word);

        removedDuplicates.forEach(e -> System.out.print(e + " "));
        System.out.println("\n");


        double[] theFourth = {1.33, 2.66, 3.5378, 3.5378, 4.705274, 2.66, 6.25801442, 2.66, 8.3231591786, 4.705274};

        theFourth = remove(theFourth);

        for(double element : theFourth) System.out.print(element + " ");
        System.out.println("\n");
    }

    static double[] remove(double[] realNumbers){
        int counter = 0;
        Object[] current = new Object[realNumbers.length];
        for(int a = 0; a < realNumbers.length; a++) current[a] = realNumbers[a];

        for (int a = 0; a < current.length - 1; a++) {
            for (int b = a + 1; b < current.length; b++) {
                if(current[a].equals(current[b])) {
                    current[b] = "delete";
                }
            }
        }

        for(Object element : current) if(element == "delete") counter++;

        realNumbers = new double[current.length - counter];
        counter = 0;

        for (int b = 0; b < current.length; b++) {
            if(current[b] != "delete") realNumbers[counter++] = (double)current[b];
        }

        return realNumbers;
    }
}
