package arrayExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] theFirst = input.nextLine().split("\\s+");
        String[] theSecond = input.nextLine().split("\\s+");

        LinkedHashSet<String> commonElements = new LinkedHashSet<>();

        for (int a = 0; a < theSecond.length; a++) {
            for (int b = 0; b < theFirst.length; b++) {
                if(theFirst[b].equals(theSecond[a])){
                    commonElements.add(theSecond[a]);
                }
            }
        }

        for(String element : commonElements){
            System.out.print(element + " ");
        }
    }
}



//Condition

//Write a program, which prints common elements in two arrays. You have to compare the elements of the second array
// to the elements of the first.



//Tests

//Hey hello 2 4
//10 hey 4 hello
//4 hello


//S of t un i
//of i 10 un
//of i un


//i love to code
//code i love to
//code i love to

//bay mountain hill bay field field
//lowland hill bay meadow bay
//hill bay
