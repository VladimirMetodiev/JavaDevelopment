package basicSyntax;

import java.util.Arrays;
import java.util.Scanner;

public class BreakTheLoopVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int searchNumber = Integer.parseInt(input.nextLine());
        boolean foundIt = false;
        int index = -1;

        for (int a = 0; a < array.length; a++) {
            if (array[a] == searchNumber) {
                foundIt = true;
                index = a;
                break;
            }
        }

        if (foundIt) {
            System.out.printf("Found the number %d at index %d%n", searchNumber, index);
        }
        else {
            System.out.println("There isn't such number");
        }
    }
}



//Tests

//2 18 7 84 15 27 43 92 33
//27


//2 18 7 84 15 27 43 92 33
//11
