package multithreading.evaluation;

public class Criteria implements Runnable {
    private char[] marks;

    Criteria(char[] marks) {
        this.marks = marks;
    }

    // Код на нишката
    public void run() {
        for (int a = 0; a < marks.length; a++) {
            try {
                Thread.sleep(1000);     // Задържане на изпълнението на нишката
            }
            catch (InterruptedException ex) {
                // Обработка на изключение - не се предприемат действия
            }

            System.out.printf("[%c] ", marks[a]);
        }
    }
}
