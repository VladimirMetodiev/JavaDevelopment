package bitwiseOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterEncoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data, text;
        List<Integer> code;

        getMessage();
        while(!(data = input.nextLine()).equals("end")) {
            switch(data) {
                case "encode": {
                    System.out.println("Enter some text:");
                    code = encode(input.nextLine());
                    System.out.println(code);
                    break;
                }
                case "decode": {
                    System.out.println("Enter the code:");
                    text = decode(Arrays.stream(input.nextLine().split("[,]\\s+")).map(Integer::parseInt).collect(Collectors.toList()));
                    System.out.println(text);
                    break;
                }
                default: System.out.println("Wrong command!"); break;
            }
            getMessage();
        }
    }

    private static void getMessage() {
        System.out.println("Choose: \"encode\", \"decode\" or \"end\"");
    }

    private static List<Integer> encode(String text) {
        List<Integer> code = new ArrayList<>();

        for (int a = 0; a < text.length(); a += 2) {
            char first = text.charAt(a);
            char second;
            if(a + 1 < text.length()) {
                second = text.charAt(a + 1);
                code.add(((int)first << 16) + (int)second);
            }
            else {
                code.add((int)first << 16);
            }
        }

        return code;
    }

    private static String decode(List<Integer> code) {
        StringBuilder sb = new StringBuilder();

        for (int b = 0; b < code.size(); b++) {
            char first = (char)(code.get(b) >>> 16);
            sb.append(first);
            char second = (char)(code.get(b)^((int)first << 16));
            if(second != 0) {
                sb.append(second);
            }
        }

        return sb.toString();
    }
}



//Типът char е 16 битов, а типът int е 32 бита. В int променлива могат да бъдат записани 2 char символа

//Кодиране
//Първата char променлива, я каствам в int и измествам битовете с 16 позиции вляво. Втората char променлива, я каствам в int
//и я прибавям към първата. Двойките символи (кодирани като един интиджър), ги добавям в списък.

//Разкодиране
//Взимам едно число от списъка. Премествам битовете му с 16 позиции вдясно. Получавам първата буква (символ).
//Взимам същото това число и изпълнявам операцията XOR (изключващо ИЛИ), с битовете от първият символ, които са върнати
//с 16 позиции вляво. Тъй като при операцията XOR, bit = 1 ^ 1 => 0, bit = 0 ^ 1 => 1, премахвам от интиджъра, битовете на
//първият символ, и остават само битовете на вторият. Така получавам вторият символ. Разкодираните символи записвам в
//String променлива.

//Бележка: Когато броя на символите е нечетен, при последната цифра, се кодира само една буква. При разкодирането,
//char със стоойност "0", не се записва (бел. в ASCII 0 е равнозначна на NUL).



//Tests

//encode
//Anna Dimitrova
//4259950, 7209057, 2097220, 6881389, 6881396, 7471215, 7733345

//decode
//4259950, 7209057, 2097220, 6881389, 6881396, 7471215, 7733345
//Anna Dimitrova

//encode
//Vladimir Metodiev
//5636204, 6357092, 6881389, 6881394, 2097229, 6619252, 7274596, 6881381, 7733248

//decode
//5636204, 6357092, 6881389, 6881394, 2097229, 6619252, 7274596, 6881381, 7733248
//Vladimir Metodiev

//decode
//4718693, 2097271, 6815855, 2097256, 6357107, 2097263, 7733349, 7471203, 7274605, 6619168, 6815849, 7536672, 6684773, 6357106, 7536672, 7798889, 7077996, 2097268, 7471221, 7078009, 2097250, 6619168, 6684786, 6619237, 3014656
//He who has overcome his fears will truly be free.

//decode
//3670132, 6815776, 5439589, 7340148, 6619245, 6422629, 7471136, 3211321, 3670070
//8th September 1986
