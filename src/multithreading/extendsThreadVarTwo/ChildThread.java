package multithreading.extendsThreadVarTwo;

public class ChildThread extends Thread {
    @Override
    public void run() {
        for (int a = 0; a < 5; a++) {
            System.out.println("The child thread: " + getName() + " [" + (a + 1) + "]");
        }
    }
}
