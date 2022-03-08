package functionalProgramming.beginning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class Beginning {
    public static void main(String[] args) {

        GetRealNumber ten = () -> 10;
        System.out.println(ten.get());

        GetRealNumber randomValue = () -> new Random().nextDouble() * 1000.0;
        System.out.println(randomValue.get());

        HasAParameter realNumber = (num) -> Math.pow(num, 3);
        System.out.println(realNumber.get(3.33));

        HasGenParam<Integer> addition = num -> num + 1;
        System.out.println(addition.get(143));

        final double CONSTANT = 6.66;
        HasGenParam<Double> multiplication = rNum -> rNum * CONSTANT;
        System.out.println(multiplication.get(14.12));

        BooleanValue checkUp = str -> str.contains("a");
        System.out.println(checkUp.IsItTrue("Vladimir"));

        ComparesTwoStrings twoWords = (str1, str2) -> str1.length() == str2.length();
        System.out.println(twoWords.compares("victory", "rout"));



        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(63, 127, -15, 38, 94, -82, 49, -153, 54, 76));
        numbers.removeIf(num -> num < 50);

//        Predicate<Integer> remove = num -> num < 50;
//        for(int a = numbers.size() - 1; a >= 0; a--) if(remove.test(numbers.get(a))) numbers.remove(a);

        numbers.forEach(el -> System.out.print(el + " "));
    }
}
