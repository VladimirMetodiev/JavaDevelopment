package arrayExercises;

import java.util.Scanner;

public class TheHeiGanDance {
    private static double heiGanPoints = 3000000.0;
    private static int myPoints = 18500;
    private static boolean thereIsACloud = false;
    private static int x = 7;
    private static int y = 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double myHit = Double.parseDouble(input.nextLine());

        String[] command;

        while(true) {
            command = input.nextLine().split("\\s+");

            heiGanPoints -= myHit;

            if(heiGanPoints <= 0) {
                break;
            }

            if(thereIsACloud) {
                myPoints -= 3500;
                thereIsACloud = false;
            }

            if(myPoints <= 0) {
                break;
            }

            int damageX = Integer.parseInt(command[1]);
            int damageY = Integer.parseInt(command[2]);

            if((x == damageX && y == damageY) ||
                    (x == damageX - 1 && y == damageY - 1) ||
                    (x == damageX - 1 && y == damageY) ||
                    (x == damageX - 1 && y == damageY + 1) ||
                    (x == damageX && y == damageY - 1) ||
                    (x == damageX && y == damageY + 1) ||
                    (x == damageX + 1 && y == damageY - 1) ||
                    (x == damageX + 1 && y == damageY) ||
                    (x == damageX + 1 && y == damageY + 1)) {
                if(command[0].equals("Cloud") || command[0].equals("Eruption")) {
                    didIGetAHit(command[0], damageX, damageY);
                }
            }
            //System.out.printf("%d, %d, %d%n", x, y, myPoints);

            if(myPoints <= 0) {
                break;
            }
        }

        if (heiGanPoints <= 0) {
            System.out.println("Heigan: Defeated!");
        }
        else {
            System.out.printf("Heigan: %.2f%n", heiGanPoints);
        }
        if (myPoints <= 0) {
            if(command[0].equals("Cloud")) System.out.printf("Player: Killed by Plague %s%n", command[0]);
            else System.out.printf("Player: Killed by %s%n", command[0]);

        }
        else {
            System.out.printf("Player: %d%n", myPoints);
        }
        System.out.printf("Final position: %d, %d%n", x, y);
    }

    private static boolean run(int damageX, int damageY) {
        if(x - 1 < damageX - 1 && x - 1 >= 0) {
            // нагоре
            --x;
            return true;
        }
        else if(y + 1 > damageY + 1 && y + 1 < 15) {
            // надясно
            ++y;
            return true;
        }
        else if(x + 1 > damageX + 1 && x + 1 < 15) {
            // надолу
            ++x;
            return true;
        }
        else if(y - 1 < damageY - 1 && y - 1 >= 0) {
            // наляво
            --y;
            return true;
        }
        else {
            return false;
        }
    }

    private static void didIGetAHit(String threat, int damageX, int damageY) {
        if(!run(damageX, damageY)) {
            if(threat.equals("Cloud")) {
                thereIsACloud = true;
                myPoints -= 3500;
            }
            else {
                myPoints -= 6000;
            }
        }
    }
}



//Condition

//At last, level 80. And what do level eighties do? Go raiding. This is where you are now – trying not to be wiped by the famous dance boss,
//Heigan the Unclean. The fight is pretty straightforward - dance around the Plague Clouds and Eruptions, and you’ll be just fine.
//Heigan’s chamber is a 15-by-15 two-dimensional array. The player always starts at the exact center. For each turn, Heigan uses a spell
//that hits a certain cell and the neighboring rows/columns. For example, if he hits (1,1), he also hits (0,0, 0,1, 0,2, 1,0 … 2,2).
//If the player’s current position is within the area of damage, the player tries to move. First, he tries to move up, if there’s damage/wall,
//he tries to move right, then down, then left. If he cannot move in any direction, because the cell is damaged or there is a wall,
//the player stays in place and takes the damage.
//Plague cloud does 3500 damage when it hits, and 3500 damage the next turn. Then it expires. Eruption does 6000 damage when it hits.
//If a spell hits a player that also has an active Plague Cloud from the previous turn, the cloud damage is applied first.
//Both Heigan and the player may die in the same turn. If Heigan is dead, the spell he would have casted is ignored.
//The player always starts at 18500 hit points; Heigan starts at 3,000,000 hit points. Each turn, the player does damage to Heigan.
//The fight is over either when the player is killed, or Heigan is defeated.

//Input
//>>> On the first line you receive a floating-point number D – the damage done to Heigan each turn
//>>> On the next several lines – you receive input in format {spell} {row} {col} – {spell} is either Cloud or Eruption

//Output
//>>> On the first line
//   - If Heigan is defeated: “Heigan: Defeated!”
//   - Else: “Heigan: {remaining}”, where remaining is rounded to two digits after the decimal separator
//>>> On the second line:
//   - If the player is killed: “Player: Killed by {spell}”
//   - Else “Player: {remaining}”
//>>> On the third line: “Final position: {row,  col}” -> the last coordinates of the player

//Constraints
//>>> D is a floating-point number in range [0 … 500000]
//>>> A damaging spell will always affect at least one cell
//>>> Allowed memory: 16 MB
//>>> Allowed working time: 0.25s



//Tests

//Input
//10000
//Cloud 7 7
//Eruption 6 7
//Eruption 8 7
//Eruption 8 7

//Output
//Heigan: 2960000,00
//Player: Killed by Eruption
//Final position: 8, 7


//Input
//500000
//Cloud 7 6
//Eruption 7 8
//Eruption 7 7
//Cloud 7 8
//Eruption 7 9
//Eruption 6 14
//Eruption 7 11

//Output
//Heigan: Defeated!
//Player: 12500
//Final position: 7, 11


//Input
//12500.66
//Cloud 7 7
//Cloud 7 7
//Cloud 7 7
//Cloud 7 7

//Output
//Heigan: 2949997,36
//Player: Killed by Plague Cloud
//Final position: 7, 7


//Input
//50000
//Cloud 6 6
//Cloud 7 6
//Eruption 8 7
//Eruption 8 8
//Eruption 8 9
//Cloud 6 9
//Cloud 6 8
//Eruption 6 6
//Eruption 5 7
//Cloud 7 6
//Cloud 8 6
//Eruption 6 6

//Output
//Heigan: 2400000,00
//Player: Killed by Eruption
//Final position: 6, 6


//Input
//50000
//Cloud 6 6
//Cloud 7 6
//Eruption 8 7
//Eruption 8 8
//Eruption 8 9
//Cloud 6 9
//Cloud 6 8
//Eruption 6 6
//Eruption 5 7
//Cloud 7 6
//Cloud 8 6
//Cloud 6 6
//Cloud 5 6

//Output
//Heigan: 2350000,00
//Player: Killed by Plague Cloud
//Final position: 6, 6



//Бележка: Направих много корекции в движение. Да се върна отново на тази задача и да опитам да подобря кода;
