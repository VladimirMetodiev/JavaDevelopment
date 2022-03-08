package stringExercises;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder result = new StringBuilder(input.next());
        StringBuilder current = new StringBuilder();
        int count = input.nextInt(), counter = 1;

        for (int a = 0; a < count - 1; a++) {
            for (int b = 1; b < result.length(); b++) {
                if(result.charAt(b) == result.charAt(b - 1)) {
                    ++counter;
                }
                else {
                    current.append(counter);
                    current.append(result.charAt(b - 1));
                    counter = 1;
                }
            }
            current.append(counter);
            current.append(result.charAt(result.length() - 1));
            result.setLength(0);
            result.append(current);
            current.setLength(0);
            counter = 1;
        }

        System.out.println(result.toString());
    }
}



//Условие

//Създайте последователност по следната схема:
//1
//11
//21
//1211
//111221
//312211
//13112221

//Входни данни
//На един ред се дават две цели числа разделени с интервал. Първото от тях x (0 <= x <= 100) е първият член на последователността.
//Второто n (1 <= n <= 25) е поредният номер на членът, който трябва да бъде определен.

//Изход
//Принтирайте n-тият член на последователността.



//Тестове

//1 8
//1113213211

//5 10
//31131122211311123113322115



//Каква е идеята: На първият ред числото 1 се среща 1 път. На втори ред първо извеждам количеството на числото 1, а след това
//и самото число 1 - получава се 11. На третият ред първо извеждам количеството на числото 1, а след това и самото число 1 - получава се 21.
//На четвъртият ред първо извеждам количеството на числото 2, а след това и 2, след това извеждам количеството на числото 1,
//а след това и 1 - получава се 1211. На пети ред числото се образува по следният начин: една 1, една 2, две 1 - получава се 111221.
//На шести ред: три 1, две 2, една 1 - получава се 312211. И така нататъка.




