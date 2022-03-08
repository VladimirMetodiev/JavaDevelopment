package streamAPIExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CreateMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        Map<Character, Integer> letters = expression
                .chars()
                .boxed()
                .collect(Collectors.toMap(k -> (char)k.intValue(), v -> 1, Integer::sum));

        letters.entrySet().stream()
                .filter(el -> el.getValue() == 2)
                .forEach(el -> System.out.println(el.getKey()));
    }
}



//Условие

//На един ред се дава символен низ, който съдържа само две еднакви букви. Низът има дължина по-голяма или равна на 3 символа и
//по-малка или равна на 27. Гарантирано е, че точно една буква се повтаря. Намерете и принтирайте тази буква.



//Тестове

//GkG
//G

//lava
//a

//cachet
//c

//FADDY
//D

//qazwsxedcrfvqtgbyhnujmikolp
//q
