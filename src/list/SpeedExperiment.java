package list;

import java.util.ArrayList;

public class SpeedExperiment {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>(10000); // Задавам капацитет

        long start = System.currentTimeMillis();

        for (int a = 0; a < 1000000; a++) {
            first.add(a);
        }

        long end = System.currentTimeMillis();

        System.out.printf("The first list: 1000000 items were added in %d milliseconds.%n", end - start);


        start = System.currentTimeMillis();

        for (int b = 0; b < 1000000; b++) {
            second.add(b);
        }

        end = System.currentTimeMillis();

        System.out.printf("The second list: 1000000 items were added in %d milliseconds.%n", end - start);
    }
}



//Results:

//the first ArrayList: without set capacity
//the second ArrayList: capacity = 1000

// 1 attempt
//The first list: 1000000 items were added in 188 milliseconds.
//The second list: 1000000 items were added in 219 milliseconds.

// 2 attempt
//The first list: 1000000 items were added in 94 milliseconds.
//The second list: 1000000 items were added in 141 milliseconds.

// 3 attempt
//The first list: 1000000 items were added in 125 milliseconds.
//The second list: 1000000 items were added in 187 milliseconds.

// 4 attempt
//The first list: 1000000 items were added in 109 milliseconds.
//The second list: 1000000 items were added in 136 milliseconds.

// 5 attempt
//The first list: 1000000 items were added in 104 milliseconds.
//The second list: 1000000 items were added in 140 milliseconds.



//the first ArrayList: without set capacity
//the second ArrayList: capacity = 100000

// 1 attempt
//The first list: 1000000 items were added in 109 milliseconds.
//The second list: 1000000 items were added in 47 milliseconds.

// 2 attempt
//The first list: 1000000 items were added in 94 milliseconds.
//The second list: 1000000 items were added in 31 milliseconds.

// 3 attempt
//The first list: 1000000 items were added in 94 milliseconds.
//The second list: 1000000 items were added in 47 milliseconds.

// 4 attempt
//The first list: 1000000 items were added in 110 milliseconds.
//The second list: 1000000 items were added in 47 milliseconds.

// 5 attempt
//The first list: 1000000 items were added in 125 milliseconds.
//The second list: 1000000 items were added in 31 milliseconds.
