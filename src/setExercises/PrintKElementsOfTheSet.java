package setExercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PrintKElementsOfTheSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int theFirstLength = input.nextInt();
        int theSecondLength = Integer.parseInt(input.nextLine().trim());

        TreeSet<Integer> set = new TreeSet<>();

        for (int a = 0; a < theFirstLength; a++) {
            set.add(input.nextInt());
        }

        if(set.size() < theSecondLength){
            System.out.println(-1);
        }
        else{
            Iterator<Integer> it = set.iterator();
            for (int b = 0; b < theSecondLength; b++) {
                System.out.print(it.next() + " ");
            }
        }
    }
}



//Condition

//Вход:
//На първият ред разделени с интервал - N броят на елементите във входящото множество и K броят на елементите в изходящото множеството;
//На втори ред стойностите на елементите от входящото множество;

//Дублиращи се стойности в изходящото множество не трябва да има;
//Елементите трябва да са подредени във възходящ ред;

//Изход:
//Ако размера на изходящото множество, е по-голям, от този на входящото множество, принтирайте -1, в противен случай принтирайте
//първите K елемента на входящото множество;



//Tests

//Input
//7 1
//2 3 4 5 6 7 1
//Output
//1

//Input
//10 5
//55 1561 51 5 1 1 15 15 1 18
//Output
//1 5 15 18 51

//Input
//8 9
//5 6 1 2 3 4 1 2
//Output
//-1

//Input
//6 6
//19 -2 38 14 -52 0
//Output
//-52 -2 0 14 19 38

//Input
//10 3
//2 5 2 5 2 2 5 2 5 5
//Output
//-1



//Solution

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int theFirstLength = input.nextInt();
//        int theSecondLength = Integer.parseInt(input.nextLine().trim());
//
//        TreeSet<Integer> set = new TreeSet<>();
//        set.addAll(Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList()));
//
//        if(set.size() < theSecondLength){
//            System.out.println(-1);
//        }
//        else{
//            Iterator<Integer> it = set.iterator();
//            for (int b = 0; b < theSecondLength; b++) {
//                System.out.print(it.next() + " ");
//            }
//        }
//    }
