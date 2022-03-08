package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertAListToAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15, 16));
        Integer[] theFirstArray = new Integer[list.size()];
        list.toArray(theFirstArray);
        System.out.println(Arrays.toString(theFirstArray));


        ArrayList<Double> realNumberList = new ArrayList<>(Arrays.asList(1.2, 2.3, 3.4, 4.5, 6.7));
        Double[] theSecondArray = realNumberList.toArray(new Double[realNumberList.size()]);
        System.out.println(Arrays.toString(theSecondArray));


        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("potato", "bean", "pepper", "tomato", "cucumber", "parsley"));
        String[] theThirdArray = new String[wordList.size()];
        wordList.toArray(theThirdArray);
        System.out.println(Arrays.toString(theThirdArray));


        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Anna", "Victoria", "Eva", "Sarah", "Valentina", "Diana"));
        String[] theFourthArray = nameList.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(theFourthArray));


        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(5.8, 9.18, 16.7, -53.6, 20.0));
        Double[] theFifthArray = doubleList.stream().toArray(Double[]::new);
        System.out.println(Arrays.toString(theFifthArray));


        // Методите mapToInt, mapToLong и mapToDouble преобразуват потоци от обекти в потоци от съответните примитивни типове.

        ArrayList<Integer> intNumbers = new ArrayList<>(Arrays.asList(23, 45, 67, 89, 102, 123, 145, 167, 189, 202));
        int[] thirdArray = intNumbers.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(thirdArray));


        List<Long> longNumbers = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L);
        long[] secondArray = longNumbers.stream().mapToLong(Long::longValue).toArray();
        System.out.println(Arrays.toString(secondArray));


        List<Double> doubleNumbers = Arrays.asList(13.5, 8.8, 45.5, -29.8, 4.7, -53.6, 11.8, 25.4, 16.8, 81.9);
        double[] fourthArray = doubleNumbers.stream().mapToDouble(Double::doubleValue).toArray();
        System.out.println(Arrays.toString(fourthArray));


        List<String> strList = Arrays.asList("Vladimir", "Anna", "Alexander", "Nina", "Nicola");
        String[] fifthArray = strList.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(fifthArray));


        List<Character> characterList = Arrays.asList('A', 'Z', 'B', 'Y', 'C', 'X', 'D', 'W', 'E', 'V');
        char[] capitalLetters = characterList.stream().map(Object::toString).collect(Collectors.joining()).toCharArray();
        System.out.println(Arrays.toString(capitalLetters));


        characterList = Arrays.asList('f', 'u', 'g', 't', 'h', 's', 'i', 'r', 'j', 'q');
        char[] letters = characterList.stream().map(String::valueOf).collect(Collectors.joining()).toCharArray();
        System.out.println(Arrays.toString(letters));
    }
}
