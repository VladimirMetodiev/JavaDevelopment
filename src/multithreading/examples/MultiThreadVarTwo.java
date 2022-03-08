package multithreading.examples;

public class MultiThreadVarTwo {
    public static void main(String[] args) {
        int n = 5;

        for (int a = 0; a < n; a++) {
            MultithreadingVarTwo object = new MultithreadingVarTwo();
            object.start();
        }
    }
}
