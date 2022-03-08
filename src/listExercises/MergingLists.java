package listExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> theFirst = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> theSecond = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        ArrayList<Integer> result = new ArrayList<>();
        int length = theFirst.size() >= theSecond.size() ? theFirst.size() : theSecond.size();

        for (int a = 0; a < length; a++) {
            if(a < theFirst.size()) result.add(theFirst.get(a));
            if(a < theSecond.size()) result.add(theSecond.get(a));
        }

        result.forEach(e -> System.out.print(e + " "));

        reader.close();
    }
}



//Condition

//You are going to receive two lists with numbers. Create a result list which contains the numbers from both of the lists.
//The first element should be from the first list, the second from the second list and so on. If the length of the two lists are not equal,
//just add the remaining elements at the end of the list.



//Tests

//Input
//1 3 5 7 9
//2 4 6 8 10
//Output
//1 2 3 4 5 6 7 8 9 10

//Input
//3 5 2 43 12 3 54 10 23
//76 5 34 2 4 12
//Output
//3 76 5 5 2 34 43 2 12 4 3 12 54 10 23


//Input
//76 5 34 2 4 12
//3 5 2 43 12 3 54 10 23
//Output
//76 3 5 5 34 2 2 43 4 12 12 3 54 10 23
