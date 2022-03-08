package oopExercises.meskliniteExpedition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StartExpedition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        List<Ship> ships = new ArrayList<>();

        for(int a = 0; a < data[0]; a++) {
            List<Integer> loads = Arrays
                    .stream(input.nextLine().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Seat> seats = new ArrayList<>();

            for(int lCap : loads) {
                seats.add(new Seat(lCap));
            }

            ships.add(new Ship(seats));
        }

        int number = Integer.parseInt(input.nextLine());
        int counter = 0;

        List<Integer> mesklinites = Arrays
                .stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        doBubbleSortInDescendingOrder(mesklinites);

        for(int e = 0; e < number; e++) {
            for(Ship ship : ships) {
                boolean found = false;
                for(int s = 0; s < ship.getPassengerSeats().size(); s++) {
                    if(ship.getPassengerSeats().get(s).getReserved().equals(Reserved.NOT_RESERVED)) {
                        if(ship.getPassengerSeats().get(s).getLoadCapacity() >= mesklinites.get(e)) {
                            ship.getPassengerSeats().get(s).setReserved(Reserved.RESERVED);
                            ++counter;
                            found = true;
                            break;
                        }
                    }
                }
                if(found) break;
            }
        }

        System.out.println(counter);
    }

    private static List<Integer> doBubbleSortInDescendingOrder(List<Integer> list) {
        for(int f = 0; f < list.size() - 1; f++) {
            for(int g = 0; g < list.size() - 1 - f; g++) {
                if (list.get(g) < list.get(g + 1)) {
                    int temporary = list.get(g);
                    list.set(g, list.get(g + 1));
                    list.set(g + 1, temporary);
                }
            }
        }
        return list;
    }
}



//Условие

//Месклинитите възнамеряват да тръгнат на експедиция до края на света. Те разполагат с N кораба, с по M места. Всяко място
//на даден кораб, има своя товароподемност, а всеки месклинит има своя собствена маса. На едно място може да се качи не повече
//от един месклинит. Ако товароподемността на избраното място е по-малка от масата на месклинита, тогава бедният месклинит
//ще бъде изхвърлен в космоса.
//Ръководителят на експедицията обмисля разпределението на местата. Помогнете му да определи максималният брой месклинити,
//които ще могат да отидат на експедиция.

//Входни данни
//Първият ред съдържа числата N и M (1 <= N, M <= 40);
//Всеки от следващите N реда съдържа M числа, показващи товароносимостта на съответния място;
//Следва един ред съдържащ числото K (1 <= K <= 2000) – броят на месклинитите;
//Следва още един ред, съдържащ K числа, всяко от които, показва масата на i-тия месклинит;
//Всички маси на месклините и товароносимостта на местата са естествени числа, ненадвишаващи 109;

//Изход
//Отпечатайте максималният възможен брой участници в експедицията.



//Тестове

//Input
//3 2
//5 10
//7 5
//5 5
//6
//9 5 3 5 12 10
//Output
//4

//Input
//4 3
//10 15 20
//10 10 10
//6 8 6
//10 8 6
//15
//9 5 11 8 6 10 22 9 12 5 9 15 10 19 8
//Output
//12
