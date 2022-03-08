package stack;

public class TrickyStack {
    private static void inputFirst() {
        System.out.println("Input first");
        inputSecond();
        System.out.println("Output first");
    }

    private static void inputSecond() {
        System.out.println("Input second");
        inputThird();
        System.out.println("Output second");
    }

    private static void inputThird() {
        System.out.println("Input third");
        System.out.println("Output third");
    }

    public static void main(String[] args) {
        inputFirst();
    }
}
