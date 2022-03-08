package basicSyntaxExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> players = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        int number = Integer.parseInt(input.nextLine());

        for(int a = 0; a < number; a++){
            players.add(input.nextLine());
            scores.add(Integer.parseInt(input.nextLine()));
        }

        for (int c = 0; c < players.size(); c++) {
            scores.set(c, calculateScore(players.get(c), scores.get(c)));
        }

        int index = 0;

        for (int d = 0; d < scores.size() - 1; d++) {
            if(scores.get(index) < scores.get(d + 1)){
                index = d + 1;
            }
        }

        System.out.printf("The winner is %s - %d points", players.get(index), scores.get(index));
    }

    static int calculateScore(String name, int currentScore){
        for (int b = 0; b < name.length(); b++) {
            if(name.charAt(b) % 2 == 0){
                currentScore += name.charAt(b);
            }
            else {
                currentScore -= name.charAt(b);
            }
        }
        return currentScore;
    }
}



//Condition

//Write a program to calculate points for all players and find who the winner is. You will be given the count of the players,
//their names and initial scores. Score for every player depends on their name. To the player score add or subtract
//the ASCII code of each letter. If ASCII code is even, add it to the score. If is odd – subtract it from the score.
//Find the one with highest score and print his name and score on the console. If two or more players are with
//same points – the winner is the first one.

//Input
//On the first input line, you will be given number N - the count of players.
//On the next 2*N lines you will be given player name and his initial score.

//Output
//The output should be printed on the console and consists of the name of the winner and his score in the following format:
//“The winner is {name} - {points} points”

//Constraints
//N – the count of players will be a positive integer in the range [1...100]
//Names will be strings with length between 3 and 30
//The score for each player will be an integer in the range [-100,000...100,000]


//Tests

//3
//Vladimir
//100
//Stefan
//100
//Peter
//100
//The winner is Peter - 208 points


//4
//Anna
//0
//Catherine
//0
//Diana
//0
//Georgia
//0
//The winner is Anna - 58 points
