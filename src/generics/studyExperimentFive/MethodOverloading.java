package generics.studyExperimentFive;

public class MethodOverloading {
    public static void main(String[] args) {
        show(100);
        show('W');
        show("Web");
        show("Amazon", "Mekong");
        show('e', 2.718281828459045);
        show("Danube", 300);
        show(400, 'C');
        show(new Character('m'), new Integer(300));
        MethodOverloading.<Character, Integer>show('P', 666);
        MethodOverloading.<Long>show(9000L, 500);
    }

    private static <T> void show(T var) {
        System.out.println("[1] " + var);
    }

    private static void show(String str) {
        System.out.println("[2] Text " + str);
    }

    private static <T, U> void show(T t, U u) {
        System.out.println("[3] " + t + " and " + u);
    }

    private static <T> void show(T t, int number) {
        System.out.println("[4] " + t + " and number " + number);
    }

    private static void show(int number, char symbol) {
        System.out.println("[5] Number " + number + " and symbol " + symbol);
    }
}
