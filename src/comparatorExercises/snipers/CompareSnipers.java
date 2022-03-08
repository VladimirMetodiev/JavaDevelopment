package comparatorExercises.snipers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CompareSnipers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = Integer.parseInt(input.nextLine());
        ArrayList<Sniper> snipers = new ArrayList<>();

        for (int a = 0; a < length; a++) {
            String[] data = input.nextLine().split("\\s+");
            snipers.add(new Sniper(data[0], Integer.parseInt(data[1])));
        }

        Collections.sort(snipers, Comparator.comparing((Sniper n) -> n.getNickname()));
        Collections.sort(snipers, (Sniper h1, Sniper h2) -> h2.getHits() - h1.getHits());

        snipers.forEach(sniper -> System.out.printf("%s %d%n", sniper.getNickname(), sniper.getHits()));
    }
}



//Test

//Input
//9
//Orel 57
//Delta 19
//Razor 24
//Buk 15
//Alpha 19
//Argentina 19
//Zulu 98
//Raptor 24
//Samurai 38

//Output
//Zulu 98
//Orel 57
//Samurai 38
//Raptor 24
//Razor 24
//Alpha 19
//Argentina 19
//Delta 19
//Buk 15
