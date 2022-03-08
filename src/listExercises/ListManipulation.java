package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command;

        while(!(command = input.nextLine()).equals("end")) {
            String[] data = command.split("\\s+");
            switch (data[0]) {
                case "Add": numbers.add(Integer.parseInt(data[1])); break;
                case "Remove": numbers.remove((Integer) Integer.parseInt(data[1])); break;
                case "RemoveAt": numbers.remove(Integer.parseInt(data[1])); break;
                case "Insert": numbers.set(Integer.parseInt(data[2]), Integer.parseInt(data[1])); break;
                default: break;
            }
        }

        numbers.forEach(num -> System.out.print(num + " "));
    }
}



//Condition

//Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
//Add {number}: add a number to the end of the list
//Remove {number}: remove number from the list
//RemoveAt {index}: removes number at a given index
//Insert {number} {index}: inserts a number at a given index
//Note: All the indices will be valid!
//When you receive the "end" command print the final state of the list (separated by spaces)



//Tests

//Input
//4 19 11 2 53 6 43
//Add 3
//Remove 2
//RemoveAt 1
//Insert 8 3
//end
//Output
//4 11 53 8 43 3


//Input
//19 13 28 11 32 57 14
//Add 99
//Add 72
//RemoveAt 4
//Remove 28
//Insert 64 4
//Insert 36 6
//end
//Output
//19 13 11 57 64 99 36
