package arrayExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Socks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = IntStream.generate(input::nextInt).limit(3).toArray();

        int[] table = new int[data[0]];

        for (int a = 0; a < data[1]; a++) {
            int beginning = input.nextInt();
            int end = Integer.parseInt(input.nextLine().trim());

            for (int sock = beginning - 1; sock <= end - 1; sock++) {
                table[sock] += 1;
            }
        }

        for (int b = 0; b < data[2]; b++) {
            int point = Integer.parseInt(input.nextLine());
            System.out.println(table[point - 1]);
        }
    }
}



//Условие

//Разполагаме с маса, чиято дължина е L. На масата са подредени N чорапа, по такъв начин, че нито един чорап, не излиза извън
//краищата на масата. Определете дебелината на покритието на масата с чорапи, в М точки.

//Входни данни
//На първият ред получаваме 3 естествени числа L, N, M (1 <= L <= 10000, 1 <= N <= 10000, 1 <= M <= 100000);
//На следващите N реда получаваме двойки числа left <= right от 1 до L – левият и десният край на чорапите;
//След това получаваме M числа от 1 до L точки, в които ще бъдат направени "измерванията";
//Всички числа са цели;

//Изход
//Отпечатайте M числа, дебелината на покритието в точките на измерване.



//Бележки по условието:
//Чорапите се поставят в една линия. Всяка от N-те двойки представлява координатите на чорапите върху масата. Лявото число
//е левият край на чорапа, а дясното е десният. Чорапите са поставени така, че ако кординатите им съвпадат, те лежат едни върху други.



//Тест

//Input
//39 4 7
//3 21
//3 15
//2 20
//3 17
//4
//17
//33
//5
//9
//25
//37

//Output
//4
//3
//0
//4
//4
//0
//0
