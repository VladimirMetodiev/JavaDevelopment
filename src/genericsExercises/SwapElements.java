package genericsExercises;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        try {
            Integer[] numbers = {10, 20, 80, 40, 50, 60, 70, 30, 90, 100};
            swapElements(numbers, 2, 7);
            System.out.println(Arrays.toString(numbers));
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

        System.out.println("--------------------------------------------------");

        try {
            String[] words = {"digit", "dimension", "dignify", "dilemma", "digital", };
            swapElements(words, 4, 1);
            System.out.println(Arrays.toString(words));
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

        System.out.println("--------------------------------------------------");

        try {
            TopPlayers first = new TopPlayers("Iarilo", 1560320);
            TopPlayers second = new TopPlayers("Dark knight", 1280453);
            TopPlayers third = new TopPlayers("Red dragon", 2113450);
            TopPlayers fourth = new TopPlayers("Vlad", 3218745);

            TopPlayers[] players = {first, second, third, fourth};

            swapElements(players, 3, 0);
            swapElements(players, 1, 2);
            swapElements(players, 3, 2);

            for(TopPlayers p : players) System.out.println(p);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    private static<E> E[] swapElements(E[] array, int index1, int index2) {
        if(index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) throw new IllegalArgumentException("There is not such index!");
        E current = array[index1];
        array[index1] = array[index2];
        array[index2] = current;
        return array;
    }
}

class TopPlayers {
    String nickname;
    int result;

    public TopPlayers(String nickname, int result) {
        this.nickname = nickname;
        this.result = result;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format("Nickname: %s => %d points", nickname, result);
    }
}
