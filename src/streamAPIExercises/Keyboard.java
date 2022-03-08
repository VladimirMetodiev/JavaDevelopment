package streamAPIExercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Keyboard {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(new FileInputStream("text\\Keyboard.txt"))) {
            int keys = Integer.parseInt(input.nextLine());
            int[] keystrokes = Arrays.stream(input.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int total = Integer.parseInt(input.nextLine());
            Map<Integer, Integer> map = IntStream.generate(input::nextInt)
                    .limit(total)
                    .boxed()
                    .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));

            IntStream.range(0, keys)
                    .mapToObj(x -> keystrokes[x] < map.get(x + 1) ? "YES" : "NO")
                    .forEach(System.out::println);
        }
        catch (FileNotFoundException ex) {
            System.err.println("There isn't such file.");
        }
    }
}



//Условие

//Всеки знае, че с времето клавиатурата се износва и клавишите върху нея започват да "залепват". Разбира се, такава клавиатура
//все още може да се използва, известно време, но трябва да прилагате много сила, при натискането на клавишите.

//По време на производството на клавиатурата, за всеки клавиш се задава броят на натисканията, които трябва да издържи. Ако знаете
//тези стойности за използваната клавиатура, тогава, за определена последователност от натискания на клавиши, вие ще можете
//да определите кои клавиши ще се счупят и кои ще останат здрави, по време на тяхното използване.

//Необходимо е да се напише програма, която определя кои клавиши ще се счупят, по време на даден вариант на работа с клавиатурата.

//Входни данни
//Първият ред от входният файл, съдържа цяло число n (1 <= n <= 100) – броят на клавишите на клавиатурата;
//Вторият ред съдържа n цели числа – с1, с2, … , сn, където сi (1 <= сi <= 100000) – броят на натисканията, поддържани от i-тия клавиш;
//Третият ред съдържа цяло число k (1 <= k <= 100000) - общият брой натискания на клавиши;
//Последният ред съдържа k цели числа pj (1 <= pj <= n) последователността от натиснати клавиши;

//Изход
//Необходимо е да принтирате n реда, съдържащи информация за здравината на клавишите. Ако i-тият клавиш е повреден,
//тогава i-тият ред трябва да съдържа думата YES, ако клавишът е функционален, то тогава трябва да съдържа NO.



//Информация за отговора:

//1    3872    3500   YES
//2    3908    4000   NO
//3    3890    4000   NO
//4    3752    3500   YES
//5    3859    3500   YES
//6    3900    5000   NO
//7    3832    4000   NO
//8    3837    5000   NO
//9    3900    5000   NO
//10   3792    3500   YES
//11   3776    3500   YES
//12   3744    3500   YES
//13   3856    3500   YES
//14   3854    3500   YES
//15   3863    4000   NO
//16   3871    4000   NO
//17   3842    4000   NO
//18   3849    3750   YES
//19   3830    3750   YES
//20   3856    3750   YES
//21   3751    3750   YES
//22   3892    3750   YES
//23   3838    4000   NO
//24   3864    4000   NO
//25   3916    4000   NO
//26   3856    4000   NO
