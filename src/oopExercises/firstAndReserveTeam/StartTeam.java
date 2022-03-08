package oopExercises.firstAndReserveTeam;

import java.util.Scanner;

public class StartTeam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter count of players:");
        int number = Integer.parseInt(input.nextLine());
        System.out.println("Enter a name of team:");
        Team team = new Team(input.nextLine());

        System.out.printf("Enter %d players:%n", number);

        for (int a = 0; a < number; a++) {
            String[] data = input.nextLine().split("\\s+");
            team.addPlayer(new Player(data[0], data[1], Integer.parseInt(data[2])));
        }

        System.out.printf("First team have %d players%n", team.getFirstTeamPlayers().size());
        System.out.printf("Reserve team have %d players%n", team.getReserveTeamPlayers().size());
    }
}



//Test

//10
//Conquerors
//Vladimir Metodiev 43
//Alexander Dimitrov 32
//Boris Ivanov 45
//Peter Dobromirov 28
//Ivan Pavlov 24
//Stoian Iliev 46
//Teodor Petrov 31
//Ilia Trendafilov 27
//Konstantin Todorov 25
//Nicola Georgiev 23
