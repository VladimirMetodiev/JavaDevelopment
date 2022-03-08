package mapExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();
        String command;
        String resource = "";
        int quantity;
        boolean isItOdd = true;

        while(!(command = reader.readLine()).equalsIgnoreCase("stop")) {
            if(isItOdd) {
                resource = command;
                isItOdd = false;
            }
            else {
                try {
                    if(resource.isEmpty()) throw new InputMismatchException();
                    quantity = Integer.parseInt(command);
                    if(resources.containsKey(resource)) {
                        resources.put(resource, resources.get(resource) + quantity);
                    }
                    else {
                        resources.put(resource, quantity);
                    }
                }
                catch (InputMismatchException | NumberFormatException ex) {
                }
                isItOdd = true;
            }
        }

        for(Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

        reader.close();
    }
}



//Condition

//You are given a sequence of strings, each on a new line. Every odd line on the console is representing a resource,
//and every even – quantity. Your task is to collect the resources and print them each on a new line.
//Print the resources and their quantities in format:
//{resource} –> {quantity}



//Tests

//Input
//Copper
//1253
//Iron
//2473
//Nickel
//230
//stop

//Output
//Copper -> 1253
//Iron -> 2473
//Nickel -> 230



//Input
//Lead
//2600
//Zinc
//1800
//Copper
//4695
//stop

//Output
//Lead -> 2600
//Zinc -> 1800
//Copper -> 4695



//Input
//Iron
//204
//Copper
//528
//Iron
//381
//Silver
//118
//Copper
//632
//Copper
//560
//Iron
//962
//Copper
//154
//Stop


//Output
//Iron -> 1547
//Copper -> 1874
//Silver -> 118



//Input
//Copper
//374
//
//150
//Copper
//291
//Silver
//15
//Silver
//
//Silver
//35
//stop

//Output
//Copper -> 665
//Silver -> 50



//Input
//Iron
//Copper
//Iron
//150
//Copper
//200
//Iron
//
//stop

//Output
//Iron -> 150
//Copper -> 200
