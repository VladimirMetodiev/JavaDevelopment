package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAgainstLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int a = 0; a < 1000000; a++) {
            arrayList.add(a + 1);
        }

        long end = System.currentTimeMillis();

        System.out.printf("The ArrayList: 1000000 items were added in %d milliseconds.%n", end - start);


        start = System.currentTimeMillis();

        for (int a = 0; a < 1000000; a++) {
            linkedList.add(a + 1);
        }

        end = System.currentTimeMillis();

        System.out.printf("The LinkedList: 1000000 items were added in %d milliseconds.%n", end - start);


        System.out.println("--------------------------------------------------");

        start = System.currentTimeMillis();

        System.out.println(arrayList.get(525299));

        end = System.currentTimeMillis();

        System.out.printf("The ArrayList, search - .get(): %d milliseconds.%n", end - start);


        start = System.currentTimeMillis();

        System.out.println(linkedList.get(525299));

        end = System.currentTimeMillis();

        System.out.printf("The LinkedList, search - .get(): %d milliseconds.%n", end - start);


        System.out.println("--------------------------------------------------");

        start = System.currentTimeMillis();

        arrayList.remove(525299);

        end = System.currentTimeMillis();

        System.out.printf("The ArrayList, deletion - .remove(): %d milliseconds.%n", end - start);


        start = System.currentTimeMillis();

        linkedList.remove(525299);

        end = System.currentTimeMillis();

        System.out.printf("The LinkedList, deletion - .remove(): %d milliseconds.%n", end - start);


        System.out.println("--------------------------------------------------");

        start = System.currentTimeMillis();

        arrayList.set(525299, 5000000);

        end = System.currentTimeMillis();

        System.out.printf("The ArrayList, .set() method: %d milliseconds.%n", end - start);


        start = System.currentTimeMillis();

        linkedList.set(525299, 5000000);

        end = System.currentTimeMillis();

        System.out.printf("The LinkedList, .set() method: %d milliseconds.%n", end - start);
    }
}



//Result

// 1st attempt
//The ArrayList: 1000000 items were added in 109 milliseconds.
//The LinkedList: 1000000 items were added in 312 milliseconds.
//--------------------------------------------------
//525300
//The ArrayList, search - .get(): 0 milliseconds.
//525300
//The LinkedList, search - .get(): 16 milliseconds.
//--------------------------------------------------
//The ArrayList, deletion - .remove(): 0 milliseconds.
//The LinkedList, deletion - .remove(): 0 milliseconds.
//--------------------------------------------------
//The ArrayList, .set() method: 0 milliseconds.
//The LinkedList, .set() method: 16 milliseconds.


// 2nd attempt
//The ArrayList: 1000000 items were added in 109 milliseconds.
//The LinkedList: 1000000 items were added in 312 milliseconds.
//--------------------------------------------------
//525300
//The ArrayList, search - .get(): 0 milliseconds.
//525300
//The LinkedList, search - .get(): 16 milliseconds.
//--------------------------------------------------
//The ArrayList, deletion - .remove(): 0 milliseconds.
//The LinkedList, deletion - .remove(): 16 milliseconds.
//--------------------------------------------------
//The ArrayList, .set() method: 0 milliseconds.
//The LinkedList, .set() method: 15 milliseconds.


// 3rd attempt
//The ArrayList: 1000000 items were added in 109 milliseconds.
//The LinkedList: 1000000 items were added in 312 milliseconds.
//--------------------------------------------------
//525300
//The ArrayList, search - .get(): 0 milliseconds.
//525300
//The LinkedList, search - .get(): 16 milliseconds.
//--------------------------------------------------
//The ArrayList, deletion - .remove(): 0 milliseconds.
//The LinkedList, deletion - .remove(): 15 milliseconds.
//--------------------------------------------------
//The ArrayList, .set() method: 0 milliseconds.
//The LinkedList, .set() method: 0 milliseconds.


// 4th attempt
//The ArrayList: 1000000 items were added in 109 milliseconds.
//The LinkedList: 1000000 items were added in 328 milliseconds.
//--------------------------------------------------
//525300
//The ArrayList, search - .get(): 0 milliseconds.
//525300
//The LinkedList, search - .get(): 15 milliseconds.
//--------------------------------------------------
//The ArrayList, deletion - .remove(): 0 milliseconds.
//The LinkedList, deletion - .remove(): 16 milliseconds.
//--------------------------------------------------
//The ArrayList, .set() method: 0 milliseconds.
//The LinkedList, .set() method: 0 milliseconds.


// 5th attempt
//The ArrayList: 1000000 items were added in 109 milliseconds.
//The LinkedList: 1000000 items were added in 313 milliseconds.
//--------------------------------------------------
//525300
//The ArrayList, search - .get(): 0 milliseconds.
//525300
//The LinkedList, search - .get(): 15 milliseconds.
//--------------------------------------------------
//The ArrayList, deletion - .remove(): 0 milliseconds.
//The LinkedList, deletion - .remove(): 0 milliseconds.
//--------------------------------------------------
//The ArrayList, .set() method: 0 milliseconds.
//The LinkedList, .set() method: 16 milliseconds.
