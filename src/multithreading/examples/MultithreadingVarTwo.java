package multithreading.examples;

public class MultithreadingVarTwo extends Thread{
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        }
        catch (Exception ex) {
            System.out.println("Exception is caught!");
        }
    }
}
