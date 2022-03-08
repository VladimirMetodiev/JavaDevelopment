package methods;

import java.util.HashMap;
import java.util.Objects;

public class MethodHashCode {
    public static void main(String[] args) {
        HashMap<Player, Integer> players = new HashMap<>();
        players.put(new Player("Orel", 2536300), 25);
        players.put(new Player("Conqueror", 8239450), 82);
        players.put(new Player("Orchid", 898200), 8);
        players.put(new Player("Blade", 1927720), 19);
        players.put(new Player("Freya", 6735260), 67);
        players.put(new Player("Destroyer", 3800300), 38);

        // Методът .equals() е преопределен, въпреки това метода .containsKey() връща false.
        // Проблемът се състои в това, че колекции като HashMap използват хеширане при търсене и сравнение,
        // затова трябва да преопределя и методът .hashCode().

        // Ако преопределя .hashCode(), трябва да преопределя и .equals(), защото сравнението първоначално се прави с
        // hashCode, а след това и с .equals();

        // Object method: -> public native int hashCode();

        // За да получа хеш-код, трябва да преобразувам някакъв обект в int
        // Когато метода .hashCode(), за различни обекти, връща един и същи хеш-код, това се нарича колизия.
        // Колкото по-малко са колизиите, толкова по-добре.

        boolean result = players.containsKey(new Player("Conqueror", 8239450));
        System.out.println(result);
        result = players.containsKey(new Player("Freya", 6735260));
        System.out.println(result);

        System.out.println("------------------------------");

        for(Player p : players.keySet()) System.out.println(p.hashCode());

        System.out.println("------------------------------");

        for(Player p : players.keySet()) System.out.println(p.myHashCode());
    }
}

class Player {
    String nickname;
    int points;

    public Player(String nickname, int points) {
        this.setNickname(nickname);
        this.setPoints(points);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Player player = (Player) obj;
        return points == player.points && Objects.equals(nickname, player.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, points);
    }

    public int myHashCode() {
        return nickname.length() * nickname.charAt(0) * nickname.charAt(1);
    }
}