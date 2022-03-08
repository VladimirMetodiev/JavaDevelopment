package streamAPIExercises;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class SumOfFractions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        double result = DoubleStream.iterate(1, x -> x + 1).limit(n).map(x -> 1.0 / Math.pow(x, 2)).sum();
        System.out.println(new DecimalFormat("0.#####").format(result));
    }
}



//Условие

//По дадено число n (не превишаващо 100000), изчислете сумата 1 + 1/2^2 + 1/3^2 +...+ 1/n^2.



//Тестове

//2
//1,25

//3
//1,36111
