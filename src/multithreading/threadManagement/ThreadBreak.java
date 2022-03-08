package multithreading.threadManagement;

public class ThreadBreak {
    public static void main(String[] args){
        AnotherThread obj = new AnotherThread();
        Thread thread = new Thread(obj);            // Създаване на вторичната нишка
        thread.start();                             // Стартиране на вторичната нишка

        try{
            Thread.sleep(10000);              // Основната нишка изчаква 10 sec
            thread.interrupt();                     // Прекъсване на вторичната нишка
            if(thread.isAlive()) thread.join();
        }
        catch (InterruptedException ex){
            System.out.println("Finish!");
        }

        System.out.println("Main thread finish.");
    }
}

class AnotherThread implements Runnable {
    @Override
    public void run() {
        try{
            int a = 1;

            while(true){
                Thread.sleep(1000);
                System.out.printf("Secondary thread: %d%n", a++);
            }
        }
        catch (InterruptedException ex){
            System.out.println("Secondary thread finish.");
        }
    }
}