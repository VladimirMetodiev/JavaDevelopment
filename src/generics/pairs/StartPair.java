package generics.pairs;

import java.util.Scanner;

public class StartPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pair<Integer, Double> one = new Pair<>(6, 6.9);
        Pair<Integer, Double> two = new Pair<>(6, null);

        System.out.println(one.equals(two));
        System.out.println(one.hashCode() == two.hashCode());

        Pair<Long, Double> three = new Pair<>(666L, 6666.66);
        Pair<Long, Double> four = new Pair<>(Long.parseLong(input.nextLine()), Double.parseDouble(input.nextLine()));

        System.out.println(three.equals(four));
        System.out.println(three.hashCode() == four.hashCode());
    }
}


//Condition

//Generic pairs

//Implement the generic class Pair which contains a pair of objects (of any types). The objects can be null.

//You should implement the methods getFirst(), getSecond(), equals() and hashCode() and the static method of()
//for creating instances as well. The constructor must be private.

//Be careful with nulls when implementing equals() and hashCode().
