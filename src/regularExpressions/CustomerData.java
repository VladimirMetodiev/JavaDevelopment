package regularExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerData {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<>(Arrays.asList(
                "Ivan Petrov; Bulgaria; Burgas; street:Kraibrejna 52; zip-code:8008; e-mail:ivan@abv.bg; phone:+3598884367853",
                "Vladimir Metodiev; Bulgaria; Sofia; street:Alexander Malinov 43; zip-code:1715; e-mail:vlad@gmail.com; phone:+3598888888888",
                "Irina Pavlova; Bulgaria; Sofia; street:Stephan Bogoridy 34; zip-code:1505; e-mail:irka.pavlova@gmail.com; phone:+3598885555555",
                "Boris Georgiev; Bulgaria; Plovdiv; street:Gerlovo 4; zip-code:4006; e-mail:bo_ge@abv.bg; phone:+3598881937477"
        ));

        String expression;
        ArrayList<String> currentData;
        Pattern pattern;
        Matcher matcher;

        System.out.println("CUSTOMER NAMES");

        for (int a = 0; a < customers.size(); a++) {
            expression = customers.get(a);
            pattern = Pattern.compile("\\A[A-Z][a-z]+\\s+[A-Z][a-z]+");
            matcher = pattern.matcher(expression);
            while(matcher.find()) System.out.println(matcher.group());
        }

        System.out.println("\nCUSTOMER PHONE NUMBERS");

        for (int a = 0; a < customers.size(); a++) {
            expression = customers.get(a);
            pattern = Pattern.compile("\\A[A-Z][a-z]+\\s+[A-Z][a-z]+");
            matcher = pattern.matcher(expression);
            while(matcher.find()) System.out.print(matcher.group());
            pattern = Pattern.compile("\\+359\\d{10}\\Z");
            matcher = pattern.matcher(expression);
            while(matcher.find()) System.out.println(" - phone number: " + matcher.group());
        }

        System.out.println("\nCUSTOMER E-MAILS");

        for (int b = 0; b < customers.size(); b++) {
            expression = customers.get(b);
            pattern = Pattern.compile("\\A[A-Z][a-z]+\\s+[A-Z][a-z]+");
            matcher = pattern.matcher(expression);
            while(matcher.find()) System.out.print(matcher.group());
            pattern = Pattern.compile("[a-z._]{4,30}@[a-z]+\\.[a-z]{2,}");
            matcher = pattern.matcher(expression);
            while(matcher.find()) System.out.println(" - e-mail: " + matcher.group());
        }

        System.out.println("\nCUSTOMER ADDRESSES");

        for (int c = 0; c < customers.size(); c++) {
            expression = customers.get(c);

            pattern = Pattern.compile("[A-Z][a-z]+\\s+[A-Z][a-z]+\\s+\\d+|[A-Z][a-z]+\\s+\\d+|[A-Z][a-z]+\\s+[A-Z][a-z]+|[A-Z][a-z]+");
            matcher = pattern.matcher(expression);

            currentData = new ArrayList<>();

            while(matcher.find()) {
                currentData.add(matcher.group());
            }

            System.out.println("NAME: " + currentData.get(0).toUpperCase());
            System.out.println("Country: " + currentData.get(1));
            System.out.println("Town: " + currentData.get(2));
            System.out.println("Street: " + currentData.get(3));

            pattern = Pattern.compile("\\b\\d{4}\\b");
            matcher = pattern.matcher(expression);

            while(matcher.find()) System.out.println("ZIP code: " + matcher.group() + "\n");
        }
    }
}
