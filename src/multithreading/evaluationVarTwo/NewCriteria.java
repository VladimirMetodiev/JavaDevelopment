package multithreading.evaluationVarTwo;

public class NewCriteria implements Runnable {
    private char[] marks;
    private Thread thread;

    NewCriteria(char[] marks, String name) {
        this.marks = marks;
        thread = new Thread(this, name);
        System.out.println(thread.getName().toUpperCase());
        thread.start();
    }

    public void run() {
        for(char item : marks){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {
            }

            System.out.printf("[%c] ", item);
        }

    }
}
