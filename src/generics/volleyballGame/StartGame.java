package generics.volleyballGame;

public class StartGame {
    public static void main(String[] args) {

        Student spartacusPlayer1 = new Student("Alex", 17);
        Student spartacusPlayer2 = new Student("Nina", 18);
        Student starTeamPlayer1 = new Student("Mario", 16);
        Student starTeamPlayer2 = new Student("Sonia", 16);

        Team<Student> spartacus = new Team<>("Spartacus");
        spartacus.addNewPlayer(spartacusPlayer1);
        spartacus.addNewPlayer(spartacusPlayer2);

        Team<Student> starTeam = new Team<>("Star team");
        starTeam.addNewPlayer(starTeamPlayer1);
        starTeam.addNewPlayer(starTeamPlayer2);

        spartacus.playWith(starTeam);



        Professional staropramenPlayer1 = new Professional("Vladimir", 30);
        Professional staropramenPlayer2 = new Professional("Anna", 28);
        Professional zagorkaPlayer1 = new Professional("Peter", 35);
        Professional zagorkaPlayer2 = new Professional("Irina", 26);

        Team<Professional> staropramen = new Team<>("Staropramen");
        staropramen.addNewPlayer(staropramenPlayer1);
        staropramen.addNewPlayer(staropramenPlayer2);

        Team<Professional> zagorka = new Team<>("Zagorka");
        zagorka.addNewPlayer(zagorkaPlayer1);
        zagorka.addNewPlayer(zagorkaPlayer2);

        staropramen.playWith(zagorka);
    }
}
