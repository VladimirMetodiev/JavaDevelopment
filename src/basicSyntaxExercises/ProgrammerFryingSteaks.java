package basicSyntaxExercises;

import java.util.Scanner;

public class ProgrammerFryingSteaks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int minutes = 0;

        while(n > 0) {
            minutes += 2 * m;

            if(n - k > 0 && n - k < k && 2 * (n % k) <= k) {
                n = 0;
                minutes += m;
            }
            else {
                n -= k;
            }
        }

        System.out.println(minutes);
    }
}



//Условие

//Програмист пържи пържоли. Върху тигана, едновременно могат да бъдат сложени k пържоли . Всяка пържола, трябва да се пържи непрекъснато,
//от всяка страна, по m минути. Какво е най-краткото време, необходимо за изпържването на n пържоли и от двете страни?

//Входни данни
//Въвеждат се 3 числа: k, m и n. Всички числа не надвишават 32000.

//Изход
//Принтирайте времето, необходимо за изпържването на всички котлети.



//Тестове

//1
//5
//1
//10

//3
//5
//4
//15

//3
//5
//5
//20

//3
//5
//1
//10



//Бележка: запържваме всички пържоли от 2-те страни, докато останат пържоли за един пълен тиган и още един, който ще се запълни до
//половината или по-малко от половината. Запържваме пържолите в пълният тиган от едната страна, оставяме половината от тях настрана и
//обръщаме другата половина, слагаме останалите в тигана и пържим. След това вадим изпържените и от двете страни, поставяме в тигана
//половината, която отделихме и обръщаме останалите. Пържим. Така спестяваме m минути.






//n < k и n != 0   ==> 2 * m

//n % k == 0   ==> 2 * m * n / k

//n % k != 0 && 2 * (n % k) <= k   ==> 2 * m * n / k + m

//n % k != 0 && 2 * (n % k) > k   ==> 2 * m *(n / k + 1)
