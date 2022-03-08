package setExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class UniqueUserNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashSet<String> women = new LinkedHashSet<>();
        int count = Integer.parseInt(reader.readLine());

        for(int a = 0; a < count; a++) {
            women.add(reader.readLine());
        }

        Iterator<String> iterator = women.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        reader.close();
    }
}



//Condition

//Write a simple program that reads from the console a sequence of usernames and keeps a collection with only the unique ones.
//Print the collection on the console in order of insertion.


//Test

//18
//Diana
//Maria
//Iva
//Albena
//Victoria
//Sarah
//Diana
//Anna
//Nina
//Boriana
//Diana
//Anna
//Valentina
//Polina
//Lora
//Victoria
//Maria
//Irina
