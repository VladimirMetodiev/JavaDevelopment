package setExercises;

import java.util.Scanner;
import java.util.TreeSet;

public class TheSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        TreeSet<Integer> set = new TreeSet<>();

        for (int a = 0; a < number; a++) {
            set.add(input.nextInt());
        }

        try {
            System.out.println(set.subSet(0, set.last()).last());
        }
        catch (Exception ex) {
            System.err.println("There is not such element.");
        }
    }
}



//Условие

//Даден е списък с естествени числа. Принтирайте вторият по големина елемент, от списъка с числа.



//Тестове

//5
//1 2 3 4 5
//4

//10
//2 14 3 16 4 18 5 20 6 22
//20

//15
//3 4 12 5 3 12 10 9 4 8 3 7 12 1 5
//10

//3
//10 10 10
//There is not such element.
