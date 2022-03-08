package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocalMaximumsVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int previous = input.nextInt(), current = input.nextInt(), next, counter = 1, min = 0;

        while((next = input.nextInt()) != 0) {
            if(previous < current && current > next) list.add(1);
            else list.add(0);

            previous = current;
            current = next;
        }

        if(list.indexOf(1) != list.lastIndexOf(1)) {
            min = Integer.MAX_VALUE;
            list = list.subList(list.indexOf(1), list.lastIndexOf(1) + 1 < list.size() ? list.lastIndexOf(1) + 1 : list.size());

            for (int a = 0; a < list.size(); a++) {
                if(list.get(a).equals(0)) {
                    counter++;
                }
                else {
                    if(counter > 1 && counter < min) {
                        min = counter;
                    }
                    counter = 1;
                }
            }
        }

        System.out.println(min);
    }
}



//Условие

//Определете най-малкото разстояние между два локални максимума, в последователност от естествени числа, която завършва
//с въвеждането на числото 0.
//Ако последователността няма два локални максимума, отпечатайте числото 0.
//Ако последователността има два или повече локални максимума, отпечатайте най-малкото разстояние, между два от тях.



//Тестове

//5 4 3 0
//0

//1 2 3 4 5 0
//0

//6 6 6 6 0
//0

//10 20 50 40 30 0
//0

//100 90 85 50 60 50 40 75 30 0
//3

//25 100 90 80 70 100 95 85 75 65 80 60 0
//4

