package regularExpressions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupsVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, String> people = new LinkedHashMap<>();
        String expression;
        Pattern pattern;
        Matcher matcher;

        int number = Integer.parseInt(input.nextLine());

        for (int a = 0; a < number; a++) {
            expression = input.nextLine();

            pattern = Pattern.compile("([A-Z][a-z]+\\s+[A-Z][a-z]+)\\s(\\d{2}/\\d{2}/\\d{4})");
            matcher = pattern.matcher(expression);

            while (matcher.find()) {
                people.put(matcher.group(1), matcher.group(2));
            }
        }

        for(Map.Entry<String, String> element : people.entrySet()){
            System.out.printf("%s was born on %s.%n", element.getKey(), element.getValue());
        }
    }
}



//Test

//5
//Anna Dimitrova 18/09/1983
//Nicola Petrov 16/04/1976
//Sarah Ivanova 11/06/1981
//Vladimir Metodiev 14/05/1978
//Ralitza Dobrinova 08/01/1986
