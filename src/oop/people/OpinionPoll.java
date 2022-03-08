package oop.people;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OpinionPoll extends Human {
    String politicalOrientation = "It isn't your business";

    static ArrayList<OpinionPoll> result = new ArrayList<>();

    public OpinionPoll (String name, int age, String politicalOrientation){
        super(name, age);
        this.politicalOrientation = politicalOrientation;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());

        for (int a = 0; a < number; a++) {
            String[] data = input.nextLine().split("\\s+");
            result.add(new OpinionPoll(data[0], Integer.parseInt(data[1]), data[2]));
        }

        Collections.sort(result, (a, b) -> a.name.compareTo(b.name));

        result.forEach(el -> System.out.printf("%s, %d years old, is a %s.%n", el.name, el.age, el.politicalOrientation));
    }
}



//Tests

//6
//Peter 29 Democrat
//Stephan 33 Republican
//Ivan 54 Republican
//Anna 20 Democrat
//Vladimir 40 Democrat
//Diana 38 Republican


//12
//Teodor 38 Democrat
//Peter 29 Democrat
//Nina 26 Green
//Stephan 33 Republican
//Eva 18 Green
//Ivan 54 Republican
//Konstantin 46 Socialist
//Anna 20 Democrat
//Vladimir 40 Democrat
//Maria 35 Democrat
//Philip 51 Green
//Diana 38 Republican
