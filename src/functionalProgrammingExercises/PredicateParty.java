package functionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> people = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());
        String expression;

        BiPredicate<String, String> checkUpBeginning = (name, ind) -> name.indexOf(ind) == 0;
        BiPredicate<String, String> checkUpEnd = (name, ind) -> name.lastIndexOf(ind) != -1;
        BiPredicate<String, Integer> checkUpLength = (name, len) -> name.length() == len;

        while(!(expression = input.nextLine()).equals("Party!")){
            String[] data = expression.split("\\s+");

            for(int a = 0; a < people.size(); a++) {
                switch (data[1]) {
                    case "StartsWith": {
                        if(checkUpBeginning.test(people.get(a), data[2])){
                            people = manipulatesTheList(people, data[0], a);
                            if(data[0].equals("Double")) a++;
                            if(data[0].equals("Remove")) a--;
                        }
                        break;
                    }
                    case "EndsWith": {
                        if(checkUpEnd.test(people.get(a), data[2])){
                            people = manipulatesTheList(people, data[0], a);
                            if(data[0].equals("Double")) a++;
                            if(data[0].equals("Remove")) a--;
                        }
                        break;
                    }
                    case "Length":  {
                        if(checkUpLength.test(people.get(a), Integer.parseInt(data[2]))){
                            people = manipulatesTheList(people, data[0], a);
                            if(data[0].equals("Double")) a++;
                            if(data[0].equals("Remove")) a--;
                        }
                        break;
                    }
                    default: break;
                }
            }
        }

        if(people.size() == 0) System.out.println("Nobody is going to the party!");
        else System.out.println(String.join(", ", people) + " are going to the party!");
    }

    private static List<String> manipulatesTheList (List<String> list, String condition, int index) {
        switch (condition) {
            case "Double": list.add(index, list.get(index)); break;
            case "Remove": list.remove(index); break;
            default: break;
        }
        return list;
    }
}



//Condition

//The Wire’s parents are on a vacation for the holidays and he is planning an epic party at home. Unfortunately, his
//organizational skills are next to non-existent so you are given the task to help him with the reservations.
//On the first line you get a list with all the people that are coming. On the next lines, until you get the "Party!" command,
//you may be asked to double or remove all the people that apply to given criteria. There are three different options:
//Everyone that has a name starting with a given string;
//Everyone that has a name ending with a given string;
//Everyone that has a name with a given length.
//If nobody is going, checkUp "Nobody is going to the party!".



//Tests

//Peter Philip Alexander Stefan
//Remove StartsWith P
//Double Length 9
//Party!
//Alexander, Alexander, Stefan are going to the party!

//Peter
//Double StartsWith Pet
//Double EndsWith er
//Party!
//Peter, Peter, Peter, Peter are going to the party!


//Philip
//Remove StartsWith P
//Party!
//Nobody is going to the party!
