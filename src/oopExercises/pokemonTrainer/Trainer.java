package oopExercises.pokemonTrainer;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private int badges = 0;
    private ArrayList<Pokemon> pokemon = new ArrayList<>();

    public Trainer(String trainerName, String pokemonName, String element, double health) {
        name = trainerName;
        pokemon.add(new Pokemon(pokemonName, element, health));
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }
}
