package oopExercises.firstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Player> firstTeamPlayers;
    private List<Player> reserveTeamPlayers;

    public Team(String name) {
        this.name = name;
        firstTeamPlayers = new ArrayList<>();
        reserveTeamPlayers = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if(player.getAge() < 40) firstTeamPlayers.add(player);
        else reserveTeamPlayers.add(player);
    }

    public List<Player> getFirstTeamPlayers() {
        return Collections.unmodifiableList(firstTeamPlayers);
    }

    public List<Player> getReserveTeamPlayers() {
        return Collections.unmodifiableList(reserveTeamPlayers);
    }
}
