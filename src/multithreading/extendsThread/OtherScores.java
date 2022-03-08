package multithreading.extendsThread;

public class OtherScores {
    public static void main(String[] args) {
        char[] marks = {'A', 'B', 'C', 'D', 'E'};
        String[] assessment = {"Excellent", "Very good", "Good", "Fair", "Poor"};
        String name = "Evaluation";

        new OtherCriteria(marks, name);

        for(String item : assessment){
            try {
                Thread.sleep(1150);
            }

            catch (InterruptedException e) {
            }

            System.out.println(item);
        }
    }
}
