package multithreading;

public class MainThread {
    public static void main(String[] args) {
        Thread baseThread = Thread.currentThread();

        System.out.println("Main thread: " + "ID[" + baseThread.getId() + "] " + baseThread);

        baseThread.setName("One");

        System.out.println("Main thread: " + "ID[" + baseThread.getId() + "] " + baseThread);

        baseThread.setPriority(8);

        System.out.println("Main thread: " + "ID[" + baseThread.getId() + "] " + baseThread);
    }
}
