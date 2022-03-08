package algorithms;

import java.util.List;

public class Support {
    public static void printTheArray(int[] array) {
        for (int a = 0; a < array.length; a++) {
            if (a < array.length - 1) System.out.print(array[a] + " ");
            else System.out.println(array[a]);
        }
    }

    public static void printTheArray(double[] array) {
        for (int a = 0; a < array.length; a++) {
            if (a < array.length - 1) System.out.print(array[a] + " ");
            else System.out.println(array[a]);
        }
    }

    public static void printTheTextLines(String[] expressions) {
        for (String exp : expressions) {
            System.out.println(exp);
        }
    }

    public static void printTheWords(String[] words) {
        for (int a = 0; a < words.length; a++) {
            if (a < words.length - 1) System.out.print(words[a] + " ");
            else System.out.println(words[a]);
        }
    }

    public static <T> void printTheLines(List<T> list) {
        for (T line : list) {
            System.out.println(line);
        }
    }

    public static <T> void printTheList(List<T> list) {
        for (int a = 0; a < list.size(); a++) {
            if (a < list.size() - 1) System.out.print(list.get(a) + " ");
            else System.out.println(list.get(a));
        }
    }
}
