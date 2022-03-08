package io.scannerClass;

import java.util.ArrayList;
import java.util.Scanner;

public class HasNextMethod {
    public static void main(String[] args) {
        /*
         * Прекъсването на .hasNext(), може да бъде направено, чрез Ctrl+D или:
         */

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();



        while (!input.hasNext("stop")) {
            numbers.add(input.nextInt());
        }

        numbers.forEach(e -> System.out.print(e + " "));
        input.nextLine();



        while (input.hasNext()) {
            String str = input.next();

            if (str.equals("stop")) {
                break;
            }

            numbers.add(Integer.parseInt(str));
        }

        numbers.forEach(e -> System.out.print(e + " "));
    }
}



//Test

//1 2 3 stop
//1 2 3
//4 5 6 stop
//1 2 3 4 5 6


