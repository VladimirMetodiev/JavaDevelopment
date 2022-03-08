package comparatorExercises.snipers;

public class Sniper {
    private String nickname;
    private int hits;

    public Sniper(String nickname, int hits) {
        this.nickname = nickname;
        this.hits = hits;
    }

    public String getNickname() {
        return nickname;
    }

    public int getHits() {
        return hits;
    }
}
