package functionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Inferno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> gems = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        char[] exclusion = new char[gems.size()];
        Arrays.fill(exclusion, 'i');

        String command;

        BiConsumer<Integer, Character> left = (sum, letter) -> {
            for(int a = 0; a < gems.size(); a++) {
                if(a > 0) {
                    if(gems.get(a) + gems.get(a - 1) == sum) exclusion[a] = letter;
                }
                else {
                    if(gems.get(a).equals(sum)) exclusion[a] = letter;
                }
            }
        };

        BiConsumer<Integer, Character> right = (sum, letter) -> {
            for(int b = 0; b < gems.size(); b++) {
                if(b < gems.size() - 1) {
                    if(gems.get(b) + gems.get(b + 1) == sum) exclusion[b] = letter;
                }
                else {
                    if(gems.get(b).equals(sum)) exclusion[b] = letter;
                }
            }
        };

        BiConsumer<Integer, Character> both = (sum, letter) -> {
            for(int c = 0; c < gems.size(); c++) {
                if(c > 0 &&  c < gems.size() - 1) {
                    if(gems.get(c) + gems.get(c + 1) + gems.get(c - 1) == sum) exclusion[c] = letter;
                }
                else if (c == 0){
                    if(gems.get(c) + gems.get(c + 1) == sum) exclusion[c] = letter;
                }
                else if (c == gems.size() - 1){
                    if(gems.get(c) + gems.get(c - 1) == sum) exclusion[c] = letter;
                }
            }
        };

        while (!(command = input.nextLine()).equals("Forge")){
            String[] data = command.split(";");

            switch (data[0]){
                case "Exclude": {
                    if(data[1].equals("Sum Left")) left.accept(Integer.parseInt(data[2]), 'e');
                    else if(data[1].equals("Sum Right")) right.accept(Integer.parseInt(data[2]), 'e');
                    else if(data[1].equals("Sum Left Right")) both.accept(Integer.parseInt(data[2]), 'e');
                    break;
                }
                case "Reverse": {
                    if(data[1].equals("Sum Left")) left.accept(Integer.parseInt(data[2]), 'i');
                    else if(data[1].equals("Sum Right")) right.accept(Integer.parseInt(data[2]), 'i');
                    else if(data[1].equals("Sum Left Right")) both.accept(Integer.parseInt(data[2]), 'i');
                    break;
                }
                default: break;
            }
        }

        for (int d = 0; d < gems.size(); d++) {
            if(exclusion[d] == 'i') System.out.print(gems.get(d) + " ");
        }
    }
}



//Condition

//Your game studio’s next triple A big-budget-killer-app is the Hack and Slash Action RPG Inferno III. The main purpose
//of the game is well, to hack and slash things. But the secondary purpose is to craft items and recently the main fan base
//has started complaining that once you craft an item you can’t change it. So your next job is to implement a feature for
//one time reforging an item.
//On the first line you are given the gems already inserted in the form of numbers, representing their power. On the next lines,
//until you receive the "Forge" command, you can receive commands in the following format {command;filter type;filter parameter}:
//Commands can be: "Exclude", "Reverse" or "Forge". The possible filter types are: "Sum Left", "Sum Right" and "Sum Left Right".
//All filter parameters will be an integer.
//"Exclude" marks a gem for exclusion from the set if it meets a given condition. "Reverse" deletes a previous exclusion.
//"Sum Left" tests if a gems power summed with the gem standing to its right gives a certain value. "Sum Right" is the same
//but looks to a gems right peer. "Sum Left Right" sums the gems power with both its left and right neighbours.
//Note that changes on to the item are made only after forging. This means that the gems are fixed at their positions and
//every function occurs on the original set, so every gems power is considered, no matter if it is marked or not.



//Tests

//Input
//1 2 3 4 5
//Exclude;Sum Left;1
//Exclude;Sum Left Right;9
//Forge

//Output
//2 4


//Input
//1 2 3 4 5
//Exclude;Sum Left;1
//Reverse;Sum Left;1
//Forge

//Output
//1 2 3 4 5


//Input
//4 2 6 3 5 2 7 1 5
//Exclude;Sum Left;8
//Exclude;Sum Right;9
//Reverse;Sum Right;9
//Exclude;Sum Left Right;6
//Forge

//Output
//2 6 3 2 7



//Solution

//Решението ми получава 80/100 в Judge-системата
