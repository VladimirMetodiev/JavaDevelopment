package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;

public class TrickyAddItemsToQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(0, 1));
        System.out.println(queue);
        System.out.println("--------------------------------------------------");

        int[] digits = {2, 3};
        //Arrays.stream(digits).forEach(d -> queue.offer(d));
        Arrays.stream(digits).forEach(queue::offer);
        System.out.println(queue);
        System.out.println("--------------------------------------------------");

        Collections.addAll(queue, 4, 5);
        System.out.println(queue);
        System.out.println("--------------------------------------------------");
    }
}
