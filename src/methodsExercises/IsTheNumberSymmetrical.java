package methodsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class IsTheNumberSymmetrical {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        number = number.length() == 3 ? "0" + number : number.length() == 2 ? "00" + number : number.length() == 1 ? "000" + number : number;

        ArrayList<String> num = new ArrayList<>(Arrays.asList(number.split("")));

        System.out.println(isNumberSymmetrical(num));
    }

    private static int isNumberSymmetrical(ArrayList<String> num) {
        ListIterator<String> iterator = num.listIterator();
        ListIterator<String> reverseIterator = num.listIterator(num.size());

        boolean isSymmetrical = true;

        while(iterator.hasNext() && reverseIterator.hasPrevious()) {
            if(!iterator.next().equals(reverseIterator.previous())) {
                isSymmetrical = false;
                break;
            }
        }

        return isSymmetrical ? 1 : 0;
    }
}



//Tests

//5445
//1

//9887
//0

//1761
//0

//6262
//0

//0000
//1

//9999
//1

//550
//1

//00
//1

//0
//1

//520
//0

//20
//0
