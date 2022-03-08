package regularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMethodsMatchesAndSplit {
    public static void main(String[] args) {
        String expression = "vlad.metodiev@gmail.com";

        Pattern pattern = Pattern.compile("[a-z._]{6,30}@[a-z]+\\.[a-z]{2,}");
        Matcher matcher = pattern.matcher(expression);

        boolean flag = matcher.matches();           // търси съответствие на шаблона с целият низ
        if(flag) System.out.println(expression);



        System.out.println("\nThe String methods: .matches() and .split()");

        flag = expression.matches("[a-z._]{6,30}@[a-z]+\\.[a-z]{2,}");
        if(flag) System.out.println(expression + "\n");



        expression = "Daniel Georgiev=34; Nina Nikolova=26; Boris Teodorov Ivanov=27; Peter Dobrev=22;  Alex=24; Eva=21; Stoian Petrov=38";
        String[] data = expression.split("(=\\d{1,2};\\s+|=\\d{1,2})");

        Arrays.sort(data);
        for(String name : data) System.out.println(name);
    }
}
