package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command;

        while(!(command = input.nextLine()).equals("end")) {
            String[] data = command.split("\\s+");

            switch(data[0]) {
                case "Delete": list.removeAll(Arrays.asList((Integer.parseInt(data[1])))); break;
                case "Insert": list.add(Integer.parseInt(data[2]), Integer.parseInt(data[1])); break;
                default: break;
            }
        }

        list.forEach(e -> System.out.print(e + " "));
    }
}



//Condition

// Write a program, which reads a list of integers from the console and receives commands, which manipulate the list.
// Your program may receive the following commands:
//    Delete {element} – delete all elements in the array, which are equal to the given element
//    Insert {element} {position} – insert element and the given position
// You should stop the program when you receive the command "end". Print all numbers in the array separated with single whitespace.



//Tests

//Input
//1 2 3 4 5 5 5 6
//Delete 5
//Insert 10 1
//Delete 5
//end
//Output
//1 10 2 3 4 6


//Input
//20 12 4 319 21 31234 2 41 23 4
//Insert 50 2
//Insert 50 5
//Delete 4
//end
//Output
//20 12 50 319 50 21 31234 2 41 23


