package generics.volleyballGame;

import java.util.ArrayList;
import java.util.Random;

public class Team<T extends Player> {
    private String teamName;
    private ArrayList<T> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addNewPlayer(T p){
        players.add(p);
        System.out.printf("A new player has been added in %s [%s, %d years old].%n", teamName, players.get(players.size() - 1).getName(), players.get(players.size() - 1).getAge());
    }

    public String getTeamName() {
        return teamName;
    }

    public void playWith(Team<T> team){
        String winner = "";

        Random random = new Random();
        int result = random.nextInt(2);

        if(result == 1) winner = teamName;
        else winner = team.getTeamName();

        System.out.println("Winner is " + winner + ".");
    }
}
