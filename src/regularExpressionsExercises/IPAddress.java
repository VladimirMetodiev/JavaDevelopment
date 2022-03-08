package regularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ipPattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(input.nextLine());
        boolean isItAnIPAddress = matcher.matches();

        if(isItAnIPAddress) System.out.println(1);
        else System.out.println(0);

    }
}



//Условие

//За достъп до Интернет на всеки компютър се присвоява т. нар. IP адрес. Състои се от четири цели числа, разделени с точки,
//които варират в диапазона от 0 до 255. Напишете програма, която определя дали даден символен низ е валиден IP адрес.

//Входни данни
//Дава се символен низ не по-дълъг от 15 знака, който включва числа и точно три точки.

//Изход
//Ако низът е валиден IP адрес, изведете 1, в противен случай 0.

//БЕЛЕЖКА: Има тънкости, свързани с незначимите нули в IP адресите. За да не навлизаме в джунглата на тези тънкости,
//адрес, който има водещи нули, но в същото време всяко число има не повече от три цифри, може да се счита за правилен за задачата.
//Например адресът 10.01.100.001 е правилен, а адресът - 01.0001.100.001 - не е правилен.



//Тестове

//127.0.0.0
//0.05.122.144
//255.00.255.255
//11.39.200.111
//000.5.55.034
//121.234.12.12
//1

//000.42.224.25.33
//122.0000.000.220
//0000.11.11.11
//150.120.160
//125.125.125.256
//-200.210.220.230
//ooo.112.115.118
//0



//Друго мое решение

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] data = input.nextLine().split("\\.");
//        boolean isItAnIPAddress = true;
//
//        if(data.length > 0 && data.length <= 4) {
//            for (int a = 0; a < 4; a++) {
//                if(data[a].length() > 3) {
//                    isItAnIPAddress = false;
//                    break;
//                }
//                try {
//                    int num = Integer.parseInt(data[a]);
//                    if(num < 0 || num > 255) throw new Exception();
//                }
//                catch (Exception ex) {
//                    isItAnIPAddress = false;
//                    break;
//                }
//            }
//        }
//        else {
//            isItAnIPAddress = false;
//        }
//
//        if(isItAnIPAddress) System.out.println(1);
//        else System.out.println(0);
//    }
