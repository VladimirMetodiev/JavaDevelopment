package streamAPIExercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Champion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int athletes = input.nextInt();
        int hammerThrows = Integer.parseInt(input.nextLine().trim());

        List<Sportsman> sportsmen = new ArrayList<>();

        for (int a = 0; a < athletes & hammerThrows > 0; a++) {
            List<Integer> current = Arrays
                    .stream(input.nextLine().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            sportsmen.add(new Sportsman(current));
        }

        int max = sportsmen.stream().map(Sportsman::getMax).mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(sportsmen.stream().filter(s -> s.getMax() == max).count());
    }
}

class Sportsman {
    private List<Integer> results;

    Sportsman(List<Integer> results) {
        this.results = results;
    }

    int getMax() {
        return results.stream().mapToInt(Integer::intValue).max().orElse(0);
    }
}



//Условие

//В състезание по мятане на чук се съревновават n атлети. Всеки от тях прави m хвърляния. Победителят се определя по най-високия
//резултат. Определете броя на състезателите, които са постигнали най-добрият резултат.

//Входни данни
//На първи ред програмата получава като вход две числа n и m - броят на спортистите и броят на хвърлянията;
//След това входният поток съдържа n реда от по m числа всеки, - резултатите от мятанията на всеки атлет;

//Изход
//Принтирайте броя на спортистите, постигнали най-добрият резултат.



//Тестове

//3 4
//7 8 6 8
//7 10 6 8
//9 9 9 9
//1

//6 5
//6 7 8 8 7
//7 8 7 8 7
//8 10 9 10 8
//7 6 6 5 6
//10 10 10 10 10
//9 7 8 9 10
//3

//5 0
//0

//0 0
//0
