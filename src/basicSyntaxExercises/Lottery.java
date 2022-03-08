package basicSyntaxExercises;

public class Lottery {
    public static void main(String[] args) {
        for (int a = 1; a <= 8; a++) {
            for (int b = a + 1; b <= 9; b++) {
                for (int c = b + 1; c <= 10; c++) {
                    System.out.printf("%d %d %d%n", a, b, c);
                }
            }
        }
    }
}



//Condition

//Print all combinations from TOTO 3/10 lottery (like 6/49 but with less combinations)
