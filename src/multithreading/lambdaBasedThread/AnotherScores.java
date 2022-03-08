package multithreading.lambdaBasedThread;

public class AnotherScores {
    public static void main(String[] args) {
        char[] marks = {'A', 'B', 'C', 'D', 'E'};
        String[] assessment = {"Excellent", "Very good", "Good", "Fair", "Poor"};

        Thread thread = new Thread(()-> {
            for(char item : marks){
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex) {
                }

                System.out.printf("[%c] ", item);
            }
        });

        thread.start();

        for(String element : assessment){
            try {
                Thread.sleep(1150);
            }

            catch (InterruptedException ex) {
            }

            System.out.println(element);
        }
    }
}
