package oopExercises.pokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StartTournament {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Trainer> trainers = new ArrayList<>();
        String command;
        String[] data;

        while (!(command = reader.readLine()).equals("Tournament")) {
            data = command.split("\\s+");
            boolean flag = false;

            for (int z = 0; z < trainers.size(); z++) {
                if(trainers.get(z).getName().equals(data[0])) {
                    flag = true;
                    trainers.get(z).getPokemon().add(new Pokemon(data[1], data[2], Double.parseDouble(data[3])));
                    break;
                }
            }

            if(!flag) {
                trainers.add(new Trainer(data[0], data[1], data[2], Double.parseDouble(data[3])));
            }
        }

        while (!(command = reader.readLine()).equals("End")) {
            boolean doesHeHave = false;

            for (int a = 0; a < trainers.size(); a++) {
                for (int b = 0; b < trainers.get(a).getPokemon().size(); b++) {
                    if(trainers.get(a).getPokemon().get(b).getElement().equals(command)) {
                        doesHeHave = true;
                        break;
                    }
                }

                if(doesHeHave) {
                    trainers.get(a).setBadges(trainers.get(a).getBadges() + 1);
                }
                else {
                    for(Pokemon p : trainers.get(a).getPokemon()) p.setHealth(p.getHealth() - 10);
                }

                trainers = checkUp(trainers, a);
                doesHeHave = false;
            }
        }

        trainers.stream().sorted(new TrainerComparator()).forEach(trainer -> System.out.printf("%s %d %d%n", trainer.getName(), trainer.getBadges(), trainer.getPokemon().size()));

        reader.close();
    }

    private static ArrayList<Trainer> checkUp (ArrayList<Trainer> trainers, int index) {
        for (int c = trainers.get(index).getPokemon().size() - 1; c >= 0; c--) {
            if(trainers.get(index).getPokemon().get(c).getHealth() <= 0) trainers.get(index).getPokemon().remove(c);
        }

        return trainers;
    }
}



//Condition

//You wanna be the very best pokemon trainer, like no one ever was, so you set out to catch pokemon. Define a class Trainer and a class Pokemon.
//Trainers have a name, number of badges and a collection of pokemon, Pokemon have a name, an element and health, all values are mandatory.
//Every Trainer starts with 0 badges.
//From the console you will receive an unknown number of lines until you receive the command “Tournament”, each line will carry information
//about a pokemon and the trainer who caught it in the format “<TrainerName> <PokemonName> <PokemonElement> <PokemonHealth>” where TrainerName
//is the name of the Trainer who caught the pokemon, names are unique there cannot be 2 trainers with the same name. After receiving
//the command “Tournament” an unknown number of lines containing one of three elements “Fire”, “Water”, “Electricity” will follow until
//the command “End” is received. For every command you must check if a trainer has at least 1 pokemon with the given element,
//if he does he receives 1 badge, otherwise all his pokemon lose 10 health, if a pokemon falls to 0 or less health he dies
//and must be deleted from the trainer’s collection. After the command “End” is received you should print all trainers sorted by
//the amount of badges they have in descending order (if two trainers have the same amount of badges they should be sorted by
//order of appearance in the input) in the format “<TrainerName> <Badges> <NumberOfPokemon>”.



//Tests

//Peter Charizard Fire 100
//Alexander Squirtle Water 38
//Peter Pikachu Electricity 10
//Tournament
//Fire
//Electricity
//End

//Peter 2 2
//Alexander 0 1


//Stephan Blastoise Water 18
//Nicola Pikachu Electricity 22
//Julia Kadabra Psychic 90
//Tournament
//Fire
//Electricity
//Fire
//End

//Nicola 1 1
//Stephan 0 0
//Julia 0 1


//Chancer Buk Water 30
//Runner Falcon Fire 36
//Sparkling Beauty Electricity 20
//Chancer Orel Fire 48
//Tournament
//Fire
//Electricity
//Electricity
//Water
//End

//Chancer 2 2
//Sparkling 2 0
//Runner 1 1
