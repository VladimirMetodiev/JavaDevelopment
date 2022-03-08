package oopExercises.chessQueens;

public class ChessQueens {
    private int x;
    private int y;

    public ChessQueens(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean beat(int x, int y) {
        return Math.abs(this.x - x) == Math.abs(this.y - y) || this.x == x || this.y == y;
    }
}
