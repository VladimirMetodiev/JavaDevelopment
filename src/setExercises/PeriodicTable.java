package setExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfChemicalCompounds = Integer.parseInt(input.nextLine());

        List<String> compound;
        TreeSet<String> elements = new TreeSet<>();

        for(int a = 0; a < numberOfChemicalCompounds; a++) {
            compound = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());
            elements.addAll(compound);
        }

        elements.forEach(el -> System.out.print(el + " "));
    }
}



//Condition

//You are given an n number of chemical compounds. You need to keep track of all chemical elements used in the compounds
//and at the end print all unique ones in ascending order.



//Tests

//Input
//4
//Mg Cl H
//Mg C O
//Ca C O Mg C O
//Mg S O

//Output
//C Ca Cl H Mg O S


//Input
//5
//P H
//P O
//H P O
//P Cl
//Ca P

//Output
//Ca Cl H O P
