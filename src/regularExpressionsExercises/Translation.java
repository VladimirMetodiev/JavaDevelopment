package regularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Translation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String data = input.nextLine();
        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile("\\d+|[\\WA-Za-z]+");
        Matcher matcher = pattern.matcher(data);

        while(matcher.find()) {
            try {
                result.append(Integer.toString(Integer.parseInt(matcher.group()), 2));
            }
            catch(NumberFormatException ex) {
                result.append(matcher.group());
            }
        }

        System.out.println(result);
    }
}



//Условие

//На планетата на роботите наистина не харесват десетичната бройна система, затова те помолиха човек - именно теб, да напишеш програма,
//която да заменя всички числа, намиращи се в текста, със същите числа, но в двоичната бройна система.

//Входни данни
//Подава се единичен символен низ, състоящ се от произволни знаци. Дължината на низа не надвишава 255 знака. Гарантирано е, че няма
//водещи нули във всички числа в низът.

//Изход
//Принтирай преобразуваният низ.



//Тестове

//distance traveled 624 kilometers:transported#716 machine housings&98 electric motors
//distance traveled 1001110000 kilometers:transported#1011001100 machine housings&1100010 electric motors
