package multithreading.examples;

public class MultiThreadVarOne {
    public static void main(String[] args) {
        int numberOfThreads = 5;

        for (int a = 0; a < numberOfThreads; a++) {
            MultithreadingVarOne object = new MultithreadingVarOne();
            Thread thread = new Thread(object);
            thread.start();
        }
    }
}

