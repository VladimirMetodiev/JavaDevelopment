package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> theFirstPlayer = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> theSecondPlayer = Arrays.stream(input.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while(!theFirstPlayer.isEmpty() && !theSecondPlayer.isEmpty()) {
            if(theFirstPlayer.get(0) > theSecondPlayer.get(0)) {
                theFirstPlayer.add(theFirstPlayer.get(0));
                theFirstPlayer.remove(0);
                theFirstPlayer.add(theSecondPlayer.get(0));
                theSecondPlayer.remove(0);
            }
            else if(theFirstPlayer.get(0) < theSecondPlayer.get(0)) {
                theSecondPlayer.add(theSecondPlayer.get(0));
                theSecondPlayer.remove(0);
                theSecondPlayer.add(theFirstPlayer.get(0));
                theFirstPlayer.remove(0);
            }
            else {
                theFirstPlayer.remove(0);
                theSecondPlayer.remove(0);
            }
        }

        if(!theFirstPlayer.isEmpty()) System.out.printf("First player wins! Sum: %d%n", theFirstPlayer.stream().reduce(0, Integer::sum));
        if(!theSecondPlayer.isEmpty()) System.out.printf("Second player wins! Sum: %d%n", theSecondPlayer.stream().reduce(0, Integer::sum));
    }
}



//Condition

//You will be given two hands of cards, which will be integer numbers. Assume that you have two players. You have to find out
//the winning deck and respectively the winner.
//You start from the beginning of both hands. Compare the cards from the first deck to the cards from the second deck.
//The player, who has the bigger card, takes both cards and puts them at the back of his hand - the second player’s card is last,
//and the first person’s card (the winning one) is before it (second to last) and the player with the smaller card must remove
//the card from his deck. If both players’ cards have the same values - no one wins, and the two cards must be removed from the decks.
//The game is over, when one of the decks is left without any cards. You have to print the winner on the console and
//the sum of the left cards: "Player {one/two} wins! Sum: {sum}".



//Tests

//Input
//50 40 10 30 10
//40 40 30 20 30
//Output
//First player wins! Sum: 160


//Input
//10 30 10 50 40
//50 40 30 20 30
//Output
//Second player wins! Sum: 50


//Input
//10 30 30 50 40
//10 30 30 50 40
//Output
//
