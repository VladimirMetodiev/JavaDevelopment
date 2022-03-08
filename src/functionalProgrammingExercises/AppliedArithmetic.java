package functionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command;

        Function<List<Integer>, List<Integer>> add = (a) -> {
            for(int i = 0; i < a.size(); i++) a.set(i, a.get(i) + 1);
            return a;
        };

        Function<List<Integer>, List<Integer>> multiply = (b) -> {
            for(int i = 0; i < b.size(); i++) b.set(i, b.get(i) * 2);
            return b;
        };

        Function<List<Integer>, List<Integer>> subtract = (c) -> {
            for(int i = 0; i < c.size(); i++) c.set(i, c.get(i) - 1);
            return c;
        };

        Consumer<List<Integer>> print = (d) -> {
            d.forEach(e -> System.out.print(e + " "));
            System.out.println();
        };

        while (!(command = input.nextLine()).equals("end")){
            switch (command) {
                case "add": list = add.apply(list); break;
                case "multiply": list = multiply.apply(list); break;
                case "subtract": list = subtract.apply(list); break;
                case "checkUp": print.accept(list); break;
                default: break;
            }
        }
    }
}



//Condition

//On the first line you are given a list of numbers. On the next lines you are passed different commands that you need
//to apply to all numbers in the list: "add" -> adds 1; "multiply" -> multiplies by 2; "subtract" -> subtracts 1;
//"checkUp" -> prints all numbers on a new line. The input will end with an "end" command, after which you need to checkUp the result.



//Tests

//Input
//1 2 3 4 5
//add
//add
//checkUp
//end

//Output
//3 4 5 6 7


//Input
//5 10
//multiply
//subtract
//checkUp
//end

//Output
//9 19


//Input
//25 2 24 3 23 4 22 5 21 6 20 7 19 8 18 9 17 10 16 11 15 12 14 13
//multiply
//add
//checkUp
//add
//multiply
//subtract
//checkUp
//end

//Output
//51 5 49 7 47 9 45 11 43 13 41 15 39 17 37 19 35 21 33 23 31 25 29 27
//103 11 99 15 95 19 91 23 87 27 83 31 79 35 75 39 71 43 67 47 63 51 59 55
