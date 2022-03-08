package basicSyntax;

public class NestedCycles {
    public static void main(String[] args) {
        int counter = 1;

        for (char x = 'a'; x <= 'c'; x++) {
            for (char y = 'a'; y <= 'c'; y++) {
                for (char z = 'a'; z <= 'c'; z++) {
                    System.out.printf("Combination %d: %c %c %c%n", counter++, x, y, z);
                }
            }
            System.out.println();
        }
    }
}
