package queueExercises;

import java.util.*;

public class CreateAHeap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String commands;
        Heap heap = new Heap();

        print();
        while(!(commands = input.nextLine().toLowerCase()).equals("end")) {
            String[] data = commands.split("\\s+");
            try {
                switch (data[0]) {
                    case "contains": heap.contains(Integer.parseInt(data[1])); break;
                    case "insert": heap.insert(Integer.parseInt(data[1])); break;
                    case "extract": System.out.println(heap.extract()); break;
                    case "size": System.out.println(heap.size()); break;
                    case "print": heap.printTheHeap(); break;
                    default: System.out.println("Wrong command.");break;
                }
            } catch (NullPointerException ex) {
                System.err.println(ex.getMessage());
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("There is not an input value.");
            }
            print();
        }
    }

    private static void print() {
        System.out.println("Choose: \"contains\", \"insert\", \"extract\", \"size\", \"print\" or \"end\"");
    }
}

class Heap {
    private PriorityQueue<Integer> prQueue = new PriorityQueue<>(Comparator.reverseOrder());

    public void contains(int number) {
        if(prQueue.contains(number)) System.out.printf("There is the number %d.%n", number);
        else System.out.println("There is not such number.");
    }

    public void insert(int number) {
        prQueue.offer(number);
    }

    public int extract() {
        if(prQueue.isEmpty()) throw new NullPointerException("There are not any elements.");
        return prQueue.poll();
    }

    public int size() {
        return prQueue.size();
    }

    public void printTheHeap() {
        Iterator<Integer> iterator = prQueue.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}