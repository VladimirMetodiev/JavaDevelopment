package multithreading.examples;

public class MultithreadingVarOne implements Runnable {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        }
        catch (Exception ex) {
            System.out.println("Exception is caught!");
        }
    }
}
