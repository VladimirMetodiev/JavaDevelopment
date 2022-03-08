package multithreading.evaluation;

public class Scores {
    public static void main(String[] args) {
        char[] marks = {'A', 'B', 'C', 'D', 'E'};
        String[] assessment = {"Excellent", "Very good", "Good", "Fair", "Poor"};

        // Създавам обект на класът с реализация на метода run()
        Criteria obj = new Criteria(marks);

        // Създавам нова нишка - обект на клас Thread
        Thread thread = new Thread(obj);

        // Стартирам нишка
        thread.start();

        for (int b = 0; b < assessment.length; b++) {
            try {
                Thread.sleep(1150);
            }
            catch (InterruptedException ex) {
            }

            System.out.println(assessment[b]);
        }
    }
}
