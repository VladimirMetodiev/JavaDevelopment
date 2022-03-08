package stringExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = Arrays.stream(input.nextLine().trim().split("\\s+")).collect(Collectors.joining(" "));
        System.out.println(line);
    }
}



//Условие

//Даден е символен низ, ако между думите има повече от един интервал, трябва да преобразувате всички последователни интервали в един.
//Ако има интервали в началото и в края на реда, те трябва да бъдат премахнати. Принтирайте промененият символен низ.



// Greek  farmers  stage tractor   protest  against  soaring   energy costs.
//Greek farmers stage tractor protest against soaring energy costs.



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String line = input.nextLine().trim();
//        System.out.print(line.replaceAll("\\s+", " "));
//    }
