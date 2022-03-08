package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Vladimir Metodiev
 * @version 2.0
 */

public class ListOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> myList = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command;

        while(!(command = input.nextLine()).equals("End")) {
            String[] data = command.split("\\s+");

            try {
                switch(data[0]) {
                    case "Add": myList.add(Integer.parseInt(data[1])); break;
                    case "Insert": myList.add(Integer.parseInt(data[2]), Integer.parseInt(data[1])); break;
                    case "Remove": myList.remove(Integer.parseInt(data[1])); break;
                    case "Shift": {
                        if(data[1].equals("left")) {
                            for (int a = 0; a < Integer.parseInt(data[2]); a++) {
                                myList.add(myList.get(0));
                                myList.remove(0);
                            }
                        }
                        if(data[1].equals("right")) {
                            for (int a = 0; a < Integer.parseInt(data[2]); a++) {
                                myList.add(0, myList.get(myList.size() - 1));
                                myList.remove(myList.size() - 1);
                            }
                        }
                        break;
                    }
                    default: break;
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Invalid index");
            }
        }

        myList.forEach(e -> System.out.print(e + " "));
    }
}



//Condition

// You will be given a list of integer numbers on the first input line. Until you receive "End" you will be given operations
// you have to apply on the list. The possible commands are:
//    Add {number} – add number at the end
//    Insert {number} {index}” – insert number at given index
//    Remove {index} – remove at index
//    Shift left {count} – first number becomes last ‘count’ times - напр. left 3 означава да взема първите три елемента (един по един) и да ги поставя най-отзад
//    Shift right {count} – last number becomes first ‘count’ times - напр. right 3 означава да взема последните три елемента и да ги поставя най-отпред
// Note: it is possible that the index given is outside of the bounds of the array. In that case print "Invalid index"



//Tests

//Input
//1 23 29 18 43 21 20
//Add 5
//Remove 5
//Shift left 3
//Shift left 1
//End

//Output
//43 20 5 1 23 29 18


//Input
//5 12 42 95 32 1
//Insert  3 0
//Remove 10
//Insert 8 6
//Shift right 1
//Shift left 2
//End

//Output
//Invalid index
//5 12 42 95 32 8 1 3


//Input
//19 21 25 30 40 50 60 2 4 10
//Insert 27 3
//Insert -1 -1
//Remove  7
//Insert 35  5
//Remove 12
//Shift right 4
//Shift left 1
//Add 90
//End

//Output
//Invalid index
//Invalid index
//2 4 10 19 21 25 27 30 35 40 50 90
