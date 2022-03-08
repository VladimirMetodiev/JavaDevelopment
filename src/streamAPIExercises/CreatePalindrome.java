package streamAPIExercises;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CreatePalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<Character, Integer> letters = input.nextLine()
                .chars()
                .boxed()
                .collect(Collectors.toMap(k -> (char)k.intValue(), v -> 1, Integer::sum));

        Map<Character, Integer> even = letters.entrySet()
                .stream()
                .filter(el -> el.getValue() % 2 == 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, TreeMap::new)); // k -> k.getKey(), v -> v.getValue()

        Map<Character, Integer> odd = letters.entrySet()
                .stream()
                .filter(el -> el.getValue() % 2 != 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, TreeMap::new));

        for(Map.Entry<Character, Integer> entry : even.entrySet()) {
            for (int index = 0; index < entry.getValue() / 2; index++) {
                System.out.print(entry.getKey());
            }
        }

        odd.entrySet()
                .stream()
                .limit(1)
                .forEach(el -> {
                    for (int index = 0; index < el.getValue(); index++) {
                        System.out.print(el.getKey());
                    }
                });

        even.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(el -> {
                    for (int index = 0; index < el.getValue() / 2; index++) {
                        System.out.print(el.getKey());
                    }
                });
    }
}



//Tests

//HWHWFPFP
//FHPWWPHF

//BGBACGFCWFCW
//BFGWAWGFB

//AHWAHAW
//HWAAAWH

//BACBCDCDAD
//ABCCCBA

//KABKBMKAMK
//ABKKMMKKBA

//GWKDWGFCWGFKWGCD
//CDFGGKWWWWKGGFDC

//BBVWVGABWBGA
//ABBGVWWVGBBA

//DEBARDEADRA
//ERAAARE

//ABAWANBCPWNNP
//BPWAAAWPB
