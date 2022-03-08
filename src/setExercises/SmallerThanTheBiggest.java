package setExercises;

import java.util.Scanner;
import java.util.TreeSet;

public class SmallerThanTheBiggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeSet<Integer> set = new TreeSet<>();

        for(int a = input.nextInt(); a != 0; set.add(a), a = input.nextInt());

        System.out.println(set.lower(set.last()));
    }
}



//Условие

//Дадена е последователност от естествени числа, която завършва с въвеждането на числото 0. Определете стойността на
//вторият по големина елемент в тази последователност. Принтирайте резултата.



//Тестове

//11 24 5 62 48 39 72 0
//62

//10 50 20 50 60 60 0
//50
