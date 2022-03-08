package setExercises;

import java.util.Scanner;
import java.util.TreeSet;

public class MergeTwoSequences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        TreeSet<Long> union = new TreeSet<>();

        for (int a = 1; a <= number; a++) {
            union.add((long)Math.pow(a, 2));
            union.add((long)Math.pow(a, 3));
        }

        for(long num : union) System.out.print(num + " ");
    }
}



//Условие

//Нека имаме две безкрайни числови последователности от естествени числа. N-тият член на първата е равен на N^2, а
//N-тият член на втората е равен на N^3. Вземете всяка от тези последователности до X-тия член и ги обединете.
//Принтирайте резултата.



//Тестове

//2
//1 4 8

//3
//1 4 8 9 27

//4
//1 4 8 9 16 27 64

//5
//1 4 8 9 16 25 27 64 125
