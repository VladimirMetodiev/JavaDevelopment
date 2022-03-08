package mapExercises;

import java.util.*;

public class TheResultOfTheOlympics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        HashMap<Integer, Integer> sportsmen = new HashMap<>();

        for (int a = 0; a < number; a++) {
            int[] data = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if(!sportsmen.containsKey(data[0])) sportsmen.put(data[0], data[1]);
            else sportsmen.put(data[0], sportsmen.get(data[0]) + data[1]);
        }

        sportsmen.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
                .forEach(el -> System.out.printf("%d %d%n", el.getKey(), el.getValue()));
    }
}



//Условие

//За всяко състезание от Олимпийските игри, всеки състезател получава уникален идентификационен номер – естествено число.
//Необходимо е да сортирате списъка на участниците в дадено състезание, по броя точки, които са отбелязали.

//Входни данни
//На първият ред получаваме числото N (1 <= N <= 1000) – броят на състезателите отбелязали точки;
//На всеки следващ ред получаваме идентификационният номер на атлета и резултата, който е постигнал;

//Изход
//Принтирайте списъкът със атлетите, сортиран по резултатите, в низходящ ред.
//Ако някои участници имат еднакви резултати, тогава те трябва да бъдат сортирани по идентификационният номер, във възходящ ред.



//Тестове

//Input
//3
//101 80
//305 90
//200 14
//Output
//305 90
//101 80
//200 14


//Input
//6
//15 42
//12 39
//14 49
//10 45
//17 40
//13 45
//Output
//14 49
//10 45
//13 45
//15 42
//17 40
//12 39


//Input
//5
//200 10
//100 9
//300 10
//200 7
//100 8
//Output
//100 17
//200 17
//300 10


//Input
//6
//20 8
//10 7
//20 9
//30 6
//10 8
//30 9
//Output
//20 17
//10 15
//30 15
