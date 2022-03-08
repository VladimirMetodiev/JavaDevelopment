package stringExercises;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        int moving = Integer.parseInt(input.nextLine());

        StringBuilder result = new StringBuilder();

        for(char c : expression.toCharArray()) {
            if(Character.isLetter(c)) {
                if(Character.isUpperCase(c)) result.append(getUpperCase(c, moving));
                else result.append(getLowerCase(c, moving));
            }
            else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }

    private static char getUpperCase(char s, int m) {
        return s - m >= 65 ? (char)(s - m) : (char)(91 + (s - 65 - m));
    }

    private static char getLowerCase(char s, int m) {
        return s - m >= 97 ? (char)(s - m) : (char)(123 + (s - 97 - m));
    }
}



//Условие

//Юлий Цезар е използвал собствен метод за шифроване на текст. Всяка буква е била заменяна със следващата по азбучен ред,
//през K позиции, като позициите, които излизат извън края на азбуката, се преместват кръгово в началота на азбуката. Необходимо е
//по даден шифрован текст, да се определи изходния текст.

//Входни данни
//Първият ред съдържа шифрован текст. Вторият ред съдържа числото K (1 <= K <= 10);

//Изход
//Принтирайте разкодираното изходно съобщение .



//Тестове

//XPSE
//1
//WORD


//Aqfinrnw
//5
//Vladimir


//Flssvd wlhyz
//7
//Yellow pears


//Q tqsm gmttwe xmiza.
//8
//I like yellow pears.
