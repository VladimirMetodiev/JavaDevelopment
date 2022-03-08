package functionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.LongStream;

public class ProductionOfAllNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long theFirst = Long.parseLong(input.nextLine());
        long theSecond = Long.parseLong(input.nextLine());

        BiFunction<Long, Long, Long> calculate = (x, y) -> LongStream.rangeClosed(x, y).reduce(1L, (a, b) -> a * b);
        System.out.println(calculate.apply(theFirst, theSecond));
    }
}



//Condition

//Write a lambda expression that accepts two long arguments as a range borders and calculates (returns) production of all numbers
//in this range (inclusively). It's guaranteed that 0 <= left border <= right border. If left border == right border then
//the result is any border.



//Tests

//5
//5
//5

//-10
//-10
//-10

//2
//5
//120

//0
//300
//0

//5
//12
//19958400

//-1000000
//1000000
//0

//-7
//-2
//5040
