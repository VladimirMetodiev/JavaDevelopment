package multithreading.extendsThread;

public class OtherCriteria extends Thread {
    private char[] marks;

    OtherCriteria(char[] marks, String name) {
        super();
        setName(name);
        this.marks = marks;
        System.out.println(getName().toUpperCase());
        start();
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
