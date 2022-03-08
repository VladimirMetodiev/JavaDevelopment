package basicSyntaxExercises;

import java.util.Scanner;

public class TheRingRoadOfSofia {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int v = Integer.parseInt(input.nextLine());
        int t = Integer.parseInt(input.nextLine());

        int distance = v * t;
        int motorway = distance > 0 ? 0 : 109;

        for (int i = 0; i < Math.abs(distance); i++) {
            if(distance > 0) {
                ++motorway;
                if(motorway == 109) motorway = 0;
            }
            else {
                --motorway;
                if(motorway == 0) motorway = 109;
            }
        }

        System.out.println(motorway);
    }
}



//Condition

//Да приемем, че дължината на околовръстния път на София е 109 километра. Един автомобил тръгва от нулевия километър на
//Софийския околовръстен път и се движи със скорост v километра в час. На кой километър ще бъде след t часа?

//Като вход получаваме стойностите на v и t.
//Ако v > 0, тогава автомобила се движи в положителна посока по околовръстния път на София, ако v < 0, тогава се движи в отрицателна посока.

//Като изход програмата трябва да върне цяло число от 0 до 108



//Tests

//60
//2
//11


//54
//2
//108


//60
//4
//22


//-48
//2
//13

