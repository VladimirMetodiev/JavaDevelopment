package listExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            int value = iterator.next();
            if (value < 10) iterator.remove();
        }

        System.out.println(list);
    }
}



//Condition

//A list with numbers from 0 to 20 is given.
//Remove numbers less than 10 from it without additional lists or arrays usage.
//Modify the code so that it does not raise the ConcurrentModificationException.

//Hint ! Use the Iterator.



//Output:
//[10, 11, 12, 13, 14, 15, 16, 17, 18, 19]


