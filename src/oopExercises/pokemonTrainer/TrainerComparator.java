package oopExercises.pokemonTrainer;

import java.util.Comparator;

public class TrainerComparator implements Comparator<Trainer> {
    public int compare (Trainer tr1, Trainer tr2) {
        if(tr1.getBadges() - tr2.getBadges() > 0) {
            return -1;
        }
        else if(tr1.getBadges() - tr2.getBadges() < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
