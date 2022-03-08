package listExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Balloons {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int count = input.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int a = 0; a < count; a++) list.add(input.nextInt());

        boolean flag = true;

        while(flag) {
            flag = false;
            int counter = 1, first = 0;
            for (int b = 1; b < list.size(); b++) {
                if(list.get(b - 1).equals(list.get(b))) {
                    if(counter == 1) {
                        flag = true;
                        first = b - 1;
                    }
                    counter++;
                }

                if(!list.get(b - 1).equals(list.get(b)) && counter == 2) {
                    counter = 1;
                }

                if(!list.get(b - 1).equals(list.get(b)) && counter >= 3) {
                    break;
                }
            }
            if(counter >= 3) {
                list = removeElement(list, first, counter);
                result += counter;
            }
            else {
                flag = false;
            }
        }

        System.out.println(result);
    }

    private static List<Integer> removeElement(List<Integer> list, int index, int count) {
        for (int c = 0; c < count; c++) {
            list.remove(index);
        }
        return list;
    }
}



//Условие

//В една компютърна игра имаме балони с различни цветове в една редица. Когато се образува непрекъсната верига, от три или повече
//балона, от един и същи цвят, тя може да се отстрани от редът. В същото време, всички други балони, се движат един към друг
//и може да се образуват, нови печеливши поредици от балони.

//Напишете програма, която да изчислява, максималният брой балони, от зададен ред, който може да бъде отстранен (унищожен).
//В началния момент, не може да има повече от една непрекъсната верига, от три или повече балона, от един и същи цвят.

//Входни данни
//Получаваме ред от цели числа (не повече от 1000). Първата цифра е броя на балоните, т.е. тя е равна на броя на
//следващите цифри. Всяка следваща цифра означава един балон. Тъй като балоните са цветни, цветът се закодира чрез число
//от 0 до 9 (всеки цвят има собствено цяло число).

//Изход
//Принтирайте броя на балоните, които ще бъдат "унищожени".


//Тестове

//5 1 3 3 3 2
//3

//7 1 2 2 2 1 1 3
//6

//7 7 4 4 4 7 1 2
//3

//10 2 3 3 3 5 5 5 3 2 2
//6

//6 5 4 4 4 5 5
//6

//14 8 2 4 4 4 4 4 0 0 0 2 2 8 8

//17 1 0 0 0 1 0 0 2 2 2 2 0 0 4 4 4 4
//15
