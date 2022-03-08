package listExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SplitByWordCasing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = Arrays.stream(input.nextLine().split("[\\s,;:.!()\\\"\\'\\/\\[\\]]+")).collect(Collectors.toList());

        ArrayList<String> lowerCase = new ArrayList<>();
        ArrayList<String> upperCase = new ArrayList<>();
        ArrayList<String> mixedCase = new ArrayList<>();

        for (String word : list) {
            if(word.matches("[a-z]+")) lowerCase.add(word);
            else if(word.matches("[A-Z]+")) upperCase.add(word);
            else mixedCase.add(word);
        }

        System.out.print("Lower-case: ");
        print(lowerCase);
        System.out.print("Mixed-case: ");
        print(mixedCase);
        System.out.print("Upper-case: ");
        print(upperCase);
    }

    private static void print(ArrayList<String> list) {
        for (int a = 0; a < list.size(); a++) {
            if(a < list.size() - 1) System.out.print(list.get(a) + ", ");
            else System.out.println(list.get(a));
        }
    }
}



//Condition

//Read a text, split it into words and distribute them into 3 lists.
//>	Lower-case words like “programming”, “at” and “databases” – consist of lowercase letters only.
//>	Upper-case words like “PHP”, “JS” and “SQL” – consist of uppercase letters only.
//>	Mixed-case words like “C#”, “SoftUni” and “Java” – all others.

//Use the following separators between the words: , ; : . ! ( ) " ' \ / [ ] space

//Print the 3 lists as shown in the example below.
//Lower-case: word, word, word
//Mixed-case: Word, woRd, word-5
//Upper-case: WORD, WORD, WORD



//Tests

//Input
//Learn programming at SoftUni: Java, PHP, JS, HTML 5, CSS, Web, C#, SQL, databases, AJAX, etc.
//Output
//Lower-case: programming, at, databases, etc
//Mixed-case: Learn, SoftUni, Java, 5, Web, C#
//Upper-case: PHP, JS, HTML, CSS, SQL, AJAX


//Input
//Companies: TOYOTA, 3M, SONY, Apple, Nissan, Toshiba, HUAWEI, ACER, HONDA / programme: DjVu; WinRar; 7‑Zip; CCleaner; Notepad++; AIMP / languages: Java JavaScript SQL XML HTML CSS PHP Python
//Output
//Lower-case: programme, languages
//Mixed-case: Companies, 3M, Apple, Nissan, Toshiba, DjVu, WinRar, 7‑Zip, CCleaner, Notepad++, Java, JavaScript, Python
//Upper-case: TOYOTA, SONY, HUAWEI, ACER, HONDA, AIMP, SQL, XML, HTML, CSS, PHP
