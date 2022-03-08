package mapExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("text\\AtlanticPuffin.txt"));

        HashMap<String, Integer> words = new HashMap<>();

        while(input.hasNext()) {
            String word = input.next();
            word = word.replaceAll("[.,;!?()\"]", "");
            int frequency = words.get(word) == null ? 1 : words.get(word) + 1;
            words.put(word, frequency);
        }

        words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf("%s = %d%n", e.getKey(), e.getValue()));

        input.close();
    }
}
