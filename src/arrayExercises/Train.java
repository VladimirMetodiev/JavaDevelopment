package arrayExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Train {
    static int[] passengers;
    static int sum = 0;

    public static void main(String[] arguments) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfWagons = Integer.parseInt(reader.readLine());

        passengers = new int[countOfWagons];

        for (int a = 0; a < countOfWagons; a++) {
            passengers[a] = Integer.parseInt(reader.readLine());
            sum += passengers[a];
        }

        for(int item : passengers) System.out.print(item + " ");
        System.out.println("\n" + sum);

        reader.close();
    }
}



//Condition

//You will be given a count of wagons in a train n. On the next n lines you will receive how many people
//are going to get on that wagon. At the end print the whole train and after that the sum of the people in the train.



//Tests

//3
//13
//24
//8
//13 24 8
//45


//6
//3
//52
//71
//13
//65
//4
//3 52 71 13 65 4
//208


//1
//30
//30
//30